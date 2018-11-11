(ns learntocode.dev
  (:require [learntocode.main]))

(js/console.log "In dev")



(defn on-js-reload []
  (prn "reloading"))