package main.componentes.abstrato;

//Pacotes Swing
import javax.swing.JTextField;
import javax.swing.ToolTipManager;
import javax.swing.JToolTip;
//Pacotes AWT
import java.awt.Dimension;
import java.awt.Font;


public abstract class AbsJTextField extends JTextField {

    private Dimension tamanhoPreferrido = new Dimension(50,30);
    private Dimension tamanhoMaximo = new Dimension(80,30);
    private Font fonte = new Font("default", Font.PLAIN, 20);

    public AbsJTextField(String dica){
        this.setPreferredSize(this.tamanhoPreferrido);
        this.setMaximumSize(this.tamanhoMaximo);
        this.setFont(this.fonte);
        setDica(dica);
    }

    private void setDica(String dica){
        this.setToolTipText(dica);
        ToolTipManager.sharedInstance().registerComponent(this);
    }

    @Override
    public JToolTip createToolTip(){
        JToolTip dica = new JToolTip();
        dica.setFont(this.fonte);
        return dica;
    }

}
