import adapter.Cleaner;
import adapter.Electronic110V;
import adapter.HairDryer;
import adapter.SocketAdapter;
import aop.AopBrowser;
import decorator.*;
import facade.Ftp;
import facade.Reader;
import facade.SftpClient;
import facade.Writer;
import observer.Button;
import observer.IButtonListener;
import proxy.Browser;
import proxy.BrowserProxy;
import proxy.Ibrowser;
import sigleton.AClazz;
import sigleton.BClazz;
import sigleton.SocketClient;
import strategy.*;

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

//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//        Ibrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//                });
//        aopBrowser.show();
//        System.out.println("loading time : " + end.get());
//        aopBrowser.show();
//        System.out.println("loading time : " + end.get());

//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        //a3
//        ICar audi3 = new A3(audi,"A3");
//        audi3.showPrice();
//        //a4
//        ICar audi4 = new A4(audi,"A4");
//        audi4.showPrice();
//        //a5
//        ICar audi5 = new A5(audi, "A5");
//        audi5.showPrice();

//        Button button = new Button("버튼");
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//        button.click("메시지1");
//        button.click("메시지2");
//        button.click("메시지3");

////        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "home/etc");
////        ftpClient.connect();
////        ftpClient.moveDirectory();
////        Writer writer = new Writer("text.tmp");
////        writer.fileConnect();
////        writer.write();
////        Reader reader = new Reader("text.tmp");
////        reader.fileConnect();
////        reader.fileRead();
////
////        reader.fileDisconnect();
////        writer.fileDisconnect();
////        ftpClient.disConnect();
//        //-->
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "home/etc", "text.tmp");
//        sftpClient.connect();
//        sftpClient.write();
//        sftpClient.read();
//        sftpClient.disconnect();
        Encoder encoder = new Encoder();
        //base64
        EncodingStrategy base64 = new Base64Stategy();
        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        //Append
        EncodingStrategy append = new AppendStrategy();
        encoder.setEncodingStrategy(append);
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }


    //콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}