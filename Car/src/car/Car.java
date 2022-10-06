
package car;

/**
 *
 * @author Red Team
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight= 4079;
    boolean IsTheCarOn = false;
    char condition = 'A';
    
    public void printVariables(){
        System.out.print(maxSpeed);
        System.out.print(minSpeed);
        System.out.print(weight);
        System.out.print(IsTheCarOn);
        System.out.print(condition);
    }
            
                    
    
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        Car Xex = new Car();
        Xex.printVariables();
    }

 }
