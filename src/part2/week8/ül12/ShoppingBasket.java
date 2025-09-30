package part2.week8.ül12;

import java.util.HashMap;

public class ShoppingBasket {
    private final HashMap<String, Purchase> purchases = new HashMap<>();

    public ShoppingBasket(){}

    public void add(String product, Integer price){
        if (purchases.containsKey(product)){
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }

    public Integer price(){
        int sum = 0;
        for(Purchase p : purchases.values()){
            sum += p.price();
        }
        return sum;
    }

    public void print(){
        for(Purchase p : purchases.values()){
            System.out.println(p.toString());
        }
    }
}
