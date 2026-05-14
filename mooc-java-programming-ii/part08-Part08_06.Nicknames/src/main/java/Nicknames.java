
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickNames = new HashMap<String, String>();
        nickNames.put("matthew's", "matt");
        nickNames.put("michael's", "mix");
        nickNames.put("arthur's", "artie");
        System.out.println(nickNames.get("matthew's"));
    }

}
