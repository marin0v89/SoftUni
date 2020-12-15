package Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] articleData = scan.nextLine().split(", ");
        String initialTitle = articleData[0];
        String initialContent = articleData[1];
        String initialData = articleData[2];
        Article article = new Article(initialTitle, initialContent, initialData);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(": ");
            String command = tokens[0];
            String data = tokens[1];
            switch (command) {
                case "Edit":
                    article.edit(data);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(data);
                    break;
                case "Rename":
                    article.changeTitle(data);
                    break;
            }
        }
        System.out.println(article);
    }
}
