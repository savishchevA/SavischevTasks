package abstractfactory;

import abstractfactory.android.AndroidInterviewFactory;
import abstractfactory.ios.IosInterviewFactory;

public class AbstractFactoryTest {
    public static InterviewType type;

    public static void main(String[] args) {
        type = InterviewType.ANDROID;

        Factory factory = null;
        InterviewInformation interviewInformation;

        switch (type) {
            case ANDROID:
                factory = new AndroidInterviewFactory();
                break;
            case IOS:
                factory = new IosInterviewFactory();
                break;
        }

        interviewInformation = new InterviewInformation(factory);

        System.out.println(interviewInformation);


    }
}
