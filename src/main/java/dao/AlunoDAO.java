package dao;

import java.util.ArrayList;
import modelo.Aluno;

public class AlunoDAO {

    // "Banco de dados" simulado
    private static ArrayList<Aluno> minhaLista = new ArrayList<>();

    // Retorna a lista de alunos
    public static ArrayList<Aluno> getMinhaLista() {
        return minhaLista;
    }

    // Define a lista (não muito comum, mas útil em alguns casos)
    public static void setMinhaLista(ArrayList<Aluno> minhaLista) {
        AlunoDAO.minhaLista = minhaLista;
    }

    // Retorna o maior ID atual na lista (para gerar o próximo)
    public static int maiorID() {
        int maiorID = 0;
        for (Aluno a : minhaLista) {
            if (a.getId() > maiorID) {
                maiorID = a.getId();
            }
        }
        return maiorID;
    }
}
