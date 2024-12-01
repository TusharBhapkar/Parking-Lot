import java.util.UUID;

public class Token {
    public static String generateToken(int number) {
    	//UUID uuid = UUID.randomUUID();
    	//not using uuid for token as its a runtime project and we are not storing the data in db.
        return "P" + number;
    }
}
