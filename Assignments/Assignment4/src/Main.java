//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Vanilla");
        Message message = new Message(user, "1st besked");
        Message message2 = new Message(user, "2nd besked");
        Message message3 = new Message(user, "3rd besked");

        System.out.println(user.addMessage(message));
        System.out.println(user.readMessage());
        System.out.println(user.readMessage());
        System.out.println(user.addMessage(message));
        System.out.println(user.addMessage(message2));
        System.out.println(user.readMessage()); // should return første besked
        System.out.println(user.readMessage()); // should return anden besked
        System.out.println(user.readMessage()); // should return anden besked
        System.out.println(user.addMessage(message3));
        System.out.println(user.readMessage()); // should return anden besked
        System.out.println(user.readMessage()); // should return anden besked
        System.out.println(user.addMessage(message));
        System.out.println(user.addMessage(message2));
        user.readAll();

    }
}
