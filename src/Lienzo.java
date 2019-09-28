
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class Lienzo extends JPanel{
    private Color colorFondo;
    private Color colorLapiz;
    private int grosor;
    private Point[] puntos;
    private int p_index;
    
    public Lienzo(int size){
        this.colorFondo = Color.WHITE;
        this.colorLapiz = Color.BLACK;
        this.grosor = 10;
        puntos = new Point[size];
        p_index = 0;
    }
    
    public Lienzo() {
        this(5);
    }
    
    public void add(Point punto){      
        if (p_index >= puntos.length) p_index = 0;
        puntos[p_index++] = punto;
        
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setColorLapiz(Color colorLapiz) {
        this.colorLapiz = colorLapiz;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
    public void setSize(int size){
        puntos = new Point[size];    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        this.setBackground(colorFondo);
        this.setForeground(colorLapiz);
        
        for (int i = 0; i < puntos.length && puntos[i] != null; i++){
            g2d.fillOval((int)puntos[i].getX(), (int)puntos[i].getY(), grosor, grosor);
        }
    }

    void clear() {
        for (int i = 0; i < puntos.length && puntos[i] != null; i++){
            puntos[i] = null;
        }
    }
    
}
