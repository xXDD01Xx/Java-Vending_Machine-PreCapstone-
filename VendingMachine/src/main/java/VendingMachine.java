public interface VendingMachine
{
    void displayInventory();

    void selectProduct(int product);

    void displayEnterCoinMessage();

    void enterCoins(int... money);

    void displayChangeMessage();
}
