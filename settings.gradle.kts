rootProject.name = "spring-startup-to-collapse-stack"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("jackson", "2.18.1")

            library("jackson.core", "com.fasterxml.jackson.core", "jackson-core").versionRef("jackson")
            library("jackson.databind", "com.fasterxml.jackson.core", "jackson-databind").versionRef("jackson")
            library("jackson.jsr310", "com.fasterxml.jackson.datatype", "jackson-datatype-jsr310").versionRef("jackson")

            bundle("jackson", listOf(
                    "jackson.core",
                    "jackson.databind",
                    "jackson.jsr310"
            ))

            // Test Deps
            version("assertj", "3.26.3")
            version("junit", "5.11.3")

            library("test.assertj.core", "org.assertj", "assertj-core").versionRef("assertj")
            library("test.junit.api", "org.junit.jupiter", "junit-jupiter-api").versionRef("junit")
            library("test.junit.engine", "org.junit.jupiter", "junit-jupiter-engine").versionRef("junit")
        }
    }
}
