package phone.kernel;

import phone.InternetBrowser;
import phone.MusicPlayer;
import phone.PhoneDevice;

public abstract class iphone {
	public static void main(String[] args) {
		MusicPlayer musicP = new MusicPlayer();
		musicP.SelectMusic("Nelly Furtado - Promiscuous.mp3");
		musicP.Play();
		musicP.Stop();
		
		PhoneDevice phoneD = new PhoneDevice();
		phoneD.Call("4002 - 8922");
		phoneD.Answer();
		phoneD.Voicemail();
		
		InternetBrowser internetB = new InternetBrowser();
		internetB.ShowPage("clickjogos.com");
		internetB.AddNewTab();
		internetB.UpdatePage();
	}
}
