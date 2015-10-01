import Helper (primes, isPrime, powerset)
import Control.Arrow
import Data.List

main = print $ head $ filter ((== 8) . value) primes

value n = maximum $ map length $ filter (elem n) potFam
        where potFam = map (filter isPrime . map read . genFamily n) pos
              pos = init $ powerset [1..numDigits]
              numDigits = genericLength $ show n

genFamily n p | elem 1 p = fam ['1'..'9']
              | otherwise = fam ['0'..'9']
              where fam = map (gen (show n) p)

gen [] _ _ = ""
gen number [] _ = number
gen (n:number) (p:pos) d | p == 1 = d : rest pos
                         | otherwise = n : rest (p:pos)
                         where rest r = gen number (map pred r) d