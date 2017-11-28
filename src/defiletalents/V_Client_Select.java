package defiletalents;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import methodesVerif.Verify;

/**
 * Classe permettant de selectionner un client.
 * @author giraudeaup
 */
public class V_Client_Select extends javax.swing.JDialog
{

    /**
     * Parent appelant cette vue.
     */
    private JFrame parent;
    /**
     * Controleur de l'appli.
     */
    private Controller controller;
    /**
     * Tableau d'entiers représentant les identifiants correspondants à la liste de client.
     */
    private int[] idClients;

    /**
     * Constructeur de la vue.
     * @param controller 
     */
    public V_Client_Select(Controller controller)
    {
        this.controller = controller;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        listClient = new javax.swing.JList<>();
        btValider = new javax.swing.JButton();
        btFermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clients");
        setModal(true);
        setResizable(false);

        listClient.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listClient.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                listClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listClient);

        btValider.setText("Valider");
        btValider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btValiderActionPerformed(evt);
            }
        });

        btFermer.setText("Fermer");
        btFermer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btValider, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValider)
                    .addComponent(btFermer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Méthode utilisée lorsque l'on double clique sur un client dans la liste. Retourne le résultat au parent.
     * @param evt 
     */
    private void listClientMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_listClientMouseClicked
    {//GEN-HEADEREND:event_listClientMouseClicked
        if (evt.getClickCount() == 2)
        {
            ((V_Achat_Edit) parent).setVisible(true, idClients[listClient.getSelectedIndex()]);
            setVisible(false);
        }
    }//GEN-LAST:event_listClientMouseClicked

    /**
     * Méthode utilisée lorsque l'on appuie sur le bouton 'Fermer'.
     * @param evt 
     */
    private void btFermerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btFermerActionPerformed
    {//GEN-HEADEREND:event_btFermerActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btFermerActionPerformed

    /**
     * Méthode utilisée lorsque l'on appuies sur le bouton 'Valider'. Retourne le résultat au parent.
     * @param evt 
     */
    private void btValiderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btValiderActionPerformed
    {//GEN-HEADEREND:event_btValiderActionPerformed
        if (listClient.getSelectedIndex() != -1)
        {
            ((V_Achat_Edit) parent).setVisible(true, idClients[listClient.getSelectedIndex()]);
            setVisible(false);
        }
    }//GEN-LAST:event_btValiderActionPerformed

    /**
     * Surcharge de la méthode setVisible(boolean b).
     * @param b 
     */
    @Override
    public void setVisible(boolean b)
    {
        if (b)
        {
            setLocationRelativeTo(parent);
            setClients();
        }

        super.setVisible(b);
    }

    /**
     * Met à jour la liste de clients utilisé par la vue.
     */
    private void setClients()
    {
        DefaultListModel model = new DefaultListModel();
        CopyOnWriteArrayList<M_Client> clients = Verify.trierClients(controller.getClients());
        idClients = new int[clients.size()];
        int i = 0;

        for (M_Client c : clients)
        {
            model.addElement(c.getNom() + " " + c.getPrenom() + ", " + c.getLieuDit() + " " + c.getCodePostal());
            idClients[i] = c.getId();
            i++;
        }
        listClient.setModel(model);
    }

    /**
     * Valorise le parent appelant cette vue.
     * @param parent 
     */
    public void setValues(JFrame parent)
    {
        this.parent = parent;
    }

    /**
     * Retourne le client selectionné par l'utilisateur ou -1 si aucun n'est selectionné.
     * @return 
     */
    public int getSelectedClient()
    {
        return (listClient.getSelectedIndex() != -1 ? idClients[listClient.getSelectedIndex()] : -1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFermer;
    private javax.swing.JButton btValider;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listClient;
    // End of variables declaration//GEN-END:variables
}
