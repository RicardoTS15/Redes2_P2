/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author rtorress1400
 */
public class Imagen extends JPanel{
    private String name;
    
    public Imagen(){
        this.setSize(80, 80);
    }
    
    public void paint(Graphics g){
        Dimension height = getSize();
        
        ImageIcon Img = new ImageIcon(getClass().getResource("C:/Users/rtorress1400/Documents/Redes 2/CarritoCompras_P2/icons/"+name+".png"));
        
        g.drawImage(Img.getImage(), 0, 0, height.width,height.width,null);
        
        setOpaque(false);
        super.paintComponent(g);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
