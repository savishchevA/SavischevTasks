package abstractfactory.ios;

import abstractfactory.Factory;
import abstractfactory.InterviewQuestions;
import abstractfactory.Interviewer;

public class IosInterviewFactory implements Factory {


    @Override
    public Interviewer createInterviewer() {
        return new IosInterviewer();
    }

    @Override
    public InterviewQuestions createInterviewQuestions() {
        return new IosInterviewQuestions();
    }
}
