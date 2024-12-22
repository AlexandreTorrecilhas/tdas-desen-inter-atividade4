package main.componentes;

//Pacotes Swing
import javax.swing.*;
//Pacotes AWT
import java.awt.Dimension;
import java.awt.Font;


public class TxtJTextField extends JTextField {
    protected Dimension tamanhoPreferido = new Dimension(150,50);
    protected Dimension tamanhoMaximo = new Dimension(200,80);
    protected Font fonte = new Font("Default", Font.PLAIN, 20);

    public TxtJTextField(String mensagem){
        this.setPreferredSize(tamanhoPreferido);
        this.setMaximumSize(tamanhoMaximo);
        this.setFont(fonte);
        setDica(mensagem);
    }

    public void setDica(String mensagem){
        setToolTipText(mensagem);
        ToolTipManager.sharedInstance().registerComponent(this);
    }

    @Override
    public JToolTip createToolTip(){
        JToolTip dica = new JToolTip();
        dica.setComponent(this);
        dica.setFont(fonte);
        return dica;
    }

}
