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

        actionMenuOption(getActionMenu(chosenOption));
    }

    private void actionMenuOption(String actionMenu) {
        switch (actionMenu) {
            case "LIST_BOOK":
                BookList bookList = new BookList();
                Converter converter = new Converter();
                this.printer.print(converter.bookListToString(bookList.getBookList()));
        }
    }

    private String getActionMenu(int chosenOption) {
        for (MenuOptions option : MenuOptions.values()) {
            if (option.getOption() == chosenOption) {
                return option.getAction();
            }
        }
        return "";
    }

    public String getMenuOptions() {
        String options = "\nPlease, select option menu item!";

        for (MenuOptions option : MenuOptions.values()) {
            options += "\n" + option.getOption() + " - " + option.getDescription();
        }

        return options;
    }
}
