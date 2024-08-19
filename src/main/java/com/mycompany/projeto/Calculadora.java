package com.mycompany.projeto;
import java.awt.event.KeyEvent;

public class Calculadora extends javax.swing.JFrame {
    
    private double acumulado;
    private double acumulado1;
    private int operacao;
    private String apagaValor = "";

    public Calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnPotencia = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        bntSeis = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(134, 245));
        setResizable(false);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(5, 4, 1, 1));

        btnPotencia.setText("x²");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnPotencia);

        btnRaiz.setText("√x");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel2.add(btnRaiz);

        btnApagar.setText("C");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagar);

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSoma);

        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });
        jPanel2.add(btnUm);

        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });
        jPanel2.add(btnDois);

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres);

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        jPanel2.add(btnSub);

        btnQuatro.setText("4");
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuatro);

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco);

        bntSeis.setText("6");
        bntSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSeisActionPerformed(evt);
            }
        });
        jPanel2.add(bntSeis);

        btnMultiplica.setText("x");
        btnMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplica);

        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSete);

        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });
        jPanel2.add(btnOito);

        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNove);

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivisao);

        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPonto);

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnZero);

        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentagem);

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual);

        txtValor.setFont(new java.awt.Font("Arial", 1, 18));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtValor.setToolTipText("");
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        // Adiciona o KeyListener para permitir apenas números e um ponto decimal
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                String text = txtValor.getText();

                // Verifica se o caractere é um dígito ou um ponto decimal
                if (Character.isDigit(c) || c == '.') {
                    // Se for um ponto decimal, verifica se já existe um ponto no texto
                    if (c == '.' && text.indexOf('.') != -1) {
                        evt.consume(); // Ignora o caractere se já houver um ponto
                    }
                } else if (c != KeyEvent.VK_BACK_SPACE) {
                    // Ignora o caractere se não for número, ponto decimal ou backspace
                    evt.consume();
                }
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        String texto = txtValor.getText();

        // Verifica se o campo está vazio ou se é apenas "0"
        if (texto.isEmpty() || texto.equals("0")) {
            return; // Não faz nada se não houver número
        }

        // Verifica se já existe um ponto no texto
        if (!texto.contains(".")) {
            txtValor.setText(texto + ".");
        }       
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        acumulado = 0;
        acumulado1 = 0;
        operacao = 0;
        txtValor.setText("0");
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
                                        
        // Obtém o texto do campo txtValor
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);

        // Processa a operação com base no valor de 'operacao'
        switch (operacao) {
            case 1: // Adição
                // Soma o valor ao acumulado
                if (acumulado == 0){
                    acumulado = valor;
                    txtValor.setText("0");
                }
                else if(acumulado !=0){
                    acumulado1=valor;
                    acumulado += acumulado1;
                    if (acumulado % 2 == 0){
                        int valorInt = (int) acumulado;
                        String valorString = String.valueOf(valorInt);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                    else{
                        String valorString = String.valueOf(acumulado);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                        acumulado = 0;
                        acumulado1 = 0;
                        operacao = 0;
                        break;
                }              
            case 2: // Subtração
                if (acumulado == 0) {
                    acumulado = valor;
                    txtValor.setText("0");
                } else {
                    acumulado1 = valor;
                    acumulado -= acumulado1;
                    if (acumulado % 2 == 0){
                        int valorInt = (int) acumulado;
                        String valorString = String.valueOf(valorInt);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                    else{
                        String valorString = String.valueOf(acumulado);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                }
                // Reseta acumulado e acumulado1 após a operação
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                break;

            case 3: // Multiplicação
                if (acumulado == 0) {
                    acumulado = valor;
                    txtValor.setText("0");
                } else {
                    acumulado1 = valor;
                    acumulado *= acumulado1;
                    if (acumulado % 2 == 0){
                        int valorInt = (int) acumulado;
                        String valorString = String.valueOf(valorInt);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                    else{
                        String valorString = String.valueOf(acumulado);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                }
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                break;

            case 4: // Divisão
                if (acumulado == 0) {
                    acumulado = valor;
                    txtValor.setText("0");
                } else {
                    acumulado1 = valor;
                    // Verifica se o denominador é diferente de zero para evitar divisão por zero
                    if (acumulado1 != 0) {
                        acumulado /= acumulado1;
                        if (acumulado % 2 == 0){
                            int valorInt = (int) acumulado;
                            String valorString = String.valueOf(valorInt);
                            // Limpa o campo de texto para o próximo valor
                            txtValor.setText(valorString);
                            apagaValor = valorString;
                        }
                        else{
                            String valorString = String.valueOf(acumulado);
                            // Limpa o campo de texto para o próximo valor
                            txtValor.setText(valorString);
                            apagaValor = valorString;
                        }
                    }
                }
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                break;
                
            case 5: //Potencia
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                txtValor.setText("0");
                break;
            case 6: //Raiz
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                txtValor.setText("0");
                break;
            case 7:       
                // Soma o valor ao acumulado
                if (acumulado == 0){
                    acumulado = valor;
                    txtValor.setText("0");
                }
                else if(acumulado !=0){
                    acumulado1=valor;
                    acumulado = (acumulado*acumulado1)/100;
                    if (acumulado % 2 == 0){
                        int valorInt = (int) acumulado;
                        String valorString = String.valueOf(valorInt);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                    else{
                        String valorString = String.valueOf(acumulado);
                        // Limpa o campo de texto para o próximo valor
                        txtValor.setText(valorString);
                        apagaValor = valorString;
                    }
                acumulado = 0;
                acumulado1 = 0;
                operacao = 0;
                break;
                }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // Evita adicionar múltiplos zeros desnecessários
        if (!txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText(txtValor.getText() + "0");
            apagaValor = "";
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("9");
            apagaValor = "";
        }
        else {
            txtValor.setText(txtValor.getText() + "9");
        }
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("8");
            apagaValor = "";
        }
        else {
            txtValor.setText(txtValor.getText() + "8");
        }
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("7");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "7");
        }
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != "") {
            txtValor.setText("4");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "4");
        }
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("5");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "5");
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void bntSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSeisActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("6");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "6");
        }
    }//GEN-LAST:event_bntSeisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != ""){
            txtValor.setText("3");
            apagaValor = "";
        }
        else {
            txtValor.setText(txtValor.getText() + "3");
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0")|| apagaValor != "") {
            txtValor.setText("2");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "2");
        }
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        // Verifica se o texto é "0" e limpa se necessário
        if (txtValor.getText().equals("0") || apagaValor != "") {
            txtValor.setText("1");
            apagaValor = "";
        } else {
            txtValor.setText(txtValor.getText() + "1");
        }
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaActionPerformed
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        operacao += 3;

        // Soma o valor ao acumulado
        if (acumulado == 0){
            acumulado = valor;
            txtValor.setText("0");
        }
        else if(acumulado !=0){
            acumulado1=valor;
            acumulado *= acumulado1;
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
        }
    }//GEN-LAST:event_btnMultiplicaActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        operacao += 4;

        // Soma o valor ao acumulado
        if (acumulado == 0){
            acumulado = valor;
            txtValor.setText("0");
        }
        else if(acumulado !=0){
            acumulado1=valor;
            acumulado /= acumulado1;
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        operacao += 2;

        // Soma o valor ao acumulado
        if (acumulado == 0){
            acumulado = valor;
            txtValor.setText("0");
        }
        else if(acumulado !=0){
            acumulado1=valor;
            acumulado -= acumulado1;
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // Obtém o texto do campo txtValor
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        operacao += 1;

        // Soma o valor ao acumulado
        if (acumulado == 0){
            acumulado = valor;
            txtValor.setText("0");
        }
        else if(acumulado !=0){
            acumulado1=valor;
            acumulado += acumulado1;
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            
        }
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        // Obtém o texto do campo txtValor
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        acumulado = valor * valor;
        
        operacao += 5;
        
        if (acumulado % 2 == 0){
            int valorInt = (int) acumulado;
            String valorString = String.valueOf(valorInt);
            // Limpa o campo de texto para o próximo valor
            txtValor.setText(valorString);
            apagaValor = valorString;
        }
        else{
            String valorString = String.valueOf(acumulado);
            // Limpa o campo de texto para o próximo valor
            txtValor.setText(valorString);
            apagaValor = valorString;
        }  
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed

    }//GEN-LAST:event_txtValorActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
         // Obtém o texto do campo txtValor
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        operacao += 6;
        
        // Verifica se o número é não negativo
        if (valor < 0) {
            txtValor.setText("0");
        } 
        else {
            // Calcula a raiz quadrada usando o método Math.sqrt()
            double acumulado = Math.sqrt(valor);
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
         // Obtém o texto do campo txtValor
        String texto = txtValor.getText();

        // Converte o texto para double
        double valor = Double.parseDouble(texto);
        
        // Soma o valor ao acumulado
        if (acumulado == 0){
            acumulado = valor;
            txtValor.setText("0");
        }
        else if(acumulado !=0){
            acumulado1=valor;
            acumulado = (acumulado*acumulado1)/100;
            if (acumulado % 2 == 0){
                int valorInt = (int) acumulado;
                String valorString = String.valueOf(valorInt);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
            else{
                String valorString = String.valueOf(acumulado);
                // Limpa o campo de texto para o próximo valor
                txtValor.setText(valorString);
                apagaValor = valorString;
            }
        }
        operacao += 7;
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSeis;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

