import qualified Data.Set as Set

main = print $ Set.size $ Set.fromList [a^b | a <- r, b <- r] where r = [2..100]