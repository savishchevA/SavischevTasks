package abstractfactory.ios;

import abstractfactory.Interviewer;

public class IosInterviewer implements Interviewer {

    private String name;
    private String location;
    private String workExperience;

    @Override
    public void createMainInterviewer() {
        name = "Denis Petrov";
        location = "Warsaw, Poland";
        workExperience = "10 years";
    }

    @Override
    public String toString() {
        return "IosInterviewer{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }
}
