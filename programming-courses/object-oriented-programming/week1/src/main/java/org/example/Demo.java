package org.example;

public class Demo {
    public static void main(String[] args) {
        LivingRoomTable livingRoomTable = new LivingRoomTable("wood", 10, 10, 2, "IKEA");
        Desk desk = new Desk("wood", 10, 10, 2, "IKEA");

        livingRoomTable.showInfo();
        livingRoomTable.setBrand("NUMRO");
        livingRoomTable.setNumberOfDrawers(6);
        livingRoomTable.setMaterial("plastic");
        livingRoomTable.showInfo();

        desk.showInfo();
        desk.setBrand("NOVA");
        desk.setNumberOfShelves(2);
        desk.setMaterial("brick");
        desk.showInfo();
    }
}
