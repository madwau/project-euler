import Helper (collatz)

main = print $ maximum $ map length [collatz n | n <- [1..999999]]