import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Printer printer;

    public MainMenu(Printer printer) {
        this.printer = printer;
    }

    public void showMenu() {
        int chosenOption;

        printer.print(getMenuOptions());

        chosenOption = getChosenOption();

        if (MenuOptions.validateOption(chosenOption)) {
            doActionMenu(chosenOption);
        } else {
            printer.print(MessageManager.INVALID_MENU_OPTION);
        }

        showMenu();
    }


    public String getMenuOptions() {
        String menu = "\nPlease, select option menu item!";

        for (MenuOptions option : MenuOptions.values()) {
            menu += "\n" + option.getOption() + " - " + option.getDescription();
        }

        return menu;
    }

    public int getChosenOption() {
        printer.print("\nYour Choice");
        Scanner chose = new Scanner(System.in);
        try {
            return chose.nextInt();
        }catch (InputMismatchException e) {
            return 0;
        }
    }

    public void doActionMenu(int choseee) {

        MenuOptions optionSelected = MenuOptions.resolveMenuOption(choseee);

        ActionMenu action = ActionsFactory.getAction(optionSelected);

        action.execute();
    }
}
