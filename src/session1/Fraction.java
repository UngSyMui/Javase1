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
        this.result = (float)tuso/(float)mauso;
    }
    public void print(){
     System.out.println("In phân số");
     System.out.println(this.tuso+"/"+this.mauso+"="+this.result);
    }
    public int ucln(int tuso, int mauso){
      this.tuso=Math.abs(tuso);
      this.mauso=Math.abs(mauso);
      if(this.tuso==0||this.mauso==0) {
          return this.tuso+this.mauso;
      }
      while(this.tuso!=this.mauso){
          if(this.tuso>this.mauso){
              this.tuso=this.tuso-this.mauso;
          }else{
              this.mauso=this.mauso-this.tuso;
          }
      }
      return this.tuso;
    }
    public void rutgon(){
        System.out.println("Rút gọn phân số");
        System.out.println(this.tuso+"/"+this.mauso+"="+(this.tuso/this.ucln(this.tuso,this.mauso)+"/"+(this.mauso/this.ucln(this.tuso,this.mauso))));
    }

    public void nghichdao(){
        System.out.println("Nghịch đảo phân số");
        System.out.println(this.mauso+"/"+this.tuso+"="+(this.mauso/this.ucln(this.tuso,this.mauso))+"/"+(this.tuso/this.ucln(this.tuso,this.mauso)));
    }


}
