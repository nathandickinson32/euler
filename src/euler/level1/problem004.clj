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
    ; a = 99
    ; b = 91
    ; a = 99
    ; b = 10
    ; a = 98
    ; b = 98
    ;(recur a b max-palindrome)
    ;(recur 0 0 0)
    (cond
      (< a lowest-factor)
      max-palindrome

      (< b lowest-factor)
      (recur (dec a) (dec a) max-palindrome lowest-factor)

      :else
      (let [product (* a b)]
        (if (palindrome? product)
          (recur (dec a) (dec a) (max product max-palindrome) b)
          (recur a (dec b) max-palindrome lowest-factor)
          ;
          ;max-palindrome product
          ;restart loop with a range  - 1 - current b and b range a - current b
          ))))
  ; 99 * 91
  ; 98 * 92
  ; 97
  ; ...
  ; 92 * 91
  ; 91 * 91
  #_(->> (for [a (range highest-factor lowest-factor -1)
             b (range a lowest-factor -1)
             :let [product (* a b)]
             :when (palindrome? product)]
         product)
       (apply max)))

(defn ->range-of-factors [number-of-digits]
  (let [lowest-factor (int (math/pow 10 (dec number-of-digits)))
        highest-factor (dec (int (math/pow 10 number-of-digits)))]
    (->sort-palindrome-list lowest-factor highest-factor)))

(defn euler-4 [number-of-digits]
  (when (>= number-of-digits 2)
    (->range-of-factors number-of-digits)))