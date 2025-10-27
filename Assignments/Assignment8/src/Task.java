public class Task {
    //represents a single item that needs to get done
    private String desc;
    private int prio;
    private int time;

    public Task(String desc, int prio, int time){
        this.desc = desc;
        this.prio = prio;
        this.time = time;
    }
    public int getTime(){
        return this.time;
    }

    public int getPrio() {
        return this.prio;
    }

    public String toString() {
        String prioTxt;
        String[] prioTrans = {"very important", "important","unimportant","after learn Portuguese"};
        prioTxt = prioTrans[(this.prio-1)];

        return this.desc + " takes " + this.time + " minutes and has priority " + prioTxt;

    }







}
