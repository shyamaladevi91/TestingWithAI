import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class DynamicValue {

    public static Map<String, String> generateTestData() {

        Map<String, String> data = new LinkedHashMap<>();
        for(int i=0;i<5;i++){
        String uniqueId = UUID.randomUUID().toString().substring(0, 8);
        data.put( "user_" + uniqueId,"username" + i);
        data.put( "user_" + uniqueId + "@gmail.com","email");}

        return data;
    }

    public static void main(String[] args) {

        Map<String, String> data = generateTestData();

        System.out.println(data);
    }
}
