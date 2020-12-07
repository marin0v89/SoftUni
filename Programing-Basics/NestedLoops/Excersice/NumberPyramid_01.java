import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 0; rows <n ; rows++) {

            for (int cols = 0; cols <=rows ; cols++) {
                System.out.printf("%d ",current);
                current++;
                if (current >n){
                    isBigger = true;
                    break;
                }
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}

