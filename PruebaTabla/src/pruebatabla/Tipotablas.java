package pruebatabla;
import com.component.tabla.Tabla2;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel Vasquez
 */
public class Tipotablas extends JFrame
{
       Tabla2  tabla = new Tabla2(); 
       public JComboBox tipos;
       private String nombres []={"Peliculas","Obras de teatro","Productos","Lugares","Museos"};
      public Tipotablas()
      {
           setSize( 435,185 );
           setLocation( 300, 20 );
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setVisible(true);
           setResizable(false);
           getContentPane().setLayout(null);
           setTitle("Seleccion de Tablas");
          tipos= new JComboBox(nombres);
          tipos.setBounds(12,17,300,20);
          getContentPane().add(tipos);
          setSize( 435,185 );
          tabla.setVisible(true);
      }
     
}
