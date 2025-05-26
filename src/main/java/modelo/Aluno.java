package modelo;

import java.util.ArrayList;
import dao.AlunoDAO;

public class Aluno extends Pessoa {
    private String curso;
    private int fase;

    // Construtor Vazio
    public Aluno() {
        this(0, "", 0, "", 0);
    }

    // Construtor com parâmetros
    public Aluno(int id, String nome, int idade, String curso, int fase) {
        super(id, nome, idade); // Chama o construtor da classe Pessoa
        this.curso = curso;
        this.fase = fase;
    }

    // Métodos GET e SET
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso + ", fase=" + fase;
    }

    // Métodos que usam DAO para manipular dados
    public ArrayList<Aluno> getMinhaLista() {
        return AlunoDAO.getMinhaLista();
    }

    public boolean insertAlunoBD(String nome, int idade, String curso, int fase) {
        int id = this.maiorID() + 1;
        Aluno novo = new Aluno(id, nome, idade, curso, fase);
        getMinhaLista().add(novo);
        return true;
    }

    public boolean updateAlunoBD(int id, String nome, int idade, String curso, int fase) {
        int i = this.procurarIndice(id);
        Aluno atualizado = new Aluno(id, nome, idade, curso, fase);
        getMinhaLista().set(i, atualizado);
        return true;
    }

    public boolean deleteAlunoBD(int id) {
        int i = this.procurarIndice(id);
        getMinhaLista().remove(i);
        return true;
    }

    public Aluno carregaAluno(int id) {
        int i = this.procurarIndice(id);
        return getMinhaLista().get(i);
    }

    private int procurarIndice(int id) {
        for (int i = 0; i < getMinhaLista().size(); i++) {
            if (getMinhaLista().get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int maiorID() {
        return AlunoDAO.maiorID();
    }
}

