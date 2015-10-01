import Data.List (permutations)
import Helper (primes)

main = print $ sum $ map read $ filter (property 0) $ permutations ['0'..'9']
       where property i (x:xs) = i == 7 || mod (read $ take 3 xs) (primes !! i) == 0 && property (i+1) xs