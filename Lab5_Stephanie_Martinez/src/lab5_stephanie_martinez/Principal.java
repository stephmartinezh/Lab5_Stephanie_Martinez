package lab5_stephanie_martinez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_empresa = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nombre_empresa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tipo_empresa = new javax.swing.JComboBox<>();
        fecha_empresa = new com.toedter.calendar.JDateChooser();
        pin_empresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ubicacion_empresa = new javax.swing.JTextArea();
        id_empresa = new javax.swing.JSpinner();
        datos_empresas = new javax.swing.JDialog();
        nombre_empresa_datos = new javax.swing.JTextField();
        id_empresa_datos = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        crear_empleados = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nombre_empleado = new javax.swing.JTextField();
        fecha_empleado = new com.toedter.calendar.JDateChooser();
        correo_empleado = new javax.swing.JTextField();
        cargo_empleado = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        menu = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        detalles = new javax.swing.JMenuItem();
        contratar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pin = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        crear_empresa.setTitle("Crear Empresa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Datos");

        jLabel5.setText("Nombre");

        jLabel6.setText("Tipo de empresa");

        jLabel7.setText("Fecha");

        jLabel8.setText("Ubicación");

        jLabel9.setText("ID sucursal");

        jButton3.setText("Aceptar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });

        jLabel10.setText("PIN de acceso");

        tipo_empresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micro", "Mediana ", "Gran" }));

        ubicacion_empresa.setColumns(20);
        ubicacion_empresa.setRows(5);
        jScrollPane1.setViewportView(ubicacion_empresa);

        id_empresa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout crear_empresaLayout = new javax.swing.GroupLayout(crear_empresa.getContentPane());
        crear_empresa.getContentPane().setLayout(crear_empresaLayout);
        crear_empresaLayout.setHorizontalGroup(
            crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_empresaLayout.createSequentialGroup()
                .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_empresaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre_empresa)
                            .addComponent(fecha_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pin_empresa)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(id_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(crear_empresaLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_empresaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(166, 166, 166))
        );
        crear_empresaLayout.setVerticalGroup(
            crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_empresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(crear_empresaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nombre_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tipo_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addComponent(fecha_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(crear_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pin_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jButton3)
                .addContainerGap())
        );

        datos_empresas.setTitle("Datos");

        nombre_empresa_datos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        id_empresa_datos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lista.setModel(new DefaultListModel());
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        jLabel11.setText("Lista Empleados");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empresas");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(arbol);

        jButton4.setText("Logout");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Crear Empleado");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout datos_empresasLayout = new javax.swing.GroupLayout(datos_empresas.getContentPane());
        datos_empresas.getContentPane().setLayout(datos_empresasLayout);
        datos_empresasLayout.setHorizontalGroup(
            datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_empresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datos_empresasLayout.createSequentialGroup()
                        .addComponent(nombre_empresa_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(id_empresa_datos))
                    .addGroup(datos_empresasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(datos_empresasLayout.createSequentialGroup()
                                .addGroup(datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jLabel11))
                                .addGap(0, 124, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datos_empresasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(57, 57, 57))
        );
        datos_empresasLayout.setVerticalGroup(
            datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datos_empresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_empresa_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_empresa_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(datos_empresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datos_empresasLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        crear_empleados.setTitle("Datos del empleado");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Datos");

        jLabel13.setText("Nombre Completo");

        jLabel14.setText("Fecha de nacimiento");

        jLabel15.setText("Correo electrónico");

        jLabel16.setText("Cargo");

        cargo_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero", "Medico", "Estudiante", "Licenciado", "Maestro" }));

        jButton6.setText("Aceptar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crear_empleadosLayout = new javax.swing.GroupLayout(crear_empleados.getContentPane());
        crear_empleados.getContentPane().setLayout(crear_empleadosLayout);
        crear_empleadosLayout.setHorizontalGroup(
            crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_empleadosLayout.createSequentialGroup()
                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crear_empleadosLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel12))
                    .addGroup(crear_empleadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crear_empleadosLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(correo_empleado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crear_empleadosLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(34, 34, 34)
                                .addComponent(cargo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, crear_empleadosLayout.createSequentialGroup()
                                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crear_empleadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(150, 150, 150))
        );
        crear_empleadosLayout.setVerticalGroup(
            crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crear_empleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(fecha_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(correo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(crear_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cargo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menu.add(eliminar);

        detalles.setText("Ver Detalles");
        detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesActionPerformed(evt);
            }
        });
        menu.add(detalles);

        contratar.setText("Contratar");
        contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarActionPerformed(evt);
            }
        });
        menu.add(contratar);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        menu.add(modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setText("ID de su empresa");

        jLabel3.setText("PIN de acceso");

        jButton1.setText("Entrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Crear Empresa");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(pin))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        crear_empresa.pack();
        crear_empresa.setModal(true);
        crear_empresa.setLocationRelativeTo(this);
        crear_empresa.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String tipo = (String) tipo_empresa.getSelectedItem();
        if (tipo.equalsIgnoreCase("micro")) {
            capital = 80000;
        }
        if (tipo.equalsIgnoreCase("mediana")) {
            capital = 120000;
        }
        if (tipo.equalsIgnoreCase("gran")) {
            capital = 169000;
        }
        String nombre = nombre_empresa.getText();
        int id1 = (int) id_empresa.getValue();
        id_g.add(id1);
        pin_g.add(nombre);
        nombre_empresa.setText("");
        fecha_empresa.setDate(new Date());
        tipo_empresa.setSelectedIndex(0);
        ubicacion_empresa.setText("");
        id_empresa.setValue(0);
        pin_empresa.setText("");
        nombre_empresa_datos.setText(nombre);
        id_empresa_datos.setText("ID " + id1);
        crear_empresa.setVisible(false);
        datos_empresas.pack();
        datos_empresas.setModal(true);
        datos_empresas.setLocationRelativeTo(this);
        datos_empresas.setVisible(true);
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo_persona;
        nodo_persona = new DefaultMutableTreeNode(new Empresa(nombre_empresa.getText(), capital, fecha_empresa.getDate(), ubicacion_empresa.getText(), (int) id_empresa.getValue(), pin_empresa.getText()));
        DefaultMutableTreeNode empresa;
        empresa = new DefaultMutableTreeNode(nombre_empresa.getText());
        nodo_persona.add(empresa);
        raiz.add(nodo_persona);
        m.reload();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        crear_empleados.pack();
        crear_empleados.setModal(true);
        crear_empleados.setLocationRelativeTo(this);
        crear_empleados.setVisible(true);
        //datos_empresas.setVisible(false);
        DefaultListModel modelo = (DefaultListModel) lista.getModel();
        String tipo = (String) cargo_empleado.getSelectedItem();
        if (tipo.equalsIgnoreCase("ingeniero")) {
            salario = 22000;
        }
        if (tipo.equalsIgnoreCase("Medico")) {
            salario = 18000;
        }
        if (tipo.equalsIgnoreCase("Estudiante")) {
            salario = 7600;
        }
        if (tipo.equalsIgnoreCase("Licenciado")) {
            salario = 12000;
        }
        if (tipo.equalsIgnoreCase("Maestro")) {
            salario = 2000;
        }
        modelo.addElement(new Empleado(nombre_empleado.getText(), fecha_empleado.getDate(), correo_empleado.getText(), (String) cargo_empleado.getSelectedItem(), salario));
        lista.setModel(modelo);
        nombre_empleado.setText("");
        fecha_empleado.setDate(new Date());
        correo_empleado.setText("");
        cargo_empleado.setSelectedIndex(0);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        datos_empresas.pack();
        datos_empresas.setModal(true);
        datos_empresas.setLocationRelativeTo(this);
        datos_empresas.setVisible(true);
        crear_empleados.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if (lista.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                menu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_listaMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (lista.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) lista.getModel();
            modelo.remove(lista.getSelectedIndex());
            lista.setModel(modelo);
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesActionPerformed
        if (lista.getSelectedIndex() >= 0) {
            JOptionPane.showMessageDialog(this, "Nombre: " + nombre_empleado.getText() + "\nFecha de nacimiento: " + fecha_empleado.getDate() + "\nCorreo electronico: " + correo_empleado.getText() + "\nCargo: " + (String) cargo_empleado.getSelectedItem());
        }
    }//GEN-LAST:event_detallesActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int condi = 0, condp = 0;
        int id_en = Integer.parseInt(id.getText());
        String pin_en = pin.getSelectedText();
        for (int i = 0; i < id_g.size(); i++) {
            if(id_g.get(i)== id_en){
                condi++;
            }
        }
        for (int i = 0; i < pin_g.size(); i++) {
            if(pin_g.get(i).equalsIgnoreCase(pin_en)){
                condp++;
            }
        }
        if(condi == 0 && condp==0){
            JOptionPane.showMessageDialog(this, "ID o PIN incorrecto");
        }else{
        datos_empresas.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       datos_empresas.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (lista.getSelectedIndex() >= 0) {
            DefaultListModel modeloLista = (DefaultListModel) lista.getModel();
            //modeloLista.get(lista.getSelectedIndex().setModificar());
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre");
            //(Persona) modeloLista.get(lista.getSelectedIndex()
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarActionPerformed
       /*if (lista.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) lista.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloArbol.getRoot();
            //obtener la pesonas a guardar
            DefaultListModel modeloLista = (DefaultListModel) lista.getModel();
            String nombre, ubicacion,p1;
            int id1;
            double cap;
            Date fecha;
            nombre = ((Empleado) modeloLista.getSelectedIndex()).getNombre();
            /*nacionalidad = ((Em) modeloLista.get(
                    jl_personas.getSelectedIndex())).getNacionalidad();
            nombre = ((Persona) modeloLista.get(
                    jl_personas.getSelectedIndex())).getNombre();
            edad = ((Persona) modeloLista.get(
                    jl_personas.getSelectedIndex())).getEdad();
            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(nombre)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Persona(nombre, edad, nacionalidad));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }
            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(nombre);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new Empleado(nombre, cap, fecha,ubicacion,id1,p1));
                n.add(p);
                raiz.add(n);
            }
            modeloArbol.reload();
        } else {
            JOptionPane.showMessageDialog(this, "No hay persona seleccionada");
        }*/
    }//GEN-LAST:event_contratarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JComboBox<String> cargo_empleado;
    private javax.swing.JMenuItem contratar;
    private javax.swing.JTextField correo_empleado;
    private javax.swing.JDialog crear_empleados;
    private javax.swing.JDialog crear_empresa;
    private javax.swing.JDialog datos_empresas;
    private javax.swing.JMenuItem detalles;
    private javax.swing.JMenuItem eliminar;
    private com.toedter.calendar.JDateChooser fecha_empleado;
    private com.toedter.calendar.JDateChooser fecha_empresa;
    private javax.swing.JTextField id;
    private javax.swing.JSpinner id_empresa;
    private javax.swing.JTextField id_empresa_datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JTextField nombre_empleado;
    private javax.swing.JTextField nombre_empresa;
    private javax.swing.JTextField nombre_empresa_datos;
    private javax.swing.JPasswordField pin;
    private javax.swing.JTextField pin_empresa;
    private javax.swing.JComboBox<String> tipo_empresa;
    private javax.swing.JTextArea ubicacion_empresa;
    // End of variables declaration//GEN-END:variables
double capital;
    int salario;
    ArrayList<Integer> id_g = new ArrayList();
    ArrayList<String> pin_g = new ArrayList();
}
