public class StringCharAt {
    public static void main(String[] args) {

        String stringOne = "This is a string.";
        int length = stringOne.length();
        int lengthTwo = 0;

        System.out.println(stringOne);

        char charPos = stringOne.charAt(0);
        System.out.println(charPos);
        for (int i = 0; i < length; i++) {
            System.out.print(stringOne.charAt(i));
        }

        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(stringOne.charAt(i));
        }

        System.out.println();
        for (int i = length - 7; i < length; i++) {
            System.out.print(stringOne.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            lengthTwo += 1;
        }

        System.out.println();
        System.out.println("String length using length() method: " + length);
        System.out.println("String length counting manually: " + lengthTwo);
    }
}