package Задание_1;
public class Клиент {
	public String a; double b, c;
	public Клиент(String a,double b, double c){
		this.a=a;     //ФИО
		this.b=b;     //Деньги на счету
		this.c=c;     //Процент
	}
	double os() { //остаток
		return this.b;	
		}
	double sn(double n) { //снятие денег
		this.b = this.b-n;
	return this.b;	
	}
	double p(double n) { //пополнение 
		this.b = this.b+n;
	return this.b;	
	}
	
	String pr() { //имена
	return this.a;	
	}
	void pro() { //процент
			this.b = this.b+((this.b/100)*this.c);
	}
	}