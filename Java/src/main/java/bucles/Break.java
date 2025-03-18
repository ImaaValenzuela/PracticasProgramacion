package bucles;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i == 5){
                System.out.println("Bucle finalizado.");
                break;
            }
            System.out.println(i);
        }
    }
}
