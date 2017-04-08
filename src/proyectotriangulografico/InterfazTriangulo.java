
package proyectotriangulografico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * clase de la ventana principal del programa y que llama a todos los paneles del mismo y los inicializa
 * @author Edgar Andres Krejci Bautista
 * @Michael Cardenas
 */
public class InterfazTriangulo extends JFrame{
    
    String seleccion;
    
    String colorArea;
        
    private PanelImagen panelImagen;
    
    private PanelOpciones panelOpciones;
    
    private PanelBotones panelBotones;
    
    private PanelTriangulo panelTriangulo;
    
    private DialogoColorLinea color;
/**
 * ventana principal
 */
    public InterfazTriangulo() {
        setTitle("PROGRAMA TRIANGULO -- EDGAR ANDRES KREJCI BAUTISTA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(this);
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones( this,true );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setSeleccion(seleccion);
        setVisible(true);
    }
    
    /**
     * recibe el color  lo setea cambia
     * @param item 
     */
    void setearColor(String item){
        seleccion=panelBotones.colorArea.caja.item;
        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setSeleccion(seleccion);
        setVisible(true);
    }
    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }


    public PanelTriangulo getPanelTriangulo() {
        return panelTriangulo;
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }
    
    
}
