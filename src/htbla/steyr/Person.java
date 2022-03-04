package htbla.steyr;

public class Person {
    protected String name;
    protected String givenname;
    protected String nickname;
    protected Date birthday;

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }

    protected PhoneNumber phone;


    public Person(String s, String s1, String s2, Date date, PhoneNumber phoneNumber) {
        s=name;
        s1=givenname;
        s2=nickname;
        date=birthday;
        phoneNumber=phone;
    }
}
