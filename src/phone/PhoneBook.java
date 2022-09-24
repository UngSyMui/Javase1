package phone;

import java.util.ArrayList;

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
    public String toString() {
        return "PhoneBook{" +
                "phoneList=" + phoneList +
                '}';
    }

    @Override
    public void insertPhone(PhoneNumber o) {

        for(int i=0;i<phoneList.size();i++){
            if(phoneList.get(i).name.equalsIgnoreCase(o.name)){
                for(int j=0;j<o.phoneNumber.size();j++){
                    phoneList.get(i).phoneNumber.add(o.phoneNumber.get(j));
                }
                for(int m=0;m<phoneList.get(i).phoneNumber.size()-1;m++){
                    for(int n=m+1;n<phoneList.get(i).phoneNumber.size();n++){
                        if(phoneList.get(i).phoneNumber.get(m).equalsIgnoreCase(phoneList.get(i).phoneNumber.get(n))){
                            phoneList.get(i).phoneNumber.remove(n);
                        }
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
              phoneList.remove(phoneList.get(i));
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
                System.out.println("Tìm thấy PhoneNumber"+phoneList.get(i).toString());
                return;
            }
        }
        System.out.println("Không tìm thấy PhoneNumber");

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
