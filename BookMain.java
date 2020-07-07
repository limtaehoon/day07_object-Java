package day07_object;

import java.util.Scanner;

public class BookMain {
static Scanner sc=new Scanner(System.in);
BookBean[]arr=new BookBean[50];
//메뉴보기
int cnt;
public void showMenu() {
	System.out.println("메뉴>");
	System.out.println("1.데이터입력");
	System.out.println("2.전체보기");
	System.out.println("선택:");
}
//데이터 입력	
public void bookInsert() {
	System.out.println("데이터입력>");
	System.out.println("책제목");
	String tatle=sc.nextLine();
	System.out.println("책저자");
	String writer=sc.nextLine();
	arr[cnt]=new BookBean(tatle,writer);
	cnt++;
}
//전체보기
public void bookList() {
	System.out.println("보기");
//	for(int i=0;i<cnt;i++) {
//	System.out.println("책제목"+arr[i].tatle);
//	System.out.println("책제목"+arr[i].writer);
//	System.out.println();
	for(BookBean book:arr) {
		if(book==null)break;
		System.out.println("책제목"+book.tatle);
		System.out.println("책제목"+book.writer);
	
	}
}

public static void main(String[] args) {
		BookMain bm=new BookMain();
		while(true) {
			bm.showMenu();
		int choie=sc.nextInt();
		BookMain.sc.nextLine();
		switch(choie) {
		case 1:bm.bookInsert();break;
		case 2:bm.bookList();break;
		case 3:System.out.println("종료");
		System.exit(0);
		default:System.out.println("입력오류");
		
		}

	}
}
}
