package htbla.steyr;

public class PhoneNumber {
    protected Integer country;
    protected Integer area;
    protected Integer number;

    PhoneNumber(int c, int a, int n){

    }
    PhoneNumber(String number){

    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", area=" + area +
                ", number=" + number +
                '}';
    }


    public Integer getNumber(){
        return 0;
    }


    public Integer getCountryCode() {
        return country;
    }

    public Integer getAreaCode() {
        return area;
    }
    public boolean isValid(PhoneNumber d){
        return true;
    }
}
