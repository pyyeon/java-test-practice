import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>(){{
            put("피카츄", 85);
        }};//
        // Entry 객체 저장
        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        map.put("야도란", 10);

        System.out.println(map.size());
        System.out.println(map.containsValue("메타몽"));
        System.out.println(map.containsKey("메타몽"));
        System.out.println(map.get("야도란"));
//        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> entry :map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
        for (String key :map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + ":" + value);

        }
    }
}
