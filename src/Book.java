import java.util.ArrayList;

public class Book {

    int index; String name; String writer; String cor; int year;int month;
    Book(int index, String name, String writer, String cor, int year,int month){
        this.index=index; this.name=name; this.writer=writer; this.cor=cor; this.year=year; this.month=month;
    }
    void look(){
        System.out.println("책 번호 : "+index+"   책 이름 : "+name+"   저자 : "+writer+"   출판사 : "+cor+"   "+year+"년 "+month+"월");
    }

}
