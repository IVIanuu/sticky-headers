@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.stickyheaders.sample"
    const val buildToolsVersion = "28.0.2"
    const val compileSdk = 28
    const val minSdk = 14
    const val targetSdk = 28

    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Versions {
    const val androidGradlePlugin = "3.2.0"

    const val androidx = "1.0.0"

    const val kotlin = "1.3.0-rc-57"
    const val mavenGradle = "2.1"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidx}"
    const val androidxRecyclerView = "androidx.recyclerview:recyclerview:${Versions.androidx}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
}