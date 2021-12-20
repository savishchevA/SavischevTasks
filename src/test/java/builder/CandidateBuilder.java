package builder;

import builder.info.ContactInformation;
import builder.info.WorkExperience;

import java.util.List;

public class CandidateBuilder extends Builder {

    private Candidate candidate;

    @Override
    public Builder createCandidate() {
        this.candidate = new Candidate();
        return this;
    }

    @Override
    public Builder addSkills(List<String> skillsList) {
        return null;
    }

    @Override
    public Builder addWorkExperience(List<WorkExperience> workExperiences) {

        return null;
    }

    @Override
    public Builder addName(String name) {
        return null;
    }

    @Override
    public Builder addSurname(String surname) {
        return null;
    }

    @Override
    public Builder addEducation(String education) {
        return null;
    }

    @Override
    public Builder addContactInformation(ContactInformation contactInformation) {
        return null;
    }
}
