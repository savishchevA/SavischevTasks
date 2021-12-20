package builder;

import builder.info.ContactInformation;
import builder.info.WorkExperience;

import java.util.List;

abstract class Builder {

    public abstract Builder createCandidate();

    public abstract Builder addWorkExperience(List<WorkExperience> workExperiences);

    public abstract Builder addSkills(List<String> skillsList);

    public abstract Builder addName(String name);

    public abstract Builder addSurname(String surname);

    public abstract Builder addEducation(String education);

    public abstract Builder addContactInformation(ContactInformation contactInformation);

}
