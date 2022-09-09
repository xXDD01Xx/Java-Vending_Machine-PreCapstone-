public enum Money
{
    FIVE_CENTS(5), TEN_CENTS(10), TWENTYFIVE_CENTS(25), ONE_DOLLAR(100), FIVE_DOLLAR(500);

    private int value;

    Money(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public static int[] parseMoney(String coins)
    {
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for (int index = 0; index < numberCoinsInText.length; index++)
        {
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }
}

