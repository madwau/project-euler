import Data.List

main = print $ sm 0 5

sm current max | current > max = 0
               | current == max = 1
               | otherwise = sum [sm (current+d) max | d <- [1..max-current]]