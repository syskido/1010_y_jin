import java.util.Scanner;

public class TimesTable {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] row;
		row = new int[1];
		int[] column = new int[]{1,2,3,4,5,6,7,8,9};
		int i;
		
		System.out.println("���Ͻô� ����ǥ(������)�� �Է��ϼ���.\n");
		System.out.println("�����Է�: ");
		row[0] = scan.nextInt();
		
		for(i=0; i<=8; i++) {
			System.out.println(row[0] + " * " + column[i] + " = "+ row[0]*column[i]);
		}
		
	}

}
