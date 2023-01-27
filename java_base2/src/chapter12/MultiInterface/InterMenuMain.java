package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3 {

	public static void main(String[] args) {
		InterMenuMain im = new InterMenuMain();

		Inter_Menu1 im1 = im; // ¾÷Ä³½ºÆÃ
		Inter_Menu2 im2 = im;
		Inter_Menu3 im3 = im;
		System.out.println("---------Inter_Menu1---------");
		System.out.println(im1.jajang());
		System.out.println(im1.jjambbong());
		im1.show();
		System.out.println("---------Inter_Menu2---------");
		System.out.println(im2.tangsuyuck());
		System.out.println("---------Inter_Menu3---------");
		System.out.println(im3.boggembob());

	}

	@Override
	public String tangsuyuck() {
		return "Âı½Ò ÅÁ¼öÀ°";
	}

	@Override
	public String jajang() {
		return "ÇÏ³ª Á×À¸¸é ¾Æ´Â Â¥Àå¸é";
	}

	@Override
	public String jjambbong() {
		return "ÇØÀåÇÏ¼¼¿ä";
	}

	@Override
	public String boggembob() {
		return "ÇØ¹° ººÀ½¹äÀÌ Â¯!!";
	}

}