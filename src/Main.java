
public class Main {

    public static void main(String[] args){


        for(int i = 0; i<=5; i++) {
            Multithread thread = new Multithread(i);
            thread.start();
        }

        //@@@@@@@@@@@@@@@@@@ do wypelnienia i wyswietlenia tablicy biletow
//        Tickets ticketsTable = new Tickets();
//
//        for(int i = 0; i<3; i++){
//            System.out.println(ticketsTable.tabTicket[i]);
//        }
//
    }

}