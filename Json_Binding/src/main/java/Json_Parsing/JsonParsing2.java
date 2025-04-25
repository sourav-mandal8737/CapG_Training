package Json_Parsing;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParsing2 {
    public static void main(String[] args) throws Exception {
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> list = Arrays.asList("Hello", "World", "Demo");
        map.put(1, list);
        map.put(2, list);

        ObjectMapper om = new ObjectMapper();

        // using valueToTree()
        JsonNode node = om.valueToTree(map);
        Iterator<String> fieldNames = node.fieldNames();
        while (fieldNames.hasNext()) {
            String key = fieldNames.next();
            JsonNode jsonNode = node.get(key);
            System.out.println("Key: " + key);
            for (JsonNode json : jsonNode) {
                System.out.println(json.asText());
            }
        }

        /*
        // using treeNode()
        String data = om.writeValueAsString(map);
        JsonNode tree = om.readTree(data);
        Iterator<String> itr = tree.fieldNames();
        while (itr.hasNext()) {
            String key = itr.next();
            JsonNode value = tree.get(key);
            System.out.println("Key: " + key);
            for (JsonNode json : value) {
                System.out.println(json.asText());
            }
            System.out.println("-------------------------");
        }
        System.out.println(data);
        */
    }
}
