package icici.loans.personalloans;

public class Payment 
{
	void pay(int amount) 
	{
        System.out.println("Paying " + amount + " using cash");
    }

}

class CardPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paying " + amount + " using credit/debit card");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}
