package phone;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneList;


    public PhoneBook() {
        this.phoneList = new ArrayList<PhoneNumber>();
    }

    public PhoneBook(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }



    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneBook)) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return getPhoneList().equals(phoneBook.getPhoneList());
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneList=" + phoneList +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneList());
    }

    @Override
    public void insertPhone(PhoneNumber o) {
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).name.equalsIgnoreCase(o.name)){
//                for(int j=0;j<o.phoneNumber.size();j++){
//                    phoneList.get(i).phoneNumber.add(o.phoneNumber.get(j));
//                }
//                for(int m=0;m<phoneList.get(i).phoneNumber.size()-1;m++){
//                    for(int n=m+1;n<phoneList.get(i).phoneNumber.size();n++){
//                        if(phoneList.get(i).phoneNumber.get(m).equalsIgnoreCase(phoneList.get(i).phoneNumber.get(n))){
//                            phoneList.get(i).phoneNumber.remove(phoneList.get(i).phoneNumber.get(n));
//                        }
//                    }
//                }
                for(int h=0;h<o.phoneNumber.size();h++){
                    int k=0;
                    for(int g =0;g<phoneList.get(i).phoneNumber.size();g++){
                        if(o.phoneNumber.get(h).equals(phoneList.get(i).phoneNumber.get(g))){
                            k++;
                        }
                    }
                    if(k==0){
                        phoneList.get(i).phoneNumber.add(o.phoneNumber.get(h));
                    }

                }
                return;
            }
        }
        phoneList.add(o);
    }

    @Override
    public void removePhone(String name) {
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).name.equalsIgnoreCase(name)){
                phoneList.remove(i);
            }
        }

    }

    @Override
    public void updatePhone(PhoneNumber o) {
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).name.equalsIgnoreCase(o.name)){
                phoneList.get(i).phoneNumber = o.phoneNumber;
            }
        }

    }

    @Override
    public void searchPhone(String name) {
        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).name.equalsIgnoreCase(name)){
                System.out.println("Tìm thấy: "+phoneList.get(i).toString());
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    @Override
    public void sort() {
        for(int i=0;i<phoneList.size()-1;i++){
            for(int j=i+1;j<phoneList.size();j++){
                if(phoneList.get(i).compareTo(phoneList.get(j))>0){
                    phoneList.get(i).swap(phoneList.get(j));
                }
            }
        }

    }
}
