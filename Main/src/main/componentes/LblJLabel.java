package main.componentes;

//Pacotes Swing
import javax.swing.JLabel;
//Pacotes AWT
import java.awt.Dimension;
import java.awt.Font;

public class LblJLabel extends JLabel {
    private Dimension tamanhoPreferido = new Dimension(50,50);
    private Dimension tamanhoMaximo = new Dimension(100,100);
    private Font fonte = new Font("Default", Font.PLAIN, 20);

    public LblJLabel(String texto){
        this.setPreferredSize(tamanhoPreferido);
        this.setMaximumSize(tamanhoMaximo);
        this.setFont(fonte);
        this.setText(texto);
    }
}
