package phone;

import phone.kernel.iphone;

public class InternetBrowser extends iphone {
	public void ShowPage(String url) {
		System.out.println(String.format("Showing page: %s", url));
	}
	public void AddNewTab() {
		System.out.println("Adding a new tab");
	}
	public void UpdatePage() {
		System.out.println("Updating page");
	}
}
