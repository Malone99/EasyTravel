package mc.tech.com.easytravel.domain;

import jakarta.persistence.*;
import mc.tech.com.easytravel.domain.User.Contact;
import mc.tech.com.easytravel.domain.User.USER;
import org.jetbrains.annotations.NotNull;

import static jakarta.persistence.GenerationType.SEQUENCE;
@Entity
public class userAccount {
    @Id
    @SequenceGenerator(name = "userAccount", sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 7, initialValue = 7001)
    @GeneratedValue(strategy = SEQUENCE, generator = "userAccount")

    private int UserNumber;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String confirm_password;

    private String code;
    @NotNull
    private String status;

    public userAccount() {

    }
    public int getUserNumber() {
        return UserNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public String getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public USER getUser() {
        return user;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    private  USER user;

    public userAccount(Builder builder) {
        this.name=builder.name;
        this.email=builder.email;
        this.password=builder.password;
        this.confirm_password=builder.confirm_password;
        this.UserNumber=builder.UserNumber;
        this.user=builder.user;
        this.code=builder.code;
        this.status=builder.status;

    }


    public static class  Builder {

        private int UserNumber;

        private String name;

        private String email;

        private String password;

        private String confirm_password;

        private String code;

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        private String status;

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        private  Contact contact;

        public Builder setUser(USER user) {
            this.user = user;
            return this;
        }

        private  USER user;

        public Builder setUserNumber(int userNumber) {
            UserNumber = userNumber;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public void setUserr(USER user) {
            this.user = user;
        }
        public Builder setConfirm_password(String confirm_password) {
            this.confirm_password = confirm_password;
            return this;
        }

        public userAccount bulde(){
            return  new userAccount(this)  ;
        }

    }
}


