public class Book
  
{
  //Fields
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
  
  
  // private is a visiblity modifier, cant access directly from outside the class
  // instance data is private most of the time becuase hava would like properrties and names changed on object easily, forced to do them through public methods
  //when something is public, that means that you as a programmer can access it as a class
  //almost all classes we make will be public
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
    // normal in java to have same numbe
  }
  // accessor methods

  public  String getTitle()
  {
    return title; //reuturn type is what your trying to get
  }

  public String getAuthor()
  {
    return author;
  }

  public int getYear()
  {
    return year;
  }

  public int getNumPages()
  {
    return numPages;
  }

  public boolean getHardCover()
  {
    return hardCover;
  }

  //mutator methods (ALL HAVE RETURN TYPE OF VOID JUST SETTING THINGS)

  public void setTitle(String s)
  {
    title = s;
  }
   public void setAuthor(String s)
  {
    title = s;
  }
   public void setYear(int s)
  {
    year = s;
  }
   public void setNumPages(int s)
  {
    numPages = s;
  }

   public void setHardCover(boolean s)
  {
    hardCover = s;
  }

  //other methods

  public boolean equals(Book b)
  {
    if(this.getTitle().equals(b.getTitle()))// this means the object your comparing the parameter to
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  //what prints for our objects
  
  public String toString()
  {
    String str= "";
    str = "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nNumber of Pages: " + numPages + "\nHard Cover: " + hardCover;
    return str;
    
  }
  
}