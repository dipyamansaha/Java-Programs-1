import java.util.*;

public class damru{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int sp = 0;
    int st = n;
    
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=sp;j++){
            System.out.print("\t");
        }
        for(int j = 1;j<=st;j++){
                System.out.print("*\t");
        }
        if(i <= n/2 ){
            sp++;
            st-=2;
        }else{
            st+=2;
            sp--;
        }
        System.out.println();   
        
    }
 }
}


/*

input = 7;

output :
*	*	*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
*/
