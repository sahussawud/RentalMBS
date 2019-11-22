/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JLabel;

/**
 *
 * @author 05
 */
  public class FontLoader {

    public static Font loadFont(float size, int style, JLabel j) {
    Font font = null;
    InputStream is = j.getClass().getResourceAsStream("Kanit-Regular.ttf");
    try {
        font = Font.createFont(Font.TRUETYPE_FONT, is);
        font = font.deriveFont(size);
        font = font.deriveFont(style);
    } /*catch (FileNotFoundException fe) {
        System.out.println("File not found"); // was in here because i tried a file       instead of an InputStream
    } */catch (FontFormatException ex) {
        System.out.println("Font is null1");
    } catch (IOException e) {
        System.out.println("Font is null2");
    }
    return font;
}
}
