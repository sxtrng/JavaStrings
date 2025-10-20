public class StringCompareTo {
    public static void main(String[] args) {

        String stringA = "A";
        String stringa = "a";

        System.out.println(stringA.compareTo(stringa));
        System.out.println(stringa.compareTo(stringA));

        System.out.println(stringA.compareToIgnoreCase(stringa));
        System.out.println(stringa.compareToIgnoreCase(stringA));
    }
}