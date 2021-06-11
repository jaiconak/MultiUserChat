public class ServerMain {
    public static void main(String[] args) {
        int port = 8111;
        Server server = new Server(port);
        server.start();
    }
}
