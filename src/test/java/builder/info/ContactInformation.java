package builder.info;

public class ContactInformation {

    private String email;
    private String phoneNumber;

    private String telegram;

    public static Builder builder(
            String email, String phoneNumber
    ) {
        return new ContactInformation().new Builder(email, phoneNumber);
    }

    public class Builder {

        public Builder(String email, String phoneNumber) {
            ContactInformation.this.email = email;
            ContactInformation.this.phoneNumber = phoneNumber;
        }

        //
        public Builder addTelegramName(String telegramName) {
            ContactInformation.this.telegram = telegramName;
            return this;
        }


        public ContactInformation build() {
            return ContactInformation.this;
        }
    }


    @Override
    public String toString() {
        return "ContactInformation{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", telegram='" + telegram + '\'' +
                '}';
    }
}
