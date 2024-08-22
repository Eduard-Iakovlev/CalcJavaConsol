import java.io.IOException;

public class CalcWork {
    private String insruction = " Введите выражение в формате a+b=(или Enter) или a! \n доступные операции: '+' '-' '*' '/' '!' '^' '%' \n для выхода нажмите \"Esc\". для очистки дисплея нажмите \"пробел\"\n ";
    public String calcStart(){
        System.out.println("jklsadhbflabovbnasd\n fjsdphgoihpwae");
        clearConsole();


        
        return "";
    }

    

    private void clearConsole(){        
                           
            CLS clear = new CLS();
             try {
                 clear.clearConsle("");
             } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 } catch (InterruptedException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }   
        
        System.out.println(insruction);
    }
   

}
