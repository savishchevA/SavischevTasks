package abstractfactory.android;

import abstractfactory.Factory;
import abstractfactory.InterviewQuestions;
import abstractfactory.Interviewer;

public class AndroidInterviewFactory implements Factory {

    @Override
    public Interviewer createInterviewer() {
        return new AndroidInterviewer();
    }

    @Override
    public InterviewQuestions createInterviewQuestions() {
        return new AndroidInterviewQuestions();
    }
}
