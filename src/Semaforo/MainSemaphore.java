package Semaforo;

public class MainSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        semaphore.color = "amarillo";
        semaphore.state= true;
        if(semaphore.state){
            System.out.println(semaphore.mosntrarMensaje());
        }
    }
}
