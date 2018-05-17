public class Biblioteca {

    private final Printer printer;

    public Biblioteca(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.print(MessageManager.WELCOME_MESSAGE);
    }

    public static void main(String[] args) {


    }

}
