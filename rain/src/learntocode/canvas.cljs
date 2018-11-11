(ns learntocode.canvas)

(def animate
  "Request animation frame"
  (or (.-requestAnimationFrame js/window)
      (.-oRequestAnimationFrame js/window)
      (.-mozRequestAnimationFrame js/window)
      (.-webkitRequestAnimationFrame js/window)
      (.-msRequestAnimationFrame js/window)
      (fn [callback] (js/setTimeout callback 17))))

(defn init-canvas [canvas]
  "Clears the canvas"
  (let [ctx (.getContext canvas "2d")
        width (.-width canvas)
        height (.-height canvas)]
    (.clearRect ctx 0 0 width height)))

(defn fill-rect [ctx [x y] width height fill-style]
  (do
    (set! (. ctx -fillStyle) fill-style)
    (.fillRect ctx x y width height)))

(defn fill-square [ctx pos width fill-style]
  (fill-rect ctx pos width width fill-style))

(defn text [ctx [x y] text-string fill-style font]
  (do
    (set! (. ctx -fillStyle) fill-style)
    (set! (. ctx -font) font)
    (.fillText ctx text-string x y)))

(defn text-large [ctx pos text-string fill-style]
  (text ctx pos text-string fill-style "60px verdana"))

(defn text-small [ctx pos text-string fill-style]
  (text ctx pos text-string fill-style "30px verdana"))
