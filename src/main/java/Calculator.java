import java.util.ArrayList;

public class Calculator {

    public static int add(String text) {
        if(text.isEmpty()){
         return 0;
        }
        else if(text.contains(",")){
            String[] commaSeperated = text.split(",");
            return Integer.parseInt(commaSeperated[0])+Integer.parseInt(commaSeperated[1]);

        }
        else{
            return Integer.parseInt(text);
        }
    }

}
