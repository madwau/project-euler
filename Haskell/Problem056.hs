import Helper (digits)

main = print $ maximum [sum $ digits $ a^b | a <- [0..99], b <- [0..99]]