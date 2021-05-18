package CanNang;
public class Weight{
    public float ChiPhi(float weight){
        if(weight>0 && weight<=1){
            return 3.5f;
        }
        else if(weight>1 && weight<=3){
            return 5.5f;
        }
        else if(weight>3 && weight<=10){
            return 8.5f;
        }
        else if(weight>10 && weight<=20){
            return 10.5f;
        }
        else{
            return -1;
        }
    }
}