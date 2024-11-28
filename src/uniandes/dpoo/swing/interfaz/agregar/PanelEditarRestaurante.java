package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3, 2, 5, 5));
		
        // Crea el campo para el nombre con una etiqueta al frente
    	 JLabel etiquetaNombre = new JLabel("Nombre:");
    	    txtNombre = new JTextField(20);
    	  
        // Crea el selector para la calificación con una etiqueta al frente
    	    JLabel lblCalificacion = new JLabel("Calificación:");
    	    cbbCalificacion = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
    	    
    	    
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
    	    JLabel lblVisitado = new JLabel("Visitado:");
    	    cbbVisitado = new JComboBox<>(new String[]{"Sí", "No"});
    	   

        // Agregar todos los elementos al panel
    	    add(etiquetaNombre);
    	    add(txtNombre);
    	    add(lblCalificacion);
    	    add(cbbCalificacion);
    	    add(lblVisitado);
    	    add(cbbVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	return cbbVisitado.getSelectedItem().equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	return txtNombre.getText().trim();
    }
}