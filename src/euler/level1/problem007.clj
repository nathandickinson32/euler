(ns euler.level1.problem007)

(defn is-prime? [cursor primes]
  (not-any? #(zero? (mod cursor %)) primes))

(defn maybe-add-cursor-to-prime [cursor primes]
  (if (is-prime? cursor primes)
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
