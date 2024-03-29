import java.util.Observable;  
import java.util.Observer; 
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.Observable;   
  
class ResponseHandler1 implements Observer {  
    private String resp;  
    public void update(Observable obj, Object arg) {  
        if (arg instanceof String) {  
            resp = (String) arg;  
            System.out.println("\nReceived Response: " + resp );  
        }  
    }  
}
  
  
class ResponseHandler2 implements Observer {  
    private String resp;  
    public void update(Observable obj, Object arg) {  
        if (arg instanceof String) {  
            resp = (String) arg;  
            System.out.println("\nReceived Response: " + resp );  
        }  
    }  
}

class EventSource extends Observable implements Runnable {  
    @Override  
    public void run() {  
        try {  
            final InputStreamReader isr = new InputStreamReader(System.in);  
            final BufferedReader br = new BufferedReader(isr);  
            while (true) {  
                String response = br.readLine();  
                setChanged();  
                notifyObservers(response);  
            }  
        }  
        catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}


