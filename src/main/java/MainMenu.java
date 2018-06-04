import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Printer printer;

    private int chosenOption;

    public MainMenu(Printer printer) {
        this.printer = printer;
    }

    public void showMainMenu() {
        this.printer.print(getMenuOptions());

        this.printer.print("\n\nYour Choice: ");

        Scanner chose = new Scanner(System.in);
        try {
            chosenOption = chose.nextInt();
        }catch (InputMismatchException e) {
            this.printer.print("Option is not valid!");
            showMainMenu();
        }

        actionMenu(chosenOption);
    }

    private void actionMenu(int chosenOption) {
        String actionMenu = "";
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == chosenOption) {
                actionMenu = option.getAction();
            }
        }

        switch (actionMenu) {
            case "LIST_BOOK":
                this.printer.print("\nList Books");
                BookList bookList = new BookList();
                Converter converter = new Converter();
                this.printer.print(converter.bookListToString(bookList.getBookList()));
                break;
            default:
                this.printer.print("Option is not valid!");
                showMainMenu();
        }
    }

    public String getMenuOptions() {
        String options = "\nPlease, select option menu item!";

        for (MenuOptions option : MenuOptions.values()) {
            options += "\n" + option.getOption() + " - " + option.getDescription();
        }

        return options;
    }
}
