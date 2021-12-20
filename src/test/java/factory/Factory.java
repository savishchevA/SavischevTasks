package factory;

import factory.project.Project;
import factory.project.ProjectType;

abstract class Factory {

    abstract Project createProject(ProjectType type);
}
