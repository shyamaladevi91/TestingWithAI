import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Practise_DynamicValue {


    public static Map<String,String> method1(){
        Map<String,String> data = new HashMap<>();
        String input= UUID.randomUUID().toString();
        data.put("userid","user_"+input);
        data.put("password","password"+input+"@gmail.com");
        return data;
    }

    public static void main(String[] args){
         Map<String,String> data = method1();
         System.out.print(data);


    }



}
