# AtlantaFX Starter

A really quick skeleton project to get started with AtlantaFX and Maven. Just clone or download the repo and use it.

## How to use

To clone the repo:

```shell
git clone https://github.com/mkpaz/atlantafx-starter
```

To run the app:

```shell
# omit java.home property if OS Java version is the same as project Java version
mvn javafx:run -Djava.home=<path-to-jdk>
```

To run the app in debug mode:

```shell
mvn javafx:run@debug -Djava.home=<path-to-jdk>
```
