package day07_object;

 class Good{
	String name,code,maker;
	double DiscountRate;
	int price;
	//"001","레몬","레몬사",1000
	public Good(String code,String name,String maker,int price ){
		this.name=name;
		this.code=code;
		this.maker=maker;
		this.price=price;
	
	
	}
	
	public int getSellingPrice() {//판매금액:원가격-할인가격
		return price-(int)(price*DiscountRate);
	}
	public void updateDiscountRate(double rate) {
		DiscountRate=rate;
	}
}



public class GoodMain {

	public static void main(String[] args) {
		Good g1= new Good("001","레몬","레몬사",1000);
		//레몬사:1000
		System.out.println(g1.name+":"+g1.getSellingPrice());
		Good g2= new Good("002","사과","애플사",1500);
		//사과:1500
		System.out.println(g2.name+":"+g2.getSellingPrice());
		g2.updateDiscountRate(0.2);//20%할인
		//사과:1200
		System.out.println("사과:"+g2.getSellingPrice());//사과 할인율:0.2
		System.out.println(g2.name+"할인율:"+g2.DiscountRate);
	}

}
