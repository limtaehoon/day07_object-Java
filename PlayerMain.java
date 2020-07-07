package day07_object;

import java.util.Scanner;

public class PlayerMain {
	static	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	 PlayerManager pm=new PlayerManager();
	 while(true) {
		 pm.showMenu();
	 int choice =PlayerMain.sc.nextInt();
	 			
	 			switch(choice) {
	 case 1:pm.intsertPlayer();break;
	 case 2:pm.viewPlayer();break;
	 case 3:pm.searchPlayer();break;
	 case 4:System.out.println("종료");
	  		System.exit(0);
	  default:System.out.println("입력오류");
	 }
	 
	}
	}
}