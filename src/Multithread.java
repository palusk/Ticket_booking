
public class Multithread extends Thread{

    private int threadNumber;
    public Multithread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    Tickets ticketsTable = new Tickets();

    public void reservation(){
        for(int i = 0; i<3; i++){

            ticketsTable.tabTicket[i] = "reservation"+ticketsTable.ticketName+i;
        }
    }

    public void run(){
        reservation();
    }
}
