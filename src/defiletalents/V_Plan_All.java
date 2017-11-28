package defiletalents;

import javax.swing.table.DefaultTableModel;

/**
 * Classe permettant de gérer la vue relative à la table tal_plan.
 *
 * @author giraudeaup
 */
public class V_Plan_All extends javax.swing.JFrame {

    /**
     * Controleur de l'appli.
     */
    private Controller controller;

    /**
     * Constructeur de la vue.
     *
     * @param controller
     */
    public V_Plan_All(Controller controller) {
        this.controller = controller;
        initComponents();
        setTitle("Paramètres > Plan");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlan = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        tablePlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Libelle", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePlan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablePlan);
        if (tablePlan.getColumnModel().getColumnCount() > 0) {
            tablePlan.getColumnModel().getColumn(0).setMinWidth(0);
            tablePlan.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablePlan.getColumnModel().getColumn(0).setMaxWidth(0);
            tablePlan.getColumnModel().getColumn(1).setMinWidth(160);
            tablePlan.getColumnModel().getColumn(1).setPreferredWidth(160);
            tablePlan.getColumnModel().getColumn(1).setMaxWidth(160);
        }

        btAdd.setText("Ajouter...");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setText("Modifier...");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDel.setText("Supprimer...");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btClose.setText("Fermer");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                .addContainerGap())
        );

        setBounds(0, 0, 650, 510);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Fermer'.
     *
     * @param evt
     */
    private void btCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCloseActionPerformed
    {//GEN-HEADEREND:event_btCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCloseActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Ajouter'.
     *
     * @param evt
     */
    private void btAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btAddActionPerformed
    {//GEN-HEADEREND:event_btAddActionPerformed
        controller.getPlanEditFrame(V_Main.MODE_AJOUT).setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Modifier'.
     *
     * @param evt
     */
    private void btEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btEditActionPerformed
    {//GEN-HEADEREND:event_btEditActionPerformed
        if (tablePlan.getSelectedRow() != -1) {
            controller.getPlanEditFrame((int) tablePlan.getValueAt(tablePlan.getSelectedRow(), 0), V_Main.MODE_EDITION).setVisible(true);
        }
    }//GEN-LAST:event_btEditActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Supprimer'.
     *
     * @param evt
     */
    private void btDelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btDelActionPerformed
    {//GEN-HEADEREND:event_btDelActionPerformed
        if (tablePlan.getSelectedRow() != -1) {
            controller.getDeleteConfirmFrame("plan", String.valueOf((int) tablePlan.getValueAt(tablePlan.getSelectedRow(), 0))).setVisible(true);
        }
    }//GEN-LAST:event_btDelActionPerformed

    /**
     * Surcharge de la méthode setVisible(boolean b).
     *
     * @param b
     */
    @Override
    public void setVisible(boolean b) {
        if (b) {
            setLocationRelativeTo(controller.getMainFrame());
            setTable();
        }

        super.setVisible(b);
    }

    /**
     * Met à jour le tableau utilisé par la vue.
     */
    private void setTable() {
        DefaultTableModel model = (DefaultTableModel) tablePlan.getModel();
        int size = controller.getPlans().size();
        int i = 0;

        model.setRowCount(size);

        for (M_Plan p : controller.getPlans()) {
            model.setValueAt(p.getId(), i, 0);
            model.setValueAt(p.getLibelle(), i, 1);
            model.setValueAt(p.getImage(), i, 2);
            i++;
        }
        tablePlan.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePlan;
    // End of variables declaration//GEN-END:variables
}
