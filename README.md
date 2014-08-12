Finagle examples in Java
========================
Example is based directly off of [Finagle Quickstart](http://twitter.github.io/finagle/guide/Quickstart.html)

Getting started
---------------

compile
```
$ mvn clean -U compile assembly:single
```

run
```
$ java -cp target/finagle-playground-1.0-SNAPSHOT-jar-with-dependencies.jar com.tekphile.finagle_playground.FinagleHttpServiceJavaExample
```

confirm that it works
```
$ curl -D - localhost:8080
```
