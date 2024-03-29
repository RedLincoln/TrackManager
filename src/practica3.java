
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;


public class practica3 extends javax.swing.JFrame {
    
    private static final Color[] colors = {Color.WHITE, 
        Color.BLACK, Color.YELLOW, Color.BLUE, Color.RED};
    private static final String[] colorsCB = {"Blanco", "Negro", "Amarillo",
                                              "Azul", "Rojo"};
    
    
    /**
     * Creates new form practica3
     */
    public practica3() {
        initComponents();
        this.setTitle("Track manager");
        fondoCB.setModel(new DefaultComboBoxModel<>(colorsCB));
        lapizCB.setModel(new DefaultComboBoxModel<>(colorsCB));
        lapizCB.setSelectedIndex(1);
        setupGrosorSL();
        setupTamañoSL();
        this.pack();
    }
    
    private void setupGrosorSL (){
        grosorSL.setMinimum(5);
        grosorSL.setMaximum(30);
        grosorSL.setValue(10);
        grosorSL.setMajorTickSpacing(5);
        grosorSL.setPaintLabels(true);
        grosorSL.setPaintTicks(true);
        grosorTF.setToolTipText("Valor entero entre 5 y 30");
    }
    
    private void setupTamañoSL (){
        tamañoSL.setMinimum(1);
        tamañoSL.setMaximum(51);
        tamañoSL.setValue(5);
        tamañoSL.setMajorTickSpacing(10);
        tamañoSL.setPaintLabels(true);
        tamañoSL.setPaintTicks(true);
        tamañoTF.setToolTipText("Valor entero entre 1 y 51");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondoCB = new javax.swing.JComboBox<>();
        lapizCB = new javax.swing.JComboBox<>();
        fondoLa = new javax.swing.JLabel();
        colorLa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        grosorSL = new javax.swing.JSlider();
        grosorTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tamañoSL = new javax.swing.JSlider();
        tamañoTF = new javax.swing.JTextField();
        canvas = new Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        fondoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fondoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoCBActionPerformed(evt);
            }
        });

        lapizCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lapizCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizCBActionPerformed(evt);
            }
        });

        fondoLa.setText("Color Fondo :");

        colorLa.setText("Color Lapiz :");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grosor"));

        grosorSL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                grosorSLStateChanged(evt);
            }
        });

        grosorTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grosorTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grosorSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(grosorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(grosorSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(grosorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño de estela"));

        tamañoSL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tamañoSLStateChanged(evt);
            }
        });

        tamañoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tamañoTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tamañoSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(tamañoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tamañoSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tamañoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fondoLa)
                        .addGap(27, 27, 27)
                        .addComponent(fondoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorLa)
                        .addGap(18, 18, 18)
                        .addComponent(lapizCB, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fondoLa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fondoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLa)
                    .addComponent(lapizCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        canvas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvasMouseDragged(evt);
            }
        });
        canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                canvasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                canvasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fondoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoCBActionPerformed
        int index = fondoCB.getSelectedIndex();
        canvas.setColorFondo(colors[index]);
        repaint();
    }//GEN-LAST:event_fondoCBActionPerformed

    private void lapizCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizCBActionPerformed
        int index = lapizCB.getSelectedIndex();
        canvas.setColorLapiz(colors[index]);
        repaint();
    }//GEN-LAST:event_lapizCBActionPerformed

    private void canvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseDragged
        canvas.add(evt.getPoint());
        repaint();
    }//GEN-LAST:event_canvasMouseDragged

    private void canvasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseExited
        canvas.clear();
        repaint();
    }//GEN-LAST:event_canvasMouseExited

    private void canvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseReleased
        canvas.clear();
        repaint();
    }//GEN-LAST:event_canvasMouseReleased

    private void canvasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseEntered
        
    }//GEN-LAST:event_canvasMouseEntered

    private void grosorSLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_grosorSLStateChanged
        canvas.setGrosor(grosorSL.getValue());
        grosorTF.setBackground(Color.WHITE);
        grosorTF.setText(grosorSL.getValue()+"");
    }//GEN-LAST:event_grosorSLStateChanged

    private void tamañoSLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tamañoSLStateChanged
        canvas.setSize(tamañoSL.getValue());
        tamañoTF.setBackground(Color.WHITE);
        tamañoTF.setText(tamañoSL.getValue()+"");
    }//GEN-LAST:event_tamañoSLStateChanged

    private void grosorTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grosorTFKeyReleased
        grosorTF.setBackground(Color.WHITE);
        Integer value = checkInput(grosorTF.getText(), grosorSL.getMinimum(), grosorSL.getMaximum());
        if (value == null)
            grosorTF.setBackground(Color.RED);
        else
            grosorSL.setValue(value);
    }//GEN-LAST:event_grosorTFKeyReleased

    private void tamañoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamañoTFKeyReleased
        tamañoTF.setBackground(Color.WHITE);
        Integer value = checkInput(tamañoTF.getText(), tamañoSL.getMinimum(), tamañoSL.getMaximum());
        if (value == null)
            tamañoTF.setBackground(Color.RED);
        else
            tamañoSL.setValue(value);
    }//GEN-LAST:event_tamañoTFKeyReleased
    
    private Integer checkInput(String value, int minimum, int maximum) {
        Integer result = null;
        try {
            result = Integer.parseInt(value);
            if (!(result >= minimum && result <= maximum)) result = null;
        }catch(NumberFormatException nfe){ }
        return result;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Lienzo canvas;
    private javax.swing.JLabel colorLa;
    private javax.swing.JComboBox<String> fondoCB;
    private javax.swing.JLabel fondoLa;
    private javax.swing.JSlider grosorSL;
    private javax.swing.JTextField grosorTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> lapizCB;
    private javax.swing.JSlider tamañoSL;
    private javax.swing.JTextField tamañoTF;
    // End of variables declaration//GEN-END:variables

}
