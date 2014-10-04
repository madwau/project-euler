import Helper (isPalindrome)

main = print $ maximum $ [a*b | a <- xs, b <- xs, isPalindrome $ a*b] where xs = [100..999]