package uamykola;

public class View {
    public static final String VALUE_LESS = "The desired value is less.";
    public static final String CONGRATULATION = "Congratulations you have guessed the number.";
    public static final String VALUE_HIGHER = "The desired value is higher.";
    public static final String NOT_INTEGER = "You entered not a number.";
    public static final String OUT_RANGE = "You entered a number outside the range.";
    public static final String GUESS_THE_NUMBER ="Try to guess the number.";
    public void printMessage(String message) {
        System.out.println(message);
    }

}
