public class YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        double costSummer = 160.71;
        double costSpring = 257.95;
        double costFall = 200.0;
        double costWinter = 350.95;
        double totalCost = costFall + costSpring + costWinter + costSummer;

        System.out.println("Your maintenance cost for summer is" + costSummer);
        System.out.println("Your maintenance cost for spring is" + costSpring);
        System.out.println("Your maintenance cost for fall is" + costFall);
        System.out.println("Your maintenance cost for winter is" + costWinter);
        System.out.println("Your total maintenance cost for the year is" + totalCost);
    }
}
