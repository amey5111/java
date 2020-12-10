//Implement multiple inheritance using interface
interface demo 
{
    static final double pie= 3.14;
    public void disp(); //function declaration
}
class Def
{
    int i= 22;
    void disp1()
    {
        System.out.println("In disp1 function");
    }
}
class java_practical_18 extends Def implements demo
{
    public void disp()
    {
        System.out.println("In disp function -: ");
    }



 
    public static void main(String[] args){
        java_practical_18 obj =new java_practical_18();
        obj.disp1();
        obj.disp();
    }
}
