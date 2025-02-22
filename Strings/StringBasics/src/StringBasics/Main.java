package StringBasics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str1="Java";
        String str5="Java";
        System.out.println(str1==str5);//checking references(Memory address) are same or not.if they refer to same object-->True,if not false.
        System.out.println(str1.equals(str5));//compares the contents of str1 and str5. If they contain the same sequence of characters, it returns true; otherwise, it returns false.


        String str2=new String("Java Program");
        System.out.println(str2);
        char[] c={'h','e','l','l','o'};
        String str3= new String(c);
        System.out.println(str3);
        byte[] b={65,66,67,68};
        String str4=new String(b,2,2);
        System.out.println(str4);


    }
}