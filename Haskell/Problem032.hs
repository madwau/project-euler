import Helper (isPandigital)
import Data.List

main = print $ sum $ nub $ [a*b | a <- [1..2000], b <- [1..a], isPandigital [1..9] (show a ++ show b ++ show (a*b))]