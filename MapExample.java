import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String, BigDecimal> price = new HashMap<String, BigDecimal>();

        price.put("りんご", BigDecimal.valueOf(120));
        price.put("ブドウ", BigDecimal.valueOf(240));
        price.put("みかん", BigDecimal.valueOf(80));

        System.out.println(price);
    }
}