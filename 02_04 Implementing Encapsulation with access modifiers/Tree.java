public class Tree {
    private String treeName;
    private double height;
    private double trunkDiameter;
    private String treeColor;

    public Tree(String treeName, double height, double trunkDiameter, String treeColor) {
        this.treeName = treeName;
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeColor = treeColor;
    }

    public String getTreeName() {
        return treeName;
    }

    public double getHeight() {
        return height;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }

    public void growTree() {
        this.height = height + 10;
        this.trunkDiameter = trunkDiameter + 1;
    }
}
