# Scala-CLI vs SBT configs

Working directory for all following commands is assumed to be the root of this repository.

## Scala-CLI

> **Note**
> Not sure about “best-practice” folder structure for Scala-CLI projects. Should hierarchy follow packages structure like in SBT or Java projects?

### Test `mylib`

```
scala-cli --power test scala-cli/mylib
```

### Publish `mylib` locally

```
scala-cli --power publish local scala-cli/mylib
```

Documentation: https://scala-cli.virtuslab.org/docs/commands/publishing/publish-local/.

### Run `myproject`

To open `myproject` in VSCode:

```
scala-cli scala-cli/myproject
```

## SBT

Example project: https://github.com/scala/scala3-example-project.

> **Note**
> Is it required and/or recommended to prefix some options with `ThisBuild /`? What is the default scope if no prefix?

### Test `mylib`

```
cd sbt/mylib
sbt test
```

### Publish `mylib` locally

```
cd sbt/mylib
sbt publishLocal
```

Documentation: https://www.scala-sbt.org/1.x/docs/Publishing.html#Publishing+locally.

### Run `myproject`

```
cd sbt/myproject
sbt run
```

## Extra

### List JAR content

```
jar -tf ~/.ivy2/local/com.example/mylib_3/0.1.0-SNAPSHOT/jars/mylib_3.jar
```
