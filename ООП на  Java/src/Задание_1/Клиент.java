package �������_1;
public class ������ {
	public String a; double b, c;
	public ������(String a,double b, double c){
		this.a=a;     //���
		this.b=b;     //������ �� �����
		this.c=c;     //�������
	}
	double os() { //�������
		return this.b;	
		}
	double sn(double n) { //������ �����
		this.b = this.b-n;
	return this.b;	
	}
	double p(double n) { //���������� 
		this.b = this.b+n;
	return this.b;	
	}
	
	String pr() { //�����
	return this.a;	
	}
	void pro() { //�������
			this.b = this.b+((this.b/100)*this.c);
	}
	}