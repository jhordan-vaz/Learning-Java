package roomsArray.Rooms;

public class Rooms {

    private String name;
    private String email;
    private double rent;

    public Rooms(String name, String email, double rent) {
        this.name = name;
        this.email = email;
        this.rent = rent;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
