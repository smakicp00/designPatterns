package crossPlarformUIElements;

public class WebDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
