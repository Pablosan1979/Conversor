/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Conversor;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author santa
 */
public class Moneda extends javax.swing.JFrame {

    private Object resultado;

    /**
     * Creates new form Inicio
     */
    public Moneda() {        
        initComponents();
        this.setTitle("Conversor de Unidades");
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/Logo.jpg"));
        this.setIconImage(img);
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
    }
        double convertirMonedas(double cantidad, String monedaOrigen, String monedaDestino) {
        
        switch (monedaOrigen) {
            case "Dólares" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 1;
                    }
                    case "Euros" -> {
                        return cantidad * 0.90;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 0.77;
                    }
                    case "Pesos" -> {
                        return cantidad * 4141;
                    }
                    case "Won" -> {
                        return cantidad * 1273.36;
                    }
                    case "Yenes" -> {
                        return cantidad * 138.47;
                    }
                }
            }
            case "Euros" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 1.11;
                    }
                    case "Euros" -> {
                        return cantidad * 1;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 0.86;
                    }
                    case "Pesos" -> {
                        return cantidad * 4609.37;
                    }
                    case "Won" -> {
                        return cantidad * 1419.11;
                    }
                    case "Yenes" -> {
                        return cantidad * 154.22;
                    }
                }
            }

            case "Libras Esterlinas" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 1.30;
                    }
                    case "Euros" -> {
                        return cantidad * 1.17;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 1;
                    }
                    case "Pesos" -> {
                        return cantidad * 5378.68;
                    }
                    case "Won" -> {
                        return cantidad * 1655.68;
                    }
                    case "Yenes" -> {
                        return cantidad * 179.95;
                    }
                }
            }

            case "Pesos" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 0.00024;
                    }
                    case "Euros" -> {
                        return cantidad * 0.00022;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 0.00019;
                    }
                    case "Pesos" -> {
                        return cantidad * 1;
                    }
                    case "Won" -> {
                        return cantidad * 0.31;
                    }
                    case "Yenes" -> {
                        return cantidad * 0.033;
                    }
                }
            }

            case "Won" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 0.00078;
                    }
                    case "Euros" -> {
                        return cantidad * 0.00070;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 0.00060;
                    }
                    case "Pesos" -> {
                        return cantidad * 3.25;
                    }
                    case "Won" -> {
                        return cantidad * 1;
                    }
                    case "Yenes" -> {
                        return cantidad * 0.11;
                    }
                }
            }
            case "Yenes" -> {
                switch (monedaDestino) {
                    case "Dolares" -> {
                        return cantidad * 0.0072;
                    }
                    case "Euros" -> {
                        return cantidad * 0.0065;
                    }
                    case "Libras Esterlinas" -> {
                        return cantidad * 0.0056;
                    }
                    case "Pesos" -> {
                        return cantidad * 29.89;
                    }
                    case "Won" -> {
                        return cantidad * 9.20;
                    }
                    case "Yenes" -> {
                        return cantidad * 1;
                    }
                }
            }
        }

        return 0.0;
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
        lblTitulo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        SelectorOrigen = new javax.swing.JComboBox<>();
        SelectorDestino = new javax.swing.JComboBox<>();
        txtValorIngresado = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnResultado = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblCantidadAConvertir = new javax.swing.JLabel();
        lblMonedaOrigen = new javax.swing.JLabel();
        lblMonedaDestino = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("Principal"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setFont(new java.awt.Font("Lato Black", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Conversor de Monedas");
        lblTitulo.setMaximumSize(new java.awt.Dimension(380, 60));
        lblTitulo.setMinimumSize(new java.awt.Dimension(380, 60));
        lblTitulo.setPreferredSize(new java.awt.Dimension(380, 60));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(180, 60));
        lblLogo.setMinimumSize(new java.awt.Dimension(180, 60));
        lblLogo.setPreferredSize(new java.awt.Dimension(180, 60));

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setMaximumSize(new java.awt.Dimension(50, 75));
        btnSalir.setMinimumSize(new java.awt.Dimension(50, 75));
        btnSalir.setPreferredSize(new java.awt.Dimension(50, 75));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        SelectorOrigen.setBackground(new java.awt.Color(0, 204, 204));
        SelectorOrigen.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        SelectorOrigen.setForeground(new java.awt.Color(102, 102, 102));
        SelectorOrigen.setMaximumRowCount(50);
        SelectorOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos COP", "Dolares", "Euros", "Libras Esterlinas", "Won Surcoreano", "Yen Japones" }));
        SelectorOrigen.setMinimumSize(new java.awt.Dimension(150, 40));
        SelectorOrigen.setPreferredSize(new java.awt.Dimension(150, 40));
        SelectorOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorOrigenActionPerformed(evt);
            }
        });

        SelectorDestino.setBackground(new java.awt.Color(0, 204, 204));
        SelectorDestino.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        SelectorDestino.setForeground(new java.awt.Color(102, 102, 102));
        SelectorDestino.setMaximumRowCount(50);
        SelectorDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos COP", "Dolares", "Euros", "Libras Esterlinas", "Won Surcoreano", "Yen Japones" }));
        SelectorDestino.setMinimumSize(new java.awt.Dimension(150, 40));
        SelectorDestino.setPreferredSize(new java.awt.Dimension(150, 40));
        SelectorDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorDestinoActionPerformed(evt);
            }
        });

        txtValorIngresado.setBackground(new java.awt.Color(0, 204, 204));
        txtValorIngresado.setFont(new java.awt.Font("Anton", 0, 14)); // NOI18N
        txtValorIngresado.setForeground(new java.awt.Color(102, 102, 102));
        txtValorIngresado.setMinimumSize(new java.awt.Dimension(120, 40));
        txtValorIngresado.setPreferredSize(new java.awt.Dimension(120, 40));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(0, 204, 204));
        txtResultado.setFont(new java.awt.Font("Anton", 0, 14)); // NOI18N
        txtResultado.setMinimumSize(new java.awt.Dimension(150, 40));
        txtResultado.setPreferredSize(new java.awt.Dimension(150, 40));
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(0, 153, 153));
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/igual.png"))); // NOI18N
        btnResultado.setBorderPainted(false);
        btnResultado.setContentAreaFilled(false);
        btnResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResultado.setMaximumSize(new java.awt.Dimension(75, 75));
        btnResultado.setMinimumSize(new java.awt.Dimension(75, 75));
        btnResultado.setPreferredSize(new java.awt.Dimension(75, 75));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 204, 204));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrador.png"))); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setMaximumSize(new java.awt.Dimension(75, 75));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(75, 75));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(75, 75));
        btnLimpiar.setRolloverEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblCantidadAConvertir.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblCantidadAConvertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadAConvertir.setText("Cantidad a convertir");
        lblCantidadAConvertir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblMonedaOrigen.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblMonedaOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonedaOrigen.setText("Moneda Origen");
        lblMonedaOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblMonedaDestino.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblMonedaDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonedaDestino.setText("Moneda Destino");
        lblMonedaDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblResultado.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");
        lblResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCantidadAConvertir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorIngresado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonedaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SelectorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonedaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCantidadAConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMonedaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblMonedaDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectorOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectorDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/regreso.png"));
        this.setIconImage(img);
        btnSalir.setIcon(new ImageIcon(img.getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        
        Inicio newFrame = new Inicio();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void SelectorOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorOrigenActionPerformed
        String[] monedas = {"Dólares", "Euros", "Libras Esterlinas", "Pesos COP", "Won", "Yenes"};
        SelectorOrigen = new JComboBox<>(monedas);
    }//GEN-LAST:event_SelectorOrigenActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/Imagenes/igual.png"));
        this.setIconImage(img);
        btnResultado.setIcon(new ImageIcon(img.getScaledInstance(btnResultado.getWidth(), btnResultado.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        JButton btnResultado = new JButton();
        btnResultado.addActionListener(SelectorOrigen);        
        txtResultado.setText(String.format(String.valueOf(txtResultado.equals(resultado))));        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void SelectorDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorDestinoActionPerformed
        String[] monedas = {"Dólares", "Euros", "Libras Esterlinas", "Pesos COP", "Won", "Yenes"};
        SelectorDestino = new JComboBox<>(monedas);           
    }//GEN-LAST:event_SelectorDestinoActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        txtResultado = new JTextField();
        
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtResultado.setText(null);
       txtValorIngresado.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(btnResultado)) {
            // Obtener la cantidad y las monedas seleccionadas
            double cantidad = Double.parseDouble(txtValorIngresado.getText());
            String monedaOrigen = (String) SelectorOrigen.getSelectedItem();
            String monedaDestino = (String) SelectorDestino.getSelectedItem();

            // Realizar la conversión
            double resultado = convertirMonedas(cantidad, monedaOrigen, monedaDestino);

            // Mostrar el resultado en el área de texto
            //txtResultado.setText(String.format(monedaDestino));
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        new Moneda();
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelectorDestino;
    private javax.swing.JComboBox<String> SelectorOrigen;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidadAConvertir;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMonedaDestino;
    private javax.swing.JLabel lblMonedaOrigen;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorIngresado;
    // End of variables declaration//GEN-END:variables
}
