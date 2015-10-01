import Data.Char
import Data.List
import Data.Ord
import Control.Arrow
import Data.Maybe

data Suit = Hearts | Diamonds | Clubs | Spades deriving (Eq,Ord,Enum,Show)
data Rank = Two | Three | Four | Five | Six | Seven | Eight | Nine | Ten | Jack | Queen | King | Ace deriving (Eq,Ord,Enum,Show)
data Category = HighCard | OnePair | TwoPairs | ThreeOfAKind | Straight | Flush | FullHouse | FourOfAKind | StraightFlush | RoyalFlush deriving (Eq,Ord)

type Card = (Rank, Suit)
type Hand = [Card]
type Game = (Hand, Hand)
type Result = (Category, [Rank])

main = do hands <- readFile "poker.txt"
          print $ length $ filter winner $ toGames $ toCards $ filter isAlphaNum hands

winner :: Game -> Bool
winner (me, you) = eval me > eval you

eval :: Hand -> Result
eval h | flush && royal     = (RoyalFlush,    ranks)
       | flush && straight  = (StraightFlush, ranks)
       | freq == [1,4]      = (FourOfAKind,   last cards : others)
       | freq == [2,3]      = (FullHouse,     last cards : others)
       | flush              = (Flush,         ranks)
       | straight           = (Straight,      ranks)
       | freq == [1,1,3]    = (ThreeOfAKind,  last cards : others)
       | freq == [1,2,2]    = (TwoPairs,      desc (tail cards) ++ [head cards])
       | freq == [1,1,1,2]  = (OnePair,       last cards : others)
       | otherwise          = (HighCard,      ranks)

   where (ranks, suits) = unzip $ sortBy (flip $ comparing fst) h
         (cards, freq)  = unzip $ sortBy (comparing snd) . map (head &&& length) $ group ranks
         others   = desc $ init cards
         desc     = reverse . sort
         royal    = ranks == reverse [Ten .. Ace]
         straight = ranks == reverse [last ranks .. head ranks]
         flush    = length (nub suits) == 1

toGames :: [Card] -> [Game]
toGames [] = []
toGames cards = (take 5 cards, take 5 $ drop 5 cards) : toGames (drop 10 cards)

toCards :: String -> [Card]
toCards [] = []
toCards (r:s:rest) = (rank, suit) : toCards rest
   where rank = fromJust $ lookup r $ zip "23456789TJQKA" [Two .. Ace]
         suit = fromJust $ lookup s $ zip "HDCS" [Hearts .. Spades]