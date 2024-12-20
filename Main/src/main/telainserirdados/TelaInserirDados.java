package main.telainserirdados;

//Pacotes Swing
import javax.swing.JFrame;
//PAcotes AWT
import java.awt.Dimension;

public class TelaInserirDados extends JFrame {
    
    Integer[] coordenadasXY;
    Dimension tamanhoJFrame = new Dimension(700,700);
    
    public TelaInserirDados(){
        setCoordenadasXY();
        
    }
    
    private void setCoordenadasXY(){
        this.coordenadasXY = new PosicaoJFrame(this.tamanhoJFrame).getCoordenadasXY();
    }
}
