package crossPlarformUIElements;

abstract public class Dialog {
    public void render(){
        createButton();
    };
    public abstract Button createButton();
}
