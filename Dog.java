package kita8;

public class Dog extends Animal{
	//フィールド
	private int Power=30;
	
	//コンストラクタ
		public Dog(int power) {
			this.Power=power;
		}
		public Dog() {};
		
	//メソッド	
	
	public void Run() {
		System.out.println("トコトコ");
	}
	@Override
	public String Speak() {
		//System.out.println("ワンワン");
		return "ワンワン";
	}
	@Override
	public int getPower() {
		return this.Power;
	}
}
