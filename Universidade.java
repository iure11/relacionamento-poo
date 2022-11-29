import java.util.Scanner;
public class Universidade {
    private String nome;
    Departamento dep[] = new Departamento[50];
    private int cont = 0;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public void iniciaDep(){
        Departamento depa = new Departamento();
        System.out.println("Insira o nome do departamento");
        depa.setNomeDept(s.nextLine());
        dep[cont] = depa;
        this.cont++;
        System.out.println("Esse departamento pertence a universidade: "+nome);
    }

    public void mostraDeps(){
        System.out.println("Os departamentos da universidade "+nome+ " são:");
        for(int i=0;i<cont;i++)
        System.out.println(dep[i].getNomeDept());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    static Scanner s = new Scanner(System.in);
}
