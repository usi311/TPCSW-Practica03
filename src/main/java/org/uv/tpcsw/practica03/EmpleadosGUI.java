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
        jComboBox1 = new javax.swing.JComboBox<>();
        jBdelete = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("Clave");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Telefono");

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Direccion", "Telefono"
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jBdelete.setText("Delete");
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btonBid)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtTelefono)))
                            .addComponent(btonBtodos)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jBdelete)
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btoGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btoGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBdelete))
                        .addGap(27, 27, 27)
                        .addComponent(btonBtodos)
                        .addGap(18, 18, 18)
                        .addComponent(btonBid))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
  
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
    DAOEmpleado dao = new DAOEmpleado();
    DAODepartamento daoDepartamento = new DAODepartamento();  
    
  
    String clave = txtClave.getText();
    String nombre = txtNombre.getText();
    String direccion = txtDireccion.getText();
    String telefono = txtTelefono.getText();

  
    if (clave.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
        return;
    }

   
    String nombreDepartamento = (String) jComboBox1.getSelectedItem();

 
    Long departamentoId = departamentosMap.entrySet().stream()
            .filter(entry -> entry.getValue().equals(nombreDepartamento))
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

   
    if (departamentoId == null) {
        JOptionPane.showMessageDialog(this, "Seleccione un departamento válido.");
        return;
    }


    Departamento departamento = daoDepartamento.findById(departamentoId);


    if (departamento == null) {
        JOptionPane.showMessageDialog(this, "El departamento seleccionado no existe.");
        return;
    }

   
    Empleado empleado = new Empleado();
    empleado.setClave(Long.parseLong(clave));
    empleado.setNombre(nombre);
    empleado.setDireccion(direccion);
    empleado.setTelefono(telefono);
    empleado.setDepto(departamento);  

  
    boolean guardado = dao.save(empleado);

    if (guardado) {
        JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al guardar el empleado.");
    }


    txtClave.setText("");
    txtNombre.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    jComboBox1.setSelectedIndex(0);  
       
    }//GEN-LAST:event_btoGuardarActionPerformed

private void cargarDepartamentos() {
    jComboBox1.removeAllItems();  

    departamentosMap.put(1L, "Administracion");
    departamentosMap.put(2L, "Finanzas");
    departamentosMap.put(3L, "Pepes");

    for (String nombre : departamentosMap.values()) {
        jComboBox1.addItem(nombre);
    }

    JOptionPane.showMessageDialog(this, "Departamentos cargados correctamente.");
}


    private void btonBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonBtodosActionPerformed
        DAOEmpleado dao = new DAOEmpleado();
    
 
    List<Empleado> empleados = dao.findAll();
    
    if (empleados != null) {
 
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
      
        for (Empleado emp : empleados) {
            Object[] fila = new Object[4];
            fila[0] = emp.getClave();
            fila[1] = emp.getNombre();
            fila[2] = emp.getDireccion();
            fila[3] = emp.getTelefono();
            model.addRow(fila);
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron empleados");
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
        
        Object[] fila = new Object[4];
        fila[0] = empleado.getClave();
        fila[1] = empleado.getNombre();
        fila[2] = empleado.getDireccion();
        fila[3] = empleado.getTelefono();
        model.addRow(fila);
    } else {
        JOptionPane.showMessageDialog(this, "Empleado no encontrado");
    }

    }//GEN-LAST:event_btonBidActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.");
            btonBtodosActionPerformed(evt); 
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La clave debe ser un número válido.");
    }
    }//GEN-LAST:event_jBdeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoGuardar;
    private javax.swing.JButton btonBid;
    private javax.swing.JButton btonBtodos;
    private javax.swing.JButton jBdelete;
    private javax.swing.JComboBox<String> jComboBox1;
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
