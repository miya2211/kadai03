import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //在庫数Map（ 品名 , 個数 ）
        Map<String, Integer> inventoryMap = new HashMap<>();
        inventoryMap.put("箱ティッシュ", 6);
        inventoryMap.put("トイレットペーパー", 4);
        inventoryMap.put("ラップ", 2);
        inventoryMap.put("洗濯用洗剤", 1);

        //在庫数 （ 品名：個数 ）
        System.out.println("【在庫数】");
        inventoryMap.forEach((goods, stock) -> System.out.println(goods + "：" + stock));

        System.out.println(); //改行

        //例外処理
        System.out.println("【例外処理】");
        try {
            if (null != inventoryMap.get("ざる")) {
                System.out.println(inventoryMap.get("ざる"));
            } else {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {
            System.out.println("データはありません");
        }

        //isNull使用
        if (Objects.isNull(inventoryMap.get("パン"))) {
            System.out.println("データはありません");
        }
    }
}