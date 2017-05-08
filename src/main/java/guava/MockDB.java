package guava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangww on 2017-05-08.
 *
 */
public class MockDB {
    private static Map<String, String> mockPersistence = new HashMap<String, String>() {{
        this.put("github", "codedrinker");
        this.put("git", "tangwwk");
    }};

    public static String loadFromPersistence(String key) {
        System.out.println("load key from persistence : " + key);
        return mockPersistence.get(key);
    }
}
