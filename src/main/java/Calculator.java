import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.join;

public class Calculator {

    public static int add(String text) throws Exception {

        String[] delimeters = getDelimeters(text);
        int[] arr = Arrays.stream(delimeters).mapToInt(Integer::parseInt).toArray();
        negativeNumnersNotAllowed(arr);
        return sumofNnumbers(arr);


        }

    private static void negativeNumnersNotAllowed(int[] arr) throws Exception {
        List<Integer> negative = new ArrayList<>();
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i]<0)
            {
                negative.add(arr[i]);
            }
        }
        if(negative.size()>0)
        {
            throw new Exception("negatives_numbers_not_allowed"+join((CharSequence) negative));
        }
    }

    private static String[] getDelimeters(String text) {
        if(text.isEmpty()){
            return new String[0];
        }
        else if (useCustomDelimeterSyntax(text)) {
            return splitUsingCustomDelimeter(text);
        } else {
            return splitUsingNewLineAndComma(text);
        }
    }

    private static boolean useCustomDelimeterSyntax(String text) {
        return text.startsWith("//");
    }

    private static String[] splitUsingNewLineAndComma(String text) {
        String[] token = text.split(",|\n");
        return token;
    }

    private static String[] splitUsingCustomDelimeter(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        m.matches();
        String customDelimeter = m.group(1);
        String numbers = m.group(2);
        return numbers.split(Pattern.quote(customDelimeter));
    }


    private static int sumofNnumbers(int[] arr) {
        int sum=0;
        for(int i = 0; i< Arrays.stream(arr).count(); i++)
        {
            sum=arr[i]>1000?sum:sum+arr[i];

        }
        return sum;
    }


}
