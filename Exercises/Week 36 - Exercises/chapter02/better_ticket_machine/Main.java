package better_ticket_machine;

public class Main {
    public static void main(String[] args) {


        // Exercise 2.2
        TicketMachine ticketMachine = new TicketMachine(10);
        /*ticketMachine.printTicket();
        ticketMachine.getBalance();*/
        // it says that we should insert money first (the amount that a ticket costs at least)


        // Exercise 2.3
        /*ticketMachine.insertMoney(100);
        ticketMachine.printTicket();*/
        //I didnt get a refund
        /*ticketMachine.insertMoney(1);
        ticketMachine.printTicket();*/
        //it tells me the rest amount needed for a ticket


        // Exercise 2.8
        // Check whether or not it is possible to leave out the word public
        //from the outer wrapper of the TicketMachine class.

        //ticketMachine.printTicket();
        // it is possible


        // Ex 2.9
        // Put back the word public, and then check whether it is possible
        //to leave out the word class by trying to compile again

        //it is not running


        // Ex 2.11
        // idk? I dont see anything significant - it has a parameter and uses it?


        //Ex 2.37
        // Add a method called prompt to the TicketMachine class.
        //This should have a void return type and take no parameters. The body of the
        //method should print the following single line of output:
        // Please insert the correct amount of money

        //ticketMachine.prompt();
        //it works


        //Ex 2.38

        // then it prints the words not the values/amounts


        //Ex 2.41
        // add showPrice

        //ticketMachine.showPrice();
        //it works


        //Ex 2.42
        TicketMachine ticketMachine2 = new TicketMachine(20);
        ticketMachine2.showPrice();
        ticketMachine.showPrice();
        //it shows different because its two different ticket machines / instances of the class


        //Ex 2.79
        // 102
        // catfish
        // cat9
        // 12cat
        // cat12
        // fi
        // fish

    }
}