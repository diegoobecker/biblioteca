public class InvalidMenuOptionAction implements ActionMenu {

    @Override
    public void execute() {
        System.out.print("\n" + MenuOptions.INVALID_MENU_OPTION.getDescription());
    }
}
