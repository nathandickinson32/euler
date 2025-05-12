(ns euler.level1.problem006)

(defn square-of-sums [amount-of-natural-numbers sum]
  (if (zero? amount-of-natural-numbers)
    (* sum sum)
    (recur (dec amount-of-natural-numbers) (+ amount-of-natural-numbers sum))))

(defn sum-of-squares [amount-of-natural-numbers sum]
  (if (zero? amount-of-natural-numbers)
    sum
    (recur (dec amount-of-natural-numbers) (+ (* amount-of-natural-numbers amount-of-natural-numbers) sum))))

(defn euler-4 [amount-of-natural-numbers]
  (if (or (not (number? amount-of-natural-numbers)) (< amount-of-natural-numbers 0))
    nil
    (- (square-of-sums amount-of-natural-numbers 0) (sum-of-squares amount-of-natural-numbers 0))))