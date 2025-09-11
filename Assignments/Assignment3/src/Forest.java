import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    public void addTree(double growthRate) {
        this.trees.add(new Tree(growthRate));
    }

    public String toString(){ //I learned about stringbuilder now
        StringBuilder totalTrees = new StringBuilder();
        for (Tree tree : trees){
            totalTrees.append(tree.toString());
        }
        return "Forest(" + totalTrees.toString() + ")";
       //return "Forest(" + trees.toString() + ")"; // this one didnt work beauce it printed as an obj with []
    }

    public void growOneYear() {
        for(Tree tree : this.trees){
            tree.growOneYear();
        }
    }

}
