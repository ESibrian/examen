package exaprac2;

public class Examen {
    public static void main(String[] args) {
        
       int op=0;
        int cantidad=0;
        int seguir;
         
        String[] producto= new String[100];
        double[] cant= new double[100];
        double[] precio= new double[100];
        int bandera = 0;
        
         do{
        op=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opcion:\n"+
        "\n1---Agregar Producto"+
        "\n2---Calcular Total"+
        "\n3---Salir"
        ));
      
                
        if(op==1){
            
            cantidad =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de productos a ingresar:"));
             
              if(cantidad<=100)
              {
              for (int i = bandera; i < cantidad+bandera; i++) {
                  producto[i]=JOptionPane.showInputDialog("Ingrese el nombre del producto: "+i);
                  cant[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el codigo del producto: "+i));
                  precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "+i));
                  
            }
              bandera += cantidad;
              }
             
            
        } 
        
        if(op==2){
            if(bandera!=0){
                    for (int j = 0; j < 100; j++) {
                        if(precio[j] != 0){
                        JOptionPane.showMessageDialog(null,"Producto: "+producto[j]
                        +"\nCantidad:"+cant[j]
                        +"\nPrecio:"+precio[j]

                        );
                        }
                    }
            }else{
            JOptionPane.showMessageDialog(null, "no hay datos coxis");
            
            }
           
                      
        }
        if(op==3){
        System.exit(0);
        }
        seguir=JOptionPane.showConfirmDialog(null, "Desea repetir el proceso?","Continuar",JOptionPane.YES_NO_OPTION);
        }while(seguir==JOptionPane.YES_OPTION);
        
        
    }
}
