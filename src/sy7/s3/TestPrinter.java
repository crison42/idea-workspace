package sy7.s3;

public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        NumberPrinter numberPrinter = new NumberPrinter(printer);
        LetterPrinter letterPrinter = new LetterPrinter(printer);

        Thread t1 = new Thread(numberPrinter);
        Thread t2 = new Thread(letterPrinter);

        t1.start();
        t2.start();
    }
}