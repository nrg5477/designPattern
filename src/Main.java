import sigleton.AClazz;
import sigleton.BClazz;
import sigleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient socketClient1 = aClazz.getSocketClient();
        SocketClient socketClient2 = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(socketClient1.equals(socketClient2));
        socketClient1.connect();
        socketClient2.connect();
    }
}