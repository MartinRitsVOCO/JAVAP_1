package part2.week8.ül12;

public class Purchase {
    private final String product;
    private Integer amount;
    private final Integer unitPrice;
    public Purchase(String product, Integer amount, Integer unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public Integer price(){
        return unitPrice * amount;
    }

    public void increaseAmount(){
        amount += 1;
    }

    public String toString(){
        return String.format("%s: %d",  product, amount);
    }
}
