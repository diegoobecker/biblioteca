import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Printer printer;

    public MainMenu(Printer printer) {

        this.printer = printer;
    }

    public void showMenu() {
        int chosenOption;

        printer.print(MenuOptions.getMenuOptions());

        chosenOption = getChosenOption();

        doActionMenu(chosenOption);

        showMenu();
    }

    public int getChosenOption() {
        printer.print("\nYour Choice");
        Scanner chose = new Scanner(System.in);
        try {
            return chose.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public void doActionMenu(int choseee) {
        MenuOptions optionSelected;

        if(MenuOptions.validateOption(choseee)) {
            optionSelected = MenuOptions.resolveMenuOption(choseee);

        } else {
            optionSelected = MenuOptions.INVALID_MENU_OPTION;
        }

        ActionMenu action = ActionsFactory.getAction(optionSelected);

        action.execute();

    }
}
