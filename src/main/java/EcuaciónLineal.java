public class EcuaciónLineal {
    float a;
    float b;
    float x;
   public EcuaciónLineal(float a ,float b){
       this.a=a;
       this.b=b;
   }
   public boolean haySolución(){
       boolean res=true;
       if(a==0 || b==0){
           res=false;
           return res;
       }
       return res;
   }
   public float solución(){

       if (a==0 && b==0){
           System.out.println("El resultado es infinito");
           throw new ArithmeticException();
       }
       else if (haySolución()){
            x = -(b/a);}
       else
           throw new ArithmeticException();
       return x;
   }
    public static void main(String[] args) {
       EcuaciónLineal prueba = new EcuaciónLineal(3,5);
        System.out.println("prueba = " + prueba.a+"\t"+prueba.b);
       float res =  prueba.solución();
        System.out.println("El resultado es: "+res);

    }
}


