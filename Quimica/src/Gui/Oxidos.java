package Gui;

import data.Base;
import data.Elemento;
import data.Reaccion;
import java.sql.SQLException;



public class Oxidos extends javax.swing.JFrame {

    
    /**
     * Creates new form Oxidos
     */
    public Oxidos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbmetal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        res1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnmenu = new javax.swing.JButton();
        cbnometal = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 91, 627, 6);

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/serna/Documentos/quimica-master/Quimica/src/imagenesq/image3398.png")); // NOI18N
        jLabel1.setText("Oxidos");
        jLabel1.setFocusCycleRoot(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 12, 152, 49);

        jLabel2.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Basicos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 91, 89, 38);

        jSeparator2.setForeground(new java.awt.Color(76, 91, 180));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 372, 627, 32);

        cbmetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmetalActionPerformed(evt);
            }
        });
        getContentPane().add(cbmetal);
        cbmetal.setBounds(12, 199, 110, 27);

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Metal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 171, 91, 17);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(264, 115, 0, 0);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("+");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(134, 201, 10, 21);

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Oxigeno");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 204, 59, 17);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("=");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(215, 204, 20, 17);

        btn2.setText("Combinar");
        getContentPane().add(btn2);
        btn2.setBounds(12, 557, 375, 56);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(247, 194, 104, 38);

        jScrollPane1.setForeground(new java.awt.Color(30, 4, 4));

        res1.setColumns(20);
        res1.setRows(5);
        res1.setText("informacion:");
        jScrollPane1.setViewportView(res1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(397, 150, 203, 188);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 251, 251));
        jLabel8.setText("Acidos");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(12, 410, 58, 21);

        btnmenu.setIcon(new javax.swing.ImageIcon("/home/serna/Documentos/quimica-master/Quimica/src/imagenesq/flecharec.png")); // NOI18N
        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu);
        btnmenu.setBounds(490, 10, 110, 40);

        getContentPane().add(cbnometal);
        cbnometal.setBounds(12, 494, 110, 27);

        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("No Metal");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 466, 63, 17);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("+");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(134, 498, 10, 18);

        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Oxigeno");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 499, 59, 17);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("=");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(221, 498, 9, 18);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(248, 489, 104, 37);

        btn1.setText("Combinar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(12, 275, 347, 51);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("informacion:");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(399, 410, 203, 203);

        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("compuesto");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(247, 171, 79, 17);

        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("compuesto");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(248, 466, 79, 17);

        jLabel15.setFocusCycleRoot(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(12, 12, 0, 0);

        jLabel16.setIcon(new javax.swing.ImageIcon("/home/serna/Descargas/gwall.png")); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 630, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
 VentanaPricipal aux = new VentanaPricipal();
    aux.setVisible(true);
    this.setVisible(false);
                
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

    }//GEN-LAST:event_btn1ActionPerformed

    private void cbmetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmetalActionPerformed
        
    }//GEN-LAST:event_cbmetalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btnmenu;
    private javax.swing.JComboBox<String> cbmetal;
    private javax.swing.JComboBox<String> cbnometal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea res1;
    // End of variables declaration//GEN-END:variables
}
