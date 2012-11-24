/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatabla;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Jorge
 */
public class ComLogin 
{
    String [] login;
    String [] pass;
    char[] p;
    boolean ban=false;
    
    public ComLogin()
    {
        login = new String [5];
        pass = new String [5];
        
        
        String ruta="Miembros.txt";
        BufferedReader a=cargaAr(ruta);  
        int opc=0;
        int i=0;
        String l=leeAr(a);
        String[] datosLee;
        while(l!=null)
        {
            datosLee=l.split(",");
            l=leeAr(a);
            login[i]= datosLee[0];
            pass[i] = datosLee[1];
            i++;
            opc++;
        }
    }
    
    public boolean compUser(String user,String pas)
    {   ban = false;
        for(int i=0;i<5;i++)
        {
            if((user.equals(login[i]))&&(pas.equals(pass[i])))
            {
                ban = true;
            }
        }
        return ban;
    }
    
    
    
    
    
    
    
    
    public static BufferedReader cargaAr(String nombre)
    {   BufferedReader a=null;	 
        try
        {   
            a = new BufferedReader(new FileReader(nombre));
        }
        catch (FileNotFoundException e)
        {   
            System.out.println("el archivo no existe");
            System.exit(0);
        }
        return a;
    } 
 
    public static  String leeAr(BufferedReader d)
    {
        String linea = "";
        try
        {   
            linea =d.readLine();
        }
        catch (IOException e)
        {
          System.out.println("I/O Error");
            System.exit(0);
        }
        String data; 
        if((linea != null))
        {
            data = linea;
            return data; 
        }
        else
        {
            return null;
        }
    }
}
