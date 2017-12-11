(defproject quiescent "0.3.2"
  :description "A minimal, functional ClojureScript wrapper for ReactJS"
  :url "http://github.com/levand/quiescent"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [cljsjs/react-dom "16.2.0-0" :exclusions [cljsjs/react]]]
  :source-paths ["src"])
