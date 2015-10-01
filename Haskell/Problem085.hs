main = print $ snd $ minimum [(abs $ 2*10^6 - rect n m, n*m) | n <- [1..80], m <- [1..n]]

rect n m = sum [(m-b+1)*(n-a+1) | a <- [1..n], b <- [1..m]]