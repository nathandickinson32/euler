(ns euler.level1.problem012
  (:require [euler.level1.core :as core]))

(defn ->sqrt-n [n]
  (Math/floor (Math/sqrt n)))

(defn ->divisor-range [n]
  (range 1 (inc n)))

(defn perfect-square? [n divisor]
  (= divisor (core/square n)))

(defn ->divisor-type [tri-num divisor]
  (cond
    (not (core/divisible-by? tri-num divisor)) 0
    (perfect-square? tri-num divisor) 1
    :else 2))

(defn ->divisor-count [divisor-range tri-num]
  (map #(->divisor-type tri-num %) divisor-range))

(defn count-divisors [tri-num]
  (let [sqrt-tri-num  (->sqrt-n tri-num)
        divisor-range (->divisor-range sqrt-tri-num)
        divisor-count (->divisor-count divisor-range tri-num)]
    (apply + divisor-count)))

(defn ->triangle-number [n]
  (/ (* n (inc n)) 2))

(defn- asd [i limit]
  (let [tri-num  (->triangle-number i)
        divisors (count-divisors tri-num)]
    (when (> divisors limit)
      tri-num)))

(defn euler-12 [limit]
  (loop [i 1]
    (let [tri-num  (->triangle-number i)
          divisors (count-divisors tri-num)]
      (if (> divisors limit)
        tri-num
        (recur (inc i))))))