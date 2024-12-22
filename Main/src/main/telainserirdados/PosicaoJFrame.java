package main.telainserirdados;

//Pacotes Swing
import javax.swing.JFrame;
//Pacotes AWT
import java.awt.Toolkit;
import java.awt.Dimension;

public class PosicaoJFrame {
    
    Dimension tamanhoMonitor = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension tamanhoJFrame;
    Integer[] coordenadasXY = new Integer[2];
    
    public PosicaoJFrame(Dimension tamanhoJFrame){
        this.tamanhoJFrame = tamanhoJFrame.getSize();
    }
    
    private void setCoordenadasXY(){
        this.coordenadasXY[0] = (int)(this.tamanhoMonitor.width - this.tamanhoJFrame.getWidth()) / 2;
        this.coordenadasXY[1] = (int) (this.tamanhoMonitor.height - this.tamanhoJFrame.getHeight()) / 2;
    }
    
    public Integer[] getCoordenadasXY(){
        this.setCoordenadasXY();
        return this.coordenadasXY;
    }
    
}
