public class InvalidMenuOptionAction implements ActionMenu {

    @Override
    public void execute() {
        System.out.println(MenuOptions.INVALID_MENU_OPTION.getDescription());
    }
}
