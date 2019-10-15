/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author santigo
 */
public class Gui extends JFrame implements ActionListener{
    
    private ArrayList<JButton> botones;
    private JPanel panel1,panel2;
    private JLabel text;
    private JTextField cajaTexto;
    private ActionListener action;
    
    public Gui() {
        super ("ejemplo de interfaces graficas");
        //ActionListener por instanciacion y creacion
        accion();
        
        //metodo que crea los botones que estan dentro de la ventana
        crearBotones();
        //metodo que crea los texfield
        creartext();
        
        //tamaño de la ventana
        setSize(400, 300);
        
        //hacer que la ventana se muestre
        setVisible(true);
        //terminar el programa cuando este se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void crearBotones(){
        
        setLayout(new BorderLayout());
        //generamos el primer panel donde ventran los botones
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 5));
        // adicionamos los botones
        botones = new ArrayList<JButton>();
        for(int i = 0;i<10;i++){
            botones.add(i, new JButton("boton "+(i+1)));
            panel1.add(botones.get(i));
            
            //adiciono los botones 1-5 en el action de instanciacion
            if(i<5){
                botones.get(i).addActionListener(action);
            }
            //adiciono los botones 6-10 en el action de implementacion
            else{
                botones.get(i).addActionListener(this);
            }
            
            
        }
    }
    public void creartext(){
        // Creamos el segundo panel con una caja de texto
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        //añadimos la caja de texto
        cajaTexto = new JTextField("escribe y presiona el boton 3");
        panel2.add(cajaTexto, BorderLayout.NORTH);
        panel2.add(panel1, BorderLayout.CENTER);
        // adicionamos el panel 2 y el label
        add(panel2, BorderLayout.EAST);
        text = new JLabel("Aquí va todos los cambios");
        add(text,BorderLayout.CENTER);
    }
    
    //ActionListener por instanciacion y creacion botones 1,2,3,4 y 5
    public void accion(){
        action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //variable opcion es el nomb re del boton oprimido
                String opcion = (String)e.getActionCommand();
                if(opcion.equals("boton 1")){
                    text.setText("se oprimio el boton 1");
                }else if(opcion.equals("boton 2")){
                    botones.get(1).setText("se oprimio");
                }else if(opcion.equals("boton 3")){
                    text.setText("se escribio: "+cajaTexto.getText());
                }else if(opcion.equals("boton 4")){
                    text.setText("cambiaste el color de las letras a naranja");
                    text.setForeground(Color.orange);
                }else {
                    botones.get(4).setBackground(Color.red);
                }
                
            }
        };
    }
    
    //ActionListener por implementacion botones 6,7,8,9 y 10
    @Override
    public void actionPerformed(ActionEvent e) {
        //variable opcion es el nomb re del boton oprimido
        String opcion = (String)e.getActionCommand();
        if(opcion.equals("boton 6")){
            text.setIcon(new ImageIcon("..//Imagenes//fondo.jpg"));
            text.repaint();
            text.validate();
        }else if(opcion.equals("boton 7")){
            text.setText("7 no se me ocurre nada mas :v, hay muchas opciones, investiguen");
        }else if(opcion.equals("boton 8")){
            text.setText("8 no se me ocurre nada mas :v, hay muchas opciones, investiguen");
        }else if(opcion.equals("boton 9")){
            text.setText("9 no se me ocurre nada mas :v, hay muchas opciones, investiguen");
        }else {
                System.exit(0);

        }
    }
}
