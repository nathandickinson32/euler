(ns euler.level1.problem010
  (:require [euler.level1.core :as core]))

(defn maybe-add-cursor-to-prime-list [cursor primes]
  (if (core/is-prime? cursor primes)
    (conj primes cursor)
    primes))

(defn sum-of-primes-up-to-target [primes cursor target]
  (if (= cursor target)
    (apply + primes)
    (recur
      (maybe-add-cursor-to-prime-list cursor primes)
      (inc cursor) target)))

(defn euler-10 [target]
  (sum-of-primes-up-to-target [] 2 target))