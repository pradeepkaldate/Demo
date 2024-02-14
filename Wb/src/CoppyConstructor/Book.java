package CoppyConstructor;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private int nuOfPages;
public Book()
{
	title=null;
	author=null;
	ISBN=null;
}
public Book(String title,String author)
{
	this.author=author;
	this.title=title;
}
public Book(String title,String author,String ISBN)
{
	this.author=author;
	this.title=title;
	this.ISBN=ISBN;
}
public Book(String title,String author,String ISBN,int nuOfPages)
{
	this.author=author;
	this.ISBN=ISBN;
	this.nuOfPages=nuOfPages;
	this.title=title;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", nuOfPages=" + nuOfPages + "]";
}
 
}
