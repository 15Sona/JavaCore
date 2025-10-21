package lessons.lesson1.lesson6.library;

import java.util.Scanner;

public class LibraryDemo {
    static private final Scanner scanner = new Scanner(System.in);
    static private final BookStorage bookStorage = new BookStorage();
    private static final String EXIT ="0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS ="2";
    private static final String SEARCH_BOOK_BY_TITLE ="3";
    private static final String PRINT_MOST_EXPENSIVE_BOOK ="4";
    private static final String REMOVE_BOOK_BY_INDEX = "5";
    private static final String FIND_BOOKS_BY_PRICE_INTERVAL = "6";
    private static final String PRINT_QUANTITY_OF_BOOK= "7";
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            prinfCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_MOST_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case REMOVE_BOOK_BY_INDEX:
                    int index = removeBook();
                    if(index>=0){
                        bookStorage.removeBookById(index);
                        System.out.println("Book successfully removed.");
                    }
                    break;
                case FIND_BOOKS_BY_PRICE_INTERVAL:
                    System.out.println("Please enter the minimum price of the book: ");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please enter the maximum price of the book: ");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    bookStorage.findBooksByPriceInterval(minPrice,maxPrice);
                    break;
                case PRINT_QUANTITY_OF_BOOK:
                    bookStorage.updateQuantity();
                    break;
                default:
                    System.err.println("Wrong command");
            }
        }
    }
    private static void addBook() {
        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(bookTitle, authorName,price);
        bookStorage.add(book);
        System.out.println("Book successfully added");
        bookStorage.updateQuantity();
    }
    public static void prinfCommands(){
        System.out.println("Enter "+ EXIT  +" to EXIT");
        System.out.println("Enter "+ ADD_BOOK +" to ADD A NEW BOOK");
        System.out.println("Enter "+ PRINT_ALL_BOOKS +" to PRINT EXISTING BOOKS");
        System.out.println("Enter "+ SEARCH_BOOK_BY_TITLE + " to SEARCH BY TITLE");
        System.out.println("Enter "+ PRINT_MOST_EXPENSIVE_BOOK +" to PRINT THE MOST EXPENSIVE BOOK");
        System.out.println("Enter "+ REMOVE_BOOK_BY_INDEX +" to REMOVE THE BOOK BY ID");
        System.out.println("Enter "+ FIND_BOOKS_BY_PRICE_INTERVAL +" to FIND BOOKS BY PRICE INTERFAVL");
        System.out.println("Enter "+ PRINT_QUANTITY_OF_BOOK +" to PRINT QUANTITY OF THE BOOK");
    }
    public static int removeBook(){
        System.out.println("Please enter the ID of the selected book to remove it from the list.");
        int index = Integer.parseInt(scanner.nextLine());
        return index;

    }
}