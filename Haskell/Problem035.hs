import Helper (isCircularPrime)

main = print $ length $ filter isCircularPrime [1..999999]