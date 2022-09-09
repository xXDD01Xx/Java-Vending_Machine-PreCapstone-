public class ConsoleVendingCalculator implements VendingCalculator
{

    @Override
    public int calculateTotal(MoneyStack enteredCoins)
    {
        return enteredCoins.getTotal();
    }

    @Override
    public MoneyStack calculateChange(int amountOfMoneyReturned)
    {
        MoneyStack change = new MoneyStack(new int[5]);
        int remainingAmount = amountOfMoneyReturned;

        change.fiveDollarBill = remainingAmount / 500;
        remainingAmount =  remainingAmount % 500;

        change.oneDollarBill = remainingAmount / 100;
        remainingAmount =  remainingAmount % 100;

        change.twentyFiveCentCoins = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        change.tenCentsCoins = remainingAmount / 10;
        remainingAmount =  remainingAmount % 10;

        change.fiveCentsCoins = remainingAmount / 5;

        return change;
    }
}
