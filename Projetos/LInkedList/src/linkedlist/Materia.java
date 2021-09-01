package linkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Materia {
    LinkedList<String> mat = new LinkedList<>();


    public void addMateria(String nome) {
        mat.add(nome);
    }

    public void listaMaterias() {
        String mensagem = "";
 
        for ( String a : mat) {
            mensagem = mensagem + "\n" + a;

        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void buscaMateria(String nome_busca){
        String mensagem = "A materia " + nome_busca + " não está na lista";
        for(String a : mat){
            if(a.equals(nome_busca)){
                mensagem = "A materia " + nome_busca + " foi encontrada na lista";
            }
    }
        JOptionPane.showMessageDialog(null,mensagem);
}
    public void delete(String mt){
        mat.remove(mt);
    }

    void delMateria(String deleta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   }

