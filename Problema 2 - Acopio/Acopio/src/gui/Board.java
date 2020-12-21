package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;

public class Board extends JFrame{

    private static final long serialVersionUID = 1L;
    private JLabel lockers[] = new JLabel[ 20 ];
    public boolean run = false;
    private JButton boton = new JButton("notificar");
    public Board() {
        super( "Problema 2 - Centro de Acopio" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setSize( 600, 500 );
        setLayout( null );
        
        JLabel header = new JLabel( "Practica 2 - Centro de acopio" );
        header.setBounds( 220, 20, 150, 20 );

        JButton b = new JButton( "START!" );
        b.setBounds( 220, 350, 150, 40 );

        boton.setBounds( 220, 390, 150, 50 );
        
        int x = 150, y = 50, c = 0;

        for ( JLabel locker : lockers ) {
            locker = new JLabel( "0" );
            locker.setBorder(BorderFactory.createLineBorder(Color.blue));
            locker.setBounds( x, y, 50, 50 );
            x = x + 60;
            if( x >= 450 ){
                x = 150;
                y = y + 60;
            }
            locker.setVisible( true );
            lockers[c++] = locker; 
            add( locker );
        }
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!lockers[0].isVisible()){
                    for (JLabel locker : lockers) {
                        locker.setVisible(true);
                    }
                    b.setText( "STOP");
                    repaint();
                }else{
                    for (JLabel locker : lockers) {
                        locker.setVisible(false);
                    }
                    b.setText( "START!" );
                    repaint();
                }
            }   
        });
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.notify();
            }
        });

        add(header);
        add(b);
        add(boton);
        setVisible( true );
    }

    private int max = 0;

    public void entregar() throws InterruptedException{
        while (true) { 
            synchronized (this) 
            { 
                if(max<20){
                    Random r = new Random();
                    int random_number = r.nextInt(20);
                    System.out.println("numero random entregar: "+random_number);
                    if(lockers[random_number].getText().equals("0")){
                        System.out.println("<Acción> Entrega en casilla:" + (random_number));
                        lockers[random_number].setText("x");
                        lockers[random_number].setBorder(BorderFactory.createLineBorder(Color.red));
                        max++;

                        Thread.sleep(200);
                    }else{
                        System.out.println("<Accion> Casilla "+(random_number)+ " ocupada");
                        Thread.sleep(200);
                        
                    }
        
                }                             
            }
            
        }
    }   
        
    public void recoger() throws InterruptedException{
        while (true) { 
            synchronized (this) 
            { 
                if(max >= 0){
                    Random r = new Random();
                    int random_number = r.nextInt(19);
                    System.out.println("numero random recoger: "+random_number);
                    if(lockers[random_number].getText().equals("x")){
                        System.out.println("<Acción> Entrega en casilla:" + (random_number));
                        lockers[random_number].setText("0");
                        lockers[random_number].setBorder(BorderFactory.createLineBorder(Color.blue));
                        max--;
                        Thread.sleep(200);
                    }else{
                        System.out.println("<Accion> Casilla "+(random_number)+ " vacia");
                        Thread.sleep(200);
                    }    
                } 
                
                
            }
            
        }
    
}
}
