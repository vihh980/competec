import java.util.Scanner;
public class aula01{

    public static void main(String[] args ){
     /*Double abacaxi = 7.30;
     Double pera = 2.0;
     Double maca =3.0;

     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite quantos abacaxis voce deseja:");
     abacaxi *= entrada.nextInt();
     System.out.println("Digite quantos macas voce deseja:");
     maca *= entrada.nextInt();
     System.out.println("Digite quantos peras voce deseja:");
     pera *= entrada.nextInt();

     double resultado = abacaxi+ maca + pera;

     System.out.print("O valor total foi de R$" +resultado);

 */
/*Scanner entrada = new Scanner(System.in);

int x,y;
System.out.println("digite o primeiro valoe:");
x = entrada.nextInt();
System.out.println("digite o primeiro valoe:");
y = entrada.nextInt();

if (x==y){
    System.out.println("o valor é igual");
}
else {
    System.out.println("o valor é diferente");
}

System.out.println("digite a primeira idade:");
x = entrada.Nextline();

System.out.println("digite a segunda idade:");
y = entrada.Nextline();

 if (x == y){
    System.out.print("tem a mesma idade");
 }
else{
    System.out.print("não tem a mesma  idade");
}
*/
/* 
Boolean chuva;
Boolean nublado;
Boolean sol;
Scanner entrada = new Scanner(System.in);

System.out.println("Esta chovendo?:");
chuva = entrada.nextBoolean();
System.out.println("Esta nublado:");
nublado = entrada.nextBolean();
}
String tempo;
System.out.println("Como esta o clima?");
tempo = entrada.nextLine();

if(tempo.equals("chuva") == 0){
    System.out.print ("Esta chovendo");
}
else if (tempo.equals("nublado") == 0) {
    System.out.print ("Esta nublado");

}


if( chuva == true || nublado == true){
    System.out.println("Esta chovendo ou nublado?");
}
else {
    System.out.println("Esta sol");
} */
/* 
boolean = chuva;
boolean = guardaChuva;

Scanner entrada = new Scanner(System.in);

System.out.println("Esta chovendo?");
chuva = entrada.nextBoolean();
System.out.println("TROUXE GURDA CHUVA??");
guardaChuva = entrada.nextBoolean();
}
if (chuva == true || guardachuva == true){
    System.out.println("to de boa");
    if (chuva == true || guardachuva == false){
        System.out.println("to de boa");
    }
    {
*/ 
/* 
String opcao;
Scanner entrada = new Scanner (System.in);
 
System.out.println("Qual operacao voce deseja fazer?");

System.out.println("|||  A- deposito \n b - Saque \n C- |||");
opcao = entrada.nextLine();


switch(opcao){
    case "a":
    System.out.println("Voce escolheu a opcao deposito");
    break;
    case "b":
    System.out.println("Voce escolheu a opcao Saque");
    break;
    case "c":
    System.out.println("Voce escolheu a opcao emprestimo siga-...");
    break;



    }
 */

Scanner entrada = new Scanner(System.in);
Double num;
System.out.println("Digite um numero");
num = entrada.nextDouble();

 if (num % 3 == 0 || num % 5 ==0){
    System.out.println("Verdadeiro, ele eh multiplico de ambos");
 }
 else{
    System.out.println("Falso, ele não eh multiplico de ambos");
 }

}
}
