package �������_2;

import java.util.*;

public class ����{
	public ��������_������� b[];
	Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		new ����(); 
	}
����() {
	int r=0;
		System.out.println("�������� ��������:");
		System.out.println("������� �������� ����� � ������?");
		int h= sc.nextInt();
		this.b=new ��������_�������[h];
		for(int i=0;i<b.length;i++){
			System.out.println("������");
			String k =sc.next();
			System.out.println("��������");
			String h1 =sc.next();
			System.out.println("��� ���?");
			System.out.println("1.�����");
			System.out.println("2.������");
			System.out.println("3.�������");
			int l= sc.nextInt();
			if(l==1) 
			b[i]=new �����(k,h1);	
			if(l==2) 
				b[i]=new ������(k,h1);
			if(l==3) 
				b[i]=new �������(k,h1);
		}
	System.out.println("������ � ����������� � �������� ��������");
	for(int j=0;j<b.length;j++){
		System.out.println(b[j].print()+" ������ ���� "+b[j].v()+" ��� ���� ��� "+b[j].km());
	}
	System.out.println("� ���� ������ ������:");
		int k=0;
		int y=0;
		int u=0;
		for(int i=0;i<b.length;i++){
			if(b[i] instanceof ������)
				k++;
			if(b[i] instanceof �����)
				y++;
			if(b[i] instanceof �������)
				u++;
		}
		if(k>y&&k>u)
			System.out.println("�����");
		if(y>k&&y>u)
			System.out.println("�����");
		if(u>k&&u>y)
			System.out.println("��������");
		if(k==y&&y>u)
			System.out.println("����� � �����");
		if(y==u&&u>k)
			System.out.println("����� � ��������");
		if(k==u&&u>y)
			System.out.println("����� � ��������");
		if(k==u&&u==y)
			System.out.println("�����, ����� � �������� ���������");
		
}
}