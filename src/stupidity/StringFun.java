package stupidity;
import com.sun.istack.internal.NotNull;

public  class StringFun {

    static StringFun stringFun = new StringFun();

    public static boolean areAnagrams(String string1, String string2) throws Exception {
        /*
        This Method Block
        should Be Exclusively
        Used For Strings
         */

        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();

        int charLength1 = 0, charLength2 = 0; /*For determining that
                                              there shouldn't be any
                                              of the digit present in strings
                                              */

        int length1, length2, i = 0, j = 0, a = 0, f1 = 0, f2 = 0, k = 0;

        length1 = string1.length();
        length2 = string2.length();

        if (length1 == length2) {


            for (a = 65; a < 90; a++) {

                for (i = 0; i < length1; i++) {

                    char ch1 = string1.charAt(i);
                    if (ch1 == (char) a) {
                        f1++;
                        charLength1++;  /* IF  string1 has any digit
                                           then charLength1 will be less than
                                           length of string1 (i.e length1)
                                           */

                    }
                }

                for (j = 0; j < length2; j++) {

                    char ch2 = string2.charAt(j);
                    if (ch2 == (char) a) {
                        f2++;
                        charLength2++;/* IF  string2 has any digit
                                           then charLength2 will be less than
                                           length of string2 (i.e length2)
                                           */
                    }
                }

                if ((f1 == f2)) {
                    k = 1;
                } else {
                    k = 0;
                    break;
                }
            }
        } else {
            return false;
        }
        if (charLength1 == 0 || charLength2 == 0 || charLength1 < length1 - 1 || charLength2 < length2 - 1) {
            throw new Exception("Strings should not contain any AlphaNumeric Strings or Special Characters");
        } else {
            if (k == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean areJumbles(String a, String a1) {
        int b, b1, count = 0, count1 = 0;

        char ch1, ch2;


        b = a.length();
        if (b != a1.length()) {
            return false;
        } else {
            for (int i = 0; i < b; i++) {
                count = 0;
                ch1 = a.charAt(i);
                b1 = a1.length();
                for (int j = 0; j < b1; j++) {
                    ch2 = a1.charAt(j);
                    if (ch1 == ch2) {
                        count = 1;
                        a1 = a1.substring(0, j) + a1.substring(j + 1, b1);
                        break;
                    }
                }
                if (count == 0)
                    break;
            }
            if (count == 1)
                return true;
            else
                return false;
        }
    }

    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;  //returned a reversed string.
    }

    public static String fristLetterofEachWord(String str) {
        str = ' ' + str;
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.charAt(i - 1) == ' ')
                newString += str.charAt(i) + " ";
        }
        return newString;
    }

    public static String getLongestWord(String str) {
        str += ' ';
        int stringCount = 0;
        String eachWord = "", longestString = "";
        int longeststringCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                stringCount++;
                eachWord += ch;
            } else {
                if (stringCount > longeststringCount) {
                    longeststringCount = stringCount;
                    longestString = eachWord;
                }
                stringCount = 0;
                eachWord = "";
            }
        }
        return longestString;
    }

    public static boolean isPalindrome(String str) {
        String reversedString = reverseString(str);
        if (reversedString.equalsIgnoreCase(str)) return true;
        else return false;
    }

    public static boolean isSpecial(@NotNull String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) return true;
        else return false;
    }

    public static boolean isUnique(String str) {
        int flag = 1;   // 0-str is unique , 1-str is not unique.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.substring(i + 1).indexOf(ch) != -1) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 0) return true;
        else return false;
    }

    public static String getReverseOrder(String str) {
        String[] strings = str.split(" ");
        String newString = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            newString += strings[i] + " ";
        }
        return newString;
    }

    public static boolean isHappyWord(String str) {
        char[] ch = str.toCharArray();
        String numString = "";
        for (char c : ch) {
            numString += Integer.toString((int) c - 64);
        }
        if (NumberFun.isHappy(Integer.parseInt(numString))) return true;
        else return false;
    }

    public static String replaceIt(char oldchars[], char newchar, String str) {
        for (char c : oldchars) {
            str = str.replace(c, newchar);
        }
        return str;
    }

    public static String replaceIt(char oldchars[], char[] newchars, String str) throws Exception {
        if (oldchars.length == newchars.length) {
            for (int i = 0; i < oldchars.length; i++) {
                str = str.replace(oldchars[i], newchars[i]);
            }
            return str;
        } else {
            throw new Exception("Both char arrays should have same length");
        }
    }

    public static String wordWithMaxNumbOf(char chars[], String string) {
        String strings[] = string.split(" "); // extracting each string
        String reqString = "";
        int count = 0, max = 0;
        for (String str : strings) {
            count = 0;
            for (char c : chars) {
                if (str.indexOf(c) != -1) count++;
            }
            if (count > max) {
                reqString = str;
            }
        }
        return reqString;
    }

    public static String getMidWord(String str) {
        str = str + " ";
        String[] strings = str.split(" ");
        if (strings.length % 2 == 0) return null;
        else return strings[(strings.length / 2)];
    }

    public static int[] getArrayOfAllPossibleCombinations(int num) throws Exception {
        int lengthOfNumString = String.valueOf(num).length();

        int sizeOfArray = 1;

        for(int a = 1; a <= lengthOfNumString; a++)
            sizeOfArray *= a;

        int startIndex = (int) Math.pow(10, lengthOfNumString - 1);
        int endIndex = (int) Math.pow(10, lengthOfNumString);

        int p = 0;
        int[] possibleCombinations = new int[sizeOfArray];

        for (int i = startIndex; i < endIndex; i++) {
            if (areJumbles(String.valueOf(num), String.valueOf(i))) {
                possibleCombinations[p] = i;
                p++;
            }
        }

        return possibleCombinations;

    }

    public static String[] getAllPermutations(String string) throws Exception {
        char[] ch = string.toCharArray();
        String numString = "";
        for (int i = 0; i < string.length(); i++) {
            numString += Integer.toString(i + 1);
        }

        int sizeOfArray = 1;

        for(int a = 1; a <= ch.length; a++)
            sizeOfArray *= a;


       
        int num = Integer.valueOf(numString);
        String str;
        int lengthOfNumString = String.valueOf(num).length();
        int startIndex = (int) Math.pow(10, lengthOfNumString - 1);
        int endIndex = (int) Math.pow(10, lengthOfNumString);

        String[] permutations = new String[sizeOfArray];

        int p = 0;

        for (int i = startIndex; i < endIndex; i++) {
            if (areJumbles(String.valueOf(num), String.valueOf(i))) {
                permutations[p] = formStringWithIntArray(String.valueOf(i), ch);
                p++;
            }
        }
        return permutations;
    }

    public static String formStringWithCharArray(char[] chars) {
        String string = "";
        for (char c :
                chars) {
            string += c;
        }
        return string;
    }

    private static String formStringWithIntArray(String str, char[] chars) {
        int num = Integer.valueOf(str);
        int mod;
        String string = "";
        while (num != 0) {
            mod = num % 10;
            string = chars[mod - 1] + string;
            num /= 10;
        }
        return string;
    }
}
