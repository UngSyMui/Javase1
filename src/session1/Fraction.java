package session1;

public class Fraction {
    int tuso, mauso;
    float result;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public Fraction(int tuso, int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
        result = (float)tuso/(float)mauso;
    }
    public void print(){
     System.out.println("In phân số");
     System.out.println(tuso+"/"+mauso+"="+result);
    }
}
