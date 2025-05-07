(ns euler.level1.problem001)

(defn get-multiples-of-x [max-range x]
  (filter #(zero? (mod % x)) (range x max-range)))

(defn euler-1 [max-range]
  (apply +
          (set
            (concat
              (get-multiples-of-x max-range 3)
              (get-multiples-of-x max-range 5)))))


(defn multiple-of-3-or-5? [n]
  (or (zero? (mod n 3)) (zero? (mod n 5))))

(defn euler-1 [n]
  (->> (time (range n))
       (reduce (fn [acc n] (if (multiple-of-3-or-5? n) (+ acc n) acc)))
       ;(filter multiple-of-3-or-5?)
       ;(apply +)
       ))