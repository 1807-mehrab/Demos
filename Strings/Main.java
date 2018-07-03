public class Main {
    public static void main (String[] args) {
        //String literal
        String str1 = "Hello World";
        String str2 = "Hello World";

        //System.out.println(str1);

        //char array
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);

        str1 = "hello";
        //str2 = "hello";
        str2 = new String("hello");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        //StringBuilder - Mutable string, not threadsafe
        //StringBuffer - is threadsafe (must slower)

        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        str1 = sb.toString();
    }
}