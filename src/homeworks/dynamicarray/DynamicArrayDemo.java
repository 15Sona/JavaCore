package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 8 ; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();
        System.out.println(" " + dynamicArray.getByIndex(2));
        System.out.println(" " + dynamicArray.getByIndex(10));
        dynamicArray.deleteByIndex(6);
        dynamicArray.set(2, 5);
        dynamicArray.add(3, 89);
        System.out.println(dynamicArray.exists(4));
        System.out.println(dynamicArray.exists(90));
        System.out.println(dynamicArray.getIndexByValue(5));
        System.out.println(dynamicArray.getIndexByValue(90));

        dynamicArray.print();
    }
}