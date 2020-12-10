//10.Define a class, describe its constructor, overload the Constructors and instantiate its object.
class java_practical_16{
    String  NameOfTheBook;
    int  NoOfpages;
    java_practical_16(){
     System.out.println("Inside default Constructor");
     NameOfTheBook = "harryPotter";
     NoOfpages = 30;
   }
   java_practical_16(String a){
    
    System.out.println("Inside paramaterized Constructor1");
    NameOfTheBook = a;
  }
  java_practical_16(String a,int b){
  
  System.out.println("Inside paramaterized Constructor2");
  NameOfTheBook = a;
  NoOfpages = b;
 }
 public void getDatA(){
    System.out.println("Name of the book that is given is === "+NameOfTheBook);
    System.out.println("Number of pages Inside that Book are === "+NoOfpages);
}
public static void main(String args[]){
  java_practical_16 d1 = new java_practical_16();
  d1.getDatA();
  java_practical_16 d2 = new java_practical_16("HarryPotter");
  d2.getDatA();
  java_practical_16 d3 = new java_practical_16("harryPotter",50);
  d3.getDatA();
}
}