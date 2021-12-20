package builder.info;

import java.util.List;

public class WorkExperience {

    private String companyName;
    private String positionName;

    //Set value in age
    private Integer experience;

    //Add if has 
    private List<String> projectsLinks;

    private WorkExperience() {
    }

    public static Builder newBuilder() {
        return new WorkExperience().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setCompanyName(String companyName) {
            WorkExperience.this.companyName = companyName;
            return this;
        }

        public Builder setPositionName(String positionName) {
            WorkExperience.this.positionName = positionName;
            return this;
        }

        public Builder setExperience(Integer experience) {
            WorkExperience.this.experience = experience;
            return this;
        }

        public Builder setProjectsLinks(List<String> projectsLinks) {
            WorkExperience.this.projectsLinks = projectsLinks;
            return this;
        }

        public WorkExperience build() {
            return WorkExperience.this;
        }
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "companyName='" + companyName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", experience=" + experience +
                ", projectsLinks=" + projectsLinks +
                '}';
    }
}
