(defproject clojure-koans "0.5.0-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [koan-engine "0.2.1"]]
  :dev-dependencies [[lein-koan "0.1.2"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.2"]]}}
  :repl-options {:init-ns user}
  :plugins [[lein-koan "0.1.2"], 
            [cider/cider-nrepl "0.7.0-SNAPSHOT"]]
  :main koan-engine.runner/exec)
