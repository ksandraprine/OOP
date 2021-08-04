package Задание_2;

public class Собака extends Домашний_питомец{ 
public Собака(String k,String h){ 
super(k,h); 
this.k=k; 
this.h=h; 
} 

 public String print(){ 
return "Собака по кличке "+this.k+". Характер: "+this.h; 
}
 public String v() {
	return "гав";
} 
public String km() {
	return "собак";
} 

}