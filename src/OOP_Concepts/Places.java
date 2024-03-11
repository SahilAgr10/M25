package OOP_Concepts;

public class Places {
    private String place;
    private String date;
    private int ImageId;

    public Places() {
        place = "";
        date = "";
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Places(String place, String date){
        this.place=place;
        this.date=date;
    }
    public String toString() {
        return "[Name: " + place + "; Date: " + date+"]\n";
    }
}
