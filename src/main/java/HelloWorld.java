import org.json.simple.JSONObject;
import org.apache.log4j.Logger;

public class HelloWorld {
    private static final Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String args[]) {
        // System.out.println("HelloWorld!!!");
        logger.debug("Super test!!");
        JSONObject obj=new JSONObject();
        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip", Boolean.TRUE);
        obj.put("nickname",null);
        System.out.print(obj);
    }
}
