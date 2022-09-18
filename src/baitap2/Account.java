package baitap2;

public class Account {
    public String id, name;
    public int balance;

    public Account() {
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void print(){
        System.out.println("Số dư hiện tại:" +this.balance);
    }

    public void credit(int amount){
        if(amount>0){
           setBalance(this.balance+amount);
           System.out.println("Nhận được : "+amount+" Số dư hiện tại : "+balance);
        }
    }
    public void debit(int amount){
        if(this.balance>=amount){
            setBalance(this.balance-amount);
            System.out.println("Thanh toán thành công, số dư còn lại: "+balance);
        }else{
            System.out.println("Thanh toán không thành công");
        }
    }
    public Account tranferTo(Account B, int amount){
        if(this.balance>=amount){
           setBalance(this.balance-amount);
           B.setBalance(B.balance+amount);
           return B;
        }
        return B;
    }

}
