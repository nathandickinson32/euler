(ns euler.level1.problem007
  (:require [euler.level1.core :as core]))

(defn maybe-add-cursor-to-prime [cursor primes]
  (if (core/is-prime? cursor primes)
    (conj primes cursor)
    primes))

(defn get-nth-prime [primes cursor limit]
  (if (= (count primes) limit)
    (last primes)
    (recur
      (maybe-add-cursor-to-prime cursor primes)
      (inc cursor)
      limit)))

(defn euler-7 [limit]
  (get-nth-prime [] 2 limit))
