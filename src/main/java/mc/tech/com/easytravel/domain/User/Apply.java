package mc.tech.com.easytravel.domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import static jakarta.persistence.GenerationType.SEQUENCE;
@Entity
public class Apply {

    @Id
    @SequenceGenerator(name ="Apply",sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 1000,initialValue = 0001)
    @GeneratedValue(strategy = SEQUENCE ,generator = "Apply")
    private int ApplyNum;

    private String Subject;

    private String Start;

    private String End;

    Apply(Builder builder) {
        this.ApplyNum=builder.ApplyNum;
        this.Subject=builder.Subject;
        this.Start=builder.Start;
        this.End=builder.End;
        this.Located=builder.Located;
    }

    public Apply() {

    }

    public int getApplyNum() {
        return ApplyNum;
    }

    public String getSubject() {
        return Subject;
    }

    public String getStart() {
        return Start;
    }

    public String getEnd() {
        return End;
    }

    public String getLocated() {
        return Located;
    }

    private String Located;
    @Override
    public String toString() {
        return "Apply{" +
                "ApplyNum=" + ApplyNum +
                ", Subject='" + Subject + '\'' +
                ", Start='" + Start + '\'' +
                ", End='" + End + '\'' +
                ", Located='" + Located + '\'' +
                '}';
    }

    public  static class Builder{

        private int ApplyNum;

        private String Subject;

        private String Start;

        private String End;

        private String Located;

        public Builder setApplyNum(int applyNum) {
            ApplyNum = applyNum;
            return this;
        }

        public Builder setSubject(String subject) {
            Subject = subject;
            return this;
        }

        public Builder setStart(String start) {
            Start = start;
            return this;
        }

        public Builder setEnd(String end) {
            End = end;
            return this;
        }

        public Builder setLocated(String located) {
            Located = located;
            return this;
        }

        public Apply build(){
            return new Apply(this);
        }

    }


}
