public class VendingRequest
{
    public Product product;
    public MoneyStack enteredMoney;

    public VendingRequest(int selectedProducts, int... enteredMoney)
    {
        this.product = Product.valueOf(selectedProducts);
        this.enteredMoney = new MoneyStack(enteredMoney);
    }
}
