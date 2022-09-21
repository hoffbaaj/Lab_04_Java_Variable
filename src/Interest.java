public class Interest
{
    public static void main(String[] args)
    {
        double creditBal = 5000;
        double rate = 0.17;
        double payment = ((creditBal *= 0.17));
        double noPay = payment + payment;
        System.out.println("Your payment after 1 month is: $" + payment);
        System.out.println("Your payment after 2 months is: $" + noPay);
    }
}
