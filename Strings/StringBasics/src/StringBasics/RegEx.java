package StringBasics;

public class RegEx {
    public static void main(String[] args) {
        String str1="J";
        System.out.println(str1.matches("."));//Any Single Character
        String str2="a";
        System.out.println(str2.matches("[abc]"));//any single character from a,b,c
        String str3="aA7";
        System.out.println(str3.matches("[a-z][A-Z][0-9]"));//multiple values
        String str4="a";
        System.out.println(str4.matches("[a|b]"));
        String str5="d";
        System.out.println(str5.matches("\\w"));//Alphabets or digits
        System.out.println(str5.matches("\\D"));//Alphabets or digits
        String str6="abcdwd";
        System.out.println(str6.matches("[a-z]*"));//zero or more
        String str7="";
        System.out.println(str7.matches("[a-z]+"));//one or more
        System.out.println(str6.matches("[a-z]{3,6}"));//one or more
        String str8="john@gmail.com";
        System.out.println(str8.matches(".*co."));
        System.out.println(str8.matches("[a-zA-Z@.&&[\\D]]+"));
        System.out.println(str8.matches("[a-z]+.@[a-z]+\\.[a-z]+"));
        String str="programmer@gmail.com";
        int i =(str.indexOf("@"));

        String uname=(str.substring(0,i));
        String domain=(str.substring(i+1,str.length()));
        System.out.println(uname);
        System.out.println(domain);
        System.out.println(domain.startsWith("gmail"));
        int b=1010101;
        String bi=String.valueOf(b);
        System.out.println(bi.matches("[10]+"));
         String date="31/12/2024";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        String ch="A@B#C*d&";
        System.out.println(ch.replaceAll("[@#*&]",""));
        String ch2="        My      Name     is        Nimesh "  ;
        System.out.println(ch2.replaceAll("\\s+"," ").trim());




    }
}

