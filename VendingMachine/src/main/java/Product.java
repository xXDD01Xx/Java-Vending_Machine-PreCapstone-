public enum Product
{
    WATER(1, 150), COCA_COLA(2, 250), GATORADE(3, 200), SNICKERS(3, 125), TWIX(4, 125);

    private int id;
    private int price;

    Product(int id, int price)
    {
        this.id = id;
        this.price = price;
    }

    //methods
    public int getId()
    {
        return this.id;
    }

    public int getPrice()
    {
        return this.price;
    }

    public static Product valueOf(int productSelected)
    {
        for (Product product : Product.values())
        {
            if(productSelected == product.getId())
            {
                return product;
            }
        }
        return null;
    }
}
