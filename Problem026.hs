import Helper (indexOfMax)

main = print $ indexOfMax $ map ((cyc 1) . (drop 10) . show . (div $ 10^1000)) [1..1000]

cyc n a | (take (length a) $ cycle $ take n a) == a = n
        | otherwise = cyc (n+1) a