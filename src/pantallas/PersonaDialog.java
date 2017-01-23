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
        //btnCancelar.addActionListener(l);

        pnlActions = new JPanel();
        pnlActions.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlActions.setBackground(Color.CYAN);
        pnlActions.add(btnAceptar);
        pnlActions.add(btnCancelar);

        super.add(pnlActions, BorderLayout.SOUTH);
        super.add(pnlEncabezado, BorderLayout.NORTH);
    }
    public void setListener(PersonaDialogListener listener) {
        this.listener = listener;
    }
        
    protected abstract Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException;
}
