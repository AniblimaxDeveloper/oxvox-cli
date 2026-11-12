pluginManagement {
    repositories {
        maven { url = uri("https://repo.aliyun.com/maven/") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven { url = uri("https://repo.aliyun.com/maven/") }
        google()
        mavenCentral()
    }
}
rootProject.name = "OXVOX"
include(":app")
