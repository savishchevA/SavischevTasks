package factory;

import factory.project.Project;
import factory.project.ProjectType;

public class FactoryTest {
    public static void main(String[] args) {
        ProjectFactory factory = new ProjectFactory();

        Project androidProject = factory.createProject(ProjectType.ANDROID_PROJECT);
        androidProject.initSettings();

        Project webProject = factory.createProject(ProjectType.WEB_PROJECT);
        webProject.initSettings();

        System.out.println(androidProject);
        System.out.println(webProject);
    }
}
