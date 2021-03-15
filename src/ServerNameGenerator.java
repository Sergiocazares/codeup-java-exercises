import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        //Created two arrays; 10 adjs and 10 nouns.
        String[] adjectives = new String[10];
        String[] nouns = new String[10];

        adjectives[0] = "tough";
        adjectives[1] = "witty";
        adjectives[2] = "sore";
        adjectives[3] = "salty";
        adjectives[4] = "absent";
        adjectives[5] = "early";
        adjectives[6] = "trashy";
        adjectives[7] = "makeshift";
        adjectives[8] = "lush";
        adjectives[9] = "nifty";

        nouns[0] = "babies";
        nouns[1] = "beef";
        nouns[2] = "cemetery";
        nouns[3] = "hook";
        nouns[4] = "cart";
        nouns[5] = "sisters";
        nouns[6] = "question";
        nouns[7] = "cream";
        nouns[8] = "laugh";
        nouns[9] = "treatment";

        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", getRandomElement(adjectives), getRandomElement(nouns));
    }

    public static String getRandomElement(String[] array) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }
}