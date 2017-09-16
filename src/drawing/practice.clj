;; defining namespace to live in this file 
(ns drawing.practice
  (:require [quil.core :as q]
            [quil.middleware :as m]))


;; setup 
(defn setup []
  (q/smooth)
  {:flake (q/load-image "images/white_flake.png")
   :background (q/load-image "images/blue_background.png")
   :y-param 10})
  
;; falling snowflake feature
(defn update [state]
  ;; updating y parameter by one for movement
  (update-in state [:y-param] inc))

(defn draw [state]
  ;; drawing blue background and a snowflake on it
  (q/background-image (:background state))
  (q/image (:flake state) 200 (:y-param state)))
 
;; different format of draw
(defn draw2 [state]
  (let [flake (:flake state)
        background (:background state)
        y-param (:y-param state)]
    (q/background-image background)
    (q/image flake 200 y-param)))

;; different format of draw
(defn draw3 [{background :background flake :flake y-param :y-param}]
  (q/background-image background)
  (q/image flake 200 y-param))

;; different format of draw
(defn draw4 [{:keys [background flake y-param]}]
  (q/background-image background)
  (q/image flake 200 y-param))


(q/defsketch practice
  :title "Charlotte's Quil practice"
  :size [500 500]
  :setup setup
  :update update
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
 

