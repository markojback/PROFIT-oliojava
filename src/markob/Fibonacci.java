package markob;

public class Fibonacci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int lukumaara=10;
        fibonacciwhile(lukumaara);
        System.out.print("\n");
        fibonaccifor(lukumaara);
    }

    public static void fibonacciwhile(int loop){
        int vanhaArvo = 1;
        int edellinenVanhaArvo = 0;
        int n = 0;
        do{
            int nykyArvo = edellinenVanhaArvo;
            edellinenVanhaArvo = vanhaArvo;
            vanhaArvo = nykyArvo + edellinenVanhaArvo;
            System.out.print(nykyArvo+" ");
            n++;
        }while(n<loop);

    }
    
    public static void fibonaccifor(int loop){
        int edellinenVanhaArvo = 0, vanhaArvo = 1;
        for(int n = 0; n< loop; n++){
            int nykyArvo = edellinenVanhaArvo;
            edellinenVanhaArvo = vanhaArvo;
            vanhaArvo = nykyArvo + edellinenVanhaArvo;
            System.out.print(nykyArvo+" ");
        }
    }
}