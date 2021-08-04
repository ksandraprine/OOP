package Задание_2;

import java.util.*;

public class Демо{
	public Домашний_питомец b[];
	Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		new Демо(); 
	}
Демо() {
	int r=0;
		System.out.println("Домашние животные:");
		System.out.println("Сколько животных будет в списке?");
		int h= sc.nextInt();
		this.b=new Домашний_питомец[h];
		for(int i=0;i<b.length;i++){
			System.out.println("Кличка");
			String k =sc.next();
			System.out.println("Характер");
			String h1 =sc.next();
			System.out.println("Кто это?");
			System.out.println("1.Кошка");
			System.out.println("2.Собака");
			System.out.println("3.Попугай");
			int l= sc.nextInt();
			if(l==1) 
			b[i]=new Кошка(k,h1);	
			if(l==2) 
				b[i]=new Собака(k,h1);
			if(l==3) 
				b[i]=new Попугай(k,h1);
		}
	System.out.println("Список с информацией о домашних животных");
	for(int j=0;j<b.length;j++){
		System.out.println(b[j].print()+" издает звук "+b[j].v()+" ест корм для "+b[j].km());
	}
	System.out.println("В этом списке больше:");
		int k=0;
		int y=0;
		int u=0;
		for(int i=0;i<b.length;i++){
			if(b[i] instanceof Собака)
				k++;
			if(b[i] instanceof Кошка)
				y++;
			if(b[i] instanceof Попугай)
				u++;
		}
		if(k>y&&k>u)
			System.out.println("Собак");
		if(y>k&&y>u)
			System.out.println("Кошек");
		if(u>k&&u>y)
			System.out.println("Попугаев");
		if(k==y&&y>u)
			System.out.println("Собак и кошек");
		if(y==u&&u>k)
			System.out.println("Собак и попугаев");
		if(k==u&&u>y)
			System.out.println("Собак и попугаев");
		if(k==u&&u==y)
			System.out.println("Собак, кошек и попугаев одинаково");
		
}
}