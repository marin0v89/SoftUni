public class MultiplicationTable_02 {
    public static void main(String[] args) {
        for (int numberOne = 1; numberOne <=10 ; numberOne++) {
            for (int numberTwo = 1; numberTwo <=10 ; numberTwo++) {
                System.out.printf("%d * %d = %d%n",numberOne ,numberTwo ,numberOne*numberTwo);
            }
        }
    }
}
