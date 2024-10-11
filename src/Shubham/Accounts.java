package Shubham;
   abstract class Account {
        private long acc_no;
        private String name,email;
        private float amount;

        double getAcc_no() {
            return acc_no;
        }

        void setAcc_no(long acc_no) {
            this.acc_no = acc_no;
        }
        String getName() {
            return name;
        }
        void setName(String name) {
            this.name = name;
        }
        String getEmail() {
            return email;
        }
        void setEmail(String email) {
            this.email = email;
        }
        float getAmount() {
            return amount;
        }
        void setAmount(float amount) {
            this.amount = amount;
        }
    }
public class Accounts {
    public static void main(String[] args) {
        Account acc= new Account() {
            @Override
            double getAcc_no() {
                return 0;
            }
        };
        acc.setAcc_no(75605354687L);
        acc.setName("Shubham Jamdar");
        acc.setEmail("shubhamjamdar@gmail.com");
        acc.setAmount(500000f);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}
