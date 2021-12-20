package abstractfactory;

public class InterviewInformation {

    private Interviewer interviewer;
    private InterviewQuestions interviewQuestions;

    public InterviewInformation(Factory factory) {
        interviewer = factory.createInterviewer();
        interviewer.createMainInterviewer();
        interviewQuestions = factory.createInterviewQuestions();
    }

    @Override
    public String toString() {
        return "InterviewInformation{" + "\n" +
                "interviewer=" + interviewer + "\n" +
                "interviewQuestions =" + interviewQuestions.getAllTopics() +
                '}';
    }
}
