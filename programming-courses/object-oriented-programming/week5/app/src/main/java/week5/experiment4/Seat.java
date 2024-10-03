package week5.experiment4;

public class Seat {
    private String number;
    private Passenger passenger;

    public Seat(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String info() {
        String info = "";
        info += "Seat Number: " + this.number + "\n";
        if (this.passenger != null) {
            info += "Passenger: " + this.passenger.info();
        }
        return info;
    }


}
