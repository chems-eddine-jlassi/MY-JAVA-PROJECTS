/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Jaber
 */
public class Notes {

 private float test1,test2,ds,examen,oral,tp;
 private boolean avec_tp; 
    public Notes()
    {
    test1=0;
    test2=0;
    ds=0;
    examen=0;
    oral=0;
    tp=0;
    avec_tp=true;
    }
    public Notes (float test1,float test2,float ds,float examen,float oral,float tp)
    {
    this.test1=test1;
    this.test2=test2;
    this.ds=ds;
    this.examen=examen;
    this.oral=oral;
    this.tp=tp;
    this.avec_tp=true;
    }
     public Notes (float test1,float test2,float ds,float examen,float oral)
    {
    this.test1=test1;
    this.test2=test2;
    this.ds=ds;
    this.examen=examen;
    this.oral=oral;
    this.avec_tp=false;
    }
    private float CalculNCC()
     {
        return(test1+test2+oral+2*ds)/5;
     }
     public float CalculMoyenne ()
     {
         if (avec_tp==true)
         {
     return (float) (0.3*this.CalculNCC()+0.2*tp+0.5*examen);
     }
     else 
     return (float) (0.4*CalculNCC()+0.6*examen);
         
     
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
        return ds;
    }

    public void setDs(float ds) {
        this.ds = ds;
    }

    public float getExamen() {
        return examen;
    }

    public void setExamen(float examen) {
        this.examen = examen;
    }

    public float getOral() {
        return oral;
    }

    public void setOral(float oral) {
        this.oral = oral;
    }

    public float getTp() {
        return tp;
    }

    public void setTp(float tp) {
        this.tp = tp;
    }

    public boolean isAvec_tp() {
        return avec_tp;
    }

    public void setAvec_tp(boolean avec_tp) {
        this.avec_tp = avec_tp;
    }
    
    
    
    
    

    
}