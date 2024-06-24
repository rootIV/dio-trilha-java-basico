package phone;

import phone.kernel.iphone;

public class MusicPlayer extends iphone {
	public void SelectMusic(String music) {
		System.out.println(String.format("Music selected: %s", music));
	}
	public void Play() {
		System.out.println("Playing music");
	}
	public void Stop() {
		System.out.println("Stopping music");
	}
}
