import adapter.Cleaner;
import adapter.Electronic110V;
import adapter.HairDryer;
import adapter.SocketAdapter;
import sigleton.AClazz;
import sigleton.BClazz;
import sigleton.SocketClient;

public class Main {
    public static void main(String[] args) {
//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient socketClient1 = aClazz.getSocketClient();
//        SocketClient socketClient2 = bClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(socketClient1.equals(socketClient2));
//        socketClient1.connect();
//        socketClient2.connect();

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
//        connect(cleaner);
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
    }


    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}