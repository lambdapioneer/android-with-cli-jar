# Sample project: Android project with library module and CLI target

[![Full CI](https://github.com/lambdapioneer/android-with-cli-jar/actions/workflows/full.yml/badge.svg)](https://github.com/lambdapioneer/android-with-cli-jar/actions/workflows/full.yml)

This repository documents how to set-up an Android Studio project with .gradle with:
 - A shared library module (with unit tests)
 - An Android app target (with unit and instrumentation tests)
 - A cross-platform CLI .jar target
 - A GitHub actions configurations
 
I found this kind of configuration helpful when iterating on algorithms in libraries.
With the CLI .jar target I am able to run them locally on my machine (and beefy servers) against larger inputs.
It also allows to create a local UI application for QA.


## Project layout

The project consists of three modules:

`:lib` contains the shared library code and should only rely on pure Java/Kotlin dependencies.
It comes with unit tests.

`:app` contains a sample Android application with a minimal UI.
It comes with both unit tests and instrumented UI tests (using espresso).

`:cli` contains a sample CLI application that can run on "normal" computers from the command line.
It is configured to build a "fat jar" which bundles all dependencies similar to how one is used to from .apk files.


## Running

The following commands run through the important bits of this project:

```bash
# Clean everything (often a good idea)
./gradlew clean

# Build and unit test library
./gradlew :lib:test

# Build CLI .jar and run it
./gradlew :cli:jar
java -jar ./cli/build/libs/cli.jar "Hello"

# Unit test app
./gradlew :app:test

# Instrumented test of the app (using Espresso)
./gradlew :app:connectedAndroidTest

# Run app
./gradlew :app:installDebug
adb shell am start -n org.example.droidjar.app/.MainActivity
```
