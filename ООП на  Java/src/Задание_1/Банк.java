package Задание_1;
import java.util.*;
public class Банк {
	ArrayList<Клиент> f = new ArrayList<Клиент>();
	public Банк(String a[], double b[], double c[]){
		for(int i=0;i<a.length;i++){
			Клиент s=new Клиент(a[i],b[i],c[i]);
			f.add(s);
}
}
String pr() {//вывести на экран
	String s="";
	for(int i=0;i<f.size();i++){
		s=s+(i+1)+") "+f.get(i).pr()+"\n";
	}
	return s;
}
void dop(String a[], double b[], double c[]) {//пополнить список
	for(int i=0;i<a.length;i++){
		Клиент s=new Клиент(a[i],b[i],c[i]);
		f.add(s);
}
}
double sum() { //сумма вкладов
	double t = 0;
	for(int i=0;i<f.size();i++){
		t=t+f.get(i).os();
}
	return t;
}
void pro() { //начислить процент
	for(int i=0;i<f.size();i++){
		f.get(i).pro();
	}
}
String b() { //самый богатый
	double t = 0;
	int y=0;
	for(int i=0;i<f.size();i++){
		if (f.get(i).os()>t) {
		t=f.get(i).os();
		y=i;
		}
	}
	return f.get(y).pr();
}
double sn(int i,double h) { //снять деньги
	double t=0;
	t=f.get(i-1).sn(h);
	return t;
}
double po(int i,double h) { //попполнить счет
	double t =0;
	t = f.get(i-1).p(h);
	return t;
}
double ost(int i) { //узнать остаток
	return f.get(i-1).os();
}
String prin(int i) {//вывести на экран iго клиента
	
	return f.get(i-1).pr();
	}

}