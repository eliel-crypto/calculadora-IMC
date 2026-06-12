package app;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/weight_fat_body_overweight_unhealthy_obesity_diet_health_belly_icon_133507.png"))); // NOI18N

        jLabel2.setText("Peso");

        pesoText.addActionListener(this::pesoTextActionPerformed);

        jLabel3.setText("(kg)");

        jLabel4.setText("Altura");

        alturaText.addActionListener(this::alturaTextActionPerformed);

        jLabel5.setText("(cm)");

        jButton1.setText(":: Calcular ::");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        imcLabel.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        imcLabel.setText("--");

        jTextField1.setText("CALCULADORA DE PESO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(imcLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(imcLabel)
                        .addGap(51, 51, 51))))
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
            ImageIcon icono = new ImageIcon(getClass().getResource("bajo peso.png"));
            JOptionPane.showMessageDialog(null, "bajo peso", "", JOptionPane.INFORMATION_MESSAGE, icono);
        } else if (imc <= 24.9) {
            ImageIcon icono = new ImageIcon(getClass().getResource("peso normal.png"));
            JOptionPane.showMessageDialog(null, "peso normal", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }else if (imc <= 29.9) {
            ImageIcon icono = new ImageIcon(getClass().getResource("sobrepeso.png"));
            JOptionPane.showMessageDialog(null, "sobrepeso", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }else if (imc <= 34.9) {
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad I.png"));
            JOptionPane.showMessageDialog(null, "obesidad I", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }else if (imc <= 39.9) {
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad II.png"));
            JOptionPane.showMessageDialog(null, "obesidad II", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }else if (imc <= 49.9) {
            ImageIcon icono = new ImageIcon(getClass().getResource("obesidad III.png"));
            JOptionPane.showMessageDialog(null, "obesidad III", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }else if(imc > 50) {
             ImageIcon icono = new ImageIcon(getClass().getResource("obesidad IV.png"));
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pesoText;
    // End of variables declaration//GEN-END:variables
}
