/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bladi
 */
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Servidor extends javax.swing.JFrame {
    DataInputStream entrada;
    DataOutputStream salida;
    ServerSocket serverSock;
    Socket sock;
    ArrayList<String> listaPreguntas = new ArrayList<String>();
    ArrayList<String> Respuestas1 = new ArrayList<String>();
    ArrayList<String> Respuestas2 = new ArrayList<String>();
    ArrayList<String> Respuestas3 = new ArrayList<String>();
    ArrayList<String> Respuestas4 = new ArrayList<String>();
    ArrayList<String> Respuestas5 = new ArrayList<String>();
    ArrayList<String> Respuestas6 = new ArrayList<String>();
    ArrayList<String> Respuestas7 = new ArrayList<String>();
    ArrayList<String> Respuestas8 = new ArrayList<String>();
    ArrayList<String> Respuestas9 = new ArrayList<String>();
    ArrayList<String> Respuestas10 = new ArrayList<String>();
    int numPregunta=0;
    int puntaje;
    int puntaje1;
    int puntaje2;
    int strike;
    /**
     * Creates new form Servidor
     */
    public Servidor() {
        initComponents();
    }
    
    public void iniciarJuego(){
        try{
            serverSock = new ServerSocket(4242);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
    public void AceptarJugador1(){
        try{
            Socket sock = serverSock.accept();
            entrada = new DataInputStream(sock.getInputStream());
            
            String usuario = entrada.readUTF();
            txtJugador1.setText(usuario);
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
       
    }
    
     public void AceptarJugador2(){
        try{
            Socket sock = serverSock.accept();
            entrada = new DataInputStream(sock.getInputStream());
            
            String usuario = entrada.readUTF();
            txtJugador2.setText(usuario);
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
       
    }
    
    public void turnoJugador1(){
        try{
            
            Socket sock = serverSock.accept();
            salida = new DataOutputStream(sock.getOutputStream());
            salida.writeUTF(txtPregunta.getText());
            
        }catch(IOException ex){
            ex.printStackTrace();
        }        
        
    }
    public void turnoJugador2(){
        try{
            Socket sock = serverSock.accept();
            salida = new DataOutputStream(sock.getOutputStream());
            salida.writeUTF(txtPregunta.getText());
        }catch(IOException ex){
            ex.printStackTrace();
        }        
        
    }
    
    public void recibirRespuesta(){
         try{
             
            respuesta1();
            respuesta2();
            respuesta3();
            respuesta4();
            respuesta5();
            respuesta6();
            respuesta7();
            respuesta8();
            respuesta9();
            respuesta10();
            Socket sock = serverSock.accept();
            entrada = new DataInputStream(sock.getInputStream());
            String respuesta = entrada.readUTF();
            
            //Respuestas de la pregunta 1
            if(respuesta.equals(Respuestas1.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas1.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas1.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 2
             if(respuesta.equals(Respuestas2.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas2.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas2.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 3
             if(respuesta.equals(Respuestas3.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas3.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas3.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 4
             if(respuesta.equals(Respuestas4.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas4.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas4.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            
            //Respuestas de la pregunta 5
             if(respuesta.equals(Respuestas5.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas5.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas5.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            
            //Respuestas de la pregunta 6
             if(respuesta.equals(Respuestas6.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas6.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas6.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
           
            //Respuestas de la pregunta 7
             if(respuesta.equals(Respuestas7.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas7.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas7.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 8
             if(respuesta.equals(Respuestas8.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas8.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas8.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 9
             if(respuesta.equals(Respuestas9.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas9.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas9.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            
            //Respuestas de la pregunta 10
             if(respuesta.equals(Respuestas10.get(0))){
                txtRespuesta1.setText(respuesta);
                puntaje += 100;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas10.get(1))){
                txtRespuesta2.setText(respuesta);
                puntaje += 50;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(respuesta.equals(Respuestas10.get(2))){
                txtRespuesta3.setText(respuesta);
                puntaje += 20;
                String num = puntaje + "";
                txtPuntaje.setText(num);
            }
            if(!respuesta.equals(Respuestas9.get(0)) && !respuesta.equals(Respuestas9.get(1)) && !respuesta.equals(Respuestas9.get(2)) && !respuesta.equals(Respuestas8.get(0)) && !respuesta.equals(Respuestas8.get(1)) && !respuesta.equals(Respuestas8.get(2)) && !respuesta.equals(Respuestas7.get(0)) && !respuesta.equals(Respuestas7.get(1)) && !respuesta.equals(Respuestas7.get(2))  && !respuesta.equals(Respuestas6.get(0)) && !respuesta.equals(Respuestas6.get(1)) && !respuesta.equals(Respuestas6.get(2)) && !respuesta.equals(Respuestas5.get(0)) && !respuesta.equals(Respuestas5.get(1)) && !respuesta.equals(Respuestas5.get(2)) && !respuesta.equals(Respuestas4.get(0)) && !respuesta.equals(Respuestas4.get(1)) && !respuesta.equals(Respuestas4.get(2)) && !respuesta.equals(Respuestas3.get(0)) && !respuesta.equals(Respuestas3.get(1)) && !respuesta.equals(Respuestas3.get(2)) && !respuesta.equals(Respuestas2.get(0)) && !respuesta.equals(Respuestas2.get(1)) && !respuesta.equals(Respuestas2.get(2)) && !respuesta.equals(Respuestas1.get(0)) && !respuesta.equals(Respuestas1.get(1)) && !respuesta.equals(Respuestas1.get(2))&&!respuesta.equals(Respuestas10.get(0)) && !respuesta.equals(Respuestas10.get(1)) && !respuesta.equals(Respuestas10.get(2))){
                strike++;
                JOptionPane.showMessageDialog(null, "Strike "+ strike);
                if(strike==3){
                   JOptionPane.showMessageDialog(null, "Es turno del otro jugador para el robo de puntos");
                }
                
            }
            
        }catch(IOException ex){
            ex.printStackTrace();
        }  
    }
    
    public void Puntaje1(){
        try{
            puntaje1=puntaje1+puntaje;
            puntaje=0;
            Socket sock = serverSock.accept();
            salida = new DataOutputStream(sock.getOutputStream());
            String num=puntaje1 + "";
            salida.writeUTF(num);
            txtPuntaje1.setText(num);
            txtPuntaje.setText("");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void Puntaje2(){
        try{
            puntaje2=puntaje2+puntaje;
            puntaje=0;
            Socket sock = serverSock.accept();
            salida = new DataOutputStream(sock.getOutputStream());
            String num=puntaje2 + "";
            salida.writeUTF(num);
            txtPuntaje2.setText(num);
            txtPuntaje.setText("");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void generarPregunta(int numero){
        respuesta1();
        respuesta2();
        respuesta3();
        respuesta4();
        respuesta5();
        respuesta6();
        respuesta7();
        respuesta8();
        respuesta9();
        respuesta10();
        txtPregunta.setText(listaPreguntas.get(numero));
        numPregunta++;
        txtRespuesta1.setText("");
        txtRespuesta2.setText("");
        txtRespuesta3.setText("");
    }
    
    public void respuesta1(){
        listaPreguntas.add("Esta es la pregunta 1");
        Respuestas1.add("esta es la respuesta 1");
        Respuestas1.add("esta es la respuesta 2");
        Respuestas1.add("esta es la respuesta 3");
    }
    public void respuesta2(){
        listaPreguntas.add("Esta es la pregunta 2");
        Respuestas2.add("esta es la respuesta 1");
        Respuestas2.add("esta es la respuesta 2");
        Respuestas2.add("esta es la respuesta 3");
    }
    public void respuesta3(){
        listaPreguntas.add("Esta es la pregunta 3");
        Respuestas3.add("esta es la respuesta 1");
        Respuestas3.add("esta es la respuesta 2");
        Respuestas3.add("esta es la respuesta 3");
    }
    public void respuesta4(){
        listaPreguntas.add("Esta es la pregunta 4");
        Respuestas4.add("esta es la respuesta 1");
        Respuestas4.add("esta es la respuesta 2");
        Respuestas4.add("esta es la respuesta 3");
    }
    public void respuesta5(){
        listaPreguntas.add("Esta es la pregunta 5");
        Respuestas5.add("esta es la respuesta 1");
        Respuestas5.add("esta es la respuesta 2");
        Respuestas5.add("esta es la respuesta 3");
    }
    public void respuesta6(){
        listaPreguntas.add("Esta es la pregunta 6");
        Respuestas6.add("esta es la respuesta 1");
        Respuestas6.add("esta es la respuesta 2");
        Respuestas6.add("esta es la respuesta 3");
    }
    public void respuesta7(){
        listaPreguntas.add("Esta es la pregunta 7");
        Respuestas7.add("esta es la respuesta 1");
        Respuestas7.add("esta es la respuesta 2");
        Respuestas7.add("esta es la respuesta 3");
    }
    public void respuesta8(){
        listaPreguntas.add("Esta es la pregunta 8");
        Respuestas8.add("esta es la respuesta 1");
        Respuestas8.add("esta es la respuesta 2");
        Respuestas8.add("esta es la respuesta 3");
    }
    public void respuesta9(){
        listaPreguntas.add("Esta es la pregunta 9");
        Respuestas9.add("esta es la respuesta 1");
        Respuestas9.add("esta es la respuesta 2");
        Respuestas9.add("esta es la respuesta 3");
    }
    public void respuesta10(){
        listaPreguntas.add("Esta es la pregunta 10");
        Respuestas10.add("esta es la respuesta 1");
        Respuestas10.add("esta es la respuesta 2");
        Respuestas10.add("esta es la respuesta 3");
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRespuesta1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRespuesta2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRespuesta3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPuntaje2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtPuntaje1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtJugador1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtJugador2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtPuntaje = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPregunta.setColumns(20);
        txtPregunta.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        txtPregunta.setRows(5);
        jScrollPane1.setViewportView(txtPregunta);

        txtRespuesta1.setColumns(20);
        txtRespuesta1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtRespuesta1.setRows(5);
        jScrollPane2.setViewportView(txtRespuesta1);

        txtRespuesta2.setColumns(20);
        txtRespuesta2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtRespuesta2.setRows(5);
        jScrollPane3.setViewportView(txtRespuesta2);

        txtRespuesta3.setColumns(20);
        txtRespuesta3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtRespuesta3.setRows(5);
        jScrollPane4.setViewportView(txtRespuesta3);

        txtPuntaje2.setColumns(20);
        txtPuntaje2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPuntaje2.setRows(5);
        jScrollPane5.setViewportView(txtPuntaje2);

        txtPuntaje1.setColumns(20);
        txtPuntaje1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPuntaje1.setRows(5);
        jScrollPane6.setViewportView(txtPuntaje1);

        jLabel2.setText("PREGUNTA");

        jLabel3.setText("PUNTAJE 2 ");

        jLabel4.setText("PUNTAJE 1");

        jButton1.setText("Turno Jugador 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Turno Jugador 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("INICIAR JUEGO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtJugador1.setColumns(20);
        txtJugador1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtJugador1.setRows(5);
        jScrollPane7.setViewportView(txtJugador1);

        jLabel1.setText("Jugador 1");

        txtJugador2.setColumns(20);
        txtJugador2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtJugador2.setRows(5);
        jScrollPane8.setViewportView(txtJugador2);

        jLabel5.setText("Jugador 2");

        jButton4.setText("ACEPTAR JUGADOR 1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ACEPTAR JUGADOR 2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("GENERAR PREGUNTA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("RECIBIR RESPUESTA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("PUNTAJE A EQUIPO1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("PUNTAJE EQUIPO 2");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtPuntaje.setColumns(20);
        txtPuntaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPuntaje.setRows(5);
        txtPuntaje.setText("1000");
        jScrollPane9.setViewportView(txtPuntaje);

        jLabel6.setText("PUNTAJE RONDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(320, 320, 320)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8)
                                    .addComponent(jButton4))))
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(94, 94, 94)
                                    .addComponent(jButton6))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jButton9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        turnoJugador1();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        iniciarJuego();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        turnoJugador2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AceptarJugador1();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AceptarJugador2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        generarPregunta(numPregunta);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Puntaje1();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        recibirRespuesta();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Puntaje2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txtJugador1;
    private javax.swing.JTextArea txtJugador2;
    private javax.swing.JTextArea txtPregunta;
    private javax.swing.JTextArea txtPuntaje;
    private javax.swing.JTextArea txtPuntaje1;
    private javax.swing.JTextArea txtPuntaje2;
    private javax.swing.JTextArea txtRespuesta1;
    private javax.swing.JTextArea txtRespuesta2;
    private javax.swing.JTextArea txtRespuesta3;
    // End of variables declaration//GEN-END:variables
}
