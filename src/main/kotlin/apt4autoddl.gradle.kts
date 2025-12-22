plugins {
    id("site.addzero.gradle.plugin.apt-buddy")
}

// 定义共享的配置
val aptConfigMap = mapOf(
    //spring资源目录,用于猜测配置
    "springResourcePath" to "",

    //可选beg,会从application.yml或者激活的配置文件中猜测
    "jdbcUrl" to "",
    "jdbcUsername" to "",
    "jdbcPassword" to "",
    //可选end
    //会从Url中猜测schema(database)
    "jdbcSchema" to "",

    "outputDirectory" to "",
    "generateCreateTable" to "true",
    "generateDropTable" to "true",
    "generateAlterTable" to "true",
    "allowDrop" to "true",
    "ignoreCase" to "true",
    "compareComments" to "true",
    "autoConvertTypes" to "true",
    "strictTypeMatch" to "true",
)

aptBuddy {
    mustMap = aptConfigMap
    packageName = "org.babyfish.jimmer.apt.config"
    outputDir = "src/main/kotlin"
}

