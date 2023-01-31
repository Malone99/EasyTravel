package mc.tech.com.easytravel.service.domain;

import com.google.i18n.phonenumbers.NumberParseException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mc.tech.com.easytravel.domain.userAccount;
import mc.tech.com.easytravel.repository.userAccountRepository;
import mc.tech.com.easytravel.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
@Slf4j
public class userAccountService implements IService<userAccount,Integer> {
    @Autowired
     protected userAccountRepository repository;
    @Override
    public userAccount save(userAccount userAccount) {
        return this.repository.save(userAccount);
    }

    @Override
    public Optional<userAccount> read(Integer integer) {
        return this.repository.findById(integer);
    }

    @Override
    public userAccount findByiDD(int id) {
        return null;
    }

    @Override
    public List<userAccount> findALL() {
        List<userAccount>list=this.repository.findAll();
        return null;
    }

    @Override
    public userAccount update(userAccount userAccount) throws NumberParseException {
        return null;
    }
}
