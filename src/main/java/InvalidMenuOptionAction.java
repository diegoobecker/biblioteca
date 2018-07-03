public class InvalidMenuOptionAction implements ActionMenu {

    private Printer printer;

    public InvalidMenuOptionAction(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.print(MessageManager.INVALID_MENU_OPTION);
    }
}
