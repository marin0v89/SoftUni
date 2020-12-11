package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentProduct = scan.nextLine();
            products.add(currentProduct);
        }
        Collections.sort(products);

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "." + products.get(i));
        }
    }
}
