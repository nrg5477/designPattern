package observer;

public class Button{
    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String mesaage) {
        buttonListener.clickEvent(mesaage);
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
