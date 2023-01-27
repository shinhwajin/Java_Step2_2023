package chapter16.generic2;

public class GenericPrinter <T extends Material>{      //Material 상속 못 받은 Water은 못 불러옴

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}