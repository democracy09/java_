
public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalChange = 5000;
		int change500 = 0;
        int change100 = 0;
        int change50 = 0;
        int change10 = 0;
        int Won500 = 5, Won100 = 5, Won50 = 5, Won10 = 5;
        
	
            if(totalChange/500>0) {
                change500 = totalChange/500;
                if(change500>Won500) {
                	change500 = Won500;
                	totalChange -= Won500*500;
                }else totalChange %= 500;
              
               
            }
    
     
            if(totalChange/100>0) {
                change100 = totalChange/100;
                if(change100>Won100) {
                	change100 = Won100;
                	totalChange -= Won100*100;
                }else totalChange %= 100;
                
            }
    
 
            if(totalChange/50>0&&Won50>0) {
                change50 = totalChange/50;
                if(change50>Won50) {
                	change50 = Won50;
                	totalChange -= Won50*50;
                }else totalChange %= 50;
       }
       
            if(totalChange/10>0&&Won10>0) {
                change10 = totalChange/10;
                if(change10>Won10) {
                	change10 = Won10;
                	totalChange -= Won10*10;
                }else totalChange %= 10;
            }
  
        System.out.println(totalChange);
        System.out.println(change500);
        System.out.println(change100);
        System.out.println(change50);
        System.out.println(change10);
        
	}

}
