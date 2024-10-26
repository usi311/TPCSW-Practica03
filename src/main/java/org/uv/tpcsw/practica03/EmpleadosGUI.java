package org.uv.tpcsw.practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmpleadosGUI extends javax.swing.JInternalFrame {

  DefaultTableModel modelo = new DefaultTableModel();
private Map<Long, String> departamentosMap = new HashMap<>();

    public EmpleadosGUI() {
      jComboBox1 = new javax.swing.JComboBox<>();
      initComponents();
cargarDepartamentos(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btoGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btonBtodos = new javax.swing.JButton();
        btonBid = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(1600, 1400));

        jLabel1.setText("CLAVE");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("DIRECCION");

        jLabel4.setText("TELEFONO");

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Direccion", "Telefono", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btonBtodos.setText("Buscar Todos");
        btonBtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBtodosActionPerformed(evt);
            }
        });

        btonBid.setText("Buscar ID");
        btonBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonBidActionPerformed(evt);
            }
        });

        jBdelete.setText("Delete");
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new Departamento[]{}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btonBtodos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btonBid, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono))
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox1, 0, 277, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btonBtodos, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(btonBid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
  
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
      DAOEmpleado dao = new DAOEmpleado();

    // Obtener los valores ingresados en los campos de texto
    String clave = txtClave.getText();
    String nombre = txtNombre.getText();
    String direccion = txtDireccion.getText();
    String telefono = txtTelefono.getText();

    // Validar que los campos no estén vacíos
    if (clave.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

    // Obtener el departamento seleccionado del JComboBox
    Departamento departamentoSeleccionado = (Departamento) jComboBox1.getSelectedItem();

    if (departamentoSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "Seleccione un departamento válido.");
        return;
    }

    // Crear el objeto Empleado
    Empleado empleado = new Empleado();
    empleado.setClave(Long.parseLong(clave));
    empleado.setNombre(nombre);
    empleado.setDireccion(direccion);
    empleado.setTelefono(telefono);
    empleado.setDepto(departamentoSeleccionado);  // Asociar el departamento

    // Guardar el empleado en la base de datos
    boolean guardado = dao.save(empleado);

   if (guardado) {
    JOptionPane.showMessageDialog(null, "Empleado guardado exitosamente.", 
                                  "Confirmación", JOptionPane.INFORMATION_MESSAGE);
} else {
    JOptionPane.showMessageDialog(null, "Error al guardar el empleado.", 
                                  "Error", JOptionPane.ERROR_MESSAGE);
}
    // Limpiar los campos
    txtClave.setText("");
    txtNombre.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    jComboBox1.setSelectedIndex(0); 
    }//GEN-LAST:event_btoGuardarActionPerformed

private void cargarDepartamentos() {
      jComboBox1.removeAllItems();  // Limpiar las opciones
 jComboBox1.addItem(new Departamento(0L, "Seleccionar Departamento"));
    DAODepartamento daoDepartamento = new DAODepartamento();
    List<Departamento> departamentos = daoDepartamento.findAll();

    if (departamentos != null && !departamentos.isEmpty()) {
        for (Departamento dep : departamentos) {
            jComboBox1.addItem(dep);  // Agregar objeto completo al JComboBox
        }
        JOptionPane.showMessageDialog(this, "Departamentos cargados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron departamentos.");
    }

}


    private void btonBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBtodosActionPerformed
    DAOEmpleado dao = new DAOEmpleado();
    List<Empleado> empleados = dao.findAll();

    if (empleados != null && !empleados.isEmpty()) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Empleado emp : empleados) {
            Object[] fila = new Object[5];
            fila[0] = emp.getClave();
            fila[1] = emp.getNombre();
            fila[2] = emp.getDireccion();
            fila[3] = emp.getTelefono();

            // Verificar si el departamento es null para evitar NullPointerException
            if (emp.getDepto() != null) {
                fila[4] = emp.getDepto().getNombre();
            } else {
                fila[4] = "Sin departamento";
            }

            model.addRow(fila);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron empleados.");
    }
        
    }//GEN-LAST:event_btonBtodosActionPerformed





    private void btonBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBidActionPerformed
    DAOEmpleado dao = new DAOEmpleado();
    
    String clave = txtClave.getText();
    
    if(clave.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa una clave");
        return;
    }
    
    Empleado empleado = dao.findById(Long.parseLong(clave));
    
    if (empleado != null) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        Object[] fila = new Object[5];
        fila[0] = empleado.getClave();
        fila[1] = empleado.getNombre();
        fila[2] = empleado.getDireccion();
        fila[3] = empleado.getTelefono();
        fila[4] = empleado.getDepto().getNombre();
        model.addRow(fila);
    } else {
        JOptionPane.showMessageDialog(this, "Empleado no encontrado");
    }

    }//GEN-LAST:event_btonBidActionPerformed

    private void jBdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeleteActionPerformed
     DAOEmpleado dao = new DAOEmpleado();
    
    String clave = txtClave.getText();
    
    if (clave.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa la clave del empleado a eliminar.");
        return;
    }
    try {
        Long claveLong = Long.parseLong(clave); 
        boolean eliminado = dao.delete(claveLong);
        
       if (eliminado) {
    JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.", 
                                  "Confirmación", JOptionPane.INFORMATION_MESSAGE);
} else {
    JOptionPane.showMessageDialog(null, "Empleado no encontrado.", 
                                  "Error", JOptionPane.ERROR_MESSAGE);
}

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.");
    }
    }//GEN-LAST:event_jBdeleteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btonBid;
    private javax.swing.JButton btonBtodos;
    private javax.swing.JButton jBdelete;
    private javax.swing.JComboBox<Departamento> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
