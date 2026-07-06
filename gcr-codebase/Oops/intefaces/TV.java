package intefaces;

// Interface 1
interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Netflix");
    }
}

// Interface 2
interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Xbox Game Pass");
    }
}

// Class implementing both interfaces
class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Avatar", "Inception"};
    String[] games = {"FIFA", "Minecraft", "BGMI"};

    public void streamMovie() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    public void playGame() {
        System.out.println("Available Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }

    // Resolve default method conflict
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

// Main class
public class TV {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.streamMovie();
        System.out.println();

        tv.playGame();
        System.out.println();

        tv.showSubscriptionDetails();
    }
}
