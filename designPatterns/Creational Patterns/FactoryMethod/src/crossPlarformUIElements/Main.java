package crossPlarformUIElements;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new WebDialog();
        Button buttonHTLM = dialog.createButton();

        buttonHTLM.render();
        buttonHTLM.onClick();

        Dialog dialog2 = new WindowsDialog();
        Button buttonWindows = dialog2.createButton();

        buttonWindows.render();
        buttonWindows.onClick();
    }
}
