package kita8;

public class Animal implements Creature{
	    public String Name;
	    public int Age;
	    public int Power;

	    public String ShowProfile()
	    {
	        return "名前は、" + Name + "、" + Age + "歳です。\n" ;
	    }
	    public String Speak()
	    {
	        return ".......";
	    }
		@Override
		public int getPower() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}
}
