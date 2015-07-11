import com.google.common.base.Optional;
import org.json.simple.JSONObject;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("HelloWorld!!!");
        JSONObject obj=new JSONObject();
        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip", Boolean.TRUE);
        obj.put("nickname",null);
        System.out.println(obj);

        Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent());
    }
}
