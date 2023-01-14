package mc.tech.com.easytravel.domain.User;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
public class Contact {

    @Id
    @SequenceGenerator(name ="Contact_Sequence",sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 7,initialValue = 5001)
    @GeneratedValue(strategy = SEQUENCE ,generator = "Contact_Sequence")
    private int contactID;

    private String email;

    private String country;

    private String city;

    private String addressLine1;

    private String   postalCode;

    private String telephoneNumber;

    Contact(Builder builder) {
        this.contactID=builder.contactID;
        this.email=builder.country;
        this.city=builder.city;
        this.addressLine1=builder.addressLine1;
        this.postalCode=builder.postalCode;
        this.country=builder.country;
        this.telephoneNumber=builder.telephoneNumber;
    }

    public Contact() {

    }

    public int getContactID() {
        return contactID;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }

    public  static class Builder{


        private int contactID;

        private String email;

        private String country;

        private String city;

        private String addressLine1;

        private String   postalCode;

        private String telephoneNumber;


        public Builder setContactID(int contactID) {
            this.contactID = contactID;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }


    }



}
