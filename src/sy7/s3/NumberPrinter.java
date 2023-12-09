package sy7.s3;

class NumberPrinter implements Runnable {
    private final Printer printer;

    public NumberPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 52; i += 2) {
            printer.print(i);
            printer.print(i + 1);
        }
    }
}

