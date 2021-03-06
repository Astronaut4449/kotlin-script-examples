
pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    }
}

include("jvm:basic:jvm-simple-script:script")
include("jvm:basic:jvm-simple-script:host")

include("jvm:basic:jvm-maven-deps:script")
include("jvm:basic:jvm-maven-deps:host")

include("jvm:basic:jvm-embeddable-host")

include("jvm:simple-main-kts:simple-main-kts")
include("jvm:simple-main-kts:simple-main-kts-test")
