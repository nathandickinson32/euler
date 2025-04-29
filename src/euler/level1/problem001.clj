(ns euler.level1.problem001)

(defn get-multiples-of-x [max-range x]
  (filter #(zero? (mod % x)) (range x max-range)))

(defn euler-1 [max-range]
  (reduce +
          (set
            (concat
              (get-multiples-of-x max-range 3)
              (get-multiples-of-x max-range 5)))))