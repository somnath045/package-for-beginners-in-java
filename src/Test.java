import stupidity.*;
import java.util.*;

public class Test {

    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);

       /*
        System.out.println("Enter two strings");
        String string = sc.nextLine();
        char[] oldchars={'a','e','i','o','u','A','E','I','O','U'};
        char[] newchars={'b','f','j','p','v'};
        List<String> strings =   StringFun.getArrayOfAllPossibleCombinations(string);
        int flag=0; // 0 - correct , 1 - wrong .
              System.out.println("strings.size() "+strings.size());
        for (int i = 0; i <20 ; i++) {
            System.out.println("heeeeelllllllllllllllllllllllloooooooooooooooooooooooo");
        }
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println("heeeeelllllllllllllllllllllllloooooooooooooooooooooooo");
        }
        for (int j = 0; j <strings.size() ; j++) {
            for (int i = j; i <strings.size() ; i++) {
                if(strings.get(j).equals(strings.get(i)))
                {
                    flag++;
                    System.out.println("aya hai");
                }
            }
        }
        if(flag > 0)   System.out.println("wrong");
        else System.out.println("correct");
        */

       /* System.out.println("Enter two strings");
        String num = sc.nextLine();
       StringFun.showArrayOfAllPossibleCombinations(num);

        */
        /*System.out.println("Enter two strings");
        String string = sc.nextLine();
        String string2 = sc.nextLine();*/
        System.out.println(Arrays.toString(StringFun.getArrayOfAllPossibleCombinations(12345)));
        //System.out.println(NumberFun.isBuzz(87));



    }

}
