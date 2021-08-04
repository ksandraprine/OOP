package «адание_2;

public abstract class ƒомашний_питомец { 
public String k; //кличка
public String h;     //характер                  
public ƒомашний_питомец(String k, String h){          //конструктор абстрактный быть не может, а методы да 
this.k=k; 
this.h=h; 
} 
abstract public String v(); //голос
abstract public String print(); //печать
abstract public String km(); //корм

}