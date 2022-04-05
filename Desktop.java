package week3.day2;

public class Desktop implements Hardware, Software {

	public void desktopModels() {

		System.out.println("Desktop Models");

	}

	public void softwareResources() {
		System.out.println("Software Resources");

	}

	public void hardwareResources() {
		System.out.println("Hardware Resoures");

	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();
		obj.desktopModels();
		obj.softwareResources();
		obj.hardwareResources();

	}

}
