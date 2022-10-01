package baitapjavafx;

public class PhoneNumber {
    public String name;
    public String phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: "+name+"-"+"Phone: "+phoneNumber+"\n";
    }
}
