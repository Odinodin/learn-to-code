(ns learntocode.main
  (:require [goog.dom :as gdom]
            [cljs.core.async :refer [chan <! >! put! close! timeout]]
            [learntocode.canvas :as canvas]
            [learntocode.game :as game])
  (:require-macros [cljs.core.async.macros :refer [go go-loop alt!]]))

(def canvas (gdom/getElement "draw-canvas"))

(defn animate []
  "Main loop"
  (canvas/animate animate)
  (game/render canvas {}))

(def speed 5000)

;; Start the game
(defonce game-loop
  (go-loop []
    (<! (timeout speed))
    #_(swap! model update-model)
    (recur)))

(defonce u (animate))

