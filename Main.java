public class EndsWith {
    public static void main(String[] args) {

        String pastTenseVerb = "biked";
        String presentTenseVerb = "biking";
        String pastTenseSuffix = "ed";
        String presentTenseSuffix = "ing";


        System.out.printf("Yesterday, I %s to work.\t", pastTenseVerb);
        if (pastTenseVerb.endsWith(pastTenseSuffix)) {
            System.out.println("This action has already happened.");
        }

        System.out.printf("Today, I will be %s to work.\t", presentTenseVerb);
        if (presentTenseVerb.endsWith(presentTenseSuffix)) {
            System.out.print("This action is happening;" + " ");
            System.out.println("it is not yet complete.");
        }
    }
}
