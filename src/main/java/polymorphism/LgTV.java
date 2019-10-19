package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV---Power On.");
	}
	public void powerOff() {
		System.out.println("LgTV---Power Off.");
	}
	public void VoluemUp() {
		speaker.VoluemUp();
	}
	public void VoluemDown() {
		speaker.VoluemDown();
	}
}
