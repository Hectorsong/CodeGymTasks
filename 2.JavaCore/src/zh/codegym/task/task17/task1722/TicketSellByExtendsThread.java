package zh.codegym.task.task17.task1722;

public  class TicketSellByExtendsThread
{
    public static int ticket = 100;

    public static void main(String[] args)
    {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}


class Ticket extends Thread
{
    @Override
    public void run()
    {
        synchronized (Ticket.class)
        {
            while (TicketSellByExtendsThread.ticket > 1)
            {
                System.out.println("No." + (101 - TicketSellByExtendsThread.ticket) + " ticket has been sell");
                TicketSellByExtendsThread.ticket--;
                System.out.println("Tickets remain:" + TicketSellByExtendsThread.ticket);
                System.out.println();
            }
        }
    }
}

