package Chapter11;

public class ClassMethod01 {

	public static void main(String[] args) {
		Human01 yamada = new Human01();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human01 satou = new Human01("佐藤", 25);
		System.out.println("名前は" + satou.name + "で、年齢は" + satou.age + "です。");

	}

}
