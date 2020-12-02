import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result1 = scan.nextLine();
        String result2 = scan.nextLine();
        String result3 = scan.nextLine();
        int win = 0;
        int lose = 0;
        int draw = 0;
        String[] res1 = result1.split(":");
        int part1 = Integer.parseInt(res1[0]);
        int part2 = Integer.parseInt(res1[1]);
        String[] res2 = result2.split(":");
        int part3 = Integer.parseInt(res2[0]);
        int part4 = Integer.parseInt(res2[1]);
        String[] res3 = result3.split(":");
        int part5 = Integer.parseInt(res3[0]);
        int part6 = Integer.parseInt(res3[1]);

        if (part1 > part2) {
            win = win + 1;
        }
        if (part3 > part4) {
            win = win + 1;
        }
        if (part5 > part6) {
            win = win + 1;
        }
        if (part2 > part1) {
            lose = lose + 1;
        }
        if (part4 > part3) {
            lose = lose + 1;
        }
        if (part6 > part5) {
            lose = lose + 1;
        }
        if (part2 == part1) {
            draw = draw + 1;
        }
        if (part4 == part3) {
            draw = draw + 1;
        }
        if (part6 == part5) {
            draw = draw + 1;
        }
        System.out.printf("Team won %d games.%n",win);
        System.out.printf("Team lost %d games.%n",lose);
        System.out.printf("Drawn games: %d",draw);
    }
}
