/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;

/**
 *
 * @author Wycliffe
 */
public class MonteCarlo {

    private static double x,m,sin_x_2, cos_x_2,sum, monte_soln;
    public static void main(String[] args) {
        // TODO code application logic here
        
       // - find (b-a)sum of (sin2x + cos2x)) / n  , where n is 1000
        //x  is to be found 1000 times between 0 and PI
        
        sum = 0;
        for(int i = 0; i<1000 ; i++){
          //Randomly calculate the value if i a+m(b-a) 
            m= (double) Math.random();
            
            //in my case a = 0, hence the radom values generated from 0 to PI are
            x = m* Math.PI;
            
            
            sin_x_2 = (double) Math.pow(Math.sin(x), 2);
            cos_x_2 = (double) Math.pow(Math.cos(x), 2);
            
             
            
            sum += sin_x_2 + cos_x_2;
            System.out.println("Random  :" + x);
            
        }
        
        sum = sum/1000;
        System.out.println("\nSum is  :" + sum);
        
        monte_soln = (double) (Math.PI * sum) ;
        
        System.out.println("\nFinal solution is  :" + monte_soln);
        
    }
    
}
