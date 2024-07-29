package adapter;

public class AirConditional implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("AirConditional is connected 220v");
    }
}
