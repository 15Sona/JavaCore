package homeworks;

public class FigurePainter {
    public static void main(String[] args) {
        int a = 5;
        for ( int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j ++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for ( int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j -- )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

// Հրանտ ջան 3րդ ու 4 րդ պատկերներում asteriskների հեռավորությունը ո՞նց պահեմ, որ պատկերը չփոխվի։
// Եթե ("* ")  եմ կիրառում , պատկեր ստացվում է սենց
//    *
//   * *
//  * * *
// * * * *
//* * * * *
        }

        System.out.println();
        for (int i = a; i >= 1; i--) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a; i >= 1; i--) {
            for (int j = 0; j < (a - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
