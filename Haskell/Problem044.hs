import Helper (pentagonnumbers, isPentagonNumber)
import Data.List
import Data.Ord

main = print $ minimumBy (comparing d) $ filter property $ [(p,p') | p <- take (10^3) pentagonnumbers, p' <- dropWhile (<=p) $ take (10^3) pentagonnumbers]
       where d (k,j) = abs $ k-j
             property (k,j) = isPentagonNumber (k+j) && isPentagonNumber (k-j)