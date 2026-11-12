package strings;

public class StringEg {
    public static void main(String[] args) {
        String name = "abc";
        String name1 = "abc";
        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        String name2 = new String("abc");
        String name3 = new String("abc");
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));

        System.out.println(name.equals(name3));
    }
}
