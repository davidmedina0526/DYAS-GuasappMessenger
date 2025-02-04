package edu.unisabana.dyas.patterns.util;

// Proxy que controla el envío de mensajes
public class MessagingClientProxy implements MessageSender {
    private MessagingClient realClient;

    public MessagingClientProxy(MessagingClient realClient) {
        this.realClient = realClient;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec")) {
            System.out.println("Message blocked due to security reasons");
        } else {
            realClient.sendMessage(message);
        }
    }
}