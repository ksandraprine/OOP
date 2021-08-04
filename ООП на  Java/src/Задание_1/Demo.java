package Задание_1;

import java.util.*;
public class Demo{
	Scanner sc = new Scanner(System.in); 
	Банк bank;
	public static void main(String[] args) {
		new Demo(); 
	}
Demo() {
	int r=0;
	System.out.println("Здравствуйте! Вас приветствует БАНК");
	do {
		System.out.println("Доступные операции:");
		System.out.println("1.Список клиентов. Создание");
		System.out.println("2.Вывести на экран список клиентов");
		System.out.println("3.Добавить клиента");
		System.out.println("4.Пополнить счет");
		System.out.println("5.Снять деньги с счета");
		System.out.println("6.Определить остаток");	
		System.out.println("7.Определить самого богатого клиента");
		System.out.println("8.Определить общую сумму вкладов");
		System.out.println("9.Начислить ежегодный процент");	
		System.out.println("10.Завершить работу");
		System.out.println("Ваш выбор:");
		r = sc.nextInt();
		switch (r){
	case 1:
		System.out.println("Сколько клиентов будет в списке?");
		int n=sc.nextInt();
		String a[]= new String[n];
		double b[]=new double [n];
		double c[]= new double[n];
		for(int i=0;i<n;i++){
			System.out.println("ФИО клиента");
			String x=sc.next();
			String x2=sc.next();
			String x3=sc.next();
			a[i] =x+" "+x2+" "+x3;
			System.out.println("Сумма денег на счете клиента");
			b[i]=sc.nextDouble();
			System.out.println("Ежегодный процент увеличения суммы на счете клиента");
		c[i]=sc.nextDouble();
			}
		 bank = new Банк(a,b,c); 
		 System.out.println("Список создан");break;
	case 2:
		System.out.println(bank.pr());break;
	case 3:
		System.out.println("Сколько клиентов добавить?");
		n=sc.nextInt();
		String a2[]= new String[n];
		double b2[]=new double [n];
		double c2[]= new double[n];
		for(int i=0;i<n;i++){
			System.out.println("ФИО клиента");
			String x=sc.next();
			String x2=sc.next();
			String x3=sc.next();
			a2[i] =x+" "+x2+" "+x3;
			System.out.println("Сумма денег на счете клиента");
			b2[i]=sc.nextDouble();
			System.out.println("Ежегодный процент увеличения суммы на счете клиента");
		c2[i]=sc.nextDouble();
			}
		bank.dop(a2, b2, c2);
	case 4:
		System.out.println("Пополнить счет какого по счету клиента?");
		int i=sc.nextInt();
		System.out.println(bank.prin(i)+"Сколько денег начислить?");
		double n1=sc.nextDouble();
		bank.po(i, n1);
		System.out.println("Пополнение произведено");break;
	case 5:
		System.out.println("Снять деньги с счета какого по счету клиента?");
		int y=sc.nextInt();
		System.out.println(bank.prin(y)+"Сколько денег снять");
		double n2=sc.nextDouble();
		bank.po(y, n2);
		System.out.println("Снятие произведено");break;
	case 6:
		System.out.println("У какого по счету клиента хотите узнать остаток?");
		int w=sc.nextInt();
		System.out.println(bank.prin(w)+" Остаток на счету: " +bank.ost(w));break;
	case 7:
		System.out.println("Самый богатый клиент: "+bank.b());break;
	case 8:
		System.out.println("Общая сумма вклвдов: "+bank.sum());break;
	case 9:
		bank.pro();
		System.out.println("Процент начислен");break;
		}
	} while(r!=10);	
}
}