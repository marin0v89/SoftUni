import java.util.Scanner;

public class SawingFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tables = Integer.parseInt(scan.nextLine()); //5
        double lengthTable = Double.parseDouble(scan.nextLine()); //1
        double widthTable = Double.parseDouble(scan.nextLine());  //0.5
        double area = tables * (lengthTable + 2 * 0.30) * (widthTable + 2 * 0.30);
        double totalArea = tables * (lengthTable / 2) * (lengthTable / 2);
        double areaUSD = (area * 7) + (totalArea * 9);
        double bgn = areaUSD * 1.85;
        System.out.printf("%.2f USD %n", areaUSD);
        System.out.printf("%.2f BGN", bgn);

    }
}
