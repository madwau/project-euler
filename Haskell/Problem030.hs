import Helper (digits)

main = print $ sum $ filter (\n -> (sum $ map (^5) $ digits n) == n) [n | n <- [2..(6*9^5)]]