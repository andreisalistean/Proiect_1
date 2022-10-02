import java.util.*;

public class Matematik{
    // private float _lpatrat=0.0;
    // private float _ldreptunghi=0.0;
    // private float _Ldreptunghi=0.0;
    // private float _l1triunghi=0.0;
    // private float _l2triunghi=0.0;
    // private float _l3triunghi=0.0;
    // private float _rcerc=0.0;
  
    public Matematik()
    {

    }

    public String patrat (double lpatrat)
    {
        double arie=lpatrat*lpatrat;
        double perimetru=lpatrat*4;
        double diagonala=lpatrat*(Math.sqrt(2.0));
        String msg="arie: "+arie+"\nperimetru: "+perimetru+"\ndiagonala: "+diagonala;
        return msg;
    }

    public String dreptunghi (double ldreptunghi,double Ldreptunghi)
    {
        double arie=ldreptunghi*Ldreptunghi;
        double perimetru =ldreptunghi*2 +Ldreptunghi*2;
        double diagonala =Math.sqrt((ldreptunghi*ldreptunghi)+(Ldreptunghi*Ldreptunghi));
        String msg="arie: "+arie+"\nperimetru: "+perimetru+"\ndiagonala: "+diagonala;
        return msg;

    }

    public String triunghi (double l1triunghi , double l2triunghi , double l3triunghi)
    {
        String type;
        String msg;
        double h1, h2,h3;
        double arie, perimetru;

        if(CheckTriangle(l1triunghi, l2triunghi, l3triunghi))
        {
            if((l1triunghi==l2triunghi)&&(l2triunghi==l3triunghi))
            {
                type="echilateral";
            }
            else
            {
                if((l1triunghi==l2triunghi)||(l1triunghi==l3triunghi)||(l2triunghi==l3triunghi))
                {
                    type="isoscel";
                }
                else   
                    type="oarecare";
            }

            if(CheckDreptunghi(l1triunghi, l2triunghi, l3triunghi) )
                type+=" dreptunghic";

            perimetru=l1triunghi+l2triunghi+l3triunghi;
            double p=(l1triunghi+l2triunghi+l3triunghi)/2;
            arie=Math.sqrt(p*(p-l1triunghi)*(p-l2triunghi)*(p-l3triunghi));
            h1=2*arie/l1triunghi;
            h2=2*arie/l2triunghi;
            h3=2*arie/l3triunghi;
            msg="Triunghi "+type+"\narie "+arie+"\nperimetru"+perimetru+"\nh1 "+h1+"\nh2 "+h2+"\nh3 "+h3;
            return msg;

        }
        else
        {
            msg="Laturile introduse nu formeaza un triunghi ";
            return msg;
        }
    }

    private boolean CheckDreptunghi(double l1 , double l2 , double l3)
    {
        return ((l1*l1+l2*l2==l3*l3)||(l1*l1+l3*l3==l2*l2)||(l2*l2+l3*l3==l1*l1));
    }

    private boolean CheckTriangle(double l1triunghi , double l2triunghi , double l3triunghi)
    {
        return ((l1triunghi+l2triunghi>l3triunghi)&&(l1triunghi+l3triunghi>l2triunghi)&&(l2triunghi+l3triunghi>l1triunghi));
    }

    public String cerc(double raza){
        double arie = raza*raza*3.14;
        double perimetru =2*3.14*raza;

        String msg="arie: "+arie+"\nperimetru: "+perimetru+"\ndiagonala: nu are";
        return msg;
    }

    public String cub(double l){
        double volum, arie;
        String msg;
        volum=l*l*l;
        arie=l*l;
        msg="volum "+volum+"\narie "+arie+"\narie 6 fete "+(arie*6);
        return msg; 
    } 
    
    public String cilindru(double l, double r)
    {
        double arie = (r*r*3.14)*2+(l*2*r*3.14);
        double volum = r*r*3.14*l;
        String msg="volum "+volum+"\narie "+arie;
        return msg;
        
    }
    
    public String sfera(double r)
    {
        double arie = 4*3.14*r*r;
        double volum = (4/3)*3.14*r*r*r;
        String msg="volum "+volum+"\narie "+arie;
        return msg;
    }

    public String piramida(double l, double muchie)
    {
        double p=l+muchie+muchie;
        double m=Math.sqrt(p*(p-l)*(p-muchie)*2);
        double arie= l*l+4*m;
        double h1=Math.sqrt(muchie*muchie-(l/2)*(l/2));
        double h2= Math.sqrt(h1*h1-(l/2)*(l/2));
        double volum = ((l*l)*h2)/3;
        String msg="volum "+volum+"\narie "+arie;
        return msg;
    }

    public String con(double r, double l)
    {
        double h=Math.sqrt(l*l-r*r);
        double arie=3.14*r*(r+l);
        double volum = (3.14*r*r*h)/3;
        String msg="volum "+volum+"\narie "+arie;
        return msg;
    }
}
    