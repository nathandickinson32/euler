(ns euler.level1.problem006)

(defn square-of-sums [n sum]
  (if (zero? n)
    (* sum sum)
    (recur (dec n) (+ n sum))))

(defn sum-of-squares [n sum]
  (if (zero? n)
    sum
    (recur (dec n) (+ (* n n) sum))))

(defn euler-4 [amount-of-natural-numbers]
  (- (square-of-sums amount-of-natural-numbers 0)
     (sum-of-squares amount-of-natural-numbers 0)))