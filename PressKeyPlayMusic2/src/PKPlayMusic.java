import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;

public class PKPlayMusic extends JFrame {
    //Frame frm = new Frame("Press Key Play Music");
    JLabel btn1, btn2, btn3, btn4, btn5, btn6, btnbass, btndrum, btnwall,btnTotsp,btnGL,btnTn;
    AudioClip click1;

    public PKPlayMusic() {
        setTitle("Press Key Play Music");
        setSize(1920, 850);
        setLayout(null);
        setResizable(false);
        // setLayout(new FlowLayout());
        btn1 = new JLabel("1");
        btn2 = new JLabel("2");
        btn3 = new JLabel("3");
        btn4 = new JLabel("4");
        btn5 = new JLabel("5");
        btn6 = new JLabel("6");
        btnbass = new JLabel("bass");
        btndrum = new JLabel("drum");
        btnwall = new JLabel("wall");
        btnTotsp  = new JLabel("Totsp");
        btnGL = new JLabel("GL");
        btnTn = new JLabel("Tn");

        btn1.setBounds(100, 100, 200, 100);
        //btn1.setForeground(Color.green);
        btn1.setBackground(Color.gray);
        btn1.setOpaque(true);

        btn2.setBounds(400, 100, 200, 100);
        //btn2.setForeground(Color.green);
        btn2.setBackground(Color.gray);
        btn2.setOpaque(true);

        btn3.setBounds(700, 100, 200, 100);
        //btn3.setForeground(Color.green);
        btn3.setBackground(Color.gray);
        btn3.setOpaque(true);

        btnTotsp.setBounds(1000, 100, 200, 100);
        btnTotsp.setBackground(Color.gray);
        btnTotsp.setOpaque(true);

        btn4.setBounds(100, 300, 200, 100);
        //btn4.setForeground(Color.green);
        btn4.setBackground(Color.gray);
        btn4.setOpaque(true);


        btn5.setBounds(400, 300, 200, 100);
        //btn5.setForeground(Color.green);
        btn5.setBackground(Color.gray);
        btn5.setOpaque(true);

        btn6.setBounds(700, 300, 200, 100);
        //btn6.setForeground(Color.green);
        btn6.setBackground(Color.gray);
        btn6.setOpaque(true);

        btnGL.setBounds(1000, 300, 200, 100);
        btnGL.setBackground(Color.gray);
        btnGL.setOpaque(true);

        btnTn.setBounds(1000, 500, 200, 100);
        btnTn.setBackground(Color.gray);
        btnTn.setOpaque(true);


        btnbass.setBounds(100, 500, 200, 100);
        btnbass.setForeground(Color.green);
        btndrum.setBounds(400, 500, 200, 100);
        btndrum.setForeground(Color.green);
        btnwall.setBounds(700, 500, 200, 100);
        btnwall.setForeground(Color.green);






        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnbass);
        add(btndrum);
        add(btnwall);
        add(btnTotsp);
        add(btnGL);
        add(btnTn);
        setVisible(true);

        // 　Set Background Image to JFrame
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("photo.jpg"));
        add(background);
        background.setLayout(new FlowLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CkeyMove keyMove = new CkeyMove();
        addKeyListener(keyMove);
    }

    class CkeyMove extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 97:
                    btn1.setForeground(Color.red);
                    btn1.setBackground(Color.blue);
                    URL urlClick1 = PKPlayMusic.class.getResource("1.wav");
                    click1 = Applet.newAudioClip(urlClick1);
                    click1.play(); // play once
                    System.out.println("1");
                    break;
                case 98:
                    btn2.setForeground(Color.red);
                    btn2.setBackground(Color.pink);
                    URL urlClick2 = PKPlayMusic.class.getResource("2.wav");
                    click1 = Applet.newAudioClip(urlClick2);
                    click1.play(); // play once
                    System.out.println("2");
                    break;
                case 99:
                    btn3.setForeground(Color.red);
                    btn3.setBackground(Color.yellow);
                    URL urlClick3 = PKPlayMusic.class.getResource("3.wav");
                    click1 = Applet.newAudioClip(urlClick3);
                    click1.play(); // play once
                    System.out.println("3");
                    break;
                case 100:
                    btn4.setForeground(Color.red);
                    URL urlClick4 = PKPlayMusic.class.getResource("4.wav");
                    click1 = Applet.newAudioClip(urlClick4);
                    click1.play(); // play once
                    btn4.setBackground(Color.MAGENTA);
                    System.out.println("4");
                    break;
                case 101:
                    btn5.setForeground(Color.red);
                    URL urlClick5 = PKPlayMusic.class.getResource("5.wav");
                    click1 = Applet.newAudioClip(urlClick5);
                    click1.play(); // play once
                    btn5.setBackground(Color.RED);
                    System.out.println("5");
                    break;
                case 102:
                    btn6.setForeground(Color.red);
                    URL urlClick6 = PKPlayMusic.class.getResource("6.wav");
                    click1 = Applet.newAudioClip(urlClick6);
                    click1.play(); // play once
                    btn6.setBackground(Color.CYAN);
                    System.out.println("6");
                    break;
                case KeyEvent.VK_SPACE:
                    btnbass.setForeground(Color.red);
                    URL urlClick7 = PKPlayMusic.class.getResource("bass.wav");
                    click1 = Applet.newAudioClip(urlClick7);
                    click1.play(); // play once
                    System.out.println("bass");
                    break;
                case KeyEvent.VK_Z:
                    btndrum.setForeground(Color.red);
                    URL urlClick8 = PKPlayMusic.class.getResource("drum.wav");
                    click1 = Applet.newAudioClip(urlClick8);
                    click1.play(); // play once
                    System.out.println("drum");
                    break;
                case KeyEvent.VK_X:
                    btnwall.setForeground(Color.red);
                    URL urlClick9 = PKPlayMusic.class.getResource("wall.wav");
                    click1 = Applet.newAudioClip(urlClick9);
                    click1.play(); // play once
                    System.out.println("wall");
                    break;
                case KeyEvent.VK_C:
                    btnTotsp.setForeground(Color.red);
                    URL urlClick10 = PKPlayMusic.class.getResource("Totsp.wav");
                    click1 = Applet.newAudioClip(urlClick10);
                    click1.play(); // play once
                    btnTotsp.setBackground(Color.RED);
                    System.out.println("Totsp");
                    break;
                case KeyEvent.VK_V:
                    btnGL.setForeground(Color.red);
                    URL urlClick11 = PKPlayMusic.class.getResource("GL.wav");
                    click1 = Applet.newAudioClip(urlClick11);
                    click1.play(); // play once
                    btnGL.setBackground(Color.RED);
                    System.out.println("GL");
                    break;
                case KeyEvent.VK_B:
                    btnTn.setForeground(Color.red);
                    URL urlClick12 = PKPlayMusic.class.getResource("Tn.wav");
                    click1 = Applet.newAudioClip(urlClick12);
                    click1.play(); // play once
                    btnTn.setBackground(Color.RED);
                    System.out.println("Tn");
                    break;

            } // end of switch()
        } // end of keyPressed

        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 97:
                   // URL urlClick1 = PKPlayMusic.class.getResource("1.wav");
                   // click1 = Applet.newAudioClip(urlClick1);
                   // click1.play(); // play once
                    btn1.setForeground(Color.green);
                    btn1.setBackground(Color.gray);
                    System.out.println("1");
                    break;
                case 98:
                   // URL urlClick2 = PKPlayMusic.class.getResource("2.wav");
                   // click1 = Applet.newAudioClip(urlClick2);
                   // click1.play(); // play once
                    btn2.setBackground(Color.gray);

                    System.out.println("2");
                    break;
                case 99:
                   // URL urlClick3 = PKPlayMusic.class.getResource("3.wav");
                   // click1 = Applet.newAudioClip(urlClick3);
                   // click1.play(); // play once
                    btn3.setBackground(Color.gray);
                    System.out.println("3");
                    break;
                case 100:
                    // URL urlClick4 = PKPlayMusic.class.getResource("4.wav");
                    // click1 = Applet.newAudioClip(urlClick4);
                    // click1.play(); // play once
                    btn4.setBackground(Color.gray);
                    System.out.println("4");
                    break;
                case 101:
                    // /URL urlClick5 = PKPlayMusic.class.getResource("5.wav");
                    // click1 = Applet.newAudioClip(urlClick5);
                    // click1.play(); // play once
                    btn5.setBackground(Color.gray);
                    System.out.println("5");
                    break;
                case 102:
                    // URL urlClick6 = PKPlayMusic.class.getResource("6.wav");
                    // click1 = Applet.newAudioClip(urlClick6);
                    // click1.play(); // play once
                    btn6.setBackground(Color.gray);
                    System.out.println("6");
                    break;
                case KeyEvent.VK_SPACE:
                    // URL urlClick7 = PKPlayMusic.class.getResource("bass.wav");
                    // click1 = Applet.newAudioClip(urlClick7);
                    // click1.play(); // play once
                    System.out.println("bass");
                    break;
                case KeyEvent.VK_Z:
                    // URL urlClick8 = PKPlayMusic.class.getResource("drum.wav");
                    // click1 = Applet.newAudioClip(urlClick8);
                    //  click1.play(); // play once
                    System.out.println("drum");
                    break;
                case KeyEvent.VK_X:
                   //  URL urlClick9 = PKPlayMusic.class.getResource("wall.wav");
                   //  click1 = Applet.newAudioClip(urlClick9);
                   //  click1.play(); // play once
                    System.out.println("wall");
                    break;

                case KeyEvent.VK_C:
                    System.out.println("Totsp");
                    btnTotsp.setBackground(Color.gray);
                    break;
                case KeyEvent.VK_V:
                    System.out.println("GL");
                    btnGL.setBackground(Color.gray);
                    break;
                case KeyEvent.VK_B:
                    System.out.println("Tn");
                    btnTn.setBackground(Color.gray);
                    break;
            } // end of switch()
        } // end of keyReleased


    } // end of CkeyMovec
}
