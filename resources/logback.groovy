import static ch.qos.logback.classic.Level.WARN
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.DEBUG

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

appender("CONSOLE", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    //pattern = "%-4relative [%thread] - %msg%n"
    pattern = "%date - [%thread] - %-5level: %message%n"
  }
}
root(WARN, ["CONSOLE"])

//Adding logging for other packages:
//logger("com.foo", INFO)
