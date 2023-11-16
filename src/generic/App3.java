package generic;

public class App3 {
	
	public static void main(String[] args) {
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.add(new Apple());
		Apple apple = box1.get();
		
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		box2.add(new Banana());
		
		// FruitBox는 Fruit 종류만 타입 파라미터로 지정할 수 있다.
//		FruitBox<String> box3 = new FruitBox<String>();
//		box3.add("홍길동");
//		String value = box3.get();
		
	}

}
