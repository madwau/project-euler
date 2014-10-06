import Helper (primes, isPrime)

main = print $ sum $ take 11 $ filter truncatable $ drop 4 primes

truncatable n = all isPrime $ cut take n ++ cut drop n

cut f n = [read $ f i s | i <- [1..length s-1]] where s = show n