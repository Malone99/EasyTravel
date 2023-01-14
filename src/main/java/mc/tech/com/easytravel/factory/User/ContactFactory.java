package mc.tech.com.easytravel.factory.User;

import com.google.i18n.phonenumbers.NumberParseException;
import mc.tech.com.easytravel.domain.User.Contact;
import mc.tech.com.easytravel.validation.isValid;

public class ContactFactory {

        public static Contact builderContact(String country, String city, String addressLine1, String   postalCode, String telephoneNumber) throws NumberParseException {


        isValid.checkStringPara("country",country);
        isValid.checkStringPara("lastName",city);
        isValid.checkStringPara("addressLine1",addressLine1);
        isValid.isPostCodeValid(postalCode);
        isValid.givenPhoneNumber_whenValid_thenOK(telephoneNumber);

  return new Contact.Builder().setCountry(country).setCity(city).setAddressLine1(addressLine1).setPostalCode(postalCode)
          .setTelephoneNumber(telephoneNumber).build();
    }
    public static Contact builderContactId(int id,String country,String city,String addressLine1,String   postalCode,String telephoneNumber) throws NumberParseException, NumberParseException {

        isValid.checkStringPara("id", String.valueOf(id));
        isValid.checkStringPara("country",country);
        isValid.checkStringPara("lastName",city);
        isValid.checkStringPara("addressLine1",addressLine1);
        isValid.isPostCodeValid(postalCode);
        isValid.givenPhoneNumber_whenValid_thenOK(telephoneNumber);

        return new Contact.Builder().setContactID(id).setCountry(country).setCity(city).setAddressLine1(addressLine1).setPostalCode(postalCode)
                .setTelephoneNumber(telephoneNumber).build();
    }
    public static void main(String[] args) throws NumberParseException {


    }
}
