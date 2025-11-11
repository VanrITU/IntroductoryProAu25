public class RejseKort {
    private int bal = 0;
    private int time = 0;
    //private int sinceCheckIn = 0;
    private boolean checkIn = false;
    private int minX = 0;
    private int minY = 0;

    public RejseKort() {
        //constructor taking no parameters
        // the internal representation and details of implementation is left up to you

        this.bal = 100;

    }



    public void depositMoney(int dkk) {

        if (dkk < 0) {
            System.out.println("Error: Cannot deposit negative amount");
        } else {
            this.bal += dkk;
            System.out.println(dkk + " DKK deposited. New balance: "+this.bal+" DKK");
        }
    }

    public boolean isCheckedIn(int timestamp) {
        // timestamp is in minutes and only relative

        int timeDif = timestamp-time;

        if (!checkIn) {
            return false;
        } else if (timeDif > 120) {
            return false;
        } else {
            return true;
        }


    }


    public void checkIn(int x, int y, int timestamp) {
        if (x < minX || x > 0) {
            minX = x;
        }
        if (y < minY || y > 0) {
            minY = y;
        }

        if (!isCheckedIn(timestamp)) {

            if (bal < 100) {
                checkIn = false;
                int price = 12+(x-minX + y-minY)*3;
                int missing = price - bal;
                System.out.println("Not enough money in account to check in. Please deposit at least " + missing + " DKK");
            } else {
                checkIn = true;
                System.out.println("Checked in");
                time = 0;
            }


        } else if (isCheckedIn(timestamp)) {
            checkIn = true;
            System.out.println("Continued journey ("+(timestamp-time)+" minutes since last check in)");
            time = 0;
        } else if ((timestamp-time) > 120) {
            forceCheckOut(x, y, timestamp);
        }





    }


    public void checkOut(int x, int y, int timestamp) {

        if (!isCheckedIn(timestamp)) {
            System.out.println("Error: Cannot check out; Not currently checked in");

        } else if (isCheckedIn(timestamp)) {
            checkIn = false;
            int price = 12+(x-minX + y-minY)*3;
            bal = bal - price;
            System.out.println("Checked out! "+(timestamp-time)+" minutes since last check in. Price is "+price+" DKK, remaining balance is "+bal+" DKK");


        }


    }


    private void forceCheckOut(int x, int y, int timestamp) {
        checkIn = false;
        int price = 12+(x-minX + y-minY)*3;

        if (price >= 50) {
            bal = bal - 50;
        } else if (price >= 12) {
            bal = bal - price;
        }



    }






}
