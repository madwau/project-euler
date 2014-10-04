main = print $ ways 0 200 [1,2,5,10,20,50,100,200]

ways sum max coins | sum == max = 1
                   | coins == [] || sum > max = 0
                   | otherwise = ways (sum + head coins) max coins + ways sum max (tail coins)