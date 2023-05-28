import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static int add(String text) {
        if(text.isEmpty()){
         return 0;
        }
        else if(text.contains(",")){
            String[] commaSeperated = text.split(",");
            int[] arr = Arrays.stream(commaSeperated).mapToInt(Integer::parseInt).toArray();
            return sumofNnumbers(arr);

        }
        else{
            return toInt(text);
        }
    }

    private static int sumofNnumbers(int[] arr) {
        int sum=0;
        for(int i = 0; i< Arrays.stream(arr).count(); i++)
        {
            sum=arr[i]>1000?sum:sum+arr[i];

        }
        return sum;
    }

    private static int toInt(String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }

}
