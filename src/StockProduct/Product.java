package StockProduct;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
       return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    //Sobreposição no toString para imprimir o objeto direto
    public String toString(){
        return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
        //return name + ", $ " + String.format("%.2f," price) + ", " + quantity + " units, Total: $ " + String.format("%.2f," totalValueInStock());
    }
}
