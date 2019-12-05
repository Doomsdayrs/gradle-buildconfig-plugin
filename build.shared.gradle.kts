allprojects {

    repositories {
        jcenter()
    }

    group = "com.github.gmazzo"
    version = "1.6.2"

    project.plugins.withType(JavaPlugin::class.java) {
        dependencies.add("testImplementation", "junit:junit:4.12")
        dependencies.add("testImplementation", "org.mockito:mockito-core:2.27.0")
    }

}
