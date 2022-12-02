import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //在庫数Map（ 品名 , 個数 ）
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("箱ティッシュ", 6);
        inventory.put("トイレットペーパー", 4);
        inventory.put("ラップ", 2);
        inventory.put("洗濯用洗剤", 1);

        //在庫数 （ 品名：個数 ）
        System.out.println("【在庫数】");
        inventory.forEach((goods, stock) -> System.out.println(goods + "：" + stock));

        System.out.println(); //改行

        //例外処理
        System.out.println("【例外処理】");
        try {
            if (null != inventory.get("ざる")) {
                System.out.println(inventory.get("ざる"));
            } else {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {

            System.out.println("データはありません");
        }
    }
}