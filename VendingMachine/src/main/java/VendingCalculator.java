public interface VendingCalculator
{
    int calculateTotal(MoneyStack enteredCoins);

    MoneyStack calculateChange(int amountOfMoneyReturned);
}
