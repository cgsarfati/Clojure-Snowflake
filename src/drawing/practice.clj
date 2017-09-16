;; defining namespace to live in this file 
(ns drawing.practice
  (:require [quil.core :as q]))

;; setup and draw functions and q/defsketch are added in step 1-3
(defn setup [])

(defn draw [])

(q/defsketch practice
  :title "Clara's Quil practice"
  :size [500 500]
  :setup setup
  :draw draw
  :features [:keep-on-top])


