package sporcukartoyunu;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Feyzanur
 */
public class Test extends javax.swing.JFrame {

    InsanOyuncusu oyuncu;
    BilgisayarOyuncusu Bot;
    int oyuncuskor = 0;
    int bilgisayarskor = 0;
    int a, b, c, d, e, f, g, h;
    int k, l, m, n, p, r, s, q;
    int secimf1, secimf2, secimfp;
    int secimb1, secimb2, secimbp;
    int oyuncu_penalti, oyuncu_karsikarsiya, oyuncu_serbestvurus;
    int bilgisayar_penalti, bilgisayar_karsikarsiya, bilgisayar_serbestvurus;
    int oyuncu_ikilik, oyuncu_ucluk, oyuncu_serbestatis;
    int bilgisayar_ikilik, bilgisayar_ucluk, bilgisayar_serbestatis;

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

    public void pozisyonBilgisi() {
        //Futbolcular
        Messi.setPenalti(90);
        Messi.setKaleciylekarsikarsiya(95);
        Messi.setSerbestVurus(80);
        

        Ronaldo.setPenalti(100);
        Ronaldo.setKaleciylekarsikarsiya(95);
        Ronaldo.setSerbestVurus(70);
       
        Neymar.setPenalti(85);
        Neymar.setKaleciylekarsikarsiya(90);
        Neymar.setSerbestVurus(90);
        

        Quaresma.setPenalti(95);
        Quaresma.setKaleciylekarsikarsiya(75);
        Quaresma.setSerbestVurus(85);
       

        Pogba.setPenalti(86);
        Pogba.setKaleciylekarsikarsiya(80);
        Pogba.setSerbestVurus(92);
        

        SadioMané.setPenalti(75);
        SadioMané.setKaleciylekarsikarsiya(85);
        SadioMané.setSerbestVurus(83);
        

        Maradona.setPenalti(88);
        Maradona.setKaleciylekarsikarsiya(77);
        Maradona.setSerbestVurus(70);
        

        Ronaldinho.setPenalti(96);
        Ronaldinho.setKaleciylekarsikarsiya(97);
        Ronaldinho.setSerbestVurus(98);
        

        //Basketbolcular
        KobeBryant.setIkilik(94);
        KobeBryant.setÜclük(95);
        KobeBryant.setSerbestAtis(90);
       

        PauGasol.setIkilik(90);
        PauGasol.setÜclük(75);
        PauGasol.setSerbestAtis(80);
        

        KevinLove.setIkilik(85);
        KevinLove.setÜclük(80);
        KevinLove.setSerbestAtis(85);
       

        DamianLillart.setIkilik(88);
        DamianLillart.setÜclük(89);
        DamianLillart.setSerbestAtis(92);
        

        MichaelJordan.setIkilik(93);
        MichaelJordan.setÜclük(94);
        MichaelJordan.setSerbestAtis(95);
       ;

        LarryBird.setIkilik(86);
        LarryBird.setÜclük(77);
        LarryBird.setSerbestAtis(75);
       

        LebronJames.setIkilik(99);
        LebronJames.setÜclük(98);
        LebronJames.setSerbestAtis(98);
       

        KawhiLeonard.setIkilik(75);
        KawhiLeonard.setÜclük(83);
        KawhiLeonard.setSerbestAtis(82);
        

    }

    private void SecimYapf(int secim1) {
        switch (secim1) {
            case 1: {
                System.out.println("messi");
                Messi.getKaleciylekarsikarsiya();
                Messi.getPenalti();
                Messi.getSerbestVurus();
                break;
            }
            case 2: {
                System.out.println("ronaldo");
                Ronaldo.getKaleciylekarsikarsiya();
                Ronaldo.getPenalti();
                Ronaldo.getSerbestVurus();

                break;
            }
            case 3: {
                System.out.println("neymar");
                Neymar.getKaleciylekarsikarsiya();
                Neymar.getPenalti();
                Neymar.getSerbestVurus();

                break;
            }
            case 4: {
                System.out.println("quaresma");
                Quaresma.getKaleciylekarsikarsiya();
                Quaresma.getPenalti();
                Quaresma.getSerbestVurus();

                break;
            }
            case 5: {
                System.out.println("pogba");
                Pogba.getKaleciylekarsikarsiya();
                Pogba.getPenalti();
                Pogba.getSerbestVurus();
                break;
            }
            case 6: {
                System.out.println("mane");
                SadioMané.getPenalti();
                SadioMané.getKaleciylekarsikarsiya();
                SadioMané.getSerbestVurus();

                break;
            }
            case 7: {
                System.out.println("maradona");
                Maradona.getKaleciylekarsikarsiya();
                Maradona.getPenalti();
                Maradona.getSerbestVurus();
                break;
            }

            case 8: {
                System.out.println("ronaldinho");
                Ronaldinho.getKaleciylekarsikarsiya();
                Ronaldinho.getPenalti();
                Ronaldinho.getSerbestVurus();
                break;
            }

        }
    }

//    private void SecimYapf2(int secim2) {
//        switch (secim2) {
//            case 0: {
//                System.out.println("mane");
//                bilgisayar_penalti = 75;
//                bilgisayar_karsikarsiya = 85;
//                bilgisayar_serbestvurus = 83;
//                break;
//            }
//            case 1: {
//                System.out.println("maradona");
//                bilgisayar_penalti = 88;
//                bilgisayar_karsikarsiya = 77;
//                bilgisayar_serbestvurus = 70;
//
//                break;
//            }
//            case 2: {
//                System.out.println("messi");
//                bilgisayar_penalti = 90;
//                bilgisayar_karsikarsiya = 95;
//                bilgisayar_serbestvurus = 80;
//
//                break;
//            }
//            case 3: {
//                System.out.println("neymar");
//                bilgisayar_penalti = 85;
//                bilgisayar_karsikarsiya = 90;
//                bilgisayar_serbestvurus = 83;
//
//                break;
//            }
//            case 4: {
//                System.out.println("pogba");
//                bilgisayar_penalti = 86;
//                bilgisayar_karsikarsiya = 80;
//                bilgisayar_serbestvurus = 92;
//
//                break;
//            }
//            case 5: {
//                System.out.println("querasma");
//                bilgisayar_penalti = 95;
//                bilgisayar_karsikarsiya = 75;
//                bilgisayar_serbestvurus = 85;
//
//                break;
//            }
//            case 6: {
//                System.out.println("ronaldinho");
//                bilgisayar_penalti = 96;
//                bilgisayar_karsikarsiya = 97;
//                bilgisayar_serbestvurus = 98;
//
//                break;
//            }
//            case 7: {
//                System.out.println("ronaldo");
//                bilgisayar_penalti = 100;
//                bilgisayar_karsikarsiya = 95;
//                bilgisayar_serbestvurus = 70;
//
//                break;
//            }
//
//        }
//    }
    public int rastgelePozisyonSecmef(int sira) {
        String[] Fpozisyon = {"Penalti", "Kaleciylekarsikarsiya", "SerbestVurus"};
        Random rastgele = new Random();
        int pozisyon = rastgele.nextInt(Fpozisyon.length);
        if (Fpozisyon[pozisyon] == "Penalti") {
            return 1;
        } else if (Fpozisyon[pozisyon] == "Kaleciylekarsikarsiya") {
            return 2;
        } else {
            return 3;
        }

    }

    public int rastgelePozisyonSecmeb(int sira) {

        String[] Bpozisyon = {"Ikilik", "üçlük", "SerbestAtis"};
        Random rastgele = new Random();
        int pozisyon = rastgele.nextInt(Bpozisyon.length);
        if (Bpozisyon[pozisyon] == "Ikilik") {
            return 4;
        } else if (Bpozisyon[pozisyon] == "üçlük") {
            return 5;
        } else {
            return 6;
        }

    }

//    private void SecimYapf3(int secimfp) {
//        secimfp = (int) (Math.random() * 3);
//        String pozisyonf;
//        switch (secimfp) {
//            case 0: {
//                System.out.println("penaltÃ„Â± seÃƒÂ§ildi");
//                pozisyonf = "penaltÃ„Â±";
//                pozisyon.setText(pozisyonf);
//                if (oyuncu_penalti > bilgisayar_penalti) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//            case 1: {
//                System.out.println("kaleciyle karÃ…Å¸Ã„Â± karÃ…Å¸Ã„Â±ya seÃƒÂ§ildi");
//                pozisyonf = "kaleciyle karÃ…Å¸Ã„Â± karÃ…Å¸Ã„Â±ya";
//                pozisyon.setText(pozisyonf);
//                if (oyuncu_karsikarsiya > bilgisayar_karsikarsiya) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//            case 2: {
//                System.out.println("serbest vuruÃ…Å¸ seÃƒÂ§ildi");
//                pozisyonf = "serbest vuruÃ…Å¸";
//                pozisyon.setText(pozisyonf);
//                if (oyuncu_serbestvurus > bilgisayar_serbestvurus) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//        }
//
//    }
    private void SecimYapb(int secimb1) {
        switch (secimb1) {
            case 9: {
                System.out.println("kobe bryant");
                KobeBryant.getIkilik();
                KobeBryant.getSerbestAtis();
                KobeBryant.getÜclük();

                break;
            }
            case 10: {
                System.out.println("pau gasol");
                PauGasol.getIkilik();
                PauGasol.getSerbestAtis();
                PauGasol.getÜclük();

                break;
            }
            case 11: {
                System.out.println("kevin love");
                KevinLove.getIkilik();
                KevinLove.getSerbestAtis();
                KevinLove.getÜclük();

                break;
            }
            case 12: {
                System.out.println("damian lillart");
                DamianLillart.getIkilik();
                DamianLillart.getSerbestAtis();
                DamianLillart.getÜclük();

                break;
            }
            case 13: {
                System.out.println("michael jordan");
                MichaelJordan.getIkilik();
                MichaelJordan.getSerbestAtis();
                MichaelJordan.getÜclük();
                break;
            }
            case 14: {
                System.out.println("larry bird");
                LarryBird.getIkilik();
                LarryBird.getSerbestAtis();
                LarryBird.getÜclük();
                break;
            }
            case 15: {
                System.out.println("lebron james");
                 LebronJames.getIkilik();
                LebronJames.getSerbestAtis();
                LebronJames.getÜclük();
                break;
            }
            case 16: {
                System.out.println("kawhi leonard");
                KawhiLeonard.getIkilik();
                KawhiLeonard.getSerbestAtis();
                KawhiLeonard.getÜclük();
                break;
            }

        }
    }

//    private void SecimYapb2(int secimb2) {
//        switch (secimb2) {
//            case 0: {
//                System.out.println("damian lilllard");
//                bilgisayar_ikilik = 88;
//                bilgisayar_ucluk = 89;
//                bilgisayar_serbestatis = 92;
//                break;
//            }
//            case 1: {
//                System.out.println("kawhi leonard");
//                bilgisayar_ikilik = 75;
//                bilgisayar_ucluk = 83;
//                bilgisayar_serbestatis = 82;
//
//                break;
//            }
//            case 2: {
//                System.out.println("kevin love");
//                bilgisayar_ikilik = 85;
//                bilgisayar_ucluk = 80;
//                bilgisayar_serbestatis = 85;
//
//                break;
//            }
//            case 3: {
//                System.out.println("kobe bryant");
//                bilgisayar_ikilik = 94;
//                bilgisayar_ucluk = 95;
//                bilgisayar_serbestatis = 90;
//
//                break;
//            }
//            case 4: {
//                System.out.println("larry bird");
//                bilgisayar_ikilik = 86;
//                bilgisayar_ucluk = 77;
//                bilgisayar_serbestatis = 75;
//
//                break;
//            }
//            case 5: {
//                System.out.println("lebron james");
//                bilgisayar_ikilik = 99;
//                bilgisayar_ucluk = 98;
//                bilgisayar_serbestatis = 98;
//
//                break;
//            }
//            case 6: {
//                System.out.println("michael jordan");
//                bilgisayar_ikilik = 93;
//                bilgisayar_ucluk = 94;
//                bilgisayar_serbestatis = 95;
//
//                break;
//            }
//            case 7: {
//                System.out.println("pau gasol");
//                bilgisayar_ikilik = 90;
//                bilgisayar_ucluk = 75;
//                bilgisayar_serbestatis = 80;
//
//                break;
//            }
//
//        }
//    }
//    private void SecimYapb3(int secimbp) {
//        secimbp = (int) (Math.random() * 3);
//        String pozisyonb;
//        switch (secimbp) {
//            case 0: {
//                System.out.println("ikilik seÃƒÂ§ildi");
//                pozisyonb = "ikilik";
//                pozisyon.setText(pozisyonb);
//                if (oyuncu_ikilik > bilgisayar_ikilik) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//            case 1: {
//                System.out.println("ÃƒÂ¼ÃƒÂ§lÃƒÂ¼k seÃƒÂ§ildi");
//                pozisyonb = "ÃƒÂ¼ÃƒÂ§lÃƒÂ¼k";
//                pozisyon.setText(pozisyonb);
//                if (oyuncu_ucluk > bilgisayar_ucluk) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//            case 2: {
//                System.out.println("serbest vuruÃ…Å¸ seÃƒÂ§ildi");
//                pozisyonb = "serbest vuruÃ…Å¸";
//                pozisyon.setText(pozisyonb);
//                if (oyuncu_serbestatis > bilgisayar_serbestatis) {
//                    System.out.println("oyuncu puan alÃ„Â±r");
//                    oyuncuskor += 10;
//                    oyuncu_skoru.setText(String.valueOf(oyuncuskor));
//
//                } else {
//                    System.out.println("bilgisayar puan alÃ„Â±r");
//                    bilgisayarskor += 10;
//                    bilgisayar_skoru.setText(String.valueOf(bilgisayarskor));
//
//                }
//                break;
//            }
//        }
//
//    }
    /**
     * Creates new form NewJFrame1
     */
    public Test() {
        initComponents();
        isim_gir.setVisible(false);
        name.setVisible(false);
        kullaniciadi.setVisible(false);
        bilgisayar.setVisible(false);
        oyuncu_skoru.setVisible(false);
        bilgisayar_skoru.setVisible(false);
        pozisyon.setVisible(false);

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
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pozisyon = new javax.swing.JTextField();
        bilgisayar_skoru = new javax.swing.JTextField();
        oyuncu_skoru = new javax.swing.JTextField();
        bilgisayar_alani = new javax.swing.JButton();
        oyuncu_alani = new javax.swing.JButton();
        bilgisayar = new javax.swing.JTextField();
        kullaniciadi = new javax.swing.JTextField();
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

        kullaniciadi.setBackground(new java.awt.Color(204, 255, 204));
        kullaniciadi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(kullaniciadi);
        kullaniciadi.setBounds(20, 270, 150, 50);

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
        isim_gir.setText("Ã„Â°sminizi Giriniz");
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

        F8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\futbolkart.png")); // NOI18N
        getContentPane().add(F8);
        F8.setBounds(700, 630, 150, 210);

        F7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\futbolkart.png")); // NOI18N
        getContentPane().add(F7);
        F7.setBounds(860, 630, 150, 210);

        F6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\futbolkart.png")); // NOI18N
        getContentPane().add(F6);
        F6.setBounds(1020, 630, 150, 210);

        F5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\futbolkart.png")); // NOI18N
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

        B8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\basketkart.png")); // NOI18N
        getContentPane().add(B8);
        B8.setBounds(490, 630, 150, 210);

        B7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\basketkart.png")); // NOI18N
        getContentPane().add(B7);
        B7.setBounds(330, 630, 150, 210);

        B6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\basketkart.png")); // NOI18N
        getContentPane().add(B6);
        B6.setBounds(170, 630, 150, 210);

        B5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\basketkart.png")); // NOI18N
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

        play_butonu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\play.png")); // NOI18N
        play_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_butonuActionPerformed(evt);
            }
        });
        getContentPane().add(play_butonu);
        play_butonu.setBounds(490, 340, 370, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Feyzanur\\Downloads\\anaekran.png")); // NOI18N
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
    }// </editor-fold>                        

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {
        isim_gir.setVisible(false);

        a = (int) (Math.random() * 8);
        b = (int) (Math.random() * 8);
        while (a == b) {
            b = (int) (Math.random() * 8);

        }
        c = (int) (Math.random() * 8);
        while (a == c || b == c) {
            c = (int) (Math.random() * 8);
        }
        d = (int) (Math.random() * 8);
        while (a == d || b == d || c == d) {
            d = (int) (Math.random() * 8);
        }
        k = (int) (Math.random() * 8);
        while (a == k || b == k || c == k || d == k) {
            k = (int) (Math.random() * 8);
        }
        l = (int) (Math.random() * 8);
        while (a == l || b == l || c == l || d == l || k == l) {
            l = (int) (Math.random() * 8);
        }
        m = (int) (Math.random() * 8);
        while (a == m || b == m || c == m || d == m || k == m || l == m) {
            m = (int) (Math.random() * 8);
        }
        n = (int) (Math.random() * 8);
        while (a == n || b == n || c == n || d == n || k == n || l == n || m == n) {
            n = (int) (Math.random() * 8);
        }

        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(a) + ".png")));
        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(b) + ".png")));
        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(c) + ".png")));
        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(d) + ".png")));

        e = (int) (Math.random() * 8);
        f = (int) (Math.random() * 8);
        while (e == f) {
            f = (int) (Math.random() * 8);

        }
        g = (int) (Math.random() * 8);
        while (e == g || f == g) {
            g = (int) (Math.random() * 8);
        }
        h = (int) (Math.random() * 8);
        while (e == h || f == h || g == h) {
            h = (int) (Math.random() * 8);
        }
        p = (int) (Math.random() * 8);
        while (e == p || f == p || g == p || h == p) {
            p = (int) (Math.random() * 8);
        }
        r = (int) (Math.random() * 8);
        while (e == r || f == r || g == r || h == r || p == r) {
            r = (int) (Math.random() * 8);
        }
        s = (int) (Math.random() * 8);
        while (e == s || f == s || g == s || h == s || p == s || r == s) {
            s = (int) (Math.random() * 8);
        }
        q = (int) (Math.random() * 8);
        while (e == q || f == q || g == q || h == q || p == q || r == q || s == q) {
            q = (int) (Math.random() * 8);
        }

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(e) + ".jpg")));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(f) + ".jpg")));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(g) + ".jpg")));
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(h) + ".jpg")));

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

        String username = name.getText();
        kullaniciadi.setText(username);
        name.setVisible(false);
        kullaniciadi.setVisible(true);
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
        futbolcu_oyuncular.add(SadioManÃƒÂ©);
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

    }

    private void isim_girActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void play_butonuActionPerformed(java.awt.event.ActionEvent evt) {
        play_butonu.setVisible(false);
        isim_gir.setVisible(true);
        name.setVisible(true);
    }

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {
        F1.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(a) + ".png")));
        F5.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(k) + ".png")));
        secimf1 = a;//insan
        SecimYapf(secimf1);
        secimf2 = k;//bilgisayar
        SecimYapf(secimf2);
        rastgelePozisyonSecmef(secimfp);
        if (rastgelePozisyonSecmef(secimfp) == 1) {//penalti
            if (futbolcu_oyuncular.get(a).getPenalti() > futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getPenalti() < futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimfp) == 2) {//kaleciyle karsi karsiya
            if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() > futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() < futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimfp) == 3){// serbest vurus
            if (futbolcu_oyuncular.get(a).getSerbestVurus() > futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getSerbestVurus() < futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }

    }

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {
        F2.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(b) + ".png")));
        F6.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(l) + ".png")));
        secimf1 = b;
        SecimYapf(secimf1);
        secimf2 = l;
        SecimYapf(secimf2);
        rastgelePozisyonSecmef(secimfp);
         if (rastgelePozisyonSecmef(secimfp) == 1) {//penalti
            if (futbolcu_oyuncular.get(a).getPenalti() > futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getPenalti() < futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimfp) == 2) {//kaleciyle karsi karsiya
            if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() > futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() < futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimfp) == 3){// serbest vurus
            if (futbolcu_oyuncular.get(a).getSerbestVurus() > futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getSerbestVurus() < futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }

    }

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {
        F3.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(c) + ".png")));
        F7.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(m) + ".png")));
        secimf1 = c;
        SecimYapf(secimf1);
        secimf2 = m;
        SecimYapf(secimf2);
        rastgelePozisyonSecmef(secimfp);
         if (rastgelePozisyonSecmef(secimfp) == 1) {//penalti
            if (futbolcu_oyuncular.get(a).getPenalti() > futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getPenalti() < futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimfp) == 2) {//kaleciyle karsi karsiya
            if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() > futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() < futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimfp) == 3){// serbest vurus
            if (futbolcu_oyuncular.get(a).getSerbestVurus() > futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getSerbestVurus() < futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }

    }

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {
        F4.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(d) + ".png")));
        F8.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(n) + ".png")));
        secimf1 = d;
        SecimYapf(secimf1);
        secimf2 = n;
        SecimYapf(secimf2);
        rastgelePozisyonSecmef(secimfp);
         if (rastgelePozisyonSecmef(secimfp) == 1) {//penalti
            if (futbolcu_oyuncular.get(a).getPenalti() > futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getPenalti() < futbolcu_oyuncular.get(k).getPenalti()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimfp) == 2) {//kaleciyle karsi karsiya
            if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() > futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getKaleciylekarsikarsiya() < futbolcu_oyuncular.get(k).getKaleciylekarsikarsiya()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimfp) == 3){// serbest vurus
            if (futbolcu_oyuncular.get(a).getSerbestVurus() > futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (futbolcu_oyuncular.get(a).getSerbestVurus() < futbolcu_oyuncular.get(k).getSerbestVurus()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }

    }

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {
        B1.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(e) + ".jpg")));
        B5.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(p) + ".jpg")));
        secimb1 = e;
        SecimYapb(secimb1);
        secimb2 = p;
        SecimYapb(secimb2);
        rastgelePozisyonSecmeb(secimbp);
         if (rastgelePozisyonSecmeb(secimbp) == 4) {//ikilik
            if (basketbolcu_oyuncular.get(a).getIkilik() > basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getIkilik() < basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimbp) == 5) {//Ã¼clÃ¼k
            if (basketbolcu_oyuncular.get(a).getÜclük()> basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getÜclük()< basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimbp) == 6){// serbest atis
            if (basketbolcu_oyuncular.get(a).getSerbestAtis() > basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getSerbestAtis() < basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }

    }

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {
        B2.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(f) + ".jpg")));
        B6.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(r) + ".jpg")));
        secimb1 = f;
        SecimYapb(secimb1);
        secimb2 = r;
        SecimYapb(secimb2);
        rastgelePozisyonSecmeb(secimbp);
           if (rastgelePozisyonSecmeb(secimbp) == 4) {//ikilik
            if (basketbolcu_oyuncular.get(a).getIkilik() > basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getIkilik() < basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimbp) == 5) {//Ã¼clÃ¼k
            if (basketbolcu_oyuncular.get(a).getÜclük()> basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getÜclük()< basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimbp) == 6){// serbest atis
            if (basketbolcu_oyuncular.get(a).getSerbestAtis() > basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getSerbestAtis() < basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
    }

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {
        B3.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(g) + ".jpg")));
        B7.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(s) + ".jpg")));
        secimb1 = g;
        SecimYapb(secimb1);
        secimb2 = s;
        SecimYapb(secimb2);
        rastgelePozisyonSecmeb(secimbp);
           if (rastgelePozisyonSecmeb(secimbp) == 4) {//ikilik
            if (basketbolcu_oyuncular.get(a).getIkilik() > basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getIkilik() < basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimbp) == 5) {//Ã¼clÃ¼k
            if (basketbolcu_oyuncular.get(a).getÜclük()> basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getÜclük()< basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimbp) == 6){// serbest atis
            if (basketbolcu_oyuncular.get(a).getSerbestAtis() > basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getSerbestAtis() < basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
    }

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {
        B4.setVisible(false);
        oyuncu_alani.setVisible(true);
        pozisyon.setVisible(true);

        oyuncu_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(h) + ".jpg")));
        B8.setVisible(false);
        bilgisayar_alani.setVisible(true);
        bilgisayar_alani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/" + String.valueOf(q) + ".jpg")));
        secimb1 = h;
        SecimYapb(secimb1);
        secimb2 = q;
        SecimYapb(secimb2);
        rastgelePozisyonSecmeb(secimbp);
           if (rastgelePozisyonSecmeb(secimbp) == 4) {//ikilik
            if (basketbolcu_oyuncular.get(a).getIkilik() > basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getIkilik() < basketbolcu_oyuncular.get(k).getIkilik()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        } else if (rastgelePozisyonSecmef(secimbp) == 5) {//Ã¼clÃ¼k
            if (basketbolcu_oyuncular.get(a).getÜclük()> basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getÜclük()< basketbolcu_oyuncular.get(k).getÜclük()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
        else if (rastgelePozisyonSecmef(secimbp) == 6){// serbest atis
            if (basketbolcu_oyuncular.get(a).getSerbestAtis() > basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(oyuncu.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else if (basketbolcu_oyuncular.get(a).getSerbestAtis() < basketbolcu_oyuncular.get(k).getSerbestAtis()) {
                yazi.setText(Bot.getOyuncuAdi() + "10 puan kazandÄ±nÄ±z.");
                oyuncu.puanEkle();
                oyuncuyazi.setText(oyuncu.getOyuncuAdi() + " : " + oyuncu.getSkor());
                botyazi.setText(Bot.getOyuncuAdi() + " : " + Bot.getSkor());
            } else {
                yazi.setText("Berabere!");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    // Variables declaration - do not modify                     
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
    private javax.swing.JTextField kullaniciadi;
    private javax.swing.JTextField name;
    private javax.swing.JButton oyuncu_alani;
    private javax.swing.JTextField oyuncu_skoru;
    private javax.swing.JButton play_butonu;
    private javax.swing.JTextField pozisyon;
    private javax.swing.JTextField yazi;
    private javax.swing.JTextField oyuncuyazi;
    private javax.swing.JTextField botyazi;

    // End of variables declaration                   
}
