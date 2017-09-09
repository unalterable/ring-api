(defproject ring-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                [ring/ring-core "1.6.2"]
                [ring/ring-jetty-adapter "1.5.0"]]
  :main ^:skip-aot ring-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies  [[clj-http "3.7.0"]]}})
