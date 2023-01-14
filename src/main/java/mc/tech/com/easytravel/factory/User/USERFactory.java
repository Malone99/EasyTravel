package mc.tech.com.easytravel.factory.User;

import mc.tech.com.easytravel.domain.User.Contact;
import mc.tech.com.easytravel.domain.User.USER;
import mc.tech.com.easytravel.validation.isValid;

public class USERFactory {

        public static USER builderUser(String idOrPassport,
            String first_Given_Name,String middleName, String lastName, String countryOfCitizenship,
            String firstLanguage,String GenderIdentity,String DateOfBirth,String sexualOrientation,
            Contact contact)
    {
        isValid.checkStringPara("first_Given_Name",first_Given_Name);
        isValid.checkStringPara("lastName",lastName);
        isValid.checkStringPara("countryOfCitizenship",countryOfCitizenship);
        isValid.checkStringPara("firstLanguage",firstLanguage);
        isValid.checkStringPara("GenderIdentity",GenderIdentity);
        isValid.IsValidDate(DateOfBirth);
        isValid.checkStringPara("sexualOrientation",sexualOrientation);


    return new USER.Builder().setIdOrPassport(idOrPassport).setFirst_Given_Name(first_Given_Name).setMiddleName(middleName).setLastName(lastName)
            .setCountryOfCitizenship(countryOfCitizenship).setFirstLanguage(firstLanguage).setGenderIdentity(GenderIdentity)
            .setDateOfBirth(DateOfBirth).setSexualOrientation(sexualOrientation).setContact(contact).build();
    }
}
