import Helper (split)
import Data.List (sort)
import Data.Char (ord)

main = do content <- readFile "names.txt"
          print $ sum $ zipWith score (sort $ split content) [1..]

score name i = i * sum [ord c - ord 'A' + 1 | c <- name]