package day07_object;

import java.util.Scanner;

public class BookMain {
static Scanner sc=new Scanner(System.in);
BookBean[]arr=new BookBean[50];
//�޴�����
int cnt;
public void showMenu() {
	System.out.println("�޴�>");
	System.out.println("1.�������Է�");
	System.out.println("2.��ü����");
	System.out.println("����:");
}
//������ �Է�	
public void bookInsert() {
	System.out.println("�������Է�>");
	System.out.println("å����");
	String tatle=sc.nextLine();
	System.out.println("å����");
	String writer=sc.nextLine();
	arr[cnt]=new BookBean(tatle,writer);
	cnt++;
}
//��ü����
public void bookList() {
	System.out.println("����");
//	for(int i=0;i<cnt;i++) {
//	System.out.println("å����"+arr[i].tatle);
//	System.out.println("å����"+arr[i].writer);
//	System.out.println();
	for(BookBean book:arr) {
		if(book==null)break;
		System.out.println("å����"+book.tatle);
		System.out.println("å����"+book.writer);
	
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
		case 3:System.out.println("����");
		System.exit(0);
		default:System.out.println("�Է¿���");
		
		}

	}
}
}
