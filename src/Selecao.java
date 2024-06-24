public class Selecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a == b){
            System.out.println("a igual b.");
        } else if(a > b){
            System.out.println("a maior que b.");
        } else{
            System.out.println("a menor que b");
        }

        String nomeDia = null;
        int dia = 3;

        switch(dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3: 
                nomeDia = "Terça";
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        System.out.println(nomeDia);
    }
}
