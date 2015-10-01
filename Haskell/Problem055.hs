import Helper (isPalindrome)

main = print $ length $ filter (lychrel 0) [1..10000]

lychrel i n = not (isPalindrome m) && (i > 50 || lychrel (i+1) m)
              where m = n + read (reverse $ show n)