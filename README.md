# cljogger

A Clojure library designed to allow for easy integration of logback

## Usage

```clojure
[cljogger "0.1.0"]
```

Need to use a :refer :all

```clojure
(:require [cljogger.core :refer :all])
...
(init-logger)
...
(log "something" some-symbol)
```
Available: debug, info, warn, error

## License

Copyright © 2014, Andrew Nguyen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
