package session1;

public class Fraction {
    int tuso, mauso, ucln;
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
    public int ucln(int tuso, int mauso){
      this.tuso=Math.abs(tuso);
      this.mauso=Math.abs(mauso);
      if(tuso==0||mauso==0) {
          return tuso+mauso;
      }
      while(tuso!=mauso){
          if(tuso>mauso){
              tuso=tuso-mauso;
          }else{
              mauso=mauso-tuso;
          }
      }
      return tuso;
    }
    public void rutgon(){
        System.out.println("Rút gọn phân số");
        System.out.println(tuso+"/"+mauso+"="+(tuso/ucln(tuso,mauso)+"/"+(mauso/ucln(tuso,mauso))));
    }

    public void nghichdao(){
        System.out.println("Nghịch đảo phân số");
        System.out.println(mauso+"/"+tuso+"="+(mauso/ucln(tuso,mauso))+"/"+(tuso/ucln(tuso,mauso)));
    }

}
