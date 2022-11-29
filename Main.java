import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Universidade c = new Universidade("Cambridge");
        Universidade p = new Universidade("Princeton");

        //Instanciar Pessoas

        Pessoa albert = new Pessoa(p,"Albert Einstein");
        Pessoa isaac = new Pessoa(c,"Isaac Newton");

        System.out.println(albert.getNome()+", "+albert.getUniversidade().getNome());
        System.out.println(isaac.getNome()+", "+isaac.getUniversidade().getNome());

        //Adicionar departamentos a universidade de Princeton
        System.out.println("Adicione um departamento a universidade de Princeton");

        p.iniciaDep();



        System.out.println("Deseja inserir mais um departamento? (s || n)");
        char opt = s.next().charAt(0);

        while(opt =='s'){
            p.iniciaDep();
            System.out.println("Deseja inserir mais um departamento? (s || n)");
            opt = s.next().charAt(0);
        }

        p.mostraDeps();
    }
}