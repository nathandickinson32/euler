(ns euler.level1.problem009)

(defn triple-product [[a b c]]
  (* a b c))

(defn maybe-pythagorean? [a b c]
  (= (+ (* a a) (* b b)) (* c c)))

(defn find-triplets [target]
(for [a (range 1 target)
      b (range (inc a) target)
      :let [c (- target a b)]
      :when (and (< b c)
                 (maybe-pythagorean? a b c))]
  [a b c]))

(defn euler-9 [target]
  (-> (find-triplets target)
      first
      triple-product))

;(first (filter #(= 1000 (reduce + %)) triples))