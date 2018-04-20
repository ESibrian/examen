
package exaPrac2;

import javax.swing.JOptionPane;

public class ExamenTarde {
    public static void main(String[] args) {
        int opcion=0;
        int cantidad=0;
        int seguir;
        
        String[] producto= new String[100];
        double[] cant= new double[100];
        double[] precio= new double[100];
        int bandera = 0;
         
         do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opcion:\n"+
        "\n1---Agregar Producto"+
        "\n2---Calcular Total"+
        "\n3---Salir"
        ));
        
                
        if(opcion==1){
            
            cantidad =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de productos a ingresar:"));
             
              if(cantidad<=100)
              {
              for (int i = bandera; i < cantidad+bandera; i++) {
                  producto[i]=JOptionPane.showInputDialog("Ingrese el nombre del producto: "+i);
                  cant[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad: "+i));
                  precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "+i));
                  
            }
              bandera += cantidad;
              }
             
            
        } 
        
        
        
        if(opcion==2){
            if(bandera!=0){
                    for (int j = 0; j < 100; j++) {
                        
                        double iva;
                        double sumcant;
                        
                        sumcant=cant[j]*precio[j];
                        iva=sumcant*0.13+sumcant;
                        
                        if(precio[j] != 0){
                        JOptionPane.showMessageDialog(null,"Producto: "+producto[j]
                        +"\nCantidad: "+cant[j]
                        +"\nPrecio: $"+precio[j]
                        +"\nTotal sin IVA: $"+sumcant
                        +"\nTotal con IVA incluido: $"+iva+"\n");
                        }
                    }
            }else{
            JOptionPane.showMessageDialog(null, "No hay PRODUCTOS");
            
            }
           
                      
        }
        if(opcion==3){
        System.exit(0);
        }
        seguir=JOptionPane.showConfirmDialog(null, "Desea repetir el proceso?","Continuar",JOptionPane.YES_NO_OPTION);
        }while(seguir==JOptionPane.YES_OPTION);
    }
}
