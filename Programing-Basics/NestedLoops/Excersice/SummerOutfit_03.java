import java.util.Scanner;

public class SummerOutfit_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        //                      Мorning                 Afternoo             Evening
        //10 <= градуси <= 18   Outfit = Sweatshirt     Outfit = Shirt       Outfit = Shirt
        //                      Shoes = Sneakers	    Shoes = Moccasins    Shoes = Moccasins
        //
        // 18 < градуси <= 24   Outfit = Shirt          Outfit = T-Shirt     Outfit = Shirt
        //                      Shoes = Moccasins      Shoes = Sandals       Shoes = Moccasins
        //
        //градуси >= 25         Outfit = T-Shirt        Outfit = Swim Suit   Outfit = Shirt
        //                      Shoes = Sandals         Shoes = Barefoot      Shoes = Moccasins
        String outfit = "";
        String shoes = "";
        switch (time) {
            case "Morning":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (temp >= 18 && temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp >= 18 && temp <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (temp >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (temp >= 10 && temp <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp >= 18 && temp <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temp >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temp, outfit, shoes);
    }
}
