package main.telainserirdados.abstrato;

import javax.swing.JPanel;
//Pacotes AWT
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public abstract class AbsJPanel extends JPanel {

    protected Insets espaco = new Insets(5,5,5,5);

    public AbsJPanel(){
        this.setLayout(new GridBagLayout());
    }

    public abstract void addComponentes();

    public abstract void configurarEventoTecla();

    protected GridBagConstraints getGbc(int coluna, int linha){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = coluna;
        gbc.gridy = linha;
        gbc.insets = this.espaco;
        return gbc;
    }

}
