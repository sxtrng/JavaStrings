public class StringContains {
    public static void main(String[] args) {

        String sentence = "This is for demonstration purposes only.";
        String target = "pose";

        System.out.println("Original sentence: " + sentence);
        System.out.println("Target word for which we are searching: " + target);

        if (sentence.contains(target)) {
            System.out.printf("Yes, %s is in '%s'\n", target, sentence);
        }
    }
}