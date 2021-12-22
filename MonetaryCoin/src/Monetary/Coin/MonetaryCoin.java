package Monetary.Coin;
//The reserved word extends to establish an inheritance relationship
public class MonetaryCoin extends Coin {
// Store an integer in MonetaryCoin
    private int value;

//Constructor:Set up the MonetaryCoin with the specific value for coin
//Two methods to return value: get and set value
public MonetaryCoin(int money)
{
    super();
    value = money;
}

public void setValue(int money)
{
    value = money;
}

public int getValue()
{
    return value;
}

public String toString()
{
    String result = super.toString();
    result += "\t" + value;
    return result;
}
}
