package com.github.arpic.buildnotifier.services

import com.intellij.openapi.project.Project
import com.github.arpic.buildnotifier.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
