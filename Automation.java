package week3.day2;

public class Automation extends MultipleLanguage implements TestTool, Language {

	public void Java() {
		System.out.println("Java Language");

	}

	public void Selenium() {
		System.out.println("Selenium Language");

	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");

	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.python();
		obj.Java();
		obj.Selenium();
		obj.ruby();
	}

}
