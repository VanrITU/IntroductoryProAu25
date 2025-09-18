

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
        if (this.messageCount == 20) {
            return false;
        } else {
            this.inbox[this.messageCount] = msg;
            this.messageCount++;
            return true;
        }

    }

    public String readMessage() {
            //prøv at få den til at replace values med null fra start
        if (this.messageCount == 0) {
            return "There is no message to read!";
        }
            String message = this.inbox[0].getText(); //først gem

            for (int i = 1; i < this.messageCount; i++) { //på den måde går det ik ud af bounce igen
                this.inbox[i-1] = this.inbox[i];


            }
            this.inbox[this.messageCount] = null; // en form for clear men kun for den sidste i rækken
            this.messageCount--;
            return message;


    }

    public void readAll()  {
        for (int i = 1; i <= this.messageCount; i++) {
            System.out.println(this.inbox[i-1].getText());
            //this.inbox[i] = null;
        }
        messageCount = 0;
    }






}

