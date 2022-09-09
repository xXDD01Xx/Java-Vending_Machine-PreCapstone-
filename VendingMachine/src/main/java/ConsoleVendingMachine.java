public class ConsoleVendingMachine implements VendingMachine
{
private int selectedProduct;
private MoneyStack change;
private VendingMachineController controller = new SimpleController();

    @Override
    public void displayInventory()
    {
        System.out.printf("%s%n %32s%n %s%n",
                "***********************************",
                "WELCOME To Vending Machine App",
                "*********************************");

        System.out.printf("%18s%n %25s%n %18s%n",
                "-----------------------------------",
                "Products Available",
                "---------------------------------");

        for (Product selection : Product.values())
        {
            System.out.println("   " + selection.getId() + " " + selection.name() + " - Price: " + selection.getPrice());
        }

        System.out.println(" ");
        System.out.println(" Please select your product: ");

    }

    @Override
    public void selectProduct(int product)
    {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinMessage()
    {
        System.out.println(" ");
        System.out.println("                      Please enter the your input amount as follows:                            ");
        System.out.println(" Number of Nickels, Number of Dimes, Number of Quarters, Number of 1$ Bills, Number of $5 Bills ");
        System.out.println("                               Example: '0, 0, 5, 1, 0'                                         ");
        System.out.println(" ");
        System.out.println("                         Sorry, No $20 Bills or Pennies Accepted                                ");
        System.out.println(" ");
    }

    @Override
    public void enterCoins(int... coins)
    {
        VendingRequest request = new VendingRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

//        VendingCalculator calculator = new ConsoleVendingCalculator();
//        Product.valueOf(this.selectedProduct);
//        int totalAmountNeeded = calculator.calculateTotal(new MoneyStack(coins));
//
//        int changeReturned = totalAmountNeeded - selectedProduct.getPrice();
//        this.change = calculator.calculateChange(changeReturned);

    }

    @Override
    public void displayChangeMessage()
    {
        System.out.println(" ");
        System.out.println("                      Your change is: " + change.getTotal() + " cents split as follows:                            ");
        System.out.println(" $5 Bills: " + change.fiveDollarBill);
        System.out.println(" $1 Bills: " + change.oneDollarBill);
        System.out.println(" Quarters: " + change.twentyFiveCentCoins);
        System.out.println(" Dimes: " + change.tenCentsCoins);
        System.out.println(" Nickels: " + change.fiveCentsCoins);
        System.out.println(" ");


    }
}
