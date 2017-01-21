/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Listeners.PersonaDialogListener;
import Modelo.Persona;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luis_Od
 */
abstract class PersonaDialog extends JDialog{
    private JPanel pnlActions;
    private JButton btnCancelar;
    private JButton btnAceptar;
    private JPanel pnlEncabezado;
    private JLabel txtTitulo;

    private PersonaDialogListener listener;
    
    private JPanel pnlElementos;
    private JLabel lblRFC;
    private JTextField edtRFC;
    
    public PersonaDialog(JFrame frame) {
        super(frame, true);
        super.setSize(600, 400);
        super.setLayout(new BorderLayout());

        txtTitulo = new JLabel("Inscripcion");

        pnlEncabezado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlEncabezado.setBackground(Color.ORANGE);
        pnlEncabezado.add(txtTitulo);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Persona persona = crearObjeto();
                    listener.aceptarButtonClick(persona);
                    setVisible(false);
                } catch (IntervalosfechaException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "La fecha de inscripcion debe ser menor al inicio de operaciones",
                            "Error en las Fechas",
                            JOptionPane.ERROR_MESSAGE);
                } catch (PersonaFisicaException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "La persona debe ser mayor de edad para inscribirse",
                            "Estas chavo, chavo !",
                            JOptionPane.WARNING_MESSAGE);                }

            }
        });

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });

        pnlActions = new JPanel();
        pnlActions.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlActions.setBackground(Color.CYAN);
        pnlActions.add(btnAceptar);
        pnlActions.add(btnCancelar);
        
        lblRFC = new JLabel("R.F.C.: ");
        lblRFC.setBounds(50, 50, 60, 20);
        edtRFC = new JTextField(20);
        edtRFC.setBounds(100, 50, 100, 20);
        
        pnlElementos = new JPanel();
        pnlElementos.setBackground(Color.yellow);
        pnlElementos.setLayout(null);//definir posiciones fijas
        
        pnlElementos.add(lblRFC);
        pnlElementos.add(edtRFC);

        super.add(pnlActions, BorderLayout.SOUTH);
        super.add(pnlEncabezado, BorderLayout.NORTH);
        super.add(pnlElementos,BorderLayout.CENTER);
    }
    public void setListener(PersonaDialogListener listener) {
        this.listener = listener;
    }
        
    protected abstract Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException;
}
