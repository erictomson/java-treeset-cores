import javax.swing.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    // Atributos da classe
    // String para exibição
    String saida = "";
    // Array de cores
    private String[] cores = {"vermelho", "branco", "azul", "verde",
                            "cinza", "laranja", "bronzeado, branco",
                            "ciano", "pêssego", "cinza", "laranja"};

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        // Declarando e instanciando coleção TreeSet
        // Populando com o Array de cores
        TreeSet treeSet = new TreeSet(Arrays.asList(cores));

        // Montando a string com o conteúdo do TreeSet
        saida += "\nSet de elementos não duplicados e ordenados:\n";
        this.mostrarSet(treeSet);

        saida += "\n\nSubconjunto de TreeSet menor que 'laranja':\n";
        this.mostrarSet(treeSet.headSet("laranja"));

        saida += "\n\nSubconjunto de TreeSet maior que 'laranja':\n";
        this.mostrarSet(treeSet.tailSet("laranja"));

        saida += "\n\nPrimeiro elemento de set: " + treeSet.first();
        saida += "\nÚltimo elemento de set: " + treeSet.last();

        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);

        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com Sets",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public void mostrarSet(SortedSet ss) {
        // Interator para acessar os elementos do SortedSet
        Iterator iterator = ss.iterator();

        // Percorrendo os elementos do SortedSet
        while(iterator.hasNext()) {
            saida += iterator.next() + " ";
        }
    }
}
