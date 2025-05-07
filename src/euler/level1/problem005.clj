(ns euler.level1.problem005)

(defn greatest-common-denominator [first-number second-number]
  (if (zero? second-number)
    first-number
    (recur second-number (mod first-number second-number))))

(defn least-common-multiple
  ([first-number second-number]
   (/ (* first-number second-number)
      (greatest-common-denominator first-number second-number)))
  ([range-of-numbers]
   (reduce least-common-multiple 1 range-of-numbers)))



;(defn divisible-by-all? [number-to-check range-of-nums]
;  (every? #(zero? (mod number-to-check %)) range-of-nums))
;
;(defn smallest-divisible [max-divisor]
;  (loop [number-to-check max-divisor]
;    (if (divisible-by-all? number-to-check (range 1 (inc max-divisor)))
;      number-to-check
;      (recur (+ number-to-check max-divisor)))))