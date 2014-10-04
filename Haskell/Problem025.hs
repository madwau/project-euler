import Helper (digits, fibs)

main = print $ (+) 1 $ length $ takeWhile ((<1000) . length . digits) fibs