package phone;

import phone.kernel.iphone;

public class PhoneDevice extends iphone {
	public void Call(String number) {
		System.out.println(String.format("Calling: %s", number));
	}
	public void Answer() {
		System.out.println("Answering the phone");
	}
	public void Voicemail() {
		System.out.println("Listening to your voicemail");
	}
}
