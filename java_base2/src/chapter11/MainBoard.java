package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		//�⺻ ���� 1�ܰ�
		Player player=new Player();
		player.play(1);
		
		//���� 2�ܰ�
		AdvancedLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//���� 3�ܰ�
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		

	}

}