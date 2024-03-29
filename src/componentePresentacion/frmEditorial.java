/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentePresentacion;
import componenteEntidad.Editorial;
import componenteNegocio.EditorialCN;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Enrique
 */
public class frmEditorial extends javax.swing.JInternalFrame {
    boolean reg;
    int pmod;
    /**
     * Creates new form frmEditorial
     */
    public frmEditorial() {
        initComponents();
//        setLocation(300,150);
        controles(true);
        textos(false);
    }
    
    void limpiarTextos(){
        this.jTxtIdEditorial.setText("");
        this.jTxtDescr.setText("");
    }

    void controles(boolean sw){
        jBtnNuevo.setEnabled(sw);
        jBtnGrabar.setEnabled(!sw);
        jBtnCancelar.setEnabled(!sw);
//        btnBuscar.setEnabled(sw);
//        btnEliminar.setEnabled(sw);
//        btnMostrar.setEnabled(sw);
        jBtnModificar.setEnabled(sw);
    }

    void textos(boolean sw)
    {
//        jTxtIdDocumento.setEditable(!sw);
        jTxtDescr.setEditable(sw);
    }
    
    public void convertiraMayusculasEnJtextfield(javax.swing.JTextField jTextfieldS, int pos) {
        String cadena = (jTextfieldS.getText()).toUpperCase();
        jTextfieldS.setText(cadena);
        jTextfieldS.setCaretPosition(pos);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtIdEditorial = new javax.swing.JTextField();
        jTxtDescr = new javax.swing.JTextField();
        jBtnNuevo = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnGrabar = new javax.swing.JButton();
        jBtnCerrar = new javax.swing.JButton();

        setTitle("Maestro Editorial");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo:");

        jLabel2.setText("Descripción:");

        jTxtIdEditorial.setEditable(false);

        jTxtDescr.setInheritsPopupMenu(true);
        jTxtDescr.setName(""); // NOI18N
        jTxtDescr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtDescrKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtDescrKeyTyped(evt);
            }
        });

        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentePresentacion/png/document_spacing.png"))); // NOI18N
        jBtnNuevo.setText("Nuevo");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentePresentacion/png/cancel.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentePresentacion/png/pencil_go.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentePresentacion/png/disk.png"))); // NOI18N
        jBtnGrabar.setText("Grabar");
        jBtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnNuevo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBtnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtDescr)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNuevo)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnGrabar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentePresentacion/png/door_out.png"))); // NOI18N
        jBtnCerrar.setText("Cerrar");
        jBtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCerrar)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtDescrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDescrKeyReleased
        int pos = jTxtDescr.getCaretPosition();
        convertiraMayusculasEnJtextfield(jTxtDescr, pos);
    }//GEN-LAST:event_jTxtDescrKeyReleased

    private void jTxtDescrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtDescrKeyTyped
        char car = evt.getKeyChar();
        if(jTxtDescr.getText().length()>=40) evt.consume();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTxtDescrKeyTyped

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        reg=true;
        textos(true);
        limpiarTextos();
        controles(false);
        try {
            this.jTxtIdEditorial.setText(EditorialCN.getInstancia().generaCodigo());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        this.jTxtDescr.requestFocus();
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        limpiarTextos();
        textos(false);
        controles(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        String idEditorial;
        limpiarTextos();
        idEditorial=JOptionPane.showInputDialog("IdEditorial a Modificar : ");
        Editorial x;
        try {
            x = EditorialCN.getInstancia().buscarEditorial(idEditorial);
            if(x!=null) {
                this.jTxtIdEditorial.setText(x.getIdeditorial());
                this.jTxtDescr.setText(x.getDescr());
                reg=false;
                textos(true);
                //                txtIdCliente.setEditable(false);
                controles(false);
            } else
            JOptionPane.showMessageDialog(null,"El IdEditorial no existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGrabarActionPerformed
        String idgenero,descr;
        if(this.jTxtIdEditorial.getText().compareTo("")!=0 && this.jTxtDescr.getText().compareTo("")!=0 ) {
            idgenero=this.jTxtIdEditorial.getText();
            descr=this.jTxtDescr.getText();

            if(reg) {
                try {
                    EditorialCN.getInstancia().insertar(idgenero, descr);
                    JOptionPane.showMessageDialog(null,"Dato registrado");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            } else {
                try {
                    EditorialCN.getInstancia().actualizar(idgenero, descr);
                    JOptionPane.showMessageDialog(null,"Dato modificado");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
            limpiarTextos();
            textos(false);
            controles(true);
        } else
        JOptionPane.showMessageDialog(null,"faltan llenar datos");
    }//GEN-LAST:event_jBtnGrabarActionPerformed

    private void jBtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnCerrar;
    private javax.swing.JButton jBtnGrabar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtDescr;
    private javax.swing.JTextField jTxtIdEditorial;
    // End of variables declaration//GEN-END:variables
}
