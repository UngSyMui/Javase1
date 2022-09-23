package phone;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, ArrayList<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return getName().equals(that.getName()) && getPhoneNumber().equals(that.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }
    public String getTen(){
        String name = this.name.trim();
        if(name.indexOf(" ")>=0){
            int vt = name.lastIndexOf(" ");
            return name.substring(vt+1);
        }else{
            return name;
        }
    }
    public int compareTo(PhoneNumber o){
        String tenThis=this.getTen();
        String teno= o.getTen();
        return tenThis.compareTo(teno);
    }
    public void swap(PhoneNumber o){
        String tmp = o.name;
        o.name = this.name;
        this.name = tmp;
       ArrayList<String> temp = o.phoneNumber;
       o.phoneNumber = this.phoneNumber;
       this.phoneNumber = temp;
    }
}
