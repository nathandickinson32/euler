(ns euler.level1.problem012
  (:require [euler.level1.core :as core]))

(defn count-divisors [n]
  (count (filter #(core/divisible-by? n %) (range 1 (inc n)))))

(defn ->triangle-number [n]
  (/ (* n (inc n)) 2))

(defn euler-12 [limit]
  (loop [i 1]
    (let [tri-num  (->triangle-number i)
          divisors (count-divisors tri-num)]
      (if (> divisors limit)
        tri-num
        (recur (inc i))))))