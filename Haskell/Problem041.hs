import Helper (primes, isGenericPandigital)

main = print $ last $ filter isGenericPandigital $ takeWhile (<10^7) primes