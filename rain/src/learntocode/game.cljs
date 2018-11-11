(ns learntocode.game
  (:require [learntocode.colors :as colors]
            [learntocode.canvas :refer [init-canvas text-large fill-square fill-rect]]))

(defn render [canvas model]
  (let [ctx (.getContext canvas "2d")]
    (init-canvas canvas)

    (fill-square ctx [50 50] 50 (:red colors/colors))


    (fill-rect ctx [100 50] 50 1000
      (:blue colors/colors))
    (fill-square ctx [150
                      50] 50 (:red colors/colors))

    (text-large ctx [250 150] "test" (:purple colors/colors))
    ))
