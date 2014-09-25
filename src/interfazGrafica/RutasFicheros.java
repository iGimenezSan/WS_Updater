/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

/**
 *
 * @author iGimenezSan
 */
public class RutasFicheros extends javax.swing.JInternalFrame {

    /**
     * Creates new form RutasURL
     */
    public RutasFicheros() {
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

        title_seccion1 = new javax.swing.JLabel();
        fieldname_products = new javax.swing.JLabel();
        textfield_products = new javax.swing.JTextField();
        fieldname_latest = new javax.swing.JLabel();
        textfield_latest = new javax.swing.JTextField();
        fieldname_offers = new javax.swing.JLabel();
        textfield_offers = new javax.swing.JTextField();
        fieldname_stock = new javax.swing.JLabel();
        textfield_stock = new javax.swing.JTextField();
        fieldname_noStock = new javax.swing.JLabel();
        textfield_noStock = new javax.swing.JTextField();
        fieldname_expired = new javax.swing.JLabel();
        textfield_expired = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Rutas a Ficheros");

        title_seccion1.setText("Rutas a los ficheros CSV de descarga de datos");

        fieldname_products.setText("Lista Completa de Productos");

        textfield_products.setText("http://media.grutinet.com/ficheros/productos_sin_dvd.csv");

        fieldname_latest.setText("Lista de Novedades");

        textfield_latest.setText("http://media.grutinet.com/ficheros/productos_csv_novedades.csv");
        textfield_latest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_latestActionPerformed(evt);
            }
        });

        fieldname_offers.setText("Lista de Ofertas");

        textfield_offers.setText("http://media.grutinet.com/ficheros/productos_csv_ofertas.csv");

        fieldname_stock.setText("Stock Actual de Productos");

        textfield_stock.setText("http://media.grutinet.com/ficheros/productos_stock.csv");

        fieldname_noStock.setText("Productos sin Stock");

        textfield_noStock.setText("http://media.grutinet.com/ficheros/productos_csv_sin_stock.csv");

        fieldname_expired.setText("Productos Descatalogados");

        textfield_expired.setText("http://media.grutinet.com/ficheros/productos_csv_descatalogados.csv");
        textfield_expired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield_expiredActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldname_products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldname_latest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldname_offers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldname_stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldname_noStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldname_expired, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textfield_noStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_stock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_offers, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_latest, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_products, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_expired, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                    .addComponent(title_seccion1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_seccion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_products)
                    .addComponent(textfield_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_latest)
                    .addComponent(textfield_latest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_offers)
                    .addComponent(textfield_offers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_stock)
                    .addComponent(textfield_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_noStock)
                    .addComponent(textfield_noStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldname_expired)
                    .addComponent(textfield_expired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfield_latestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_latestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_latestActionPerformed

    private void textfield_expiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield_expiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield_expiredActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fieldname_expired;
    private javax.swing.JLabel fieldname_latest;
    private javax.swing.JLabel fieldname_noStock;
    private javax.swing.JLabel fieldname_offers;
    private javax.swing.JLabel fieldname_products;
    private javax.swing.JLabel fieldname_stock;
    private javax.swing.JTextField textfield_expired;
    private javax.swing.JTextField textfield_latest;
    private javax.swing.JTextField textfield_noStock;
    private javax.swing.JTextField textfield_offers;
    private javax.swing.JTextField textfield_products;
    private javax.swing.JTextField textfield_stock;
    private javax.swing.JLabel title_seccion1;
    // End of variables declaration//GEN-END:variables
}