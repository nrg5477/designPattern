package adapter;

public class HairDryer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("Hair Dryer Powered On 110v");
    }
}
