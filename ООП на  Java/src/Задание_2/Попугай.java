package Задание_2;

public class Попугай extends Домашний_питомец{ 
public Попугай(String k,String h){ 
super(k,h);
this.k=k; 
this.h=h; 
} 

public String print(){ 
return "Попугай по кличке "+this.k+". Характер: "+this.h; 
}
public String v() {
	return "чирик";
} 
public String km() {
	return "попугаев";
} 

}