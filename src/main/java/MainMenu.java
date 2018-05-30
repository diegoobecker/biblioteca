import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMenu {

//    private MainMenuOptions mainMenuOptions = MainMenuOptions.values();
    private int optionSelected;

    public int getOptionSelected() {
        return optionSelected;
    }

    public MainMenuOptions[] getMenuOptions() {

        return MainMenuOptions.values();

    }

    public void showMenuOptions(Printer printer) {

        printer.print("\nPlease, select option menu item!");

        for (MainMenuOptions option : getMenuOptions()) {
            printer.print("\n" + option.getOption() + " - " + option.getDescription());
        }

        Scanner scanner = new Scanner(System.in);
        try{
            optionSelected = scanner.nextInt();
        } catch (InputMismatchException e){
            printer.print("The option should be a integer number!");
            showMenuOptions(printer);

        } catch (NoSuchElementException ne){
            printer.print(ne.getMessage());
        }
    }

    public void actionMenu(Printer printer) {
//            switch (optionSelected) {
//                case MainMenuOptions.LIST_BOOK.getOption():
//            }

            if(optionSelected == MainMenuOptions.LIST_BOOK.getOption()){
                printer.print("List Books");
                Converter converter = new Converter();
                BookList bookList = new BookList();

                printer.print(converter.bookListToString(bookList.getBookList()));
            }

//            returnMenu();
    }

}
