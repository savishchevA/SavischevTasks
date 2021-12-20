package factory;

import factory.project.*;

public class ProjectFactory extends Factory {

    @Override
    Project createProject(ProjectType type) {
        Project project = null;
        switch (type) {
            case ANDROID_PROJECT:
                project = new AndroidProject();
                break;
            case IOS_PROJECT:
                project = new IosProject();
                break;
            case WEB_PROJECT:
                project = new WebProject();
                break;
        }

        return project;
    }
}