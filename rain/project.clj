(defproject learn-to-code-rain "0.1.0-SNAPSHOT"
  :description "Learn to code - Rain"
  :dependencies [[org.clojure/clojure "1.10.0-beta5"]
                 [org.clojure/core.async "0.4.474"]]
  :plugins [[lein-cljsbuild "1.1.7"]]

  :jvm-opts ["-Xmx1G"]
  :source-paths ["src" "dev"]

  :profiles {:dev
             {:dependencies [[org.clojure/clojurescript "1.10.339"]
                             [com.bhauman/figwheel-main "0.1.9"]]
              :resource-paths ["target"]
              :clean-targets ^{:protect false} ["target" "resources/public/js/compiled"]}}

  :repl {:source-paths ["dev"]}



  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]}

  )
