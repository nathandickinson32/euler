(ns euler.level1.problem001)

(defn get-multiples-of-x [n x]
  (filter #(zero? (mod % x)) (range x n)))

(defn euler-1 [n]
  (reduce +
          (set
            (concat
              (get-multiples-of-x n 3)
              (get-multiples-of-x n 5)))))


