package day07_object;

public class PlayerManager {
final int MAX_INT=50;
Player[]arr=new Player[MAX_INT];
	int cnt;
	public static void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.�����˻�");
		System.out.println("3.����");
		System.out.println("��>>");
	}
	
	public void intsertPlayer() {
		System.out.println("�������� ���>>");
		System.out.println("�̸�");
		String name=PlayerMain.sc.next();
		System.out.println("�ּ�");
		String address=PlayerMain.sc.next();
		System.out.println("����");
		int age=PlayerMain.sc.nextInt();
		System.out.println("Ű");
		double height=PlayerMain.sc.nextDouble();
		System.out.println("������");
		double weight=PlayerMain.sc.nextDouble();
		arr[cnt]=new Player(name,address,age,height,weight);
		cnt++;
	}
	public void viewPlayer() {
		System.out.println("---����");
		
		for(int i=0;i<cnt;i++) {
			
			System.out.println("�̸�"+arr[i].getName());
			System.out.println("�ּ�"+arr[i].getAddress());
			System.out.println("����"+arr[i].getAge());
			System.out.println("Ű"+arr[i].getHeight());
			System.out.println("������"+arr[i].getWeight());
		}
	}
	public void searchPlayer() {
		System.out.println("ã�� ���� �̸�>>");
	/*�̸��� ������ ã�¼��� 
	 * ã�� ������ ������ �̸� Ű �ּ� ���� ������ ���� ���
	 * ������ ã�� ������ �����ϴ�.
	 */
			String searchName=PlayerMain.sc.next();
			Player p=search(searchName);
			if(p==null) {
				System.out.println("ã���� �����ϴ�");
				return;
			}
			System.out.println("�̸�"+p.getName());
			System.out.println("�ּ�"+p.getAddress());
			System.out.println("����"+p.getAge());
			System.out.println("Ű"+p.getHeight());
			System.out.println("������"+p.getWeight());
			
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
			
			System.out.println("�̸�"+arr[i].getName());
			System.out.println("�ּ�"+arr[i].getAddress());
			System.out.println("����"+arr[i].getAge());
			System.out.println("Ű"+arr[i].getHeigth());
			System.out.println("������"+arr[i].getWeigth());
			}
			else {
				System.out.println("ã���� �����ϴ�");
			}
	*/
				return null;
		
	}

}