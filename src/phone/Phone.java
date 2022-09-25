package phone;

public abstract class Phone {
  public abstract void insertPhone(PhoneNumber o);
  public abstract void removePhone(String name);
  public abstract void updatePhone(PhoneNumber o);
  public abstract void searchPhone(String name);

  public abstract void sort();
}
