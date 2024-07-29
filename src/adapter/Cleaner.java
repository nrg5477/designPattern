package adapter;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("Cleaner is connected to the Electronic 220v");
    }
}
