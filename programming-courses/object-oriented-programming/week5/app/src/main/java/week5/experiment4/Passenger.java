package week5.experiment4;

public class Passenger {

    private String identityCard;
    private String name;

    public Passenger(String identityCard, String name) {
        this.identityCard = identityCard;
        this.name = name;
    }

    public String getIdentityCard() {
        return identityCard;
    }
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        String info = "";
        info += "Identity Card: " + this.identityCard + "\n";
        info += "Name: " + this.name;
        return info;
    }

}
