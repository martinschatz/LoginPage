package schoepf1;
public class Person {
int alter;
private static Person instance = null;
private Person(int age) {
this.age = age;
}
public static Person getInstance(int age) {
if(instance ==null) {
instance = new Person(age);
}
return instance;
}
public double methode() {
int faktor = 31536000;
return this.age*faktor;
}
}
