public class EcuaciónCuadrátia {
    float a;
    float b;
    float c;
    float[] x = new float[2];

    public EcuaciónCuadrátia(float a, float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public boolean tieneSolución(){
        boolean res=true;
        if (a==0 || b==0){
            res=false;
            return res;
        }
        return res;
    }
    public float[] solución(){

        if (tieneSolución()){
            x[0]= (float) ((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
            x[1]= (float) ((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
        }
        return x;
    }

    public static void main(String[] args) {
        EcuaciónCuadrátia prueba= new EcuaciónCuadrátia(1,4,1);
        System.out.println("La ecuación es: "+prueba.a+"x²+"+prueba.b+"x+"+prueba.c);
       float[] res= prueba.solución();
        System.out.println("La solución es: "+res[0]+" y "+res[1]);
    }
}
