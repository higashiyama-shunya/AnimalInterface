package kita8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnimalTest3 {
	
	Creature cat;
	Creature dog;
	
	@BeforeEach
	public void setUp() {
		cat=new Cat();
		dog=new Dog();
	}

	@Test
	@DisplayName("getPowerメソッドを使用")
	void test() {
		List<Creature> list=new ArrayList();
		list.add(cat);
		list.add(dog);
		
		for(Creature c:list) {
			System.out.println(c.getPower());
		}
		assertEquals(30,list.get(0).getPower());
		assertEquals(30,list.get(1).getPower());
	}

}
