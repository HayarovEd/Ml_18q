pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven ( url = "https://developer.huawei.com/repo/" )
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven ( url = "https://developer.huawei.com/repo/" )
    }
}

rootProject.name = "Ml_18q"
include(":app")
 