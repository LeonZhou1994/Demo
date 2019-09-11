import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitLetterConverter {

    //This array is used to convert the number 0-9 to letters
    private static String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> digitArrayToLetters(int[] digitArray) throws Exception {
        checkDigitArray(digitArray);
        char[] temp1,temp2;
        List<String> result = new ArrayList<String>();
        if(digitArray.length==2) {
            temp1 = digitToLetters(digitArray[0]).toCharArray();
            temp2 = digitToLetters(digitArray[1]).toCharArray();
            for (char c : temp1) {
                for (int j = 0; j < temp2.length; j++) {
                    result.add(String.valueOf(c) + String.valueOf(temp2[j]));
                }
            }
            return  result;
        }else {
            return Arrays.asList(digitToLetters(digitArray[0]).split(""));
        }
    }

    public static String digitToLetters(int digit){
        String result = "";
        //If the digit is greater than 9 ,it must be seprated to two single digit number.
        if(digit>9){
            result += letters[digit/10];
            result += letters[digit%10];
        }else{
            result += letters[digit];
        }
        return result;
    }

    public static void checkDigitArray(int[] digitArray) throws Exception {
        if(digitArray.length>2){
            throw new Exception("This convert doesn't support array with more than 2 elements");
        }
        for (int value : digitArray) {
            if (value > 99 || value < 2)
                throw new Exception("This digit array contains a invalid number");
        }
    }
}
