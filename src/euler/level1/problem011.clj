(ns euler.level1.problem011)



(defn ->largest-row-product [grid]
  (apply max (for [row (range (count grid))]
    (apply * (get-in grid [row])))))

(defn ->largest-collum-product [grid]
  (apply max (for [row (range (dec (count grid)))
                  collum (range (count (first grid)))]
              (* (get-in grid [row collum])
                 (get-in grid [(inc row) collum])))))


(defn euler-11 [grid]
  )


