import java.util.Scanner;

public class CalcWork {
    public void calcStart(){
        Scanner in = new Scanner(System.in);
        CLS clearing = new CLS();
        Processing processing;
        
        String work,
               example;

        clearing.clear();

        while(true){

            System.out.println("Пример:");
            example = in.nextLine();
            processing = new Processing(example);
            System.out.println("результат: " + processing.result());          

            System.out.println(" Для выбора действия введите латинские символы:\nq - выход, c - очистить решения, enter - продолжить.");
            work = in.nextLine();

            switch(work){
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
