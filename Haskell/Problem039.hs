import Helper (isInt, indexOfMax)

main = print $ indexOfMax $ [length [(a,b,c) | a <-[1..p/3], let b = (p*p-2*p*a) / (2*p-2*a), let c = sqrt (a^2+b^2), isInt c, a+b+c == p] | p <- [1..1000]]