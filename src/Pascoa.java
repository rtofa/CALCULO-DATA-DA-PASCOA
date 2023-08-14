import java.util.Scanner;

public class Pascoa {

    public static void main(String[] args){

            YearDate();


    }
    static void YearDate(){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite o ano (entre 1901 a 2099)");
            int Ano = Scanner.nextInt();

        int a = Ano % 19;
        int b = Ano % 4;
        int c = Ano % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;

        int Dia, Mes;

        if( d + e < 10 ){
            Dia = (22 + d + e);
            Mes = 3;
        }else{
            Dia = d + e - 9;
            Mes = 4;

            if ((Dia == 26) && (d == 7) && (a > 10)){
                    Dia = 19;
            }else if((Dia == 25) && (d == 6) && (a > 10)){
                    Dia = 18;
            }
        }
        System.out.println("Em " + Ano + " A Páscoa será no dia" + Dia   + "/" + Mes);

            Scanner.close();
    }
}
