main = print $ denom $ [(n,d) | d <- [1..99], n <- [1..d-1], ones d /= 0, ones n == tens d, n*(ones d) == d*(tens n)]
    where
    ones n = mod n 10
    tens n = div (n - ones n) 10

denom = (\(a,b) -> div b a) . foldl1 (\(a,b) (c,d) -> (a*c,b*d))