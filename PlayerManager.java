package day07_object;

public class PlayerManager {
final int MAX_INT=50;
Player[]arr=new Player[MAX_INT];
	int cnt;
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.선수등록");
		System.out.println("2.선수보기");
		System.out.println("3.선수검색");
		System.out.println("3.종료");
		System.out.println("택>>");
	}
	
	public void intsertPlayer() {
		System.out.println("선수정보 등록>>");
		System.out.println("이름");
		String name=PlayerMain.sc.next();
		System.out.println("주소");
		String address=PlayerMain.sc.next();
		System.out.println("나이");
		int age=PlayerMain.sc.nextInt();
		System.out.println("키");
		double height=PlayerMain.sc.nextDouble();
		System.out.println("몸무게");
		double weight=PlayerMain.sc.nextDouble();
		arr[cnt]=new Player(name,address,age,height,weight);
		cnt++;
	}
	public void viewPlayer() {
		System.out.println("---보기");
		
		for(int i=0;i<cnt;i++) {
			
			System.out.println("이름"+arr[i].getName());
			System.out.println("주소"+arr[i].getAddress());
			System.out.println("나이"+arr[i].getAge());
			System.out.println("키"+arr[i].getHeight());
			System.out.println("몸무게"+arr[i].getWeight());
		}
	}
	public void searchPlayer() {
		System.out.println("찾을 선수 이름>>");
	/*이름이 같으면 찾는선수 
	 * 찾는 선수가 있으면 이름 키 주소 나이 몸무가 전부 출력
	 * 없으면 찾는 선수는 없습니다.
	 */
			String searchName=PlayerMain.sc.next();
			Player p=search(searchName);
			if(p==null) {
				System.out.println("찾을수 없습니다");
				return;
			}
			System.out.println("이름"+p.getName());
			System.out.println("주소"+p.getAddress());
			System.out.println("나이"+p.getAge());
			System.out.println("키"+p.getHeight());
			System.out.println("몸무게"+p.getWeight());
			
	}
			public  Player search(String searchName) {
				for(int i=0;i<cnt;i++) {
					if(searchName.equals(arr[i].getName())) {
						return arr[i];
					}
				}
			/*Player p=null;
			for(int i=0;i<cnt;i++) {
				if(seatchName.equals(arr[i].getName())) {
					p=arr[i];
					break;
				}
			}
			if(p!=null) {
			
			System.out.println("이름"+arr[i].getName());
			System.out.println("주소"+arr[i].getAddress());
			System.out.println("나이"+arr[i].getAge());
			System.out.println("키"+arr[i].getHeigth());
			System.out.println("몸무게"+arr[i].getWeigth());
			}
			else {
				System.out.println("찾을수 없습니다");
			}
	*/
				return null;
		
	}

}