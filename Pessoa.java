public class Pessoa {
    private Universidade universidade;
    private String nome;
    private Departamento dep;

    public Pessoa(Universidade universidade) {
        this.universidade = universidade;
    }

    public Pessoa(Universidade universidade, String nome){
        this.universidade = universidade;
        this.nome = nome;
    }

    public Pessoa(Universidade universidade, String nome, Departamento dep){
        this.universidade = universidade;
        this.nome = nome;
        this.dep = dep;
    }

    //Getters e Setters

    public void setDep(Departamento dep) {
        this.dep = dep;
    }


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
