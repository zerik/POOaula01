public class ComparacaoStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Hello");    //Não é recomedado criar Strings dessa forma.

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);      //Comparação errada de Strings.
        System.out.println(s1.equals(s3));     //Forma correta de comparar Strings.
    }
}
