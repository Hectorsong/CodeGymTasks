package zh.codegym.task.task17.task1722;

public  class TicketSellByExtendsThreadNew
{
    public static int ticket = 100;
    public static void main(String[] args) {
        Ticket1 t1 = new Ticket1();
        Ticket1 t2 = new Ticket1();
        Ticket1 t3 = new Ticket1();
        Ticket1 t4 = new Ticket1();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class Ticket1 extends Thread
{

    @Override
    public void run()
    {
        synchronized (this)
        {
            while (TicketSellByExtendsThreadNew.ticket > 1)
            {
                System.out.println("No." + (101 - TicketSellByExtendsThreadNew.ticket) + " ticket has been sell");
                TicketSellByExtendsThreadNew.ticket--;
                System.out.println("Tickets remain:" + TicketSellByExtendsThreadNew.ticket);
                System.out.println();
            }
        }
    }
}


