import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String args[]) throws Exception {
        Calculator stringCalculator = new Calculator();

        System.out.println("Add result: " + Calculator.add("1\n;2;3"));
        System.out.println("Add result: " + Calculator.add("//;\\n1;2"));
        System.out.println("Add result: " + Calculator.add("//;\\n1000,1;2"));
        System.out.println("Add result: " + Calculator.add("//***\n1***2***3"));
        System.out.println("Add result: " + Calculator.add("//[***][%%%]\n1***2%%%3"));
    }

    public static int add(String s) throws Exception {

        int sum = 0;
        if (null != s && s.equals("")) {
            return sum;
        }

        List<Integer> numberList = splitStringInputValue(s);

        for (Integer values : numberList) {
            sum = sum + values;
        }
        return sum;
    }
    public static List<Integer> splitStringInputValue(String inputValue) throws Exception {
        String stringArray[] = inputValue.split("[//\n,!.?:;@#$%^&*()_+=?'<>+]");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < stringArray.length; i++) {
            String string = stringArray[i];

            if (null != string && !string.equals("")) {
                if (isInteger(string)) {
                    list.add(Integer.parseInt(string));
                }
            }
        }

        StringBuilder negativeValue = new StringBuilder();
        for (Integer values : list) {
            if (values < 0){
                negativeValue.append(values + " ");
            }
        }

        if (!negativeValue.toString().equals("")) {
            throw new Exception("ERROR: negatives not allowed: " + negativeValue.toString());
        }

        return list;
    }
    public static boolean isInteger(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}