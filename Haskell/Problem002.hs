import Helper (fibs)

main = print $ sum $ takeWhile (<4000000) $ filter even fibs