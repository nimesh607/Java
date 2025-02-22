public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        show(5);
        show(10,20,30);
        show(new int[]{3,4,5,6,7});//we can pass array object also.it is called anonynomous array because it doesn't has any reference
        showList(5,"John","Mark","Sam");
    }
    static void show(int...A)///varargs

    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
    static void showList(int start,String...S)
    {

        for(int i=0;i<S.length;i++)
        {
            System.out.println(start+": "+S[i]);
            start++;
        }
    }
}