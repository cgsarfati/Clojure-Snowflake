;; defining namespace to live in this file 
(ns drawing.practice
  (:require [quil.core :as q]
            [quil.middleware :as m]))

;; setup 
(defn setup []
  {:flake (q/load-image "images/white_flake.png")
   :background (q/load-image "images/blue_background.png")})

;; used deconstructing to format this part; removes typing 'state'
(defn draw [{flake :flake background :background}]
  (q/background-image background)
  (q/image flake 200 10))

(q/defsketch practice
  :title "Clara's Quil practice"
  :size [500 500]
  :setup setup
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


