package �������_1;

import java.util.*;
public class Demo{
	Scanner sc = new Scanner(System.in); 
	���� bank;
	public static void main(String[] args) {
		new Demo(); 
	}
Demo() {
	int r=0;
	System.out.println("������������! ��� ������������ ����");
	do {
		System.out.println("��������� ��������:");
		System.out.println("1.������ ��������. ��������");
		System.out.println("2.������� �� ����� ������ ��������");
		System.out.println("3.�������� �������");
		System.out.println("4.��������� ����");
		System.out.println("5.����� ������ � �����");
		System.out.println("6.���������� �������");	
		System.out.println("7.���������� ������ �������� �������");
		System.out.println("8.���������� ����� ����� �������");
		System.out.println("9.��������� ��������� �������");	
		System.out.println("10.��������� ������");
		System.out.println("��� �����:");
		r = sc.nextInt();
		switch (r){
	case 1:
		System.out.println("������� �������� ����� � ������?");
		int n=sc.nextInt();
		String a[]= new String[n];
		double b[]=new double [n];
		double c[]= new double[n];
		for(int i=0;i<n;i++){
			System.out.println("��� �������");
			String x=sc.next();
			String x2=sc.next();
			String x3=sc.next();
			a[i] =x+" "+x2+" "+x3;
			System.out.println("����� ����� �� ����� �������");
			b[i]=sc.nextDouble();
			System.out.println("��������� ������� ���������� ����� �� ����� �������");
		c[i]=sc.nextDouble();
			}
		 bank = new ����(a,b,c); 
		 System.out.println("������ ������");break;
	case 2:
		System.out.println(bank.pr());break;
	case 3:
		System.out.println("������� �������� ��������?");
		n=sc.nextInt();
		String a2[]= new String[n];
		double b2[]=new double [n];
		double c2[]= new double[n];
		for(int i=0;i<n;i++){
			System.out.println("��� �������");
			String x=sc.next();
			String x2=sc.next();
			String x3=sc.next();
			a2[i] =x+" "+x2+" "+x3;
			System.out.println("����� ����� �� ����� �������");
			b2[i]=sc.nextDouble();
			System.out.println("��������� ������� ���������� ����� �� ����� �������");
		c2[i]=sc.nextDouble();
			}
		bank.dop(a2, b2, c2);
	case 4:
		System.out.println("��������� ���� ������ �� ����� �������?");
		int i=sc.nextInt();
		System.out.println(bank.prin(i)+"������� ����� ���������?");
		double n1=sc.nextDouble();
		bank.po(i, n1);
		System.out.println("���������� �����������");break;
	case 5:
		System.out.println("����� ������ � ����� ������ �� ����� �������?");
		int y=sc.nextInt();
		System.out.println(bank.prin(y)+"������� ����� �����");
		double n2=sc.nextDouble();
		bank.po(y, n2);
		System.out.println("������ �����������");break;
	case 6:
		System.out.println("� ������ �� ����� ������� ������ ������ �������?");
		int w=sc.nextInt();
		System.out.println(bank.prin(w)+" ������� �� �����: " +bank.ost(w));break;
	case 7:
		System.out.println("����� ������� ������: "+bank.b());break;
	case 8:
		System.out.println("����� ����� �������: "+bank.sum());break;
	case 9:
		bank.pro();
		System.out.println("������� ��������");break;
		}
	} while(r!=10);	
}
}