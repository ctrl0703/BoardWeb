package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker Object created");
	}

	@Override
	public void VoluemUp() {
		System.out.println("AppleSpeaker---Volume Up.");
	}

	@Override
	public void VoluemDown() {
		System.out.println("AppleSpeaker---Volume Down.");
	}

}
