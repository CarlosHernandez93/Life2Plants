/*Trabajo Realizado por: Janiert Sebastián Salas Castillo
Grado 11°
Colegio Comfandi Calipso
*/
package Clases;

import javax.swing.JPanel;


public class CambiarPanel2 {
    JPanel container;
    JPanel content;
    
    public CambiarPanel2(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
}
