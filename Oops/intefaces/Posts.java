package intefaces;

// Interface 1
interface TextModeration {

    void checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

// Interface 2
interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is not allowed.");
    }
}

// Class implementing both interfaces
class ContentModerator implements TextModeration, SpamDetection {

    public void checkOffensive(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println(post + " -> Offensive Post");
        }
    }

    public void checkSpam(String post) {
        if (post.toLowerCase().contains("buy now")) {
            System.out.println(post + " -> Spam Post");
        }
    }

    // Resolve default method conflict
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

// Main class
public class Posts{

    public static void main(String[] args) {

        String[] posts = {
            "Hello everyone",
            "Buy now and get 50% off",
            "You are bad",
            "Welcome to Java"
        };

        ContentModerator cm = new ContentModerator();

        for (String post : posts) {

            if (TextModeration.containsRestrictedWords(post)) {
                cm.checkOffensive(post);
            }
            else if (post.toLowerCase().contains("buy now")) {
                cm.checkSpam(post);
            }
            else {
                System.out.println(post + " -> Valid Post");
            }
        }

        System.out.println();
        cm.displayModerationPolicy();
    }
}
