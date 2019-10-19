package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) Object created");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) Object created");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) Object created");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("SamsungTV Object initialized");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV Object destoryed");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() Call");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() Call");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV---Power On. (price : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV---Power Off.");
	}
	public void VoluemUp() {
		speaker.VoluemUp();
	}
	public void VoluemDown() {
		speaker.VoluemDown();
	}
}
