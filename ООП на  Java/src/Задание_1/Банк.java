package �������_1;
import java.util.*;
public class ���� {
	ArrayList<������> f = new ArrayList<������>();
	public ����(String a[], double b[], double c[]){
		for(int i=0;i<a.length;i++){
			������ s=new ������(a[i],b[i],c[i]);
			f.add(s);
}
}
String pr() {//������� �� �����
	String s="";
	for(int i=0;i<f.size();i++){
		s=s+(i+1)+") "+f.get(i).pr()+"\n";
	}
	return s;
}
void dop(String a[], double b[], double c[]) {//��������� ������
	for(int i=0;i<a.length;i++){
		������ s=new ������(a[i],b[i],c[i]);
		f.add(s);
}
}
double sum() { //����� �������
	double t = 0;
	for(int i=0;i<f.size();i++){
		t=t+f.get(i).os();
}
	return t;
}
void pro() { //��������� �������
	for(int i=0;i<f.size();i++){
		f.get(i).pro();
	}
}
String b() { //����� �������
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
double sn(int i,double h) { //����� ������
	double t=0;
	t=f.get(i-1).sn(h);
	return t;
}
double po(int i,double h) { //���������� ����
	double t =0;
	t = f.get(i-1).p(h);
	return t;
}
double ost(int i) { //������ �������
	return f.get(i-1).os();
}
String prin(int i) {//������� �� ����� i�� �������
	
	return f.get(i-1).pr();
	}

}