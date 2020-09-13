public class  practicle2b {
    public static void main(String args[])
{
    int sum=0;
    int i;
    
    try{


        for(i=0;i<args.length;i++){

            System.out.println("Your arguments"+(i+1)+"is"+Integer.parseInt(args[i]));
        }
        for(i=0;i<args.length;i++)
        {
           sum=sum+Integer.parseInt(args[i]);

        }
        System.out.println(" SUM OF ENTERED ELEMENTS = "+sum);
    }
    catch (Exception e) 
    {System.out.println("#ERROR#\nEnter value as positive integers in the command line \n please Enter The numbers again "); } 
    
}


}
