import Helper (isTriangleNumber, split, posAlphabet)

main = do file <- readFile "words.txt"
          print $ length $ filter (isTriangleNumber . wordValue) $ split file
          where wordValue = sum . map posAlphabet