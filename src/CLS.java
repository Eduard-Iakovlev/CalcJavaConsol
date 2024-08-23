import java.io.IOException;

public class CLS {
    private String insruction = " Введите выражение в формате a + b Enter\n доступные операции: '+' '-' '*' '/'\n";

    
    public void clearConsle (String... arg) throws IOException, InterruptedException {
        OSDetected oSystem = new OSDetected();
        switch (oSystem.getOS()) {
            case WINDOWS:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                break;

            case LINUX:
                System.out.print("\033[H\033[2J");
                break;
        
            default:
                break;
        }
    } 
    
    public void clear(){        
                           
            try {
                clearConsle("");
            }catch (IOException e) {
                e.printStackTrace();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }   
        
        System.out.println(insruction);
    }

}



/*
 * Для Win
 * мы должны вызвать интерпретатор командной строки (cmd) и указать ему
 *  выполнить команду (/c cls), которая позволяет вызывать встроенные команды. 
 * Далее мы должны напрямую подключить ее выходной канал к выходному каналу Java-процесса, 
 * который работает, начиная с Java 7, используя inheritIO():
 */