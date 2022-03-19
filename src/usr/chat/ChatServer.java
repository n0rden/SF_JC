package usr.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<Client> clients = new ArrayList<>();
    private ServerSocket serverSocket;
    private final int PORT = 1234;

    public ChatServer() {
        // создаем серверный сокет на порту 1234
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            System.out.println("Waiting...");
            try {
                // ждем клиента из сети
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // создаем клиента на своей стороне
                clients.add(new Client(socket, this));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sandAll(String message) {
        for (Client client : clients) {
            client.receive(message);
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer().run();
    }
}