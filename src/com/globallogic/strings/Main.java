package com.globallogic.strings;

public class Main {
    public static void main(String[] args) {
        String mySTr = "My best education project in GlobalLogic";
        System.out.println("Task1" );
        System.out.println("5a. Index of first 'a': " + mySTr.indexOf("a"));
        System.out.println("5b. index of last 'b': " + mySTr.lastIndexOf("b"));
        System.out.println("substring 3 - 6: " + mySTr.substring(3,6));

        System.out.println("reverse: " + reverseString(mySTr));

        System.out.println("Task2");
        String myStr1 = "Cartoon";
        String myStr2 = "TomcaT";

        System.out.println("Missing letters in second word: ");
        for (int i = 0; i < myStr1.length(); i++) {
            if (myStr2.indexOf(myStr1.substring(i,i+1).toLowerCase())==-1 && myStr2.indexOf(myStr1.substring(i,i+1).toUpperCase())==-1) {
                System.out.print(myStr1.substring(i,i+1) + " ; ");
            }

        }

        System.out.println();
        System.out.println("Task3");
        System.out.print("Unique result: ");
        System.out.println(uniqueChars("Using methods of class String"));

    }

    public static String reverseString(String str){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = str.length()-1; i > -1; i--) {
            stringBuffer.append(str.charAt(i));
        }

        return stringBuffer.toString();
    }

    public static char[] uniqueChars(String s){
        char[] array = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
          if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
              array[count] = s.charAt(i);
              count++;
          }

    }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        array = null;
        return result;
    }
}
