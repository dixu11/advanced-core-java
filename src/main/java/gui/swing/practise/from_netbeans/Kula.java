package gui.swing.practise.from_netbeans;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Daniel
 */
public class Kula {

    private Color kolor;
    private int x,y,d,dx,dy;

    public Kula(int x, int y,Color kolor) {
        this.x = x;
        this.y = y;
        this.kolor = kolor;

        d = 20;
        dx = 3;
        dy = 5;
    }

    public void rysuj(Graphics g){
        g.setColor(kolor);
        g.fillOval(x, y, d, d);
    }

    public void przesun(int zakresX, int zakresY){
        x += dx;
        y += dy;
        if(x >= zakresX-d || x <=0){
            dx = -dx;
        }
        if(y>= zakresY -d || y<= 0){
            dy = -dy;
        }
    }



}