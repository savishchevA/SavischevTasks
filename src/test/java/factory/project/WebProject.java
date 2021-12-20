package factory.project;


public class WebProject  implements Project {

    private String projectName;
    private String baseLink;
    private String neededSkills;

    @Override
    public void initSettings() {
        projectName = "WebSampleName";
        baseLink = "baselink.com";
    }

    @Override
    public String toString() {
        return "WebProject{" +
                "projectName='" + projectName + '\'' +
                ", baseLink='" + baseLink + '\'' +
                ", neededSkills='" + neededSkills + '\'' +
                '}';
    }
}
