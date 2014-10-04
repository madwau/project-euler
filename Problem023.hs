import Helper (properdivisors)
import qualified Data.Set as Set

main = print $ sum $ filter (\e -> not $ Set.member e sums) [1..limit]

sums = Set.fromList [a+b | a <- abundant, b <- takeWhile (<=a) abundant]

abundant = [n | n <- [1..limit], (sum $ properdivisors n) > n]

limit = 28123