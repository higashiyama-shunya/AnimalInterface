package kita8;

public class Cat extends Animal{
//フィールド
	private int Power=30;
	
//コンストラクタ
	public Cat(int power) {
		this.Power=power;
	}
	public Cat() {};
	
//メソッド
	public void Sleep() {
		System.out.println("スースー");
	}
	
	@Override
	public String Speak() {
		//System.out.println("ニャーニャー");
		return "ニャーニャー";
	}
	@Override
	public int getPower() {
		return this.Power;
	}


}
