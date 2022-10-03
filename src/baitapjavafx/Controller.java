package baitapjavafx;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField txtName;
    public TextField txtPhoneNumber;
    public TextArea phoneList;
    public ArrayList<PhoneNumber> phoneBook = new ArrayList<>();

    public String phoneListToString(){
        String t="";
        for(PhoneNumber p:phoneBook){
            t+=p.toString();
        }
        return t;
    }


    public void handleSubmit() {
        String name = txtName.getText();
        String phone = txtPhoneNumber.getText();
        if (!name.isEmpty() && !phone.isEmpty()) {
            int k = 0;
            for (PhoneNumber p : phoneBook) {
                if (p.getName().equals(name)) {
                    p.setPhone(phone);
                    k++;
                }
            }
            if (k == 0) {
                PhoneNumber pn = new PhoneNumber(name, phone);
                phoneBook.add(pn);
            }
        }
       phoneList.setText(phoneListToString());
    }
}