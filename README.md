# alsa-javacpp

alsa-javacpp is an ALSA JNI binding based on [JavaCPP](https://github.com/bytedeco/javacpp) technology.

alsa-javacpp is created mostly for use in [ktmidi](https://github.com/atsushieno/ktmidi) project.

It is a successor of my alsakt project, that strips Kotlin dependency and
OO-Wrapper part which is now part of ktmidi project (in ktmidi-jvm-desktop).

## Building

It is a Gradle Kotlin/JVM project and `./gradlew build` takes care of the Kotlin/JVM part.

Unlike alsakt, alsa-javacpp depends on local installation of `libasound.so`.
Your Linux system is supposed to have that shared library.

## Licenses

alsa-javacpp is released under the MIT license.

[JavaCPP](https://github.com/bytedeco/javacpp/) is distributed under Apache V2 license.

