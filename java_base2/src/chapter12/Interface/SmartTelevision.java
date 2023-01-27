package chapter12.Interface;

public class SmartTelevision implements SRemote, Searchable{

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > SRemote.MAX_VOLUME) {
			this.volume = SRemote.MAX_VOLUME;
		} else if (volume < SRemote.MIN_VOLUME) {
			this.volume = SRemote.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + " �� �˻��մϴ�.");

	}

}