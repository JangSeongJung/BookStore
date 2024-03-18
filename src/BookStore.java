
import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        BookRopository br1 =new BookRopository();


        br1.newBook(br1.book0);
        br1.newBook(br1.book1);
        br1.newBook(br1.book2);
        br1.newBook(br1.book3);

        for(;;){
            int endpro=0;
            System.out.println("다음 메뉴 중 고르시오.");
            System.out.println("1.책목록보기 2.번호로책찾기 3.타이틀로책찾기 4.지은이로책찾기 5.책추가하기 0.종료");
            int sel1=SC.nextInt();
            switch (sel1){
                case(1):
                    System.out.println("현재 책 명단");
                    br1.AllBook();
                    break;
                case(2):
                    // 번호로 책 찾아내기
                    System.out.println("검색할 책의 번호를 입력하시오.");
                    int bN = SC.nextInt();
                    br1.FindBookByNum(bN);
                    break;
                case(3):
                    // 타이틀로 책 찾아내기
                    System.out.println("검색할 책의 타이틀명을 입력하시오.");
                    String title1 = SC.next();
                    br1.FindBookByTitle(title1);
                    break;
                case(4):
                    // 저자의 이름으로 책 찾아내기
                    System.out.println("검색할 책의 저자 이름을 입력하시오.");
                    String writer1 = SC.next();
                    br1.FindBookByWriter(writer1);
                    break;
                case(5):
                    // 책을 추가하기
                    AddBook(br1,br1.BookList);
                    break;
                case(0):
                    endpro=1;
                    break;
                default:
                    System.out.println("메뉴에 있는 번호를 입력해 주십시오!");
            }
            if(endpro==1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    } // main end---------------------------------------------------------------------------------------------------
    public static void AddBook(BookRopository br1,ArrayList<Book> BookList) {
        Scanner SC = new Scanner(System.in);
        int howmanybooks = BookList.size() - 1;
        int index = howmanybooks + 1; // 책 번호
        System.out.println("타이틀을 입력하시오");
        String title = SC.next();
        System.out.println("책의 이름을 입력하시오");
        String name = SC.next();
        System.out.println("책의 저자 이름을 입력하시오");
        String writer = SC.next();
        System.out.println("출판사를 입력하시오");
        String cor = SC.next();
        System.out.println("출판년도를 입력하시오");
        int year = SC.nextInt();
        System.out.println("출판월을 입력하시오");
        int month = SC.nextInt();

        Book nbook=new Book(index,title ,name,writer,cor,year,month);
        br1.newBook(nbook);
        System.out.println(index+"번으로 "+name+"이 추가되었습니다.");
    }
}
