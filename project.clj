(def agentproxy-version "0.0.9")

(defproject clj-commons/clj-ssh "0.5.15-SNAPSHOT"
  :description "Library for using SSH from clojure."
  :url "https://github.com/clj-commons/clj-ssh"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.logging "0.2.6"
                  :exclusions [org.clojure/clojure]]
                 [com.jcraft/jsch.agentproxy.usocket-jna "0.0.9"]
                 [com.jcraft/jsch.agentproxy.usocket-nc "0.0.9"]
                 [com.jcraft/jsch.agentproxy.sshagent "0.0.9"]
                 [com.jcraft/jsch.agentproxy.pageant "0.0.9"]
                 [com.jcraft/jsch.agentproxy.core "0.0.9"]
                 [com.jcraft/jsch.agentproxy.jsch "0.0.9"]
                 [com.github.mwiede/jsch "0.1.65"]]
  :jvm-opts ["-Djava.awt.headless=true"]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.10.1"]]}})
