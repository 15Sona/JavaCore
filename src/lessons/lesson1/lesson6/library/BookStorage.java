package lessons.lesson1.lesson6.library;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0 ;
    public void add (Book book){
        if(size == books.length){
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[]tmp = new Book[size+10];
        System.arraycopy(books,0,tmp, 0,size);
        books = tmp;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().toLowerCase().contains(keyword)){
                System.out.println(books[i]);
            }

        }
    }
    public Book getBookByMaxPrice(){
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if(books[i].getPrice() > price){
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];

    }
    public void removeBookById(int index){

        if (index < 0 || index >= size) {
            System.out.println("There is not such an element. Invalid index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            books[i -1] = books[i];
        }
        size --;

    }
    public void findBooksByPriceInterval(double minPrice, double maxPrice){
        boolean fountTheBook = false;
        for (int i = 0; i < books.length ; i++) {
            if (books[i] != null){
                if(books[i].getPrice()>=minPrice && books[i].getPrice()<=maxPrice) {
                    System.out.println(books[i]);
                    fountTheBook = true;
                }
            }
        }
        if(!fountTheBook){
            System.out.println("No books found in the given price range.");
        }

    }
    public void  updateQuantity() {
        int totalQuantity = 0;

        for (Book book : books) {
            if (book != null && book.getTitle() != null) {
                totalQuantity++;
            }
        }
        System.out.println(" Total quantity of all book(s) is(are): " + totalQuantity);
    }
}