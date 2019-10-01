package co.ga.nyc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.model.wsdl.WSDLOutputImpl;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isCharacterAVowel("a")); // true
        System.out.println(isCharacterAVowel("z")); // false

        System.out.println(maxOfTwoNumbers(0, 1));        // 1
        System.out.println(maxOfTwoNumbers(-2, -3));      // -2
        System.out.println(maxOfTwoNumbers(-2, 3));       // 3

        System.out.println(maxOfThreeNumbers(0, -2, 3));         // 3
        System.out.println(maxOfThreeNumbers(-3, -2, -1));       // -1

        System.out.println(numberOfArgs(-2, -3));               // 2
        System.out.println(numberOfArgs(-2, -3, "cat", 1.56));  // 4

        System.out.println(reverseString("Tested"));            // "detseT"
        System.out.println(reverseString("jag testar"));        // "ratset gaj"

        String [] arr1 = {"cat", "bird", "lizard"};
        System.out.println(findLongestWord(arr1));             // 6
        String [] arr2 = {"kangaroo", "bird", "lizard"};
        System.out.println(findLongestWord(arr2));        // 8

        System.out.println(filterLongWords(arr1, 3));          // ["cat"]
        System.out.println(filterLongWords(arr1, 5));          // ["cat", "bird"]
        System.out.println(filterLongWords(arr1, 6));          // []
    }

    public static double maxOfTwoNumbers(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static double maxOfThreeNumbers(double num1, double num2, double num3) {
        double largestNumber = 0;
        if ((num1 > num2) && (num1 > num3)) {
            largestNumber = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            largestNumber = num2;
        } else {
            largestNumber = num3;
        }
        return largestNumber;
    }

    public static boolean isCharacterAVowel(String input) {
        if ((input.toLowerCase() == "a") ||
                (input.toLowerCase() == "e") ||
                (input.toLowerCase() == "i") ||
                (input.toLowerCase() == "o") ||
                (input.toLowerCase() == "u")
        ) {
            return true;
        }
        return false;
    }

    // return the number of arguments passed to it when called
    public static int numberOfArgs(Object... args) {
        return args.length;
    }

    // Returns the input string reversed
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = (str.length() - 1); i > -1; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    // BONUS:

    // findLongestWord() takes an Array and returns the length of the longest Word }
    public static int findLongestWord(String[] arr){
        int highestCount = 0;
        for( int i = 0; i<arr.length;i++){
            if(arr[i].length() > highestCount){
               highestCount = arr[i].length();
            }
        }

        return highestCount;
    }
    // filterLongWords() takes an Array of Words and a number i, returns an Array with words longer than i
    public static String[] filterLongWords(String[] arr, int num){
        String[] filteredArr = {};
        for(int i = 0; i < arr.length; i++){
           if(arr[i].length() < num){
               filteredArr.add(arr[i]);
           }

        }

        return filteredArr;
    }
}


