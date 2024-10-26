package org.uv.tpcsw.practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DepartamentosGUI extends javax.swing.JInternalFrame {



    public DepartamentosGUI() {
      initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btoGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btonBtodos = new javax.swing.JButton();
        btonBid = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("CLAVE");

        jLabel2.setText("NOMBRE");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        btoGuardar.setText("Guardar");
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Clave", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btonBtodos.setText("Buscar ID");
        btonBtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBtodosActionPerformed(evt);
            }
        });

        btonBid.setText("Buscar Todos");
        btonBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBidActionPerformed(evt);
            }
        });

        jBDelete.setText("Delete");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btonBid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btonBtodos, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jBDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btonBtodos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btonBid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
   DAODepartamento daoDepartamento = new DAODepartamento();
    
  
    String clave = txtClave.getText();
    String nombre = txtNombre.getText();

    if (clave.isEmpty() || nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }


    Departamento departamento = new Departamento();
    departamento.setClave(Long.parseLong(clave));
    departamento.setNombre(nombre);

    
    boolean guardado = daoDepartamento.save(departamento);

    if (guardado) {
        JOptionPane.showMessageDialog(this, "Departamento guardado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al guardar el departamento.");
    }


    txtClave.setText("");
    txtNombre.setText("");
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void cargarDepartamentos() {
    DAODepartamento daoDepartamento = new DAODepartamento();
    List<Departamento> departamentos = daoDepartamento.findAll();

    if (departamentos != null && !departamentos.isEmpty()) {
     
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Departamento dep : departamentos) {
            Object[] fila = new Object[2];
            fila[0] = dep.getClave();
            fila[1] = dep.getNombre();
            model.addRow(fila);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron departamentos.");
    }
}


    private void btonBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBtodosActionPerformed
       DAODepartamento daoDepartamento = new DAODepartamento();
    
    String clave = txtClave.getText();

    if (clave.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa una clave.");
        return;
    }

    Departamento departamento = daoDepartamento.findById(Long.parseLong(clave));

    if (departamento != null) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); 
      
        Object[] fila = new Object[2];
        fila[0] = departamento.getClave();
        fila[1] = departamento.getNombre();
        model.addRow(fila);
    } else {
        JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
    }
    }//GEN-LAST:event_btonBtodosActionPerformed

 
    private void btonBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBidActionPerformed
     cargarDepartamentos();
    }//GEN-LAST:event_btonBidActionPerformed

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
    DAODepartamento daoDepartamento = new DAODepartamento();
    
    String clave = txtClave.getText();

    if (clave.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa la clave del departamento a eliminar.");
        return;
    }

    try {
        Long claveLong = Long.parseLong(clave);

        boolean eliminado = daoDepartamento.delete(claveLong);

        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Departamento eliminado exitosamente.");
            cargarDepartamentos(); 
        } else {
            JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.");
    }
    }//GEN-LAST:event_jBDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btonBid;
    private javax.swing.JButton btonBtodos;
    private javax.swing.JButton jBDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
