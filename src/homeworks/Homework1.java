package homeworks;

public class Homework1 {
    public static void main(String[] args) {

        int x = 33, y = 99;
        if (x > y){
            System.out.println(x + " bigger than " + y);
        }
         else if (x == y) {
            System.out.println(x + " equals " + y);
        }
          else {
            System.out.println (y + " bigger than " + x);
        }
        for (int k = 1;  k <= 5;  k++) {
            System.out.print(k + " ");

        }

        int p = 45 , l = 34;
        int z = p + l ;
        System.out.println("\n" + z);

        int n = 3;
        for(int i = 1; i <= 10 ; i++ ) {
            System.out.println( n + " * " + i  + " = " +  (n * i));
        }

    }

}
