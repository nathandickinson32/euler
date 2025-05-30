(ns euler.level1.problem004
  (:require [clojure.string :as str]
            [clojure.math :as math]
            [clojure.math.combinatorics :as combo]))

(defn palindrome? [potential-palindrome]
  (= (str potential-palindrome) (str/reverse (str potential-palindrome))))

(defn ->sort-palindrome-list [lowest-factor highest-factor]
  (loop [a highest-factor
         b highest-factor
         max-palindrome -1
         lowest-factor lowest-factor]
    (cond
      (< a lowest-factor)
      max-palindrome
      (< b lowest-factor)
      (recur (dec a) (dec a) max-palindrome lowest-factor)
      :else
      (let [product (* a b)]
        (if (palindrome? product)
          (recur (dec a) (dec a) (max product max-palindrome) b)
          (recur a (dec b) max-palindrome lowest-factor))))))



(defn ->range-of-factors [number-of-digits]
  (let [lowest-factor (->> number-of-digits dec (math/pow 10) int)
        highest-factor (dec (int (math/pow 10 number-of-digits)))]
    (->sort-palindrome-list lowest-factor highest-factor)))

(defn euler-4 [number-of-digits]
  (when (>= number-of-digits 2)
    (->range-of-factors number-of-digits)))


