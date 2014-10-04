import Helper (divisors, trianglenumbers)

main = print $ head $ [t | t <- trianglenumbers, length (takeWhile (\d -> d^2 <= t) (divisors t)) > div 500 2]