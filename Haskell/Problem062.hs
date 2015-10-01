import Data.List
import Data.Ord
import Data.Function
import Control.Arrow

main = print $ minimum $ concat $ filter ((5==) . length) $ groupBy ((==) `on` eq) $ sortBy (comparing eq) $ map (^3) [1..10000]
       where eq = sort . show