package Exercise.P08_CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    String data = tokens[1];
                    customList.add(data);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    data = tokens[1];
                    System.out.println(customList.contains(data));
                    break;
                case "Swap":
                    int indexOne = Integer.parseInt(tokens[1]);
                    int indexTwo = Integer.parseInt(tokens[2]);
                    customList.swap(indexOne, indexTwo);
                    break;
                case "Greater":
                    String element = tokens[1];
                    System.out.println(customList.countGreater(element));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.println(customList);
                    break;

            }
            input = scan.nextLine();
        }
    }
}
