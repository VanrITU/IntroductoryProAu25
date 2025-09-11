//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.addTree(2);
        forest.addTree(4);
        System.out.println(forest.toString());
        forest.growOneYear();
        System.out.println(forest.toString());

    }
}