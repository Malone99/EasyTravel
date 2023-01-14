package mc.tech.com.easytravel.factory.User;


import mc.tech.com.easytravel.domain.User.Apply;

import mc.tech.com.easytravel.validation.isValid;

public class ApplyFactory {

    public static Apply builderContact(String Subject, String Start,String End,String Located) {


        isValid.checkStringPara("Subject failed",Subject);
        isValid.checkStringPara("Start failed",Start);
        isValid.checkStringPara("End failed",End);
        isValid.checkStringPara("End failed",Located);


       return new Apply.Builder().setLocated(Subject).setStart(Start).setEnd(End).setLocated(Located).build();
    }
}
