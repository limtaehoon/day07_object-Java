package day07_object;

public class Player {
	private	String name,address;
	private	int age;
	private	double height,weight;

	
		

	
	public Player(String name,String address, int age ,double height,double weight ) {
		this.name=name;
		this.address=address;
		this.age= age;
		this.weight=weight;
		this.height=height;
	}
	public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
			}
		public int getAge() {
		return age;
		}
		public double getHeight() {
			return  height;
		}
		public double getWeight() {
			return weight;
		}
		











}