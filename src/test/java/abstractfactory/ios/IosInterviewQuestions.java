package abstractfactory.ios;

import abstractfactory.InterviewQuestions;

public class IosInterviewQuestions implements InterviewQuestions {

    @Override
    public String[] basicTopics() {
        return new String[] {"Swift", "UIKit", "CoreLocation"};
    }

    @Override
    public String[] advanceTopics() {
        return new String[] {"Firebase", "Realm"};
    }

    @Override
    public String getAllTopics() {
        return String.join(", ", basicTopics()) + ", " + String.join(", ", advanceTopics());
    }
}
