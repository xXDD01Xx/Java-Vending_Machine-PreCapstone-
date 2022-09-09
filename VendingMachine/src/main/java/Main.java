import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        VendingMachine vendingMachine = new ConsoleVendingMachine();

        vendingMachine.displayInventory();

        String productSelected = userInput.nextLine();
        int productSelectedNumber = Integer.parseInt(productSelected);

        vendingMachine.selectProduct(productSelectedNumber);

        vendingMachine.displayEnterCoinMessage();

        String usersCoins = userInput.nextLine();

        int[] enteredCoins = Money.parseMoney(usersCoins);

        vendingMachine.enterCoins(enteredCoins);

        vendingMachine.displayChangeMessage();
    }
}
