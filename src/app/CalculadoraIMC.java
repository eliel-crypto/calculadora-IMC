package app;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/weight_fat_body_overweight_unhealthy_obesity_diet_health_belly_icon_133507.png"))); // NOI18N

        jLabel2.setText("Peso");

        pesoText.addActionListener(this::pesoTextActionPerformed);

        jLabel3.setText("(kg)");

        jLabel4.setText("Altura");

        jLabel5.setText("(cm)");

        jButton1.setText(":: Calcular ::");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        imcLabel.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        imcLabel.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesoText, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(alturaText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imcLabel)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imcLabel)
                        .addGap(26, 26, 26)))
                .addComponent(jButton1)
                .addGap(29, 29, 29))
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
            JOptionPane.showMessageDialog(rootPane, "bajo peso");
        } else if (imc <= 24.9) {
            JOptionPane.showMessageDialog(rootPane, "peso normal");
        }else if (imc <= 29.9) {
            JOptionPane.showMessageDialog(rootPane, "sobrepeso");
        }else if (imc <= 34.9) {
            JOptionPane.showMessageDialog(rootPane, "obesidad I");
        }else if (imc <= 39.9) {
            JOptionPane.showMessageDialog(rootPane, "obesidad II");
        }else if (imc <= 49.9) {
            JOptionPane.showMessageDialog(rootPane, "obesidad III");
        }else if(imc > 50) {
            JOptionPane.showMessageDialog(rootPane, "obesidad IV");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void pesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextActionPerformed

    }//GEN-LAST:event_pesoTextActionPerformed

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
    private javax.swing.JTextField pesoText;
    // End of variables declaration//GEN-END:variables
}
