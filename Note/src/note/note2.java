package note;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class note2 {
  private float test1;
  private float test2;
  private float Ds;
  private float Examen;       
  private float orale;
  private float tp;
  private boolean avectp ;
note2(){
    avectp=true;
}
public note2(float test1,float test2,float Ds,float Examen,float orale,float tp)
{
this.test1=test1;
this.test2=test2;
this.Ds=Ds;
this.Examen=Examen;
this.orale=orale;
this.tp=tp;
}

    public note2(float test1, float test2, float Ds, float Examen, float orale) {
        this.test1 = test1;
        this.test2 = test2;
        this.Ds = Ds;
        this.Examen = Examen;
        this.orale = orale;
    }   
    private float calculncc()
    {
    return ((test1+test2+orale+2*Ds)/5);
    }
   public float calculmoyene()
    {
    if (avectp==true)
    {
        return(float) (0.3*this.calculncc()+0.2*tp+0.5*Examen);
    }
    else
    {
        return (float) (0.4*this.calculncc()+0.6*Examen);
    }
    }
    public float getTest1() {
        return test1;
    }

    public void setTest1(float test1) {
        this.test1 = test1;
    }

    public float getTest2() {
        return test2;
    }

    public void setTest2(float test2) {
        this.test2 = test2;
    }

    public float getDs() {
        return Ds;
    }

    public void setDs(float Ds) {
        this.Ds = Ds;
    }

    public float getExamen() {
        return Examen;
    }

    public void setExamen(float Examen) {
        this.Examen = Examen;
    }

    public float getOrale() {
        return orale;
    }

    public void setOrale(float orale) {
        this.orale = orale;
    }

    public float getTp() {
        return tp;
    }

    public void setTp(float tp) {
        this.tp = tp;
    }

    public boolean isAvectp() {
        return avectp;
    }

    public void setAvectp(boolean avectp) {
        this.avectp = avectp;
    }

    
    
    
    
    
    
    
    
    
    



}