package Tasks12;

public class Book {

    private String Title;
    private String Author;
    private int Year;

    public Book(){}

    public Book(String title, String author, int year){
        this.Title=title;
        this.Author=author;
        this.Year=year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return  "name = " + Title + "author = " + Author + "year = " + Year;
    }
}
