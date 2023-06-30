public class Ejercicio12{
    public static void main (String[]args){

    int a=1;
    int b=1;
    int c=1;
    int d=1;
    int e=1;
    int f=1;
    int g=1;
    int h=1;
    int j=1;
    int i=1;
    int random=0;
    int random1=0;
    int random2=0;
    int random3=0;
    int random4=0;
    int random5=0;
    int random6=0;
    int random7=0;
    int random8=0;
    int random9=0;
    System.out.print("El resultado Construido es: ");
        while(a<=1){
            random = (int)(Math.random()*2); 
            a++;
        }
        System.out.print(random);

        if(random==0){
            while(b<=1){
                 random1 = (int)(Math.random()*9 +1 ); 
                 b++;
            }System.out.print(random1);
        }else if(random==1){
             while(c<=1){
                 random2 = (int)(Math.random()*3); 
                 c++;
            }System.out.print(random2);
        }
        while(d<=1){
            random3=(int)(Math.random()*4);
            d++;
        }System.out.print("."+random3);
        if(random3==0 || random3==1 || random3==2){
            while(e<=1){
                random4 = (int)(Math.random()*9 +1 ); 
                e++;
            }System.out.print(random4+".");
        }else if(random3==3){
            while(f<=1){
                 random5 = (int)(Math.random()*2 ); 
                 f++;
            }System.out.print(random5+".");
        }
        while(g<=1){
            random6=(int)(Math.random()*2 +1 );
            g++;
        }System.out.print(random6);
        while(h<=1){
            random7=(int)(Math.random()*10 );
            h++;
        }System.out.print(random7);
        while(i<=1){
            random8=(int)(Math.random()*10 );
            i++;
        }System.out.print(random8);
        while(j<=1){
            random9=(int)(Math.random()*10);
            j++;
        }System.out.print(random9);
    }
}