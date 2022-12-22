import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
class BorderExample extends JFrame {
    public BorderExample() {
        getContentPane().setBackground( new Color(152,255,152));
        setSize(800, 500);
        setLayout(new BorderLayout());
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        but1.setBackground(new Color(171,205,239));
        but2.setBackground(new Color(171,205,239));
        add(but1, BorderLayout.WEST);
        add(but2, BorderLayout.EAST);
        JLabel lbl = new JLabel("Result: 0 X 0");
        add(lbl, BorderLayout.NORTH);
        JLabel lbl1 = new JLabel("Last Scorer: ");
        add(lbl1, BorderLayout.SOUTH);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setPreferredSize(new Dimension(800, 50));
        lbl.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setPreferredSize(new Dimension(800, 50));
        lbl1.setFont(new Font("Verdana", Font.PLAIN, 20));
        final int[] Milan = {1};
        Milan[0] = 0;
        final int[] Madrid = {1};
        Madrid[0] = 0;
        JLabel lbl2 = new JLabel("");
        add(lbl2, BorderLayout.CENTER);
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setPreferredSize(new Dimension(800, 50));
        lbl2.setFont(new Font("Verdana", Font.PLAIN, 50));
        but1.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }
            public void mouseClicked(MouseEvent a) {
                Milan[0]++;
                lbl.setText("Result: " + Milan[0] + " X " + Madrid[0]);
                lbl1.setText("Last Scorer: AC Milan");
                if(Madrid[0]+Milan[0]==10){
                    but1.removeMouseListener(this);
                    lbl2.setText("Winner: AC Milan");}
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
        but2.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }
            public void mouseClicked(MouseEvent a) {
                Madrid[0]++;
                lbl.setText("Result: " + Milan[0] + " X " + Madrid[0]);
                lbl1.setText("Last Scorer: Real Madrid");
                if(Madrid[0]+Milan[0]==10){
                    but2.removeMouseListener(this);
                    lbl2.setText("Winner: Real Madrid");
                }
            }
            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
    }
    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }
}