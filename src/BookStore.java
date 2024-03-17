import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        BookRopository br1 =new BookRopository();

        Book book1 = new Book(1,"파이썬을 배워라! 당신의 파이가 늘어난다.", "한용영", "한영출판사", 2012, 5);
        Book book2 = new Book(2, "취미로 한 프로그래밍, 나의 주수입원이 되다.", "김미래", "나노출판사", 2017, 12);
        Book book3 = new Book(3, "자바야 걱정마 내가 너를 자바줄게", "오아람", "날아라출판사", 2011, 3);

        br1.newBook(book1);
        br1.newBook(book2);
        br1.newBook(book3);

        br1.AllBook();

        // 번호로 책 찾아내기
        System.out.println("검색할 책의 번호를 입력하시오.");

        int bN = SC.nextInt();
        br1.FindBookByNum(bN);

        // 이름으로 책 찾아내기
        System.out.println("검색할 책의 이름을 입력하시오.");
        String name1 = SC.next();
        br1.FindBookByName(name1);

    }
}
