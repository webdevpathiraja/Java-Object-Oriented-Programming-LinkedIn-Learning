public class Main {
    public static void main(String[] args) {

        ModArrayList arrayList1 = new ModArrayList();

        // add elements to the list
        arrayList1.add(0);
        arrayList1.add(40);
        arrayList1.add(50);
        arrayList1.add(60);

        // getUsingMod method with different indices
        System.out.println(arrayList1.getUsingMod(1));
        System.out.println(arrayList1.getUsingMod(-2));
        System.out.println(arrayList1.getUsingMod(10));

    }
}
