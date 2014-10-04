import Helper (select)

-- 6 Jan 1901 was the first Sunday, hence five days are dropped from the list of all days
-- afterwards only every seventh day (i.e. sunday) is retained and eventually compared to 1

main = print $ length $ filter (==1) $ select 7 $ drop 5 $ concatMap days [1901..2000]

days year = concatMap (\days -> [1..days]) [31,feb year,31,30,31,30,31,31,30,31,30,31]

feb year | mod year 400 == 0 = 29
         | mod year 100 == 0 = 28
         | mod year   4 == 0 = 29
         | otherwise         = 28