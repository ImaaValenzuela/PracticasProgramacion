package conceptosbasicos;

public class Estatica {
    static int variableEstatica = 100;

    public static void main(String[] args) {
        int variableLocal = 50;
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Variable estática: " + variableEstatica);
    }
}
