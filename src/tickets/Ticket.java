package tickets;

public class Ticket {
    byte number[] = new byte[6];

    public Ticket() {
        for (int i = 0; i < number.length; i++){
            number[i] = (byte)Math.round(Math.random()*10);
        }
    }
}
