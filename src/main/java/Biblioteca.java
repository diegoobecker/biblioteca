public class Biblioteca {

    private final Printer printer;
    private final MainMenu mainMenu;

    public Biblioteca(Printer printer, MainMenu mainMenu) {
        this.printer = printer;
        this.mainMenu = mainMenu;
    }

    public void run() {
        printer.print(MessageManager.WELCOME_MESSAGE);

        mainMenu.showMenu();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        MainMenu mainMenu = new MainMenu(printer);

        Biblioteca biblioteca = new Biblioteca(printer, mainMenu);

        biblioteca.run();
    }

}
