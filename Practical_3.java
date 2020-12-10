public class Practical_3 {
    public static void main(String args[]){
        int i= 0;
        int count= 0;
        int sum= 0;
        do{
            System.out.println(i+2);
            i= i+2;
            sum= sum + i;
            count= count+1;
            
        
        }while(count<10);
        System.out.println("The Summetion of first Ten even Numbers is "+sum);
    }
    
}