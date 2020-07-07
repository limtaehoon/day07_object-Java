package day07_object;

public class ShiftArray {
		public static void ShiftArray(int[][]arr) {
				//일차원 배열을 만들고 그배열에arr의 마지막행값을 넣는다
			
				
			// arr의 인덱스가 2에 1의 값을 넣는다
			for(int i=arr.length-2;i>=0;i--) {//1,0
				arr[i+1]=arr[i];//arr[2]=arr[1],arr[1]=arr[0],arr[1]=arr[0]
				}	
			
			
			// arr의 인덱스가 2에 0의 값을 넣는다
			//arr의 인덱스가 0의 위치에 처음만든 일차원 배열을 넣는다
				 
		
	    
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
	
		System.out.println("1차Shift.....");
		ShiftArray.ShiftArray(arr);//이동 메소드
		ShiftArray.showArray(arr);//출력 메소드
		System.out.println("2차 shift....");
		ShiftArray.ShiftArray(arr);//이동 메소드
		ShiftArray.showArray(arr);//출력 메소드 
	
		
			
		}
	
	/* 1차
	 * 789
	 * 123
	 * 456
	 */
	
	
	
	
	}


