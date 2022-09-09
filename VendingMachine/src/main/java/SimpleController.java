public class SimpleController implements VendingMachineController
{
    private VendingCalculator vendingCalculator = new ConsoleVendingCalculator();

        @Override
        public MoneyStack calculateChange (VendingRequest request)
        {
           int total = vendingCalculator.calculateTotal(request.enteredMoney);
           int totalChange = total - request.product.getPrice();
           return vendingCalculator.calculateChange(totalChange);
        }
}
