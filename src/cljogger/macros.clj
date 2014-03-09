(ns cljogger.macros)

(defn init-logger
  []
  (def logger# ^ch.qos.logback.classic.Logger (org.slf4j.LoggerFactory/getLogger (str *ns*)))
  (defn debug [& s#] (.debug logger# (apply str s#)))
  (defn info [& s#] (.info logger# (apply str s#)))
  (defn warn [& s#] (.warn logger# (apply str s#)))
  (defn error [& s#] (.error logger# (apply str s#)))
  logger#
  )
