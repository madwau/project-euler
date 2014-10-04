import Helper (properdivisors)

main = print $ sum $ [x | x <- [1..limit], let y = sums x in y <= limit && x /= y && x == sums y]

sums n = [sum $ properdivisors i | i <- [1..limit]] !! fromIntegral (n-1)

limit = 9999