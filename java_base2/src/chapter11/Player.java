package chapter11;

public class Player {
	
	private PlayLevel level;   //부모 일단 갖다두고 =new ~ 지정 안함  //type에 클래스이름..?
	
	public Player() {
		level=new BeginnerLevel();  // PlayLevel level=new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayLevel getLevel() {      //?????
		return level;
	}
	
	public void upgradeLevel(PlayLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}