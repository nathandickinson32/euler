(ns euler.level1.problem008)

(defn multiply-digits [n]
  (->> n
       str
       (map #(Integer/parseInt (str %)))
       (apply *)))

(defn ->all-substrings [number-as-string substring-length]
  (->> number-as-string
       (partition substring-length 1)
       (map #(apply str %))))

(defn max-product [number-as-string substring-length]
  (->> (->all-substrings number-as-string substring-length)
       (map multiply-digits)
       (apply max)))
