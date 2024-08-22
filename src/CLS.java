import java.io.IOException;

public class CLS {
    
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

}



/*
 * Для Win
 * мы должны вызвать интерпретатор командной строки (cmd) и указать ему
 *  выполнить команду (/c cls), которая позволяет вызывать встроенные команды. 
 * Далее мы должны напрямую подключить ее выходной канал к выходному каналу Java-процесса, 
 * который работает, начиная с Java 7, используя inheritIO():
 */