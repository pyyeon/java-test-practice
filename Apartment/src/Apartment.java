public class Apartment {
    public String apartName;
    public String ownerName;
    public int floorArea;


    public Apartment() {
    }

    public Apartment(String apartName, String ownerName) {
        this.apartName = apartName;
        this.ownerName = ownerName;
    }

    public Apartment(String apartName, String ownerName,int floorArea) {
        this.apartName = apartName;
        this.ownerName = ownerName;
        this.floorArea = floorArea;
    }


}
