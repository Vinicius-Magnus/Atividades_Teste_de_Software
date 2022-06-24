import java.util.Scanner;
public class atividade1 {          
 public static void main(String[] args ){
 Scanner entrada = new Scanner(System.in);
int ano, idade;
char sexo;
String sexo1;
boolean retorno;
System.out.println("Digite a idade em anos:  ");
idade = entrada.nextInt();
System.out.println("Digite o sexo (M ou F):  ");
sexo1 = entrada.next();
sexo = sexo1.charAt(0);
if ((idade > 17) && (sexo == 'M')) {
retorno = true;
}
else {
    retorno = false;
};
System.out.println("O resultado foi: " + retorno);
entrada.close();
}
} 