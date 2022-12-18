
package sporcukartoyunu;

import java.util.ArrayList;
import javax.swing.JButton;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Feyzanur
 */
public class NewJFrame extends javax.swing.JFrame {
    
    InsanOyuncusu oyuncu;
    BilgisayarOyuncusu Bot;
    int oyuncuskor = 0;
    int bilgisayarskor = 0;
    int a,b,c,d,e,f,g,h;
    int k,l,m,n,p,r,s,q;
    int secimf1,secimf2,secimfp;
    int secimb1,secimb2,secimbp;
    int oyuncu_penalti,oyuncu_karsikarsiya,oyuncu_serbestvurus;
    int bilgisayar_penalti,bilgisayar_karsikarsiya,bilgisayar_serbestvurus;
    int oyuncu_ikilik,oyuncu_ucluk,oyuncu_serbestatis;
    int bilgisayar_ikilik,bilgisayar_ucluk,bilgisayar_serbestatis;
  
    
     ArrayList<Futbolcu> futbolcu_oyuncular = new ArrayList<Futbolcu>();
     ArrayList<Basketbolcu> basketbolcu_oyuncular = new ArrayList<Basketbolcu>();
     ArrayList<JButton> fbuton = new ArrayList<JButton>();
     ArrayList<JButton> bbuton = new ArrayList<JButton>();
     
    Futbolcu Messi = new Futbolcu();
    Futbolcu Ronaldo = new Futbolcu();
    Futbolcu Neymar = new Futbolcu();
    Futbolcu Quaresma = new Futbolcu();
    Futbolcu Pogba = new Futbolcu();
    Futbolcu SadioMané = new Futbolcu();
    Futbolcu Maradona = new Futbolcu();
    Futbolcu Ronaldinho = new Futbolcu();

    Basketbolcu KobeBryant = new Basketbolcu();
    Basketbolcu PauGasol = new Basketbolcu();
    Basketbolcu KevinLove = new Basketbolcu();
    Basketbolcu DamianLillart = new Basketbolcu();
    Basketbolcu MichaelJordan = new Basketbolcu();
    Basketbolcu LarryBird = new Basketbolcu();
    Basketbolcu LebronJames = new Basketbolcu();
    Basketbolcu KawhiLeonard = new Basketbolcu();
    
         
      

    
     private void SecimYapf(int secim1){
         switch(secim1){
             case 0:{
                 System.out.println("mane"); 
         oyuncu_penalti=75;
         oyuncu_karsikarsiya=85;
         oyuncu_serbestvurus=83;
                 break;
             }
             case 1:{
                 System.out.println("maradona");
         oyuncu_penalti=88;
         oyuncu_karsikarsiya=77;
         oyuncu_serbestvurus=70;
       
                 break;
             }
             case 2:{
                 System.out.println("messi");
         oyuncu_penalti=90;
         oyuncu_karsikarsiya=95;
         oyuncu_serbestvurus=80;

                 break;
             }
             case 3:{
                 System.out.println("neymar");
         oyuncu_penalti=85;
         oyuncu_karsikarsiya=90;
         oyuncu_serbestvurus=83;
       
                 break;
             }
             case 4:{
                 System.out.println("pogba");
         oyuncu_penalti=86;
         oyuncu_karsikarsiya=80;
         oyuncu_serbestvurus=92;
        
                 break;
             }
             case 5:{
                 System.out.println("querasma");
         oyuncu_penalti=95;
         oyuncu_karsikarsiya=75;
         oyuncu_serbestvurus=85;
         
                 break;
             }
             case 6:{
                 System.out.println("ronaldinho");
         oyuncu_penalti=96;
         oyuncu_karsikarsiya=97;
         oyuncu_serbestvurus=98;

                 break;
             }
             case 7:{
                 System.out.println("ronaldo");
         oyuncu_penalti=100;
         oyuncu_karsikarsiya=95;
         oyuncu_serbestvurus=70;
        
                 break;
             }
             
         }
     }
     
          private void SecimYapf2(int secim2){
         switch(secim2){
             case 0:{
                 System.out.println("mane"); 
         bilgisayar_penalti=75;
         bilgisayar_karsikarsiya=85;
         bilgisayar_serbestvurus=83;
                 break;
             }
             case 1:{
                 System.out.println("maradona");
        bilgisayar_penalti=88;
        bilgisayar_karsikarsiya=77;
        bilgisayar_serbestvurus=70;
       
                 break;
             }
             case 2:{
                 System.out.println("messi");
         bilgisayar_penalti=90;
        bilgisayar_karsikarsiya=95;
         bilgisayar_serbestvurus=80;

                 break;
             }
             case 3:{
                 System.out.println("neymar");
         bilgisayar_penalti=85;
         bilgisayar_karsikarsiya=90;
         bilgisayar_serbestvurus=83;
       
                 break;
             }
             case 4:{
                 System.out.println("pogba");
         bilgisayar_penalti=86;
         bilgisayar_karsikarsiya=80;
         bilgisayar_serbestvurus=92;
        
                 break;
             }
             case 5:{
                 System.out.println("querasma");
         bilgisayar_penalti=95;
         bilgisayar_karsikarsiya=75;
         bilgisayar_serbestvurus=85;
         
                 break;
             }
             case 6:{
                 System.out.println("ronaldinho");
         bilgisayar_penalti=96;
         bilgisayar_karsikarsiya=97;
         bilgisayar_serbestvurus=98;

                 break;
             }
             case 7:{
                 System.out.println("ronaldo");
         bilgisayar_penalti=100;
         bilgisayar_karsikarsiya=95;
         bilgisayar_serbestvurus=70;
        
                 break;
             }
             
         }
     }
     private void SecimYapf3(int secimfp){
        secimfp=(int)(Math.random()*3);
        String pozisyonf;
        switch(secimfp){
            case 0:{
            System.out.println("penaltı seçildi");
            pozisyonf="penaltı";
            pozisyon.setText(pozisyonf);
        if(oyuncu_penalti>bilgisayar_penalti){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
            
            
        }else if(oyuncu_penalti==bilgisayar_penalti){
            System.out.println("kimse puan alamaz");
            }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
            case 1:{
            System.out.println("kaleciyle karşı karşıya seçildi");
            pozisyonf="kaleciyle karşı karşıya";
            pozisyon.setText(pozisyonf);
        if(oyuncu_karsikarsiya>bilgisayar_karsikarsiya){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
          
            
        }else if(oyuncu_karsikarsiya==bilgisayar_karsikarsiya){
            System.out.println("kimse puan alamaz");
        }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
            case 2:{
            System.out.println("serbest vuruş seçildi");
            pozisyonf="serbest vuruş";
            pozisyon.setText(pozisyonf);
        if(oyuncu_serbestvurus>bilgisayar_serbestvurus){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
          
        }else if(oyuncu_serbestvurus==bilgisayar_serbestvurus){
            System.out.println("kimse puan alamaz"); 
            
        }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
    }
         
     }  
         
    

    
     private void SecimYapb(int secimb1){
         switch(secimb1){
             case 0:{
                 System.out.println("damian lilllard"); 
         oyuncu_ikilik=88;
         oyuncu_ucluk=89;
         oyuncu_serbestatis=92;
                 break;
             }
             case 1:{
                 System.out.println("kawhi leonard");
         oyuncu_ikilik=75;
         oyuncu_ucluk=83;
         oyuncu_serbestatis=82;
       
                 break;
             }
             case 2:{
                 System.out.println("kevin love");
         oyuncu_ikilik=85;
         oyuncu_ucluk=80;
         oyuncu_serbestatis=85;

                 break;
             }
             case 3:{
                 System.out.println("kobe bryant");
         oyuncu_ikilik=94;
         oyuncu_ucluk=95;
         oyuncu_serbestatis=90;
       
                 break;
             }
             case 4:{
                 System.out.println("larry bird");
         oyuncu_ikilik=86;
         oyuncu_ucluk=77;
         oyuncu_serbestatis=75;
        
                 break;
             }
             case 5:{
                 System.out.println("lebron james");
         oyuncu_ikilik=99;
         oyuncu_ucluk=98;
         oyuncu_serbestatis=98;
         
                 break;
             }
             case 6:{
                 System.out.println("michael jordan");
         oyuncu_ikilik=93;
         oyuncu_ucluk=94;
         oyuncu_serbestatis=95;

                 break;
             }
             case 7:{
                 System.out.println("pau gasol");
         oyuncu_ikilik=90;
         oyuncu_ucluk=75;
         oyuncu_serbestatis=80;
        
                 break;
             }
             
         }
     }
     
          private void SecimYapb2(int secimb2){
          switch(secimb2){
             case 0:{
                 System.out.println("damian lilllard"); 
         bilgisayar_ikilik=88;
         bilgisayar_ucluk=89;
         bilgisayar_serbestatis=92;
                 break;
             }
             case 1:{
                 System.out.println("kawhi leonard");
         bilgisayar_ikilik=75;
         bilgisayar_ucluk=83;
         bilgisayar_serbestatis=82;
       
                 break;
             }
             case 2:{
                 System.out.println("kevin love");
         bilgisayar_ikilik=85;
         bilgisayar_ucluk=80;
         bilgisayar_serbestatis=85;

                 break;
             }
             case 3:{
                 System.out.println("kobe bryant");
         bilgisayar_ikilik=94;
         bilgisayar_ucluk=95;
         bilgisayar_serbestatis=90;
       
                 break;
             }
             case 4:{
                 System.out.println("larry bird");
         bilgisayar_ikilik=86;
         bilgisayar_ucluk=77;
         bilgisayar_serbestatis=75;
        
                 break;
             }
             case 5:{
                 System.out.println("lebron james");
         bilgisayar_ikilik=99;
         bilgisayar_ucluk=98;
         bilgisayar_serbestatis=98;
         
                 break;
             }
             case 6:{
                 System.out.println("michael jordan");
         bilgisayar_ikilik=93;
         bilgisayar_ucluk=94;
         bilgisayar_serbestatis=95;

                 break;
             }
             case 7:{
                 System.out.println("pau gasol");
         bilgisayar_ikilik=90;
         bilgisayar_ucluk=75;
         bilgisayar_serbestatis=80;
        
                 break;
             }
             
         }
     }
     private void SecimYapb3(int secimbp){
        secimbp=(int)(Math.random()*3);
        String pozisyonb;
        switch(secimbp){
            case 0:{
            System.out.println("ikilik seçildi");
            pozisyonb="ikilik";
            pozisyon.setText(pozisyonb);
        if(oyuncu_ikilik>bilgisayar_ikilik){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
          
            
        }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
            case 1:{
            System.out.println("üçlük seçildi");
            pozisyonb="üçlük";
            pozisyon.setText(pozisyonb);
        if(oyuncu_ucluk>bilgisayar_ucluk){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
          
            
        }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
            case 2:{
            System.out.println("serbest atış seçildi");
            pozisyonb="serbest atış";
            pozisyon.setText(pozisyonb);
        if(oyuncu_serbestatis>bilgisayar_serbestatis){
            System.out.println("oyuncu puan alır");
            oyuncuskor+=10;
            oyuncu_skoru.setText(String.valueOf(oyuncuskor));
          
            
        }else{
            System.out.println("bilgisayar puan alır");
            bilgisayarskor+=10;
            bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
            
        }
        break;
        }
    }
         
     }
   

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame() {
        initComponents();
        isim_gir.setVisible(false);
        name.setVisible(false);
        kullanıcı.setVisible(false);
        bilgisayar.setVisible(false);
        oyuncu_skoru.setVisible(false);
        bilgisayar_skoru.setVisible(false);
        pozisyon.setVisible(false);
        sonuc_butonu.setVisible(false);
        sonuc_text.setVisible(false);
        
        B1.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B4.setVisible(false);
        B5.setVisible(false);
        B6.setVisible(false);
        B7.setVisible(false);
        B8.setVisible(false);
        
        F1.setVisible(false);
        F2.setVisible(false);
        F3.setVisible(false);
        F4.setVisible(false);
        F5.setVisible(false);
        F6.setVisible(false);
        F7.setVisible(false);
        F8.setVisible(false);
        
        oyuncu_alani.setVisible(false);
        bilgisayar_alani.setVisible(false);
        
        ;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sonuc_text = new javax.swing.JTextField();
        sonuc_butonu = new javax.swing.JButton();
        pozisyon = new javax.swing.JTextField();
        bilgisayar_skoru = new javax.swing.JTextField();
        oyuncu_skoru = new javax.swing.JTextField();
        bilgisayar_alani = new javax.swing.JButton();
        oyuncu_alani = new javax.swing.JButton();
        bilgisayar = new javax.swing.JTextField();
        kullanıcı = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        isim_gir = new javax.swing.JTextField();
        F8 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        play_butonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        sonuc_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(sonuc_text);
        sonuc_text.setBounds(440, 370, 490, 100);

        sonuc_butonu.setBackground(new java.awt.Color(255, 153, 153));
        sonuc_butonu.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        sonuc_butonu.setForeground(new java.awt.Color(153, 0, 51));
        sonuc_butonu.setText("SONUÇ");
        sonuc_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonuc_butonuActionPerformed(evt);
            }
        });
        getContentPane().add(sonuc_butonu);
        sonuc_butonu.setBounds(610, 470, 150, 70);

        pozisyon.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pozisyon.setCaretColor(new java.awt.Color(102, 153, 255));
        pozisyon.setDisabledTextColor(new java.awt.Color(102, 0, 51));
        getContentPane().add(pozisyon);
        pozisyon.setBounds(580, 360, 200, 90);

        bilgisayar_skoru.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bilgisayar_skoru.setText("0");
        getContentPane().add(bilgisayar_skoru);
        bilgisayar_skoru.setBounds(1100, 540, 80, 50);

        oyuncu_skoru.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        oyuncu_skoru.setText("0");
        getContentPane().add(oyuncu_skoru);
        oyuncu_skoru.setBounds(170, 270, 80, 50);
        getContentPane().add(bilgisayar_alani);
        bilgisayar_alani.setBounds(800, 300, 260, 270);
        getContentPane().add(oyuncu_alani);
        oyuncu_alani.setBounds(300, 300, 260, 270);

        bilgisayar.setBackground(new java.awt.Color(204, 255, 204));
        bilgisayar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bilgisayar.setText("Bilgisayar");
        getContentPane().add(bilgisayar);
        bilgisayar.setBounds(1180, 540, 150, 50);

        kullanıcı.setBackground(new java.awt.Color(204, 255, 204));
        kullanıcı.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(kullanıcı);
        kullanıcı.setBounds(20, 270, 150, 50);

        name.setBackground(new java.awt.Color(204, 255, 204));
        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(560, 530, 240, 40);

        isim_gir.setEditable(false);
        isim_gir.setBackground(new java.awt.Color(204, 204, 204));
        isim_gir.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        isim_gir.setBackground(new java.awt.Color(204, 204, 255));
        isim_gir.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        isim_gir.setText("İsminizi Giriniz");
        isim_gir.setCaretColor(new java.awt.Color(255, 204, 255));
        isim_gir.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        getContentPane().add(isim_gir);
        isim_gir.setBounds(749, 160, 470, 70);
        isim_gir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isim_girActionPerformed(evt);
            }
        });
        getContentPane().add(isim_gir);
        isim_gir.setBounds(480, 450, 390, 80);
        getContentPane().add(F8);
        F8.setBounds(700, 630, 150, 210);
        getContentPane().add(F7);
        F7.setBounds(860, 630, 150, 210);
        getContentPane().add(F6);
        F6.setBounds(1020, 630, 150, 210);
        getContentPane().add(F5);
        F5.setBounds(1180, 630, 150, 210);

        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });
        getContentPane().add(F4);
        F4.setBounds(700, 20, 150, 210);

        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });
        getContentPane().add(F3);
        F3.setBounds(860, 20, 150, 210);

        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        getContentPane().add(F2);
        F2.setBounds(1020, 20, 150, 210);

        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        getContentPane().add(F1);
        F1.setBounds(1180, 20, 150, 210);
        getContentPane().add(B8);
        B8.setBounds(490, 630, 150, 210);
        getContentPane().add(B7);
        B7.setBounds(330, 630, 150, 210);
        getContentPane().add(B6);
        B6.setBounds(170, 630, 150, 210);
        getContentPane().add(B5);
        B5.setBounds(10, 630, 150, 210);

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4);
        B4.setBounds(180, 20, 150, 210);

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3);
        B3.setBounds(340, 20, 150, 210);

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(500, 20, 150, 210);

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(20, 20, 150, 210);

        play_butonu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Desktop\\play.png")); // NOI18N
        play_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_butonuActionPerformed(evt);
            }
        });
        getContentPane().add(play_butonu);
        play_butonu.setBounds(490, 340, 370, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Desktop\\anaekran.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 860);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1340, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        isim_gir.setVisible(false);
        
        
        
        a=(int)(Math.random()*8);
        b=(int)(Math.random()*8);
        while(a==b){
          b=(int)(Math.random()*8);  
       
        }  
        c=(int)(Math.random()*8);
        while(a==c ||b==c ){
            c=(int)(Math.random()*8);
        }
        d=(int)(Math.random()*8);
        while(a==d ||b==d || c==d ){
            d=(int)(Math.random()*8);
        }
        k=(int)(Math.random()*8);
        while(a==k ||b==k || c==k || d==k ){
            k=(int)(Math.random()*8);
        }
         l=(int)(Math.random()*8);
         while(a==l ||b==l || c==l || d==l || k==l ){
            l=(int)(Math.random()*8);
        }
         m=(int)(Math.random()*8);
         while(a==m ||b==m || c==m || d==m || k==m || l==m ){
            m=(int)(Math.random()*8);
        }
         n=(int)(Math.random()*8);
         while(a==n ||b==n || c==n || d==n || k==n || l==n || m==n ){
            n=(int)(Math.random()*8);
        }
        
        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(a)+".png")));
        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(b)+".png")));
        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(c)+".png")));
        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(d)+".png")));
          
        e=(int)(Math.random()*8);
         f=(int)(Math.random()*8);
        while(e==f){
          f=(int)(Math.random()*8);  
       
        }  
         g=(int)(Math.random()*8);
        while(e==g ||f==g ){
            g=(int)(Math.random()*8);
        }
         h=(int)(Math.random()*8);
        while(e==h ||f==h || g==h ){
            h=(int)(Math.random()*8);
        }
         p=(int)(Math.random()*8);
        while(e==p ||f==p || g==p || h==p ){
            p=(int)(Math.random()*8);
        }
         r=(int)(Math.random()*8);
         while(e==r ||f==r || g==r || h==r || p==r ){
            r=(int)(Math.random()*8);
        }
         s=(int)(Math.random()*8);
         while(e==s ||f==s || g==s || h==s || p==s || r==s ){
            s=(int)(Math.random()*8);
        }
         q=(int)(Math.random()*8);
         while(e==q ||f==q || g==q || h==q || p==q || r==q || s==q ){
            q=(int)(Math.random()*8);
        }
        
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(e)+".jpg")));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(f)+".jpg")));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(g)+".jpg")));
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(h)+".jpg")));
        
        B1.setVisible(true);
        B2.setVisible(true);
        B3.setVisible(true);
        B4.setVisible(true);
        B5.setVisible(true);
        B6.setVisible(true);
        B7.setVisible(true);
        B8.setVisible(true);
        
        F1.setVisible(true);
        F2.setVisible(true);
        F3.setVisible(true);
        F4.setVisible(true);
        F5.setVisible(true);
        F6.setVisible(true);
        F7.setVisible(true);
        F8.setVisible(true);
        
        oyuncu_skoru.setVisible(true);
        bilgisayar_skoru.setVisible(true);
        sonuc_butonu.setVisible(true);
        
            String username=name.getText();
            kullanıcı.setText(username);
            name.setVisible(false);
            kullanıcı.setVisible(true);
            bilgisayar.setVisible(true);
        
            System.out.println(username);
            /*
      
       fbuton.add(F1);
       fbuton.add(F2);
       fbuton.add(F3);
       fbuton.add(F4);
       fbuton.add(F5);
       fbuton.add(F6);
       fbuton.add(F7);
       fbuton.add(F8);

       bbuton.add(B1);
       bbuton.add(B2);
       bbuton.add(B3);
       bbuton.add(B4);
       bbuton.add(B5);
       bbuton.add(B6);
       bbuton.add(B7);
       bbuton.add(B8);
       
        futbolcu_oyuncular.add(Messi);  
        futbolcu_oyuncular.add(Ronaldo);          
        futbolcu_oyuncular.add(Neymar);
        futbolcu_oyuncular.add(Quaresma);
        futbolcu_oyuncular.add(Pogba);
        futbolcu_oyuncular.add(SadioMané);
        futbolcu_oyuncular.add(Maradona);
        futbolcu_oyuncular.add(Ronaldinho);

        basketbolcu_oyuncular.add(KobeBryant);
        basketbolcu_oyuncular.add(PauGasol);
        basketbolcu_oyuncular.add(KevinLove);
        basketbolcu_oyuncular.add(DamianLillart);
        basketbolcu_oyuncular.add(MichaelJordan);
        basketbolcu_oyuncular.add(LarryBird);
        basketbolcu_oyuncular.add(LebronJames);
        basketbolcu_oyuncular.add(KawhiLeonard);
            */
        
    }//GEN-LAST:event_nameActionPerformed

    private void isim_girActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isim_girActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isim_girActionPerformed

    private void play_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_butonuActionPerformed
        play_butonu.setVisible(false);
        isim_gir.setVisible(true);
        name.setVisible(true);
    }//GEN-LAST:event_play_butonuActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        F1.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(a)+".png")));
         F5.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(k)+".png")));
        secimf1=a;
        SecimYapf(secimf1);
        secimf2=k;
        SecimYapf2(secimf2);
        SecimYapf3(secimfp);
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        F2.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(b)+".png")));
         F6.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(l)+".png")));
        secimf1=b;
        SecimYapf(secimf1);
        secimf2=l;
        SecimYapf2(secimf2);
        SecimYapf3(secimfp);
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        F3.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(c)+".png")));
         F7.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(m)+".png")));
        secimf1=c;
        SecimYapf(secimf1);
        secimf2=m;
        SecimYapf2(secimf2);
        SecimYapf3(secimfp);
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        F4.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(d)+".png")));
        F8.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(n)+".png")));
        secimf1=d;
        SecimYapf(secimf1);
        secimf2=n;
        SecimYapf2(secimf2);
        SecimYapf3(secimfp);
    }//GEN-LAST:event_F4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        B1.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(e)+".jpg")));
        B5.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(p)+".jpg")));
        secimb1=e;
        SecimYapb(secimb1);
        secimb2=p;
        SecimYapb2(secimb2);
        SecimYapb3(secimbp);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        B2.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(f)+".jpg")));
        B6.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(r)+".jpg")));
        secimb1=f;
        SecimYapb(secimb1);
        secimb2=r;
        SecimYapb2(secimb2);
        SecimYapb3(secimbp);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        B3.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(g)+".jpg")));
        B7.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(s)+".jpg")));
        secimb1=g;
        SecimYapb(secimb1);
        secimb2=s;
        SecimYapb2(secimb2);
        SecimYapb3(secimbp);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        B4.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);
        
        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(h)+".jpg")));
        B8.setVisible(false);
         bilgisayar_alani.setVisible(true);
         bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/"+String.valueOf(q)+".jpg")));
        secimb1=h;
        SecimYapb(secimb1);
        secimb2=q;
        SecimYapb2(secimb2);
        SecimYapb3(secimbp);
    }//GEN-LAST:event_B4ActionPerformed

    private void sonuc_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuc_butonuActionPerformed
       String kazanan;
        oyuncu_alani.setVisible(false);
       bilgisayar_alani.setVisible(false);
       sonuc_butonu.setVisible(false);
       pozisyon.setVisible(false);
       sonuc_text.setVisible(true);
       if(oyuncuskor>bilgisayarskor){
            kazanan="oyuncu kazandı";
            sonuc_text.setText(kazanan);
       }
       else if(bilgisayarskor>oyuncuskor){
            kazanan="bilgisayar kazandı";
            sonuc_text.setText(kazanan);
       }
       else 
           kazanan="oyun berabere bitti";
            sonuc_text.setText(kazanan);
    }//GEN-LAST:event_sonuc_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JTextField bilgisayar;
    private javax.swing.JButton bilgisayar_alani;
    private javax.swing.JTextField bilgisayar_skoru;
    private javax.swing.JTextField isim_gir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kullanıcı;
    private javax.swing.JTextField name;
    private javax.swing.JButton oyuncu_alani;
    private javax.swing.JTextField oyuncu_skoru;
    private javax.swing.JButton play_butonu;
    private javax.swing.JTextField pozisyon;
    private javax.swing.JButton sonuc_butonu;
    private javax.swing.JTextField sonuc_text;
    // End of variables declaration//GEN-END:variables
}
