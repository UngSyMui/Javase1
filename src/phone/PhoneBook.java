package phone;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneList;

    public PhoneBook() {
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
        int k=0;
        for(PhoneNumber s:phoneList){
            if(s.getName().contains(o.getName())){
              if(!s.phoneNumber.contains(o.phoneNumber)){
                  s.phoneNumber = o.phoneNumber;
                }
                k++;
            }
        }
        if(k==0) phoneList.add(o);

    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber s:phoneList){
            if(s.getName().equals(name)){
              phoneList.remove(s);
            }
        }

    }

    @Override
    public void updatePhone(PhoneNumber o) {
        for(PhoneNumber s:phoneList){
            if(s.getName().equals(o.getName())){
                s.phoneNumber = o.phoneNumber;
            }
        }

    }

    @Override
    public void searchPhone(String name) {
        for(PhoneNumber s:phoneList){
            if(s.getName().equals(name)){
                System.out.println("Tìm thấy PhoneNumber"+s.toString());
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
