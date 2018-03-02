/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author rtorress1400
 */
public class Utils {
    public Icon redimensionar(String base64Image,int w,int h){
        //Pasa de base64 a icon de w X h px.
        base64Image = base64Image.split(",")[1];
        byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(base64Image);
        ImageIcon ii = new ImageIcon(imageBytes);
        Icon icono = new ImageIcon(ii.getImage().getScaledInstance(w,h,Image.SCALE_DEFAULT));
        return icono;
    }
}
