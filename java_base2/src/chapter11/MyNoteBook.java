package chapter11;

public class MyNoteBook extends NoteBook {  //display만 구현된 클래스 상속받으면 둘 다 구현돼서 추상x

	@Override
	public void typing() {
		System.out.println("MyNoteBook Typing");
	}

}