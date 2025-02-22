package StringBasics;

public class StringMethods {
    public static void main(String[] args) {
        // Your code here
        String str = "Nimesh";
        System.out.println(str);
        int i = str.length();

        System.out.println(i);
        String str1 = "nimesh";
        System.out.println(str);
        String sub = str.substring(2);
        System.out.println(sub);
        System.out.println(str.substring(2, 4));
        String website = "www.google.com";
        System.out.println(str.substring(2, 4));
        System.out.println(website.startsWith("www"));//retturn true or false
        System.out.println(website.startsWith("https"));
        System.out.println(website.endsWith("com"));

        System.out.println(str.charAt(4));
        System.out.println(website.indexOf("."));//return index of string and searchit
        System.out.println(website.indexOf("go"));
        System.out.println(website.indexOf("g", 5));
        System.out.println(website.indexOf("?"));
        System.out.println(website.lastIndexOf("c"));
        System.out.println(website.lastIndexOf("o", 5));
        String lang = "A";
        String lang1 = "a";
        System.out.println(lang.equals(lang1));//strictly compares letter to letter
        System.out.println(lang1.equalsIgnoreCase(lang));

        System.out.println(lang.compareTo(lang1));//A=65,a=97,sincea,a<A
        String s = "apple";
        String s2 = "apples";
        int result = s.compareTo(s2);
        System.out.println(result); //Output: -1In this case, "apple" is shorter than "apples". The first five characters of both strings are the same. Since "apple" comes before "apples" lexicographically, the result is -1.


    }


}
