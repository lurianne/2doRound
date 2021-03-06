/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControlInterfaz;
import javax.swing.JOptionPane;

/**
 *
 * @author lurianne
 */
public class VacacionEmpleado extends javax.swing.JFrame implements InterfazVista{

    /**
     * Creates new form VacacionEmpleado
     */
    public VacacionEmpleado() {
        init();
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
        jCi = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDiasDisponibles = new javax.swing.JLabel();
        jOtorgar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario de vacacion");

        jLabel1.setText("CI:");

        jBuscar.setText("Buscar");

        jLabel2.setText("Dias disponibles:");

        jDiasDisponibles.setText("0");

        jOtorgar.setText("Otorgar Vacacion");
        jOtorgar.setEnabled(false);

        jSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDiasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jOtorgar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDiasDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOtorgar)
                    .addComponent(jSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jCi;
    private javax.swing.JLabel jDiasDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jOtorgar;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControlador(ControlInterfaz c) {
        jBuscar.addActionListener(c);
        jOtorgar.addActionListener(c);
        jSalir.addActionListener(c);
    }

    @Override
    public void init() {
        initComponents();
        jBuscar.setActionCommand(BUSCARDIASVACACION);
        jOtorgar.setActionCommand(OTORGARVACACION);
        jSalir.setActionCommand(SALIRVENTANAVACACION);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public int getCi()
    {
        return Integer.parseInt(jCi.getText().trim());
    }
    public void mostrarDias(int dias)
    {
        jDiasDisponibles.setText(dias+"");
    }

    public void noExisteCi() {
        JOptionPane.showMessageDialog(this,"No existe este ci","Mensaje",JOptionPane.ERROR_MESSAGE);
    }

    public void antiguedadInsuficiente() {
        JOptionPane.showMessageDialog(this,"No cuenta con antiguedad suficiente","Mensaje",JOptionPane.ERROR_MESSAGE);
    }

    public void noVacacion() {
        JOptionPane.showMessageDialog(this,"No cuenta con dias disponibles","Mensaje",JOptionPane.ERROR_MESSAGE);
    }
    public void habilitarVacacion()
    {
        System.out.println("habilita");
        jOtorgar.setEnabled(true);
    }
    public void deshabilitarVacacion()
    {
        jOtorgar.setEnabled(false);
    }
    public int pedirDias()
    {
        String a= (String) JOptionPane.showInputDialog(this,"Escriba el numero de dias deseados","Mensaje",JOptionPane.PLAIN_MESSAGE);
        if(a==null)
            return 0;
        return Integer.parseInt(a);
    }

    public int getDiasDisponibles() {
        return Integer.parseInt(jDiasDisponibles.getText());
    }
    public void errorDias()
    {
        JOptionPane.showMessageDialog(this,"Esta pidiendo mas dias de los que tiene disponibles","Mensaje",JOptionPane.ERROR_MESSAGE);    
    }

    public void exito() {
        JOptionPane.showMessageDialog(this,"Vacacion Registrada","Mensaje",JOptionPane.OK_OPTION);
    }
    public void limpiar()
    {
        jCi.setText("");
        jDiasDisponibles.setText("0");
        
    }
}
