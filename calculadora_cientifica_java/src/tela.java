/**
 *
 * @author Yasmim/TinyHero
 */
public class tela extends javax.swing.JFrame {
    private boolean igual,inicio=true,operacao1,operacao2;
    private double a,b,c,cos,acos,sin,asin,tan,atan,memoria=0,resultado,valor1,valor2;
    private String funcoes,tipoOperacoes;

    public tela() {
        initComponents();
        Label_Memoria.setVisible(igual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RadioButton_Graus = new javax.swing.JRadioButton();
        RadioButton_Radianos = new javax.swing.JRadioButton();
        txtPrincipal = new javax.swing.JTextField();
        txtPrevio = new javax.swing.JTextField();
        Label_Memoria = new javax.swing.JLabel();
        botao_raiz3 = new javax.swing.JButton();
        botao_mmais = new javax.swing.JButton();
        botao_maismenos = new javax.swing.JButton();
        botao_cos = new javax.swing.JButton();
        botao_divisao = new javax.swing.JButton();
        botao_igual = new javax.swing.JButton();
        botao_mc = new javax.swing.JButton();
        botao_multiplicacao = new javax.swing.JButton();
        botao_menos = new javax.swing.JButton();
        botao_ms = new javax.swing.JButton();
        botao_soma = new javax.swing.JButton();
        botao_porcentagem = new javax.swing.JButton();
        botao_acos = new javax.swing.JButton();
        botao_elevado2 = new javax.swing.JButton();
        botao_c = new javax.swing.JButton();
        botao_1x = new javax.swing.JButton();
        botao_log = new javax.swing.JButton();
        botao_apagar = new javax.swing.JButton();
        botao_pi = new javax.swing.JButton();
        botao_e = new javax.swing.JButton();
        botao_fat = new javax.swing.JButton();
        botao_10x = new javax.swing.JButton();
        botao_sin = new javax.swing.JButton();
        botao_asin = new javax.swing.JButton();
        botao_xmenos1 = new javax.swing.JButton();
        botao_raizyz = new javax.swing.JButton();
        botao_mmenos = new javax.swing.JButton();
        botao_mr = new javax.swing.JButton();
        botao_exp = new javax.swing.JButton();
        botao_ce = new javax.swing.JButton();
        botao_tan = new javax.swing.JButton();
        botao_atan = new javax.swing.JButton();
        botao_expoente = new javax.swing.JButton();
        botao_raiz = new javax.swing.JButton();
        botao_elevado3 = new javax.swing.JButton();
        botao_1 = new javax.swing.JButton();
        botao_0 = new javax.swing.JButton();
        botao_7 = new javax.swing.JButton();
        botao_4 = new javax.swing.JButton();
        botao_2 = new javax.swing.JButton();
        botao_ponto = new javax.swing.JButton();
        botao_8 = new javax.swing.JButton();
        botao_5 = new javax.swing.JButton();
        botao_3 = new javax.swing.JButton();
        botao_9 = new javax.swing.JButton();
        botao_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(RadioButton_Graus);
        RadioButton_Graus.setSelected(true);
        RadioButton_Graus.setText("Graus");

        buttonGroup1.add(RadioButton_Radianos);
        RadioButton_Radianos.setText("Radianos");

        txtPrincipal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPrincipal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrincipal.setText("0");
        txtPrincipal.setBorder(null);

        txtPrevio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrevio.setBorder(null);
        txtPrevio.setFocusable(false);

        Label_Memoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Memoria.setText("M");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RadioButton_Graus)
                        .addGap(18, 18, 18)
                        .addComponent(RadioButton_Radianos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_Memoria))
                    .addComponent(txtPrincipal)
                    .addComponent(txtPrevio)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton_Graus)
                            .addComponent(RadioButton_Radianos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Label_Memoria)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_raiz3.setText("3√x");
        botao_raiz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_raiz3ActionPerformed(evt);
            }
        });

        botao_mmais.setText("M+");
        botao_mmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_mmaisActionPerformed(evt);
            }
        });

        botao_maismenos.setText("±");
        botao_maismenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_maismenosActionPerformed(evt);
            }
        });

        botao_cos.setText("cos");
        botao_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cosActionPerformed(evt);
            }
        });

        botao_divisao.setText("/");
        botao_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_divisaoActionPerformed(evt);
            }
        });

        botao_igual.setText("=");
        botao_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_igualActionPerformed(evt);
            }
        });

        botao_mc.setText("MC");
        botao_mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_mcActionPerformed(evt);
            }
        });

        botao_multiplicacao.setText("*");
        botao_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_multiplicacaoActionPerformed(evt);
            }
        });

        botao_menos.setText("-");
        botao_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_menosActionPerformed(evt);
            }
        });

        botao_ms.setText("MS");
        botao_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_msActionPerformed(evt);
            }
        });

        botao_soma.setText("+");
        botao_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_somaActionPerformed(evt);
            }
        });

        botao_porcentagem.setText("%");
        botao_porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_porcentagemActionPerformed(evt);
            }
        });

        botao_acos.setText("cos-1");
        botao_acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_acosActionPerformed(evt);
            }
        });

        botao_elevado2.setText("x^2");
        botao_elevado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_elevado2ActionPerformed(evt);
            }
        });

        botao_c.setForeground(new java.awt.Color(255, 153, 51));
        botao_c.setText("C");
        botao_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cActionPerformed(evt);
            }
        });

        botao_1x.setText("1/X");
        botao_1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_1xActionPerformed(evt);
            }
        });

        botao_log.setText("log");
        botao_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_logActionPerformed(evt);
            }
        });

        botao_apagar.setText("<-");
        botao_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_apagarActionPerformed(evt);
            }
        });

        botao_pi.setText("pi(x)");
        botao_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_piActionPerformed(evt);
            }
        });

        botao_e.setText("e");
        botao_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_eActionPerformed(evt);
            }
        });

        botao_fat.setText("n!");
        botao_fat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_fatActionPerformed(evt);
            }
        });

        botao_10x.setText("10^x");
        botao_10x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_10xActionPerformed(evt);
            }
        });

        botao_sin.setText("sin");
        botao_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_sinActionPerformed(evt);
            }
        });

        botao_asin.setText("sin-1");
        botao_asin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_asinActionPerformed(evt);
            }
        });

        botao_xmenos1.setText("x^-1");
        botao_xmenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_xmenos1ActionPerformed(evt);
            }
        });

        botao_raizyz.setText("y√x");
        botao_raizyz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_raizyzActionPerformed(evt);
            }
        });

        botao_mmenos.setText("M-");
        botao_mmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_mmenosActionPerformed(evt);
            }
        });

        botao_mr.setText("MR");
        botao_mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_mrActionPerformed(evt);
            }
        });

        botao_exp.setText("EXP");
        botao_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_expActionPerformed(evt);
            }
        });

        botao_ce.setForeground(new java.awt.Color(255, 153, 51));
        botao_ce.setText("CE");
        botao_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ceActionPerformed(evt);
            }
        });

        botao_tan.setText("tan");
        botao_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_tanActionPerformed(evt);
            }
        });

        botao_atan.setText("tan-1");
        botao_atan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_atanActionPerformed(evt);
            }
        });

        botao_expoente.setText("x^y");
        botao_expoente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_expoenteActionPerformed(evt);
            }
        });

        botao_raiz.setText("√");
        botao_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_raizActionPerformed(evt);
            }
        });

        botao_elevado3.setText("x^3");
        botao_elevado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_elevado3ActionPerformed(evt);
            }
        });

        botao_1.setBackground(new java.awt.Color(255, 255, 255));
        botao_1.setText("1");
        botao_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_1ActionPerformed(evt);
            }
        });

        botao_0.setBackground(new java.awt.Color(255, 255, 255));
        botao_0.setText("0");
        botao_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_0ActionPerformed(evt);
            }
        });

        botao_7.setBackground(new java.awt.Color(255, 255, 255));
        botao_7.setText("7");
        botao_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_7ActionPerformed(evt);
            }
        });

        botao_4.setBackground(new java.awt.Color(255, 255, 255));
        botao_4.setText("4");
        botao_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_4ActionPerformed(evt);
            }
        });

        botao_2.setBackground(new java.awt.Color(255, 255, 255));
        botao_2.setText("2");
        botao_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_2ActionPerformed(evt);
            }
        });

        botao_ponto.setText(".");
        botao_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pontoActionPerformed(evt);
            }
        });

        botao_8.setBackground(new java.awt.Color(255, 255, 255));
        botao_8.setText("8");
        botao_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_8ActionPerformed(evt);
            }
        });

        botao_5.setBackground(new java.awt.Color(255, 255, 255));
        botao_5.setText("5");
        botao_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_5ActionPerformed(evt);
            }
        });

        botao_3.setBackground(new java.awt.Color(255, 255, 255));
        botao_3.setText("3");
        botao_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_3ActionPerformed(evt);
            }
        });

        botao_9.setBackground(new java.awt.Color(255, 255, 255));
        botao_9.setText("9");
        botao_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_9ActionPerformed(evt);
            }
        });

        botao_6.setBackground(new java.awt.Color(255, 255, 255));
        botao_6.setText("6");
        botao_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_acos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_e, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_fat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_10x, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_asin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_raizyz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_raiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_atan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_expoente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_elevado3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_elevado2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_log, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_ce, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_c, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botao_8, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(botao_5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(botao_2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botao_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_mmais, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_maismenos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_mmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_atan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_expoente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_elevado3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_elevado2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_cos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_acos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_e, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_fat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_sin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_asin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_raizyz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_raiz3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botao_10x, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao_log, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_ce, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_c, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botao_8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botao_2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botao_mmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botao_mmais, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_maismenos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botao_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botao_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botao_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Definindo o número 1
    private void botao_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_1ActionPerformed
          //Condição variavel inicio
          //isso serve para um número não sobrescrever o outro
        if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("1");
            inicio=false;     
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"1");
        }
    }//GEN-LAST:event_botao_1ActionPerformed

    //Definindo o número 0
    private void botao_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_0ActionPerformed
        if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("0");
            inicio=false;
            
        }
        else{
            
            txtPrincipal.setText(txtPrincipal.getText()+"0");
            inicio=false;
        }
        
    }//GEN-LAST:event_botao_0ActionPerformed

    //Definindo o número 2
    private void botao_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_2ActionPerformed
        if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("2");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"2");
        }
    }//GEN-LAST:event_botao_2ActionPerformed

    //Definindo o número 3
    private void botao_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_3ActionPerformed
if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("3");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"3");
        }
    }//GEN-LAST:event_botao_3ActionPerformed

    //Definindo o número 4
    private void botao_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_4ActionPerformed
if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("4");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"4");
        }
    }//GEN-LAST:event_botao_4ActionPerformed

    //Definindo o número 5
    private void botao_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_5ActionPerformed
if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("5");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"5");
        }
    }//GEN-LAST:event_botao_5ActionPerformed

    //Definindo o número 6
    private void botao_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_6ActionPerformed
if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("6");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"6");
        }
    }//GEN-LAST:event_botao_6ActionPerformed

    //Definindo o número 7
    private void botao_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_7ActionPerformed
if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("7");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"7");
        }    }//GEN-LAST:event_botao_7ActionPerformed

    //Definindo o número 8
    private void botao_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_8ActionPerformed
        if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("8");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"8");
        }    }//GEN-LAST:event_botao_8ActionPerformed

    //Definindo o número 9
    private void botao_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_9ActionPerformed
        if(inicio == true){
            txtPrincipal.setText("");
            txtPrincipal.setText("9");
            inicio=false;
            
        }
        else{
            txtPrincipal.setText(txtPrincipal.getText()+"9");
        }
    }//GEN-LAST:event_botao_9ActionPerformed

    //Definindo o ponto
    private void botao_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pontoActionPerformed
        //Esse if serve para não poder escrever mais de um ponto
        if(txtPrincipal.getText().contains(".")){}
        else{
            txtPrincipal.setText(txtPrincipal.getText()+".");
            inicio=false;
        }
    }//GEN-LAST:event_botao_pontoActionPerformed

    //Definindo a soma
    private void botao_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_somaActionPerformed
        igual = true;
        inicio = true;
        //Condição da variavel operacao1
        if(operacao1 = true){
            valor1 = Double.parseDouble(txtPrincipal.getText());
            txtPrevio.setText("");
            txtPrevio.setText(txtPrincipal.getText()+"+");
            operacao1 = false;
        }
        else{
            if(operacao2 = true){
                valor1 = Double.parseDouble(txtPrincipal.getText());
                txtPrevio.setText("");
                txtPrevio.setText(txtPrincipal.getText()+"+");
                operacao1 = false;
            }   
            else{
                txtPrevio.setText(txtPrincipal.getText()+"+");
                Operacoes(resultado,valor2);
            }
        }
        tipoOperacoes = "+";
    }//GEN-LAST:event_botao_somaActionPerformed

    //Definindo o menos
    private void botao_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_menosActionPerformed
        igual = true;
        inicio = true;
        //Condição da variavel operacao1
        if(operacao1 = true){
            valor1 = Double.parseDouble(txtPrincipal.getText());
            txtPrevio.setText("");
            txtPrevio.setText(txtPrincipal.getText()+"-");
            operacao1 = false;
        }
        else{
            if(operacao2 = true){
                valor1 = Double.parseDouble(txtPrincipal.getText());
                txtPrevio.setText("");
                txtPrevio.setText(txtPrincipal.getText()+"-");
                operacao1 = false;
            }   
            else{
                txtPrevio.setText(txtPrincipal.getText()+"-");
                Operacoes(resultado,valor2);
            }
        }
        tipoOperacoes = "-";
    }//GEN-LAST:event_botao_menosActionPerformed

    //Definindo a multiplicação
    private void botao_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_multiplicacaoActionPerformed
       igual = true;
        inicio = true;
        //Condição da variavel operacao1
        if(operacao1 = true){
            valor1 = Double.parseDouble(txtPrincipal.getText());
            txtPrevio.setText("");
            txtPrevio.setText(txtPrincipal.getText()+"*");
            operacao1 = false;
        }
        else{
            if(operacao2 = true){
                valor1 = Double.parseDouble(txtPrincipal.getText());
                txtPrevio.setText("");
                txtPrevio.setText(txtPrincipal.getText()+"*");
                operacao1 = false;
            }   
            else{
                txtPrevio.setText(txtPrincipal.getText()+"*");
                Operacoes(resultado,valor2);
            }
        }
        tipoOperacoes = "*";
    }//GEN-LAST:event_botao_multiplicacaoActionPerformed

    //Definindo a divisão
    private void botao_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_divisaoActionPerformed
       igual = true;
        inicio = true;
        //Condição da variavel operacao1
        if(operacao1 = true){
            valor1 = Double.parseDouble(txtPrincipal.getText());
            txtPrevio.setText("");
            txtPrevio.setText(txtPrincipal.getText()+"/");
            operacao1 = false;
        }
        else{
            if(operacao2 = true){
                valor1 = Double.parseDouble(txtPrincipal.getText());
                txtPrevio.setText("");
                txtPrevio.setText(txtPrincipal.getText()+"/");
                operacao1 = false;
            }   
            else{
                txtPrevio.setText(txtPrincipal.getText()+"/");
                Operacoes(resultado,valor2);
            }
        }
        tipoOperacoes = "/";
    }//GEN-LAST:event_botao_divisaoActionPerformed

    //Metodo com as operações de soma, menos, divisão, multiplicação, potenciação e raiz.
    private void Operacoes(double valor1, double valor ){
        //switch que vê a variavel tipoOperacoes
        switch(tipoOperacoes){
            //Case com a função de soma
            case "+":
                resultado = valor1 + valor2;
                txtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(txtPrincipal.getText());
                break;
                
            case "-":
                resultado = valor1 - valor2;
                txtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(txtPrincipal.getText());
                break;
                
            case "*":
                resultado = valor1 * valor2;
                txtPrincipal.setText(resultado + "");
                valor1 = Double.parseDouble(txtPrincipal.getText());
                break;
                
            case "/":
                if(valor2 == 0){
                    txtPrincipal.setText("Não existe número dividido por 0");
                    break;
                }
                else{
                    resultado = valor1 / valor2;
                    txtPrincipal.setText(resultado + "");
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    break;
                }
                //Caso da potencia
            case "potencia":
                resultado = Math.pow(valor1,valor2);
                txtPrincipal.setText(resultado+"");
                break;
                
            case "raizx":
                if(valor2 <= 0){
                    txtPrincipal.setText("Erro");
                    break;
                }
                else{
                    txtPrevio.setText(valor2 + "yroot");
                    a = 1;
                    c = a/valor2;
                    txtPrincipal.setText(Math.pow(valor1,c)+"");
                    break;
                }
        }
    }
    
    
    
    private void botao_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_igualActionPerformed
        inicio = true;
        operacao1 = true;
        if(igual = true){
            if(tipoOperacoes == null){}
            else{
            valor2 = Double.parseDouble(txtPrincipal.getText());
            txtPrevio.setText(txtPrevio.getText() + txtPrincipal.getText());
            Operacoes(valor1,valor2);
            igual = false;
            }     
        }
        else{
            txtPrevio.setText("");
            Operacoes(valor1,valor2);
        }
    }//GEN-LAST:event_botao_igualActionPerformed

    private void botao_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_raizActionPerformed
        valor1 = Double.parseDouble(txtPrincipal.getText());
        if(valor1 >= 0){
            txtPrevio.setText("sqrt("+valor1+")");
            txtPrincipal.setText(Math.sqrt(valor1)+"");   
        }
        else{
            txtPrincipal.setText("Não existe raiz quadrada de número negativo");
        }
    }//GEN-LAST:event_botao_raizActionPerformed

    private void botao_porcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_porcentagemActionPerformed
        valor2 = Double.parseDouble(txtPrincipal.getText());
        txtPrevio.setText(txtPrevio.getText()+txtPrincipal.getText());
        txtPrincipal.setText((valor1*valor2)/100+"");
        igual = true;
    }//GEN-LAST:event_botao_porcentagemActionPerformed

    private void botao_1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_1xActionPerformed
        valor1 = Double.parseDouble(txtPrincipal.getText());
        txtPrevio.setText("reciproc("+valor1+")");
        txtPrincipal.setText(1/valor1 + "");
    }//GEN-LAST:event_botao_1xActionPerformed

    private void botao_maismenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_maismenosActionPerformed
        double nu1=0,nu2,nu3;
        nu2 = Double.parseDouble(txtPrincipal.getText());
        nu3 = nu1 - nu2;
        txtPrincipal.setText(nu3 + "");
    }//GEN-LAST:event_botao_maismenosActionPerformed

    private void botao_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cActionPerformed
        txtPrincipal.setText("0");
        txtPrevio.setText("");
        inicio = true;
        funcoes = "";
        operacao1 = true;
        operacao2 = true;
        igual = true;
        valor1 = 0;
        valor2 = 0;
        resultado = 0;    
    }//GEN-LAST:event_botao_cActionPerformed

    private void botao_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ceActionPerformed
        txtPrincipal.setText("0");
        txtPrevio.setText("");
        inicio = true;
        funcoes = "";
    }//GEN-LAST:event_botao_ceActionPerformed

    private void botao_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_apagarActionPerformed
        if(txtPrincipal.getText().length()>0){
            txtPrincipal.setText(txtPrincipal.getText().substring(0,txtPrincipal.getText().length()-1));
            if(txtPrincipal.getText().length() == 0){
                txtPrincipal.setText("0");
                inicio = true;
            }
        }
    }//GEN-LAST:event_botao_apagarActionPerformed

        //Metodo trigonometrico
    public void Trigonometria(){
        if(RadioButton_Graus.isSelected()){
            //Switch que vê a variavel função
            switch(funcoes){
                //seno
                case "sin":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("sin("+valor1+")");
                    sin = Math.sin(Math.PI*(valor1)/180);
                    txtPrincipal.setText(sin+"");
                    break;
                //seno inverso
                case "asin":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("asin("+valor1+")");
                    asin = Math.asin(valor1)*180/Math.PI;
                    txtPrincipal.setText(asin+"");
                    break;
                    
                //cos
                case "cos":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("cos("+valor1+")");
                    cos = Math.cos(Math.PI*(valor1)/180);
                    txtPrincipal.setText(cos+"");
                    break;
                //cos inverso
                case "acos":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("acos("+valor1+")");
                    acos = Math.acos(valor1)*180/Math.PI;
                    txtPrincipal.setText(acos+"");
                    break;
                    
                //tan
                case "tan":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("tan("+valor1+")");
                    tan = Math.tan(Math.PI*(valor1)/180);
                    txtPrincipal.setText(tan+"");
                    break;
                //cos inverso
                case "atan":
                    valor1 = Double.parseDouble(txtPrincipal.getText());
                    txtPrevio.setText("atan("+valor1+")");
                    atan = Math.atan(valor1)*180/Math.PI;
                    txtPrincipal.setText(atan+"");
                    break;
            } 
        }
        else{
            if(RadioButton_Radianos.isSelected()){
                //Switch que vê a variavel função
                switch(funcoes){
                    //seno
                    case "sin":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("sinr("+valor1+")");
                        sin = Math.sin(valor1);
                        txtPrincipal.setText(sin+"");
                        break;
                    //seno inverso
                    case "asin":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("asinr("+valor1+")");
                        asin = Math.asin(valor1);
                        txtPrincipal.setText(asin+"");
                        break;

                    //cos
                    case "cos":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("cosr("+valor1+")");
                        cos = Math.cos(valor1);
                        txtPrincipal.setText(cos+"");
                        break;
                    //cos inverso
                    case "acos":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("acosr("+valor1+")");
                        acos = Math.acos(valor1);
                        txtPrincipal.setText(acos+"");
                        break;

                    //tan
                    case "tan":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("tanr("+valor1+")");
                        tan = Math.tan(valor1);
                        txtPrincipal.setText(tan+"");
                        break;
                    //cos inverso
                    case "atan":
                        valor1 = Double.parseDouble(txtPrincipal.getText());
                        txtPrevio.setText("atanr("+valor1+")");
                        atan = Math.atan(valor1);
                        txtPrincipal.setText(atan+"");
                        break;
                }
            }
        }
    }
    private void botao_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cosActionPerformed
        funcoes = "cos";
        Trigonometria();
    }//GEN-LAST:event_botao_cosActionPerformed

    private void botao_acosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_acosActionPerformed
        funcoes = "acos";
        Trigonometria();
    }//GEN-LAST:event_botao_acosActionPerformed

    private void botao_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_sinActionPerformed
        funcoes = "sin";
        Trigonometria();
    }//GEN-LAST:event_botao_sinActionPerformed

    private void botao_asinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_asinActionPerformed
        funcoes = "asin";
        Trigonometria();
    }//GEN-LAST:event_botao_asinActionPerformed

    private void botao_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_tanActionPerformed
        funcoes = "tan";
        Trigonometria();
    }//GEN-LAST:event_botao_tanActionPerformed

    private void botao_atanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_atanActionPerformed
        funcoes = "atan";
        Trigonometria();
    }//GEN-LAST:event_botao_atanActionPerformed

    private void botao_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_piActionPerformed
        txtPrevio.setText("PI ");
        txtPrincipal.setText(Math.PI+"");
    }//GEN-LAST:event_botao_piActionPerformed

    private void botao_xmenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_xmenos1ActionPerformed
       valor1 = Double.parseDouble(txtPrincipal.getText());
       txtPrevio.setText(valor1+"^-1");
       txtPrincipal.setText(Math.pow(valor1,-1)+"");
    }//GEN-LAST:event_botao_xmenos1ActionPerformed

    private void botao_expoenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_expoenteActionPerformed
       inicio = true;
       valor1 = Double.parseDouble(txtPrincipal.getText());
       txtPrevio.setText(valor1+"^");
       tipoOperacoes="potencia";
       operacao1=false;
       igual=true;
    }//GEN-LAST:event_botao_expoenteActionPerformed

    private void botao_raizyzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_raizyzActionPerformed
        inicio = true;
        valor1 = Double.parseDouble(txtPrincipal.getText());
        txtPrevio.setText(valor1+"yroot");
        tipoOperacoes = "raizx";
        operacao1 = false;
        igual = true;
    }//GEN-LAST:event_botao_raizyzActionPerformed

    private void botao_elevado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_elevado3ActionPerformed
        valor1 = Double.parseDouble(txtPrincipal.getText());
        txtPrevio.setText("cube("+valor1+")");
        txtPrincipal.setText(Math.pow(valor1, 3)+"");
    }//GEN-LAST:event_botao_elevado3ActionPerformed

    private void botao_fatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_fatActionPerformed
        a = 1;
        valor1 = Double.parseDouble(txtPrincipal.getText());
        txtPrevio.setText("fact("+valor1+")");
        for(b=1;b<=valor1;b++){
            a=a*b;
        }
        txtPrincipal.setText(a+"");
    }//GEN-LAST:event_botao_fatActionPerformed

    private void botao_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_eActionPerformed
        txtPrevio.setText("E");
        txtPrincipal.setText(Math.E+"");
    }//GEN-LAST:event_botao_eActionPerformed

    private void botao_raiz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_raiz3ActionPerformed
      valor1 = Double.parseDouble(txtPrincipal.getText());
      a = 1;
      b = 3;
      c = a/b;
      txtPrevio.setText("cuberoot("+valor1+")");
      txtPrincipal.setText(Math.pow(valor1,c)+"");
    }//GEN-LAST:event_botao_raiz3ActionPerformed

    private void botao_elevado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_elevado2ActionPerformed
    valor1 = Double.parseDouble(txtPrincipal.getText());
    txtPrevio.setText("sqr("+valor1+")");
    txtPrincipal.setText(Math.pow(valor1,2)+"");
    }//GEN-LAST:event_botao_elevado2ActionPerformed

    private void botao_10xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_10xActionPerformed
    valor1 = Double.parseDouble(txtPrincipal.getText());
    txtPrevio.setText("powten("+valor1+")");
    txtPrincipal.setText(Math.pow(10,valor1)+"");

    }//GEN-LAST:event_botao_10xActionPerformed

    private void botao_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_expActionPerformed
    valor1 = Double.parseDouble(txtPrincipal.getText());
    txtPrincipal.setText(Math.exp(valor1)+"");
    }//GEN-LAST:event_botao_expActionPerformed

    private void botao_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_logActionPerformed
    valor1 = Double.parseDouble(txtPrincipal.getText());
    txtPrevio.setText("log("+valor1+")");
    txtPrincipal.setText(Math.log(valor1)+"");
    }//GEN-LAST:event_botao_logActionPerformed

    private void botao_mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_mcActionPerformed
    memoria = 0;
    Label_Memoria.setVisible(false);
    }//GEN-LAST:event_botao_mcActionPerformed

    private void botao_mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_mrActionPerformed
    txtPrincipal.setText(memoria+"");
    }//GEN-LAST:event_botao_mrActionPerformed

    private void botao_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_msActionPerformed
    memoria = Double.parseDouble((txtPrincipal.getText()));
    Label_Memoria.setVisible(true);
    }//GEN-LAST:event_botao_msActionPerformed

    private void botao_mmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_mmaisActionPerformed
    memoria = memoria + Double.parseDouble((txtPrincipal.getText()));
    Label_Memoria.setVisible(true);
    }//GEN-LAST:event_botao_mmaisActionPerformed

    private void botao_mmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_mmenosActionPerformed
    memoria = memoria - Double.parseDouble((txtPrincipal.getText()));
    Label_Memoria.setVisible(true);
    }//GEN-LAST:event_botao_mmenosActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Memoria;
    private javax.swing.JRadioButton RadioButton_Graus;
    private javax.swing.JRadioButton RadioButton_Radianos;
    private javax.swing.JButton botao_0;
    private javax.swing.JButton botao_1;
    private javax.swing.JButton botao_10x;
    private javax.swing.JButton botao_1x;
    private javax.swing.JButton botao_2;
    private javax.swing.JButton botao_3;
    private javax.swing.JButton botao_4;
    private javax.swing.JButton botao_5;
    private javax.swing.JButton botao_6;
    private javax.swing.JButton botao_7;
    private javax.swing.JButton botao_8;
    private javax.swing.JButton botao_9;
    private javax.swing.JButton botao_acos;
    private javax.swing.JButton botao_apagar;
    private javax.swing.JButton botao_asin;
    private javax.swing.JButton botao_atan;
    private javax.swing.JButton botao_c;
    private javax.swing.JButton botao_ce;
    private javax.swing.JButton botao_cos;
    private javax.swing.JButton botao_divisao;
    private javax.swing.JButton botao_e;
    private javax.swing.JButton botao_elevado2;
    private javax.swing.JButton botao_elevado3;
    private javax.swing.JButton botao_exp;
    private javax.swing.JButton botao_expoente;
    private javax.swing.JButton botao_fat;
    private javax.swing.JButton botao_igual;
    private javax.swing.JButton botao_log;
    private javax.swing.JButton botao_maismenos;
    private javax.swing.JButton botao_mc;
    private javax.swing.JButton botao_menos;
    private javax.swing.JButton botao_mmais;
    private javax.swing.JButton botao_mmenos;
    private javax.swing.JButton botao_mr;
    private javax.swing.JButton botao_ms;
    private javax.swing.JButton botao_multiplicacao;
    private javax.swing.JButton botao_pi;
    private javax.swing.JButton botao_ponto;
    private javax.swing.JButton botao_porcentagem;
    private javax.swing.JButton botao_raiz;
    private javax.swing.JButton botao_raiz3;
    private javax.swing.JButton botao_raizyz;
    private javax.swing.JButton botao_sin;
    private javax.swing.JButton botao_soma;
    private javax.swing.JButton botao_tan;
    private javax.swing.JButton botao_xmenos1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPrevio;
    private javax.swing.JTextField txtPrincipal;
    // End of variables declaration//GEN-END:variables
}
