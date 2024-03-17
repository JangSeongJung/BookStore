import java.util.ArrayList;

public class BookRopository {

    ArrayList<Book> BookList = new ArrayList<>();

    ArrayList books = new ArrayList<Book>();
    public void newBook(Book info){
        BookList.add(info);
    }
    public void AllBook(){
        for(int i=0; i<BookList.size(); i++){
            BookList.get(i).look();
        }
    }
    public void FindBookByNum(int bN){
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).index==bN){
                BookList.get(i).look();
            }
        }
    }
    public void FindBookByName(String name1){
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).name==name1){
                BookList.get(i).look();
            }
        }
    }


}
