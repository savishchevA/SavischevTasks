package factory.project;

public class IosProject implements Project {

    private String projectName;
    private String githubLink;

    @Override
    public void initSettings() {
        projectName = "IOSSampleName";
        githubLink = "github.com/iosproject";
    }

    @Override
    public String toString() {
        return "IosProject{" +
                "projectName='" + projectName + '\'' +
                ", githubLink='" + githubLink + '\'' +
                '}';
    }
}
