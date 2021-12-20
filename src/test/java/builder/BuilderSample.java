package builder;

import builder.info.ContactInformation;

import java.util.Arrays;

public class BuilderSample {

    public static void main(String[] args) {
        Candidate candidate = Candidate.newBuilder()
                .setName("Name")
                .setSurname("Surname")
                .build();


        Candidate candidate2 = Candidate.newBuilder()
                .setName("Name2")
                .setSurname("Surname2")
                .setSkillsList(Arrays.asList("Java", "Kotlin"))
                .setEducation("BSU")
                .setContactInformation(
                        ContactInformation
                                .builder(
                                        "name2@gmail.com",
                                        "+3558842004"
                                )
                                .build()
                )
                .build();


        System.out.println(candidate.toString());
        System.out.println(candidate2.toString());
    }

}
