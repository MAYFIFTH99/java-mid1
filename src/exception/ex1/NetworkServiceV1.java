package exception.ex1;

public class NetworkServiceV1 { public void sendMessage(String data) {
        String address = "http://examplecom";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
