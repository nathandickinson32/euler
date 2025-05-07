(ns euler.level1.problem002)

(defn recursive-fib [sum n-2 n-1 limit]
  )

(defn recursive-fib [sequence limit]
  (let [next-number-in-sequence (apply + (take-last 2 sequence))]
    (if (> next-number-in-sequence limit)
      sequence
      (recur (conj sequence next-number-in-sequence) limit))))

(defn get-fibonacci-to-n [limit]
  (when true                                                ; (> n 1)
    (recursive-fib [1 2] limit)
    #_(loop [sequence [1 2]]
      (let [next-number-in-sequence (apply + (take-last 2 sequence))]
        (if (> next-number-in-sequence limit)
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