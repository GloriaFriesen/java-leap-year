import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a year, we'll tell you if it's a leap year:");
    String stringYear = myConsole.readLine();
    int userYear = Integer.parseInt(stringYear);
    LeapYear leapYear = new LeapYear();
    boolean leapYearResult = leapYear.isLeapYear(userYear);
    System.out.println("Is that year a leap year?" + leapYearResult);
  }
}
