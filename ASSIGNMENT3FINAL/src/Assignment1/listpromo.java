package Assignment1;


abstract class listpromo {
    abstract void places();
    
}
class listofpromo extends listpromo{
    void places(){
        System.out.println("Type of places you can choose: "+"\n1.California"+"\n2.Japan");
    }    
}