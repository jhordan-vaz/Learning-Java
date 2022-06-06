package Dollar;

public class CurrencyConverter {

    public double dollar;

    public double price;

    public double getDollar() {
        return dollar * price;
    }

    public double dollarTax() {
        return dollar * price * 106 / 100;
    }
}
