package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 5; i < 20 ; i+=2) {
            dynamicArray.add(i);
        }
        dynamicArray.print();
        System.out.println(" " + dynamicArray.getByIndex(2));
        System.out.println(" " + dynamicArray.getByIndex(10));
    }
}






