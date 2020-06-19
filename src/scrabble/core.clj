(ns scrabble.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn scramble [word]
  (->> word
       seq
       shuffle
       (apply str)))

(defn sentence-scramble [sentence]
  (->> (str/split sentence #" ")
       (map scramble)
       (str/join " ")))

(def sentence
  "this is pure gibberish man")

(sentence-scramble sentence)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Can you guess the sentence? \n"
           (sentence-scramble sentence)))
