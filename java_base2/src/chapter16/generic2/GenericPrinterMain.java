package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> printerPowder=new GenericPrinter<>();
		printerPowder.setMaterial(new Powder());
		Powder powder =printerPowder.getMaterial();
		System.out.println(powder);
		powder.doprinting();
		
		
		GenericPrinter<Plastic> printerPlastic=new GenericPrinter<>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic=printerPlastic.getMaterial();
		System.out.println(plastic);
		plastic.doprinting();
		
		//���� ���� ���Ǹ� �ȵ����� ���׸��� Ư���� ���Ǵ� ����� �߻��Ѵ�.
/*		GenericPrinter<Water> printerWater=new GenericPrinter<>();
		printerWater.setMaterial(new Water());
		Water water=printerWater.getMaterial();
		System.out.println(water);
		water.doprinting();		*/
		
		Water water=new Water();
		System.out.println(water);
		water.doprinting();
		
	}

}