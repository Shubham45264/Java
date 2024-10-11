package Shubham;
class Encapsulation {
    private long password;
    private String username;

    double password() {
        return password;
    }

    void setPassword(long password) {
        this.password= password;
    }
    String username() {
        return username;
    }
    void setusername(String name) {
        this.username = name;
    }
}
class Wifi {
    public static void main(String[] args) {
        Encapsulation b=new Encapsulation();
        b.setPassword(75605354687L);
        b.setusername("Shubham Jamdar");
//        System.out.println(b.+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
        System.out.println(b.username());
        System.out.println(b.password());
    }
}
