package CoppyConstructor;

public class Animal {
 private String name;
 private String species;
 private int age;
 public Animal(String name,String species,int age)
 {
	 this.age=age;
	 this.name=name;
	 this.species=species;	 
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 
 
 
 
 public String toString()
 {
	 return "Animal Name:"+name+" Species "+species+" Age "+age;
 }
}
