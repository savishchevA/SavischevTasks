package singleton;

public class SingletonTest {

    public static void main(String[] args) {
        InterviewSession session1 = InterviewSession.getInstance("Ivanov", "12:20");
        InterviewSession session2 = InterviewSession.getInstance("Petrov", "11:40");

        System.out.println(session1.interviewer + " " + session1.time);
        System.out.println(session2.interviewer + " " + session2.time);

        InterviewSessionEnum sessionEnum1 = InterviewSessionEnum.INSTANCE;
        sessionEnum1.setInterviewer("Ivanov");
        sessionEnum1.setTime("12:21");


        System.out.println(sessionEnum1.interviewer + " " + sessionEnum1.time);
    }
}
