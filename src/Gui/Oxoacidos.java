/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.Base;
import data.Elemento;
import data.Reaccion;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author tobias
 */
public class Oxoacidos extends javax.swing.JFrame {

    /**
     * Creates new form Oxoacidos
     */
    public Oxoacidos() {
        initComponents();
        DefaultComboBoxModel nometal = new DefaultComboBoxModel();
        for (Elemento i : Base.getTodosNoMetales()) {
            if (!i.getNombre().equals("Oxigeno") && !i.getNombre().equals("Hidrogeno")) {
                nometal.addElement(i);
            }
        }
        this.cbnometales.setModel(nometal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cbnometales = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        res = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        states = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hidrogeno(H)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 155, 96, 18);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 62, 812, 10);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Oxigeno(O)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(315, 155, 82, 18);

        cbnometales.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbnometalesItemStateChanged(evt);
            }
        });
        getContentPane().add(cbnometales);
        cbnometales.setBounds(168, 151, 106, 27);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("+");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(141, 155, 16, 18);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("+");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(286, 155, 23, 18);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("=");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(404, 155, 16, 18);

        btn.setText("Combinar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn);
        btn.setBounds(28, 192, 492, 60);

        res.setEditable(false);
        getContentPane().add(res);
        res.setBounds(427, 144, 94, 42);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("informacion:");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 260, 490, 90);

        jLabel13.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesq/image3398.png"))); // NOI18N
        jLabel13.setText("Oxoacidos");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(12, 12, 149, 49);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesq/flecharec.png"))); // NOI18N
        jToggleButton1.setText("Menu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(410, 10, 110, 42);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(133, 78, 0, 0);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("No metales");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(168, 120, 80, 18);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("compuesto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(427, 120, 79, 18);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        states.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesActionPerformed(evt);
            }
        });
        getContentPane().add(states);
        states.setBounds(250, 120, 50, 27);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesq/fondo-con-ilustraciones-de-molculas_23-2147491176.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 560, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        VentanaPricipal aux = new VentanaPricipal();
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        ComboBoxModel<Elemento> modelo = this.cbnometales.getModel();
        Elemento ele = modelo.getElementAt(this.cbnometales.getSelectedIndex());
        ele.setEstado_used(ele.getEstados().indexOf(this.states.getModel().getSelectedItem()));
        Reaccion r = new Reaccion(ele, Reaccion.ACIDO_OXACIDO);
        System.out.println(r.getCompuesto().getNom());
        this.res.setText(r.getCompuesto().getNom());      
    }//GEN-LAST:event_btnActionPerformed

    private void statesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statesActionPerformed

    private void cbnometalesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbnometalesItemStateChanged
        boolean flag = false;
        DefaultComboBoxModel estados = new DefaultComboBoxModel();
        ComboBoxModel<Elemento> modelo = this.cbnometales.getModel();
        Elemento ele = modelo.getElementAt(this.cbnometales.getSelectedIndex());
        for (int i : ele.getEstados()) {
            if (i > 0) {
                flag = true;
                estados.addElement(i);
            }
        }
        if (flag) {
            btn.setEnabled(true);
        } else {
            btn.setEnabled(false);
        }
        this.states.setModel(estados);
    }//GEN-LAST:event_cbnometalesItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JComboBox<Elemento> cbnometales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField res;
    private javax.swing.JComboBox<Integer> states;
    // End of variables declaration//GEN-END:variables
}
