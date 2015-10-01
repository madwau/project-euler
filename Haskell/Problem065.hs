import Data.Ratio

main = print $ 1 + fraction (replicate 1 2)

fraction [x] = x
fraction (x:xs) = 1 % (x + fraction xs)