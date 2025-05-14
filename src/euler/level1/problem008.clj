(ns euler.level1.problem008)

(defn multiply-digits [n]
  (->>
    ;char-seq
       n
       str
       (map #(Integer/parseInt (str %)))
       (apply *)))

; 1234 => "1234" => (\1 \2 \3 \4) => ("1" "2" "3" "4") => (1 2 3 4)

(defn ->all-substrings [number-as-string substring-length]
  (->> number-as-string
       (partition substring-length 1)
       (map #(apply str %))))

;partition-all

; "1234" => ((\1 \2) (\2 \3) (\3 \4)) => ("12" "23" "34")

(defn max-product [number-as-string substring-length]
  (->> (->all-substrings number-as-string substring-length)
       (map multiply-digits)
       (apply max)))
