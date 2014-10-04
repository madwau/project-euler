import Helper (isPalindrome, toBinary)

main = print $ sum $ filter isPalindrome $ filter (isPalindrome . toBinary) [1..999999]