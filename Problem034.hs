import Helper (fac, digits)

main = print $ sum $ filter (\n -> (==n) . sum . map fac $ digits n) [3..100000]