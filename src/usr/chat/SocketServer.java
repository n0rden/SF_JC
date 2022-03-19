package usr.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        // ������� ��������� ����� �� ����� 1234
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            System.out.println("Waiting...");
            // ���� ������� �� ����
            Socket socket = server.accept();
            System.out.println("Client connected!");
            // ������� ������� �� ����� ������� � ��������� �����
            new Thread(new Client(socket)).start();
        }
    }
}
