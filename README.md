# package-for-beginners-in-java

Uses of functions in java package stupidity:

                                            

###### NOTE: All the functions of this package can be used as follows:

<class name>.<function name>(<required parameter(s)>);

OR, if you want to store the result in a variable

<data type> <variable name> = <class name>.<function name>(<required parameter(s)>);

eg-

int a = 126;
bolean p = NumberFun.isNiven(a);

###### NOTE: The data type of the varaible in which the result is stored, should be the same as the return type of the function.

                                                       

## Functions of class NumberFun:

boolean isNiven(int n):

This function checks if the argument passed to is a Niven number or not and returns a boolean type value true or false.

boolean isDuck(int n):

This function checks if the argument passed to is a Duck number or not and returns a boolean type value true or false.

boolean isPronic(int n):

This function checks if the argument passed to is a Pronic number or not and returns a boolean type value true or false.

boolean isTwistedPrime(int n):

This function checks if the argument passed to is a Twisted Prime number or not and returns a boolean type value true or false.

boolean areTwinPrime(int n, int m):

This function checks if the argument passed to are a Twin Prime numbers or not and returns a boolean type value true or false.

boolean isMagic(int n):

This function checks if the argument passed to is a Magic number or not and returns a boolean type value true or false.

boolean isHappy(int n):

This function checks if the argument passed to is a Happy number or not and returns a boolean type value true or false.

boolean isAbundant(int n):

This function checks if the argument passed to is a Abundant number or not and returns a boolean type value true or false.

boolean isHoax(int n):

This function checks if the argument passed to is a Hoax number or not and returns a boolean type value true or false.

boolean isDisarium(int n):

This function checks if the argument passed to is a Disarium number or not and returns a boolean type value true or false.

boolean isEvil(int n):

This function checks if the argument passed to is a Evil number or not and returns a boolean type value true or false.

boolean isKeith(int n):

This function checks if the argument passed to is a Keith number or not and returns a boolean type value true or false.

boolean isArmstrong(int n):

This function checks if the argument passed to is a Armstrong number or not and returns a boolean type value true or false.

boolean isBuzz(int n):

This function checks if the argument passed to is a Buzz number or not and returns a boolean type value true or false.

boolean isSpecial(int n):

This function checks if the argument passed to is a Special number or not and returns a boolean type value true or false.

boolean isPerfect(int n):

This function checks if the argument passed to is a Perfect number or not and returns a boolean type value true or false.

boolean isTriangle(int n):

This function checks if the argument passed to is a Triangle number or not and returns a boolean type value true or false.

int getFactorial(int n):

This function returns the factorial value of integer number passed as argument.

                                                      

## Functions of class StringFun:

boolean areAnagrams(String string1, String string2):

This function checks wether the passed arguments are Anagrams or not and returns a boolean type value true or false.

String reverseString(String str):

This function reverses the argument passed and returns a String type value.

String fristLetterofEachWord(String str):

This function returns the first letter of each word put into a single String.

String getLongestWord(String str):

This function returns the longest word in a sentence.

boolean isPalindrome(String str):

This function checks if the passed argument is a Palindrome or not.

boolean isUnique(String str):

This function checks if the passed argument is a Unique String or not.

boolean isHappyWord(String str):

This function checks if the passed argument is a Happy Word or not.

String replaceIt(char oldchars[], char newchar, String str):

This function takes a character array, a character and a String as arguments. It replaces all the characters of the array present in the String with the single character passed.

String replaceIt(char oldchars[], char[] newchars, String str):

This function takes two character arrays and a String as arguments. It replaces all the characters of the oldchars array present in the String with the characters of the newchars array.

String wordWithMaxNumbOf(char chars[], String string):

This function takes a character array and a String as arguments and returns the word with the maximum number of character of the character array present in the sentence.

String getMidWord(String str):

This function returns the middle word present in the sentence passed to it as argument.

int[] getArrayOfAllPossibleCombinations(int num):

This function takes an integer as argument and returns an integer array of all possible combinatins of that number.

String[] getAllPermutations(String string):

This function takes a String as an argument and returns a String rray of all its permutations(i.e., all the possible combinations of its characters).
