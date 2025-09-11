public class Tree {
    private int age;
    private double height;
    private double growthRate;

    public Tree(double growthRate) {
        this.growthRate = growthRate;
        this.height = 0.12;
        this.age = 1;
    }

    public String toString(){
        return "Tree(age = " + age + ", height = " + height + ")";
    }

    public void growOneYear() {
        if (height*(1+growthRate/100) <= 14) {
            this.age++;
            this.height = height * (1 + growthRate / 100);
        } else {
            this.age++;
            this.height = 14;
        }
    }

}
