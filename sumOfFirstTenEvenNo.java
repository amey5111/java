public class sumOfFirstTenEvenNo {
    public static void main(String args[]){
        int i= 0;
        int count= 0;
        int sum= 0;
        do{
            i= i+2;
            sum= sum + i;
            count= count+1;
            
        
        }while(count<=10);
        System.out.println("The Summetion of first Ten even Numbers is "+sum);
    }
    
}
