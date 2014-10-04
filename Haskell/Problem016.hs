import Data.Char

main = print $ sum [digitToInt c | c <- show $ 2^1000]