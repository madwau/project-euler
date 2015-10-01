main = print $ length $ concatMap f [1..100]

f n = filter (==n) $ takeWhile (<=n) $ map (length . show . (^n)) [1..]