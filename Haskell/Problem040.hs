import Data.Char (digitToInt)

main = print $ product $ [digitToInt $ num !! (10^i-1) | i <- [0..6]]

num = concat $ map show [1..]