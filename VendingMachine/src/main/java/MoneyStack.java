public class MoneyStack
{
    public int fiveCentsCoins;
    public int tenCentsCoins;
    public int twentyFiveCentCoins;
    public int oneDollarBill;
    public int fiveDollarBill;

    public MoneyStack(int... enteredMoney)
    {
        this.fiveCentsCoins = enteredMoney[0];
        this.tenCentsCoins = enteredMoney[1];
        this.twentyFiveCentCoins = enteredMoney[2];
        this.oneDollarBill = enteredMoney[3];
        this.fiveDollarBill = enteredMoney[4];
    }

    public int getTotal()
    {
        int total = 0;

        total += this.fiveCentsCoins * 5;
        total += this.tenCentsCoins * 10;
        total += this.twentyFiveCentCoins * 25;
        total += this.oneDollarBill * 100;
        total += this.fiveDollarBill * 500;

        return total;
    }
}
