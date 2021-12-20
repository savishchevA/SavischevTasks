package factory.project;

public class AndroidProject implements Project {

    private String projectName;
    private Integer members;

    @Override
    public void initSettings() {
        projectName = "AndroidSampleName";
        members = 10;
    }

    @Override
    public String toString() {
        return "AndroidProject{" +
                "projectName='" + projectName + '\'' +
                ", members=" + members +
                '}';
    }
}
