import java.util.List;

public class Main {
    public static void main(String[] args) {
        //função cripto que recebe uma palavra e criptografa ela
        String palavra = "java";
        System.out.println(cripto(palavra));
    }

    public static String cripto(String palavra){
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder criptografia = new StringBuilder();
        for (int i = 0; i < palavra.length(); i ++) {
            String c = palavra.substring(i, i + 1);
            for (int j = 0; j < alfabeto.length; j++) {
                if (c.equalsIgnoreCase(alfabeto[j])){
                    criptografia.append(j + 1);
                    break;
                }
            }
        }
        return criptografia.toString();
    }
}