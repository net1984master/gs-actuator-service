package hello;

import java.awt.*;

/**
 * Created by akhodzinsky on 17.01.2017.
 */
public class Draw {
    static Window w;
    static Color cc=Color.RED;
    static int dd=20;

    public Draw() {
        w=new Window(null)
        {

            @Override
            public void paint(Graphics g)
            {
                g.setColor(cc);
                g.fillOval(getWidth()/2,getHeight()/2,dd,dd);
            }
            @Override
            public void update(Graphics g)
            {
                paint(g);
            }
        };
    }



    static public void replaceColor(){
        cc=Color.GREEN;
        dd+=10;
    }


    static public void make(){

        w.setAlwaysOnTop(true);
        w.setBounds(w.getGraphicsConfiguration().getBounds());
        w.setBackground(new Color(0, true));
        w.setVisible(true);

    }
}
