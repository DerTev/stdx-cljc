(defproject stdx-cljc "0.1.0"
  :description "Standart Library Extensions for Clojure and ClojureScript"
  :url "https://github.com/dertev/stdx-cljc"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot stdx-cljc.core
  :repositories [["devcord" {:url "https://repo.devcord.club/"
                              :username [:gpg :env/devcord_username]
                              :password [:gpg :env/devcord_password]}]])
