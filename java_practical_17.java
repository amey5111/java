// java method overloading
public class java_practical_17 {
    
    double   result ;
    double show(int base)
    {
        result = base;
            return result;
    }
        double show(int base, int height)
    {
        result = 0.5* base* height ;
        return result;
    }
    double show(int base, int height, int a)
    {
        result =a + base + height;
        return result;
    }
       
    public static void main(String[] args) {
        java_practical_17 obj = new java_practical_17();
        double  A, B, C;
        A=obj.show(2);
        System.out.println("base of the triangle -:" + A);
        B=obj.show(2,3);
        System.out.println("area of triangle -:"+B);
        C= obj.show(2,3,5);
        System.out.println("perimeter of triangle  -: "+ C);
    
    }




    
}
