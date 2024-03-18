import java.sql.SQLOutput;
import java.util.ArrayList;

public class BookRopository {

    ArrayList<Book> BookList = new ArrayList<>();

    Book book0 = new Book(0,"title","-------------책 제목-------------", "저자이름", "--출판사--", 0000, 00);
    Book book1 = new Book(1,"파이썬","파이썬을 배워라! 당신의 파이가 늘어난다.", "한용영", "한영출판사", 2012, 5);
    Book book2 = new Book(2, "프로그래밍","취미로 한 프로그래밍, 나의 주수입원이 되다.", "김미래", "나노출판사", 2017, 12);
    Book book3 = new Book(3, "자바","자바야 걱정마 내가 너를 자바줄게", "김미래", "날아라출판사", 2011, 3);

    public void newBook(Book info){
        BookList.add(info);
    }
    public void AllBook(){
        for(int i=1; i<BookList.size(); i++){
            BookList.get(i).look();
        }
    }
    public void FindBookByNum(int bN){
        int count=0;
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).index==bN){
                BookList.get(i).look();
                count++;
            }
        }
        if(count==0){
            System.out.println("검색하신 번호의 책이 존재하지 않습니다.");
        }
    }
    public void FindBookByTitle(String title1){
        int count=0;
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).title.equals(title1)){
                BookList.get(i).look();
                count++;
            }
        }
        if(count==0){
            System.out.println("검색하신 타이틀의 책이 존재하지 않습니다.");
        }
    }
    public void FindBookByName(String name1){ // 이름의 경우 띄어쓰기가 있어서 코딩이 에러가 난다.
        int count=0;
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).name.equals(name1)){
                BookList.get(i).look();
                count++;
            }
        }
        if(count==0){
            System.out.println("검색하신 이름의 책이 존재하지 않습니다.");
        }
    }
    public void FindBookByWriter(String writer1){
        int count=0;
        for(int i=0; i<BookList.size(); i++){
            if(BookList.get(i).writer.equals(writer1)){
                BookList.get(i).look();
                count++;
            }
        }
        if(count==0){
            System.out.println("검색하신 저자의 책이 존재하지 않습니다.");
        }
    }

}
