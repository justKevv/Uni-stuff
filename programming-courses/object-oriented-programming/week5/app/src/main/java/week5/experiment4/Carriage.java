package week5.experiment4;

public class Carriage {
    private String code;
    private Seat[] seatArray;

    Carriage(String code, int count) {
        this.code = code;
        this.seatArray = new Seat[count];
        this.seatInit();
    }

    private void seatInit() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Seat[] getSeatArray() {
        return seatArray;
    }

    public boolean isSeatOccupied(int seatNumber) {
        return seatArray[seatNumber] != null;
    }

    public void setPassenger(Passenger passenger, int seatNumber) {
        if (!isSeatOccupied(seatNumber)) {
            seatArray[seatNumber].setPassenger(passenger);
        } else {
            System.out.println("Seat " + seatNumber + " is already occupied.");
        }
    }

    public String info() {
        StringBuilder info = new StringBuilder("Carriage ID: " + code + "\n");
        for (int i = 0; i < seatArray.length; i++) {
            if (seatArray[i] != null) {
                info.append("Seat ").append(i).append(": ").append(seatArray[i].getNumber()).append("\n");
            } else {
                info.append("Seat ").append(i).append(": Empty\n");
            }
        }
        return info.toString();
    }

}
