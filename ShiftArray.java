package day07_object;

public class ShiftArray {
		public static void ShiftArray(int[][]arr) {
				//������ �迭�� ����� �׹迭��arr�� �������ప�� �ִ´�
			
				
			// arr�� �ε����� 2�� 1�� ���� �ִ´�
			for(int i=arr.length-2;i>=0;i--) {//1,0
				arr[i+1]=arr[i];//arr[2]=arr[1],arr[1]=arr[0],arr[1]=arr[0]
				}	
			
			
			// arr�� �ε����� 2�� 0�� ���� �ִ´�
			//arr�� �ε����� 0�� ��ġ�� ó������ ������ �迭�� �ִ´�
				 
		
	    
		}	
	
		public static void showArray(int[][]arr) {
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
					System.out.println();
			}
		}	
	public static void main(String[] args) {
		int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
	
		System.out.println("1��Shift.....");
		ShiftArray.ShiftArray(arr);//�̵� �޼ҵ�
		ShiftArray.showArray(arr);//��� �޼ҵ�
		System.out.println("2�� shift....");
		ShiftArray.ShiftArray(arr);//�̵� �޼ҵ�
		ShiftArray.showArray(arr);//��� �޼ҵ� 
	
		
			
		}
	
	/* 1��
	 * 789
	 * 123
	 * 456
	 */
	
	
	
	
	}


