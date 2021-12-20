package singleton;

public class InterviewSession {

    private static InterviewSession INSTANCE;

    public String interviewer;
    public String time;

    private InterviewSession(String interviewer, String time) {
        this.interviewer = interviewer;
        this.time = time;
    }

    public static InterviewSession getInstance(
            String interviewer,
            String time
    ) {
        if (INSTANCE == null) {
            INSTANCE = new InterviewSession(interviewer, time);
        }
        return INSTANCE;
    }
}
