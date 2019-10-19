package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker Object created");
	}

	@Override
	public void VoluemUp() {
		System.out.println("SonySpeaker---Volume Up.");
	}

	@Override
	public void VoluemDown() {
		System.out.println("SonySpeaker---Volume Down.");
	}
}
