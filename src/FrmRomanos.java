import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrmRomanos extends JFrame {

    // metodo constructor
    public FrmRomanos() {
        setSize(300, 200);
        setTitle("Conversión Romanos");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblArabigo = new JLabel("Número arábigo");
        lblArabigo.setBounds(10, 10, 100, 25);
        getContentPane().add(lblArabigo);

        JTextField txtArabigo = new JTextField();
        txtArabigo.setBounds(110, 10, 100, 25);
        getContentPane().add(txtArabigo);

        JButton btnCalcular = new JButton("Convertir");
        btnCalcular.setBounds(10, 40, 100, 25);
        getContentPane().add(btnCalcular);

        JTextField txtRomano = new JTextField();
        txtRomano.setBounds(110, 40, 100, 25);
        txtRomano.setEnabled(false);
        getContentPane().add(txtRomano);

        btnCalcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                convertirARomano();
            }

        });
    }

    private void convertirARomano() {

    }

}
