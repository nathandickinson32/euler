(ns euler.level1.problem002)

(defn get-fibonacci-to-n [n]
  (when (> n 1)
    (loop [sequence [1 2]]
      (let [next-number-in-sequence (apply + (take-last 2 sequence))]
        (if (> next-number-in-sequence n)
          sequence
          (recur
            (conj sequence next-number-in-sequence)))))
    ))

(defn get-sum-of-evens [sequence]
  (reduce + (filter even? sequence)))

(defn euler-2 [n]
  (if (< n 2)
    0
    (get-sum-of-evens (get-fibonacci-to-n n))))