import java.io.IOException;
import java.util.Scanner;

public class CalcWork {
    public void calcStart() throws IOException{
        Scanner in = new Scanner(System.in);
        CLS clearing = new CLS();

        
        int a = 0,
            b = 0;
        char operator = '+';
        String want,
               example;
        clearing.clear();

        while(true){
            example = in.nextLine();
          
            Operation calculate = new Operation(a, b, operator);
            System.out.println(calculate.operation());

            System.out.println(" q - выход, c - очистить решения, enter - продолжить.");
            want = in.nextLine();

            switch(want){
                case "q":
                    in.close();
                    System.exit(0);
                    break;
                case "c":
                clearing.clear();
                default:
                break;
            }
            
        }

          
        
        
    }    

}
