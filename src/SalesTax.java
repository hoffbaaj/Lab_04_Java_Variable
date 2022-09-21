public class SalesTax
{
    public static void main(String[] args)
    {
        double itemPrice = 100.75;
        double tax = ((0.05 * itemPrice)+itemPrice);

        System.out.println("The price of your item is " + itemPrice);
        System.out.println("The price of item with tax is " + tax);
    }
}
