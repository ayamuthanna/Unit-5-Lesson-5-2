import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) {

        

        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
        Book h = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);

        System.out.println(b);
        System.out.println("");
        Book c = new Book("The Stranger", "Albert Camus", 1942, 159, false);
        
        System.out.println(c);

        System.out.println("Number of pages in the Stranger: " + c.getNumPages());

        System.out.println("Is Malala a hard cover book : " + c.getHardCover());
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter new number of pages for Malala");
        int np = scan.nextInt();

        b.setNumPages(np);

        System.out.println(b);

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Change author name for The Stranger");
        String aut = scan2.nextLine();

        b.setAuthor(aut);

        System.out.println(b);

        System.out.println("Are the books equal? : " + b.equals(b));
        System.out.println("Are the books equal? : " + b.equals(c));
        System.out.println("Are the books equal? : " + b.equals(h));

}
}