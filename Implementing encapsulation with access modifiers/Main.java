public class Main {
    public static void main(String[] args) {

        Tree myTree1 = new Tree("Oak", 50,
                20, "brown");

        // getters retrieve the attributes
        // attribute values can only be modifies within the class
        // cant change any attribute's value in the Main class
        System.out.println("myTree1's name: " + myTree1.getTreeName());
        System.out.println("myTree1's height in meters: " + myTree1.getHeight());
        System.out.println("myTree1's truckDiameter in inches: " + myTree1.getTrunkDiameter());


        // myTree1.height = 180
        myTree1.growTree();
        System.out.println("myTree1's new height: " + myTree1.getHeight());
        System.out.println("myTree1's new trunkDiameter: " + myTree1.getTrunkDiameter());


        // setters allow to set value for that attributes
        // Set the height using the setter
        myTree1.setHeight(100);
        myTree1.setTrunkDiameter(50);

        
        // print the set values
        System.out.println("myTree1's new set height: " + myTree1.getHeight());
        System.out.println("myTree1's new set trunkDiameter: " + myTree1.getTrunkDiameter());
    }
}
