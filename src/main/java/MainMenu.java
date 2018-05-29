import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public MainMenuOptions[] getMenuOptions() {

        return MainMenuOptions.values();

    }

    public String showMenuOptions() {
        String menu = "\nPlease, select menu item!";

        for (MainMenuOptions options : getMenuOptions()) {
            menu += "\n" + options.getOption() + " - " + options.getDescription();
        }

        return menu;
    }


    public int optionSelected() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void actionAfterOptionSelected(int option) {

        for (MainMenuOptions options : getMenuOptions()) {

        }

        switch (option) {
            case 1:
                System.out.println("");
                break;
            default:
                System.out.println("Default");
        }
    }

//    chamar a lista de opções
//    gerenciar a escolha da opção
//public static void main(String[] args) {
//    int select;
//    do {
//        System.out.println("please select menu item");
//        System.out.println("1-create, 2-remove, 3 - rename");
//
//        Scanner scanner = new Scanner(System.in);
//        select = scanner.nextInt();
//
//        switch (select) {
//            case 1:
//                System.out.println("please select menu item");
//                System.out.println("1-image, 2-txt");
//                break;
//            case 2:
//                System.out.println("please select menu item");
//                System.out.println("1-file from pc1, 2-file from pc2, 3-file from pc3");
//                break;
//            case 3:
//                System.out.println("please type new name");
//                break;
//        }
//
//    } while (select != 4);
//}

}
