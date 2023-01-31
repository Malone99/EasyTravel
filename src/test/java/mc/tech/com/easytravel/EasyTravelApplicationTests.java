package mc.tech.com.easytravel;

import lombok.extern.slf4j.Slf4j;
import mc.tech.com.easytravel.domain.User.USER;
import mc.tech.com.easytravel.domain.userAccount;
import mc.tech.com.easytravel.factory.userAccountFactory;
import mc.tech.com.easytravel.service.domain.userAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class EasyTravelApplicationTests {

    @Autowired
    userAccountService service;
    USER user= new USER();
    userAccount useraccount= userAccountFactory.UserAccountBuilder("dray bulambo","draybulambo45@gmail.com","dray@qwer","dray@qwer",user);
    @Test
    void save() {

        userAccount account=this.service.save(useraccount) ;
        log.info("account was created ",account.toString());

    }


}
