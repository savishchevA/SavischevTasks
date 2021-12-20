package builder;

import builder.info.ContactInformation;
import builder.info.WorkExperience;

import java.util.List;

public class Candidate {

    private String name;
    private String surname;

    private String education;

    private List<String> skillsList;
    private List<WorkExperience> workExperienceList;
    private ContactInformation contactInformation;

    public static Builder newBuilder() {
        return new Candidate().new Builder();
    }

    public class Builder {
        private Builder() {}

        public Builder setName(String name) {
            Candidate.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            Candidate.this.surname = surname;
            return this;
        }

        public Builder setEducation(String education) {
            Candidate.this.education = education;
            return this;
        }

        public Builder setSkillsList(List<String> skillsList) {
            Candidate.this.skillsList = skillsList;
            return this;
        }

        public Builder setWorkExperienceList(List<WorkExperience> workExperienceList) {
            Candidate.this.workExperienceList = workExperienceList;
            return this;
        }

        public Builder setContactInformation(ContactInformation contactInformation) {
            Candidate.this.contactInformation = contactInformation;
            return this;
        }


        public Candidate build() {
            return Candidate.this;
        }
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", education='" + education + '\'' +
                ", skillsList=" + skillsList +
                ", workExperienceList=" + workExperienceList +
                ", contactInformation=" + contactInformation +
                '}';
    }
}
