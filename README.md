Scala installation [link](https://www.scala-lang.org/download/2.11.12.html)

## Steps to install scala on MAC

Download and install JDK 8 from [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) in your machine.

Install [Homebrew](https://brew.sh/) and then run the following command
```bash
$ brew install scala@2.11
$ brew install sbt
$ sbt clean compile
```

Alternatively if you are using IntelliJ IDEA, install Scala Jetbrains plugin by going to `IntelliJ IDEA > Preferences > Plugins`.

Goto `File > Project Structure > Global Libraries` and add a new global library for  `scala-sdk-2.11.12`.   