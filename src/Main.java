import adapter.Cleaner;
import adapter.Electronic110V;
import adapter.HairDryer;
import adapter.SocketAdapter;
import aop.AopBrowser;
import proxy.Browser;
import proxy.BrowserProxy;
import proxy.Ibrowser;
import sigleton.AClazz;
import sigleton.BClazz;
import sigleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

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

//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
////        connect(cleaner);
//        Electronic110V adapter = new SocketAdapter(cleaner);
//        connect(adapter);

//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        Ibrowser ibrowser = new BrowserProxy("www.naver.com");
//        ibrowser.show();
//        ibrowser.show();
//        ibrowser.show();
//        ibrowser.show();
//        ibrowser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        Ibrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }


    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}