package TestCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的基本用法
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("gaoo", "gaoqi");
        System.out.println(map.get("gaoo"));
    }

}
