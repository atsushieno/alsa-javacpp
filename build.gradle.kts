plugins {
    id("org.bytedeco.gradle-javacpp-build") version "1.5.10" apply false
}

repositories {
    mavenCentral()
}

allprojects {
    group = "dev.atsushieno"
    version = "0.1.0"
    repositories {
        mavenCentral()
    }
}