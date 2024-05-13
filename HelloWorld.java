
public class HelloWorld {

	public static void main(String[] args) {

		int age = 88;
		if (age <= 100) {
			if (age < 18) {
				System.out.println("未成年");
			} else if (age == 77) {
				System.out.println("喜寿");
			} else if (age == 88) {
				System.out.println("米寿");
			} else {
				System.out.println("成人");
			}
		}

	}
}