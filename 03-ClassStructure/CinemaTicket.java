public class CinemaTicket {

    // Static field for cinema name
    static String cinemaName = "ABC Cinemas";

    // Ticket attributes
    String filmTitle;
    int row;
    int seat;
    int price;

    // Constructor to initialize ticket attributes
    public CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = this.row > 2 ? 25 : 10;
    }

    // Method to display a ticket using toString()
    @Override
    public String toString() {
        return "Cinema: " + cinemaName +
                "\nFilm Title: " + filmTitle +
                "\nRow: " + row +
                "\nSeat: " + seat +
                "\nPrice: $" + price;
    }

    public static void main(String[] args) {
        // Creating two CinemaTicket objects
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 1, 5);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 8);

        // Displaying ticket details using toString() method
        System.out.println("Ticket 1:\n" + ticket1.toString() + "\n");
        System.out.println("Ticket 2:\n" + ticket2.toString());
    }
}
