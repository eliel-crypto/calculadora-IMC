package app;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CalculadoraIMC extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraIMC.class.getName());

    public CalculadoraIMC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alturaText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imcLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/calculadora de peso.png"))); // NOI18N

        jLabel2.setText("Peso");

        pesoText.addActionListener(this::pesoTextActionPerformed);

        jLabel3.setText("(kg)");

        jLabel4.setText("Altura");

        alturaText.addActionListener(this::alturaTextActionPerformed);

        jLabel5.setText("(cm)");

        jButton1.setLabel("Calcular estado");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        imcLabel.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        imcLabel.setText("--");

        jLabel6.setText("CALCULADORA DE PESO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(imcLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(imcLabel)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Double peso = Double.parseDouble(pesoText.getText());
        Double altura = Double.parseDouble(alturaText.getText());

        // Convierto altura de cm a m
        altura = altura / 100;

        double imc = peso / (altura * altura);

        imcLabel.setText(String.format("%.2f", imc));
        if (imc <= 18.5) {
            Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("bajo peso.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.BLUE);
            JOptionPane.showMessageDialog(null, "bajo peso", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 24.9) {
            Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("peso normal.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.GREEN);
            JOptionPane.showMessageDialog(null, "peso normal", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 29.9) {
             Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("sobrepeso.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.YELLOW);
            JOptionPane.showMessageDialog(null, "sobrepeso", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 34.9) {
             Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad I.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.ORANGE);
            JOptionPane.showMessageDialog(null, "obesidad I", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 39.9) {
            Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad II.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.RED);
            JOptionPane.showMessageDialog(null, "obesidad II", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 49.9) {
            Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad III.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.PINK);
            JOptionPane.showMessageDialog(null, "obesidad III", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc > 50) {
            Object colorFondoPanel = UIManager.get("OptionPane.background");
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad IV.png"));
            Object colorTextoOriginal = UIManager.get("OptionPane.messageForeground");
            UIManager.put("OptionPane.messageForeground", Color.BLACK);
            JOptionPane.showMessageDialog(null, "obesidad IV", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextActionPerformed

    }//GEN-LAST:event_pesoTextActionPerformed

    private void alturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CalculadoraIMC().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaText;
    private javax.swing.JLabel imcLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pesoText;
    // End of variables declaration//GEN-END:variables
}
