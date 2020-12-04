package dsw.rudok.gui.swing.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Flow;

public class AboutDialog extends JDialog {

    private final JLabel  name1;
    private BufferedImage image;


    public AboutDialog() throws IOException {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/4, screenHeight/4 +100);

        JPanel contentPanel = new JPanel();

        Border padding = BorderFactory.createEmptyBorder(25, 25, 25, 25);
        contentPanel.setBorder(padding);
        setContentPane(contentPanel);

        FlowLayout flow = new FlowLayout();

        setLayout(flow);
        name1 = new JLabel("Aleksa Paunović RN 81/2019");
        add(name1);

        image = ImageIO.read(new File("DSW2020-tim_aleksapaunovic_reljajovanovic/res/about/About.png"));
        JLabel label = new JLabel(new ImageIcon(image));
        add(label);

        setTitle("About");
        setLocationRelativeTo(null);


    }
}
