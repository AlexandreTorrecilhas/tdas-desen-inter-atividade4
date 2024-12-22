package main.telainserirdados;

//Pacotes Projeto
import main.componentes.LblJLabel;
import main.componentes.TxtJTextField;
//Pacotes Swing
import javax.swing.JPanel;
//Pacotes AWT
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

class JPanelInserirDados extends JPanel {

    LblJLabel lblDia = new LblJLabel("Dia");
    TxtJTextField txtDia = new TxtJTextField("Informe o dia em que a medição foi realizada");

    private Insets espaco = new Insets(5,5,5,5);

    public JPanelInserirDados(){
        this.setLayout(new GridBagLayout());
        addComponentes();
    }

    private void addComponentes(){
        this.add(lblDia, this.getGbc(0,0));
        this.add(txtDia, this.getGbc(1,0));
    }

    private GridBagConstraints getGbc(int coluna, int linha){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = coluna;
        gbc.gridy = linha;
        gbc.insets = this.espaco;
        return gbc;
    }

}
