package baitapjx2;

import com.sun.deploy.panel.ExceptionListDialog;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Comparator;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPoint;
    public Text noticeName;
    public Text noticeEmail;
    public Text noticePoint;
    public Text errors;
    public ListView<Student> lv;
    public ObservableList<Student> studentList = FXCollections.observableArrayList();

    public void studentList() {
        String name= txtName.getText();
        String em = txtEmail.getText();
        String diem = txtPoint.getText();
        try{
            errors.setVisible(false);
          if(name.isEmpty()){
              throw new Exception("Vui lòng nhập tên sinh viên");
          }
          Double diemThi = Double.parseDouble(diem);
          if(diemThi<0||diemThi>10){
              throw new Exception("Vui lòng nhập điểm");
          }
          if(em.isEmpty()||!em.contains("@")||em.startsWith("@")||em.endsWith("@")){
              throw new Exception("Vui lòng nhập email");
          }
          Student st = new Student(name,em,diemThi);
          studentList.add(st);
          printResult();

        }catch (Exception e){
            errors.setVisible(true);
            errors.setText(e.getMessage());
        }
    }
    public void printResult(){
        lv.setItems(studentList);
        lv.refresh();
    }
    public void sortName(){
        FXCollections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()); //Sắp xếp tên theo alphabe
            }
        });
    }
    public void sortPoint(){
        FXCollections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getPoint()-o2.getPoint()); //Sắp xếp điểm tăng dần
            }
        });
    }
}