public class Main {
    public static void main(String[] args) {

      //Exercise 1.13
      //Open the house project. Create an instance of class Picture and invoke its draw method. Also, try out the setBlackAndWhite and setColor methods.
        /*Picture picture = new Picture();
        picture.draw();
        picture.setBlackAndWhite();
        picture.setColor();*/


      //Exercise 1.16
      //In the source code of class Picture, find the part that actually draws the picture. Change it so that the sun will be blue rather than yellow.
        // done

      //Exercise 1.30
      //In this chapter we have mentioned the data types int and String. Java has more predefined data types. Find out what they are and what they are used for.
       //To do this, you can check Appendix B, or look it up in another Java book or in an online Java language manual.
        //1.31
        // 0 is int and other
        // "hello" is a string
        // 101 is int and other
        // -1 is int and other
        // true is a boolean
        // "33" is a string
        // 3.1415 is an int and not a byte



      //CHALLENGE EXERCISES
      //Exercise  1.18
      //Add a sunset to the single-sun version of Picture. That is, make the sun go down slowly.
      //Remember: The circle has a method slowMoveVertical that you can use to do this.
        Picture picture = new Picture();
        picture.draw();
        picture.sunset();

      //Exercise 1.19
      // If you added your sunset to the end of the draw method (so  that  the  sun  goes  down  automatically  when  the  picture  is  drawn),  change  this  now.
      //We  now want the sunset in a separate method, so that we can call draw and see the picture with the sun up, and then call sunset (a separate method!) to make the sun go down.

      //Exercise 1.20
      // Make a person walk up to the house after the sunset.
        Person person = new Person();
        person.makeVisible();
        //person.moveRight();
        person.slowMoveHorizontal(240);
        person.makeInvisible();
    }
}
