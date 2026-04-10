package pekan8_2511532009;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tugas8_2511532009 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtBil1;
    private JTextField txtBil2;
    private JTextField txtHasil;

    private void pesanPeringatan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

    private void pesanEror(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Eror", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tugas8_2511532009 frame = new Tugas8_2511532009();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Tugas8_2511532009() {
        setResizable(false);
        setTitle("Operator Aritmatika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 379, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblJudul = new JLabel("Operator Assignment");
        lblJudul.setFont(new Font("Roboto", Font.BOLD, 12));
        lblJudul.setBounds(120, 10, 129, 20);
        contentPane.add(lblJudul);

        JLabel lblBil1 = new JLabel("Bilangan 1");
        lblBil1.setBounds(10, 60, 87, 20);
        contentPane.add(lblBil1);

        JLabel lblBil2 = new JLabel("Bilangan 2");
        lblBil2.setBounds(10, 96, 87, 20);
        contentPane.add(lblBil2);

        JLabel lblOperator = new JLabel("Operator");
        lblOperator.setBounds(10, 136, 87, 20);
        contentPane.add(lblOperator);

        JLabel lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(10, 172, 87, 20);
        contentPane.add(lblHasil);

        txtBil1 = new JTextField();
        txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil1.setBounds(96, 61, 60, 18);
        contentPane.add(txtBil1);
        txtBil1.setColumns(10);

        txtBil2 = new JTextField();
        txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil2.setColumns(10);
        txtBil2.setBounds(96, 97, 60, 18);
        contentPane.add(txtBil2);

        JComboBox cbOperator = new JComboBox();
        cbOperator.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/", "%" }));
        cbOperator.setBounds(96, 136, 60, 20);
        contentPane.add(cbOperator);

        txtHasil = new JTextField();
        txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
        txtHasil.setEditable(false);
        txtHasil.setColumns(10);
        txtHasil.setBounds(96, 173, 60, 18);
        contentPane.add(txtHasil);

        JButton btnProses = new JButton("Proses");
        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Validasi input kosong
                if (txtBil1.getText().trim().isEmpty()) {
                    pesanPeringatan("Silahkan isi bilangan 1 terlebih dahulu");
                    return;
                }
                if (txtBil2.getText().trim().isEmpty()) {
                    pesanPeringatan("Silahkan isi bilangan 2 terlebih dahulu");
                    return;
                }

                int c = cbOperator.getSelectedIndex(); // operator yang dipilih

                // Validasi pembagian dan modulus tidak boleh b = 0
                if ((c == 3 || c == 4) && txtBil2.getText().trim().equals("0")) {
                    pesanPeringatan("Bilangan 2 tidak boleh 0 untuk operasi / atau %");
                    return;
                }

                try {
                    int a = Integer.parseInt(txtBil1.getText());
                    int b = Integer.parseInt(txtBil2.getText());
                    int hasil = 0;

                    // OPERASI ASSIGNMENT
                    if (c == 0) {
                        hasil = a += b;
                    } else if (c == 1) {
                        hasil = a -= b;
                    } else if (c == 2) {
                        hasil = a *= b;
                    } else if (c == 3) {
                        hasil = a /= b;
                    } else if (c == 4) {
                        hasil = a %= b;
                    }

                    // Tampilkan ke hasil
                    txtHasil.setText(String.valueOf(hasil));

                    // HASIL MENJADI BILANGAN 1
                    txtBil1.setText(String.valueOf(hasil));

                    // Kosongkan bilangan 2 agar siap input baru
                    txtBil2.setText("");

                } catch (NumberFormatException ex) {
                    pesanEror("Bilangan 1 dan Bilangan 2 harus angka!");
                }
            }
        });

        btnProses.setBounds(211, 117, 84, 20);
        contentPane.add(btnProses);
    }
}
