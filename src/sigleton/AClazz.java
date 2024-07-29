package sigleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance(); //객체를 가져옴으로서 싱글톤 패턴 구현
        //this.socketClient = new SocketClient();

    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
