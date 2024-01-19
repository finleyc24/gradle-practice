plugins {
    java
    checkstyle
}

repositories {
    mavenCentral()
}

checkstyle {
    val archive = configurations.checkstyle.get().resolve().filter {
        it.name.startsWith("checkstyle")
    }
    config = resources.text.fromArchiveEntry(archive, "google_checks.xml")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.named<ProcessResources>("processResources") {
    eachFile{
        println("Copying: $sourceName to $destinationDir")
    }
}

tasks.jar{
    val archiveName by archiveFileName
        eachFile {
            println("Jar file: $sourceName will be included in $archiveName")
            }
        }