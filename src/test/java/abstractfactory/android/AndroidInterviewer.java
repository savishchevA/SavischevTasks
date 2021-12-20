package abstractfactory.android;

import abstractfactory.Interviewer;

public class AndroidInterviewer implements Interviewer {

    private String name;
    private String teamName;

    @Override
    public void createMainInterviewer() {
        name = "Ivan Ivanov";
        teamName = "Alfa bank";
    }

    @Override
    public String toString() {
        return "AndroidInterviewer{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
