import java.util.*;

public class User {
    private String name;
    private Message[] inbox;
    private int messageCount;

    public User(String userName) {
        this.name = userName;
        this.inbox = new Message[20];
        this.messageCount = 0;
    }

    public boolean addMessage(Message msg) {
        this.inbox[this.messageCount] = msg;
        this.messageCount++;
        return this.inbox[this.messageCount] == msg;

    }

    public String readMessage() {
        if (this.messageCount == 0) {
            return "There is no message to read!";
        } else {
            return this.inbox[0].getText();
            }
    }






}

