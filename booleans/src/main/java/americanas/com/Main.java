package americanas.com;

public class Main {
    public static void main(String[] args) {

        //Algoritmo de ir a praia.

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        //True table.

        //Operator && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //Operator || (OR)
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        //Operador ternario.
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

        System.out.println(mensagem);
    }
}