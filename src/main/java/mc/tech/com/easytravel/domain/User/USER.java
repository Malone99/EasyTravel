package mc.tech.com.easytravel.domain.User;


import jakarta.persistence.*;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
public class USER {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  ID;
    private String idOrPassport;

    private String first_Given_Name;

    private String middleName;

    private String lastName;

    private String countryOfCitizenship;

    private String firstLanguage;

    private String GenderIdentity;

    private String DateOfBirth;

    private String sexualOrientation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactID")
    private Contact contact;

    public USER() {
    }

    USER(Builder builder) {
        this.idOrPassport=builder.idOrPassport;
        this.first_Given_Name=builder.first_Given_Name;
        this.middleName=builder.middleName;
        this.lastName=builder.lastName;
        this.DateOfBirth=builder.DateOfBirth;
        this.countryOfCitizenship=builder.countryOfCitizenship;
        this.GenderIdentity=builder.GenderIdentity;
        this.firstLanguage=builder.firstLanguage;
        this.sexualOrientation=builder.sexualOrientation;
    }


    public String getUserID() {
        return idOrPassport;
    }

    public Contact getContact() {
        return contact;
    }

    public String getFirst_Given_Name() {
        return first_Given_Name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountryOfCitizenship() {
        return countryOfCitizenship;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public String getGenderIdentity() {
        return GenderIdentity;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }
    public  static class Builder{

        private String idOrPassport;

        private String first_Given_Name;

        private String middleName;

        private String lastName;

        private String countryOfCitizenship;

        private String firstLanguage;

        private String GenderIdentity;

        private String DateOfBirth;

        private String sexualOrientation;

        private  Contact contact;

        public Builder setUserIDorPassport(String  idOrPassport) {
            idOrPassport = idOrPassport;
            return this;
        }
        public Builder setFirst_Given_Name(String first_Given_Name) {
            this.first_Given_Name = first_Given_Name;
            return this;
        }
        public Builder setIdOrPassport(String idOrPassport) {
            this.idOrPassport = idOrPassport;
            return this;
        }


        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCountryOfCitizenship(String countryOfCitizenship) {
            this.countryOfCitizenship = countryOfCitizenship;
            return this;
        }

        public Builder setFirstLanguage(String firstLanguage) {
            this.firstLanguage = firstLanguage;
            return this;
        }

        public Builder setGenderIdentity(String genderIdentity) {
            GenderIdentity = genderIdentity;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            DateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setSexualOrientation(String sexualOrientation) {
            this.sexualOrientation = sexualOrientation;
            return this;
        }
        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }
        public USER build(){
            return new USER(this);
        }
    }

}
