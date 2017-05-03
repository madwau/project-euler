import Helper (digits)
import Data.List

main = print $ head $ filter permuted_multiples [1..]

permuted_multiples x = (==) 1 $ length $ nub $ map (sort . show . (*x)) [1..6]
