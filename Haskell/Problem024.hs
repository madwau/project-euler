import Data.List

main = print $ (read $ (sort $ permutations "0123456789") !! 999999 :: Integer)