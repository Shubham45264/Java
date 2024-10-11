package Shubham;

abstract class Banking {
    // Abstract method (does not have a body)
    //public abstract void makeDebit();
    public abstract void makeCredit();

    // Concrete method
    public void getcash() {
        System.out.println("$$$$");
    }
}

class SavingsAcc extends Banking {
    @Override
    public void makeCredit() {
        System.out.println("Money Transferred");
    }
}



class CurrentAcc extends Banking {

    @Override
    public void makeCredit() {
        System.out.println("Money Cut");
    }
}

class Cash  {
    public static void main(String[] args) {
        Banking savings = new SavingsAcc();
        Banking currentacc = new CurrentAcc();

        savings.makeCredit(); // Output: Woof
        currentacc.makeCredit(); // Output: Meow

        savings.getcash(); // Output: Zzz
        currentacc.getcash(); // Output: Zzz
    }
}

