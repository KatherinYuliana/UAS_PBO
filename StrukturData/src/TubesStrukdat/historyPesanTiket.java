package TubesStrukdat;

import java.util.ArrayList;

public class historyPesanTiket {
    private ArrayList<String> ticketList;

    public historyPesanTiket() {
        ticketList = new ArrayList<String>();
    }

    public void addTicket(String ticket) {
        ticketList.add(ticket);
    }

    public void displayTicketHistory() {
        if (ticketList.size() == 0) {
            System.out.println("Belum ada tiket yang dipesan.");
            return;
        }

        System.out.println("History pesan tiket pesawat:");
        for (int i = 0; i < ticketList.size(); i++) {
            System.out.println((i+1) + ". " + ticketList.get(i));
        }
    }

    public static void main(String[] args) {
        historyPesanTiket ticketHistory = new historyPesanTiket();
        ticketHistory.addTicket("Tiket penerbangan Jakarta - Bali");
        ticketHistory.addTicket("Tiket penerbangan Bali - Surabaya");
        ticketHistory.addTicket("Tiket penerbangan Surabaya - Jakarta");

        ticketHistory.displayTicketHistory();
    }
}
