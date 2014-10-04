import Helper (isPrime)

main = print $ maximum $ [numPrimes a b 0 | a <- r, b <- r] where r = [-999..999]

numPrimes a b n | isPrime (n*n+a*n+b) = numPrimes a b (n+1)
                | otherwise = n