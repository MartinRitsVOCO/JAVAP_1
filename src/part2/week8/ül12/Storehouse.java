package part2.week8.ül12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private final Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private final Map<String, Integer> productStocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock){
        productPrices.put(product, price);
        productStocks.put(product, stock);
    }
    public int price(String product){
        return productPrices.getOrDefault(product, -99);
    }

    public int stock(String product){
        return productStocks.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if(productStocks.containsKey(product) && productStocks.get(product) > 0){
            productStocks.put(product, productStocks.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products(){
        return productPrices.keySet();
    }
}
