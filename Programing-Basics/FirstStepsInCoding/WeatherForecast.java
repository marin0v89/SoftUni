import javax.swing.*;
import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String condition = scan.nextLine();
        String weather = "sunny";
        if (condition .equals(weather))
            System.out.println("It's warm outside!");
        else
            System.out.println("It's cold outside!");

    }
}
