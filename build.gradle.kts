plugins {
  id("base")
  id("java")

  id("maven-publish")

  kotlin("jvm") version "1.3.61" apply false
  kotlin("kapt") version "1.3.61" apply false

  kotlin("plugin.allopen") version "1.3.61" apply false
//  kotlin("plugin.spring") version "1.3.61" apply false

//  id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
//  id("org.springframework.boot") version "2.2.6.RELEASE" apply false

//  id("com.google.cloud.tools.jib") version "2.2.0" apply false
}
version = "0.1"
group = "com.github.johnlayton.brucestreet"
//import org.gradle.plugins.ide.idea.model.IdeaProject
//import org.jetbrains.gradle.ext.ProjectSettings
//import org.jetbrains.gradle.ext.RunConfiguration
//import org.gradle.kotlin.dsl.create
//import org.jetbrains.gradle.ext.Gradle

//plugins {
////  id("org.jetbrains.gradle.plugin.idea-ext") version "0.7"
//}

//val amberleyway: (IncludedBuild) -> Boolean = {
//  it.name.matches(Regex("amberleyway|riverhilldrive|sidwellcourt|brucestreet"))
//}

/*
val upstreams = gradle.includedBuilds.filter(amberleyway).map {
  tasks.register<Exec>("set-upstream-${it.name}") {
    group = "composite"
    description = "relocate the ${it.name} repository"
    commandLine("./set-upstream.zsh", "${it.projectDir}")
  }
}

tasks.register("relocate-repositories") {
  group = "composite"
  description = "relocate the repositories"
  dependsOn(upstreams)
}
*/

//tasks.register("upgrade-gradle") {
//  dependsOn(gradle.includedBuilds.filter(amberleyway).map {
//    listOf(
//        it.task(":upgradeGradle")
//    )
//  })
//}
//
//idea {
//  project {
//    settings {
//      runConfigurations {
//        create<Gradle>("Upgrade Gradle") {
//          projectPath = projectDir.absolutePath
//          taskNames = listOf("upgrade-gradle")
//        }
//        gradle.includedBuilds.filter(amberleyway).map {
//          create<Gradle>("Upgrade Gradle ${it.name}") {
//            projectPath = it.projectDir.absolutePath
//            taskNames = listOf("upgradeGradle")
//          }
//        }
//      }
//    }
//  }
//}
//
//fun IdeaProject.settings(configuration: ProjectSettings.() -> Unit) = (this as ExtensionAware).configure(configuration)
//
//fun ProjectSettings.runConfigurations(configuration: PolymorphicDomainObjectContainer<RunConfiguration>.() -> Unit) = (this as ExtensionAware).configure<NamedDomainObjectContainer<RunConfiguration>> {
//  (this as PolymorphicDomainObjectContainer<RunConfiguration>).apply(configuration)
//}
