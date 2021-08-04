package Задание_2;

public class Кошка extends Домашний_питомец{ 
public Кошка(String k,String h){ 
super(k,h); 
this.k=k; 
this.h=h; 
} 

public String print(){ 
return "Кошка по кличке "+this.k+". Характер: "+this.h; 
}
public String v() {
	return "мяу";
} 
public String km() {
	return "кошек";
} 

}