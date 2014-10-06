import Helper (isPandigital)

main = putStr $ maximum $ filter (isPandigital [1..9]) [con i | i <- [1..9999]]

con n = head $ filter (\n -> length n >= 9) [concat $ map (show . (*n)) [1..i] | i <- [2..]]