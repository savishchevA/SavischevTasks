package abstractfactory.android;

import abstractfactory.InterviewQuestions;

public class AndroidInterviewQuestions implements InterviewQuestions {

    @Override
    public String[] basicTopics() {
        return new String[]{"Java", "Android SDK", "Jetpack components"};
    }

    @Override
    public String[] advanceTopics() {
        return new String[]{"Kotlin", "Coroutines", "Jetpack compose",};
    }

    @Override
    public String getAllTopics() {
        return String.join(", ", basicTopics()) + ", " + String.join(", ", advanceTopics());
    }
}
