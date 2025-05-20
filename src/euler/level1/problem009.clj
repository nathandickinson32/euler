(ns euler.level1.problem009
  (:require [euler.level1.core :as core]))

(defn triple-product [[a b c]]
  (* a b c))

(defn maybe-pythagorean? [a b c]
  (= (+ (core/square a) (core/square b)) (core/square c)))

(defn pythagorean-triples [target]
  (for [a (range 1 target)
        b (range (inc a) target)
        :let [c (- target a b)]
        :when (and (< b c)
                   (maybe-pythagorean? a b c))]
    [a b c]))

(defn euler-9 [target]
  (-> (pythagorean-triples target)
      first
      triple-product))