package chapter17.arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonManager3 {
	public void personMgr() {
		try (var scan = new Scanner(System.in)) {
			var pArr = new ArrayList<Person2>();

			WHILE: while (true) {
				System.out.println("1. ȸ���߰�");
				System.out.println("2. ȸ��Ż��");
				System.out.println("3. ȸ������");
				System.out.println("4. ����");
				System.out.print("�׸��� : ");

				int select;

				try {
					select = scan.nextInt();
				} catch (InputMismatchException e) {
					select = -1;
				}
				scan.nextLine();

				switch (select) {
				case 1:
					addPerson(scan, pArr);
					break;
				case 2:
					removePerson(scan, pArr);
					break;
				case 3:
					showPeople(pArr);
					break;
				case 4:
					break WHILE;
				default:
					System.out.println("�߸��� �Է� ���Դϴ�.");
				}

				System.out.println("--------------");
			}
			
			System.out.println("����");
		} catch (Exception e) {
			System.out.println("������ ����");
			System.out.println(e);
		}
	}

	private void addPerson(Scanner scan, ArrayList<Person2> pArr) {
		System.out.println("---- �����߰� ----");

		System.out.print("�̸� : ");
		String name = scan.nextLine();

		System.out.print("���� : ");
		int age = scan.nextInt();
		scan.nextLine();

		System.out.print("��ȭ : ");
		String tel = scan.nextLine();

		pArr.add(new Person2(name, age, tel));
	}

	private void removePerson(Scanner scan, ArrayList<Person2> pArr) {
		System.out.println("---- ȸ��Ż�� ----");

		if (pArr.isEmpty()) {
			System.out.println("Ż���� ȸ���� �����ϴ�.");
			return;
		}

		System.out.print("Ż���� ȸ����ȣ�� �Է��ϼ���(1 ~ " + pArr.size() + ") : ");
		int index = scan.nextInt();
		scan.nextLine();

		pArr.remove(index - 1);
	}

	private void showPeople(ArrayList<Person2> pArr) {
		System.out.println("---- ȸ������ ----");

		int i = 1;

		for (var person : pArr) {
			System.out.println(i + ". �̸� : " + person.getName());
			System.out.println(i + ". ���� : " + person.getAge());
			System.out.println(i + ". ��ȭ : " + person.getTel());
			System.out.println();
			i++;
		}
	}
}