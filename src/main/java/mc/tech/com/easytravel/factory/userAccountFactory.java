package mc.tech.com.easytravel.factory;

import mc.tech.com.easytravel.domain.User.USER;
import mc.tech.com.easytravel.domain.userAccount;
import mc.tech.com.easytravel.validation.isValid;

public class userAccountFactory {

    public static userAccount UserAccountBuilder(String name, String email, String password, String confirm_password, USER user)
    {

        isValid.checkStringPara("name",name);
        isValid.IsValidEmail(email);
        isValid.checkStringPara("password",password);
        isValid.checkStringPara("confirm_password",confirm_password);


     return new userAccount.Builder().setName(name).setEmail(email).setPassword(password).setConfirm_password(confirm_password)
             .setUser(user).bulde();
    }
}
