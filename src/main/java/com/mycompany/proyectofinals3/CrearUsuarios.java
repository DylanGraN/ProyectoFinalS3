/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinals3;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class CrearUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuarios
     */
    public CrearUsuarios() {
        initComponents();
    }

    public static boolean claveSegura(String password) {

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracterS = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {

                mayuscula = true;

            } else if (Character.isLowerCase(c)) {

                minuscula = true;

            } else if (Character.isDigit(c)) {

                numero = true;

            } else {

                caracterS = true;

            }

        }

        return mayuscula && minuscula && numero && caracterS;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsuarioTextField = new javax.swing.JTextField();
        crearButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ApellidoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Creacion de Alumno");

        jLabel2.setText("Carne:");

        jLabel3.setText("Password:");

        crearButton.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido:");

        ApellidoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ApellidoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(UsuarioTextField)
                            .addComponent(NombreTextField)
                            .addComponent(jTextField1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearButton)
                    .addComponent(jButton1))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        // TODO add your handling code here:
        String usuario = UsuarioTextField.getText();
        String password = jTextField1.getText();
        String nombre = NombreTextField.getText();
        String apellido = ApellidoTextField.getText();

        if (UsuarioTextField.getText().equals("") || jTextField1.getText().equals("")
                || NombreTextField.getText().equals("")|| ApellidoTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "llene todo los campos");

        } else {

            if (usuario.length() >= 8) {

                if (claveSegura(password)) {
                    Usuario usuarioNuevo = new Usuario();
                    usuarioNuevo.setUsuario(usuario);
                    usuarioNuevo.setPassword(password);
                    usuarioNuevo.setApellido(apellido);
                    usuarioNuevo.setNombre(nombre);

                    ProyectoFinalS3.usuarios.add(usuarioNuevo);

                    UsuarioTextField.setText("");
                    jTextField1.setText("");
                    NombreTextField.setText("");
                    ApellidoTextField.setText("");
                    JOptionPane.showMessageDialog(this, "Usuario Creado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(this, "la contraseña al menos una mayúscula, una minúscula, un número y un carácter especial");

                }

            } else {
                JOptionPane.showMessageDialog(this, "el carne debe tener almenos 8 caracteres");
                UsuarioTextField.setText("");
            }
        }

    }//GEN-LAST:event_crearButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Administrador admin = new Administrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ApellidoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTextField;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JTextField UsuarioTextField;
    private javax.swing.JButton crearButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
