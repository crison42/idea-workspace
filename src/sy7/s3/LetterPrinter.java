package sy7.s3;

class LetterPrinter implements Runnable {
    private final Printer printer;

    public LetterPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            printer.print(c);
        }
    }
}