//Computer Science
//Mr. Allulis
//June 6, 2014
//Computer Science

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class CalculatorGUI extends javax.swing.JFrame {

    boolean sqrt = false;
    
    public CalculatorGUI() {
        initComponents();
        this.setTitle("Calculator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        screen = new javax.swing.JTextField();
        MC = new javax.swing.JButton();
        MS = new javax.swing.JButton();
        MR = new javax.swing.JButton();
        mMinus = new javax.swing.JButton();
        mPlus = new javax.swing.JButton();
        C = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        squareRoot = new javax.swing.JButton();
        plusMinus = new javax.swing.JButton();
        leftArrrow = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        forwardSlash = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        oneOverX = new javax.swing.JButton();
        times = new javax.swing.JButton();
        four = new javax.swing.JButton();
        three = new javax.swing.JButton();
        two = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem9 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem12 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        edit = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.setText("0");
        screen.setPreferredSize(new java.awt.Dimension(186, 49));
        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });

        MC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MC.setText("MC");
        MC.setBorder(null);
        MC.setPreferredSize(new java.awt.Dimension(34, 26));
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });

        MS.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MS.setText("MS");
        MS.setBorder(null);
        MS.setPreferredSize(new java.awt.Dimension(34, 26));
        MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSActionPerformed(evt);
            }
        });

        MR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MR.setText("MR");
        MR.setBorder(null);
        MR.setPreferredSize(new java.awt.Dimension(34, 26));
        MR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRActionPerformed(evt);
            }
        });

        mMinus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mMinus.setText("M-");
        mMinus.setBorder(null);
        mMinus.setPreferredSize(new java.awt.Dimension(34, 26));
        mMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMinusActionPerformed(evt);
            }
        });

        mPlus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mPlus.setText("M+");
        mPlus.setBorder(null);
        mPlus.setPreferredSize(new java.awt.Dimension(34, 26));
        mPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPlusActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        C.setText("C");
        C.setBorder(null);
        C.setPreferredSize(new java.awt.Dimension(34, 26));
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        CE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CE.setText("CE");
        CE.setBorder(null);
        CE.setPreferredSize(new java.awt.Dimension(34, 26));
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        squareRoot.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        squareRoot.setText("√");
        squareRoot.setBorder(null);
        squareRoot.setPreferredSize(new java.awt.Dimension(34, 26));
        squareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootActionPerformed(evt);
            }
        });

        plusMinus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        plusMinus.setText("±");
        plusMinus.setBorder(null);
        plusMinus.setPreferredSize(new java.awt.Dimension(34, 26));
        plusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMinusActionPerformed(evt);
            }
        });

        leftArrrow.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        leftArrrow.setText("←");
        leftArrrow.setBorder(null);
        leftArrrow.setPreferredSize(new java.awt.Dimension(34, 26));
        leftArrrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftArrrowActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nine.setText("9");
        nine.setBorder(null);
        nine.setPreferredSize(new java.awt.Dimension(34, 26));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        eight.setText("8");
        eight.setBorder(null);
        eight.setPreferredSize(new java.awt.Dimension(34, 26));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mod.setText("%");
        mod.setBorder(null);
        mod.setPreferredSize(new java.awt.Dimension(34, 26));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        forwardSlash.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        forwardSlash.setText("/");
        forwardSlash.setBorder(null);
        forwardSlash.setPreferredSize(new java.awt.Dimension(34, 26));
        forwardSlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardSlashActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        seven.setText("7");
        seven.setBorder(null);
        seven.setPreferredSize(new java.awt.Dimension(34, 26));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        six.setText("6");
        six.setBorder(null);
        six.setPreferredSize(new java.awt.Dimension(34, 26));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        five.setText("5");
        five.setBorder(null);
        five.setPreferredSize(new java.awt.Dimension(34, 26));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        oneOverX.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        oneOverX.setText("1/x");
        oneOverX.setBorder(null);
        oneOverX.setPreferredSize(new java.awt.Dimension(34, 26));
        oneOverX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneOverXActionPerformed(evt);
            }
        });

        times.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        times.setText("*");
        times.setBorder(null);
        times.setPreferredSize(new java.awt.Dimension(34, 26));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        four.setText("4");
        four.setBorder(null);
        four.setPreferredSize(new java.awt.Dimension(34, 26));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        three.setText("3");
        three.setBorder(null);
        three.setPreferredSize(new java.awt.Dimension(34, 26));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        two.setText("2");
        two.setBorder(null);
        two.setPreferredSize(new java.awt.Dimension(34, 26));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        minus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        minus.setText("-");
        minus.setBorder(null);
        minus.setPreferredSize(new java.awt.Dimension(34, 26));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        one.setText("1");
        one.setBorder(null);
        one.setPreferredSize(new java.awt.Dimension(34, 26));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        decimal.setText(".");
        decimal.setBorder(null);
        decimal.setPreferredSize(new java.awt.Dimension(34, 26));
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        equals.setText("=");
        equals.setBorder(null);
        equals.setPreferredSize(new java.awt.Dimension(34, 26));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        plus.setText("+");
        plus.setBorder(null);
        plus.setPreferredSize(new java.awt.Dimension(34, 26));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        zero.setText("0");
        zero.setBorder(null);
        zero.setPreferredSize(new java.awt.Dimension(34, 26));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        file.setText("File");

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Standard");
        file.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem2.setText("Scientific");
        file.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem3.setText("Programmer");
        file.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem4.setText("Statistics");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        file.add(jRadioButtonMenuItem4);
        file.add(jSeparator3);

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem5.setText("History");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        file.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem6.setText("Digit grouping");
        file.add(jRadioButtonMenuItem6);
        file.add(jSeparator4);

        jRadioButtonMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem7.setText("Basic");
        file.add(jRadioButtonMenuItem7);

        jRadioButtonMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem8.setText("Unit Conversion");
        jRadioButtonMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem8ActionPerformed(evt);
            }
        });
        file.add(jRadioButtonMenuItem8);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Date calculation");
        file.add(jMenuItem1);

        jMenu2.setText("Worksheets");

        jRadioButtonMenuItem9.setText("Mortgage");
        jMenu2.add(jRadioButtonMenuItem9);

        jRadioButtonMenuItem11.setText("Vehicle lease");
        jMenu2.add(jRadioButtonMenuItem11);

        jRadioButtonMenuItem12.setText("Fuel economy (mpg)");
        jRadioButtonMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem12);

        jRadioButtonMenuItem10.setText("Fuel economy (L/100 km)");
        jMenu2.add(jRadioButtonMenuItem10);

        file.add(jMenu2);

        menuBar.add(file);

        edit.setText("Edit");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Copy");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        edit.add(jMenuItem5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Paste");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        edit.add(jMenuItem2);
        edit.add(jSeparator2);

        jMenu1.setText("History");

        jMenuItem7.setText("Copy history");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem8.setText("Edit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem10.setText("Cancel edit");
        jMenu1.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Clear");
        jMenu1.add(jMenuItem9);

        edit.add(jMenu1);

        menuBar.add(edit);

        help.setText("Help");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setText("View Help");
        help.add(jMenuItem4);
        help.add(jSeparator1);

        jMenuItem3.setText("About Calculator");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        help.add(jMenuItem3);

        menuBar.add(help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftArrrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(squareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forwardSlash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oneOverX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftArrrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardSlash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneOverX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//the screen which displays text
    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

//MC Button (my unique feature)
    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
        this.getContentPane().setBackground(Color.BLACK);
        this.setTitle("66666666666666");
        screen.setBackground(Color.RED);
        MC.setBackground(Color.RED);
        MR.setBackground(Color.RED);
        MS.setBackground(Color.RED);
        mPlus.setBackground(Color.RED);
        mMinus.setBackground(Color.RED);
        leftArrrow.setBackground(Color.RED);
        CE.setBackground(Color.RED);
        C.setBackground(Color.RED);
        plusMinus.setBackground(Color.RED);
        squareRoot.setBackground(Color.RED);
        seven.setBackground(Color.RED);
        eight.setBackground(Color.RED);
        nine.setBackground(Color.RED);
        forwardSlash.setBackground(Color.RED);
        mod.setBackground(Color.RED);
        four.setBackground(Color.RED);
        five.setBackground(Color.RED);
        six.setBackground(Color.RED);;
        times.setBackground(Color.RED);
        oneOverX.setBackground(Color.RED);
        one.setBackground(Color.RED);
        two.setBackground(Color.RED);
        three.setBackground(Color.RED);
        minus.setBackground(Color.RED);
        equals.setBackground(Color.RED);
        zero.setBackground(Color.RED);
        decimal.setBackground(Color.RED);
        plus.setBackground(Color.RED);
        file.setBackground(Color.RED);
        edit.setBackground(Color.RED);
        help.setBackground(Color.RED);
        screen.setText("ERROR");
        MC.setText("6");
        MR.setText("6");
        MS.setText("6");
        mPlus.setText("6");
        mMinus.setText("6");
        leftArrrow.setText("6");
        CE.setText("6");
        C.setText("6");
        plusMinus.setText("6");
        squareRoot.setText("6");
        seven.setText("6");
        eight.setText("6");
        nine.setText("6");
        forwardSlash.setText("6");
        mod.setText("6");
        four.setText("6");
        five.setText("6");
        six.setText("6");
        times.setText("6");
        oneOverX.setText("6");
        one.setText("6");
        two.setText("6");
        three.setText("6");
        minus.setText("6");
        equals.setText("6");
        zero.setText("6");
        decimal.setText("6");
        plus.setText("6");
        file.setText("6");
        edit.setText("6");
        help.setText("6");
    }//GEN-LAST:event_MCActionPerformed

//MS Button (no function)
    private void MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSActionPerformed
      
    }//GEN-LAST:event_MSActionPerformed

//MR Button (no function)
    private void MRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRActionPerformed

    }//GEN-LAST:event_MRActionPerformed

//M- Button (no function)
    private void mMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMinusActionPerformed
                
    }//GEN-LAST:event_mMinusActionPerformed

//M+ Button (no function)
    private void mPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPlusActionPerformed
       
    }//GEN-LAST:event_mPlusActionPerformed

//C - Clear Button
    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        screen.setText("0");
    }//GEN-LAST:event_CActionPerformed

//CE - Clear Entry Button - deletes all text following last operand (+, -, *, /)
    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        while(!(screen.getText().substring(screen.getText().length()-1,screen.getText().length()).equals("+"))
           && !(screen.getText().substring(screen.getText().length()-1,screen.getText().length()).equals("-"))
           && !(screen.getText().substring(screen.getText().length()-1,screen.getText().length()).equals("*"))
           && !(screen.getText().substring(screen.getText().length()-1,screen.getText().length()).equals("/")))
        {
            screen.setText(screen.getText().substring(0,screen.getText().length()-1));
        }   
    }//GEN-LAST:event_CEActionPerformed

//sqrt - Square Root Button - uses javascript Math.sqrt to calculate square root
    private void squareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootActionPerformed
        if (sqrt==false) 
        {
            screen.setText(screen.getText() + "Math.sqrt(");
            sqrt=true;
        }
        
        else
        {
            screen.setText(screen.getText() + ")");
            sqrt=false;
        }
    }//GEN-LAST:event_squareRootActionPerformed

//+- - Plus Minus Button (no function)
    private void plusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusMinusActionPerformed

//<-- - Backspace Button - resets text displayed by screen however without last index chaacter
    private void leftArrrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftArrrowActionPerformed
        if(screen.getText().length()!=1)
        {
            screen.setText(screen.getText().substring(0,screen.getText().length()-1));
        }
        else
        {
            screen.setText("0");
        }
    }//GEN-LAST:event_leftArrrowActionPerformed

//9 - Nine Button - adds nine to screen/sets screen to nine (if screen displays 0)
    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "9");
        }
        
        else
        {
            screen.setText("9");
        }
    }//GEN-LAST:event_nineActionPerformed

//8 - Eight Button - adds eight to screen/sets screen to eight (if screen displays 0)
    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "8");
        }
        
        else
        {
            screen.setText("8");
        }
    }//GEN-LAST:event_eightActionPerformed

//% - Mod Button (no function)
    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

// / - Division Button - appends a "/" which will be interpreted as a division sign when compiled
    private void forwardSlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardSlashActionPerformed
    screen.setText(screen.getText() + "/");
    }//GEN-LAST:event_forwardSlashActionPerformed

//7 - Seven Button - adds seven to screen/sets screen to seven (if screen displays 0)
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "7");
        }
        
        else
        {
            screen.setText("7");
        }
    }//GEN-LAST:event_sevenActionPerformed

//6 - Six Button - adds six to screen/sets screen to six (if screen displays 0)
    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "7");
        }
        
        else
        {
            screen.setText("7");
        }
    }//GEN-LAST:event_sixActionPerformed

//5 - Five Button - adds five to screen/sets screen to five (if screen displays 0)
    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "5");
        }
        
        else
        {
            screen.setText("5");
        }
    }//GEN-LAST:event_fiveActionPerformed

//1/x - One Divided by X Button - sets screen to 1/(text in screen) which will be interpreted as division when compiled
    private void oneOverXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneOverXActionPerformed
        screen.setText(1 + "/" + screen.getText());
    }//GEN-LAST:event_oneOverXActionPerformed

//X - Multiplication Button - appends an "*" which will be interpreted as a division sign when compiled
    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
    screen.setText(screen.getText() + "*");
    }//GEN-LAST:event_timesActionPerformed

//4 - Four Button - adds four to screen/sets screen to four (if screen displays 0)
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "4");
        }
        
        else
        {
            screen.setText("4");
        }
    }//GEN-LAST:event_fourActionPerformed

//3 - Three Button - adds three to screen/sets screen to three (if screen displays 0)
    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "3");
        }
        
        else
        {
            screen.setText("3");
        }
    }//GEN-LAST:event_threeActionPerformed

//2 - Two Button - adds two to screen/sets screen to two (if screen displays 0)
    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "2");
        }
        
        else
        {
            screen.setText("2");
        }
    }//GEN-LAST:event_twoActionPerformed

//- - Subtraction Button - appends a "-" which will be interpreted as a subtraction sign when compiled
    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        screen.setText(screen.getText() + "-");
    }//GEN-LAST:event_minusActionPerformed

//1 - One Button - adds one to screen/sets screen to one (if screen displays 0)
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "1");
        }
        
        else
        {
            screen.setText("1");
        }
    }//GEN-LAST:event_oneActionPerformed

//. - Decimal Point Button - appends a "." which will be interpreted as a decimal point sign when compiled  
    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        screen.setText(screen.getText() + ".");
    }//GEN-LAST:event_decimalActionPerformed

//= - Equals Button - appends an "=" which will be interpreted as an equal sign when compiled
    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String answer = screen.getText();
        
        try 
        {
            screen.setText(Double.toString((Double)engine.eval(answer)));
        } 
        catch (ScriptException ex) 
        {
            Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_equalsActionPerformed

//+ - Addition Button - appends an "+" which will be interpreted as an addition sign when compiled
    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        screen.setText(screen.getText() + "+");
    }//GEN-LAST:event_plusActionPerformed

//0 - Zero Button - adds zero to screen/sets screen to zero (if screen displays 0)    
    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!screen.getText().equals("0"))
        {
            screen.setText(screen.getText() + "0");
        }
        
        else
        {
            screen.setText("0");
        }
    }//GEN-LAST:event_zeroActionPerformed

//Menu Item (no function)
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

//Menu Item (no function)
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

//Menu Item (no function)
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

//Menu Item (no function)
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

//Menu Item (no function)
    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

//Menu Item (no function)
    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

//Menu Item (no function)
    private void jRadioButtonMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem8ActionPerformed

//Menu Item (no function)
    private void jRadioButtonMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem12ActionPerformed

    //Main Method
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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JButton CE;
    private javax.swing.JButton MC;
    private javax.swing.JButton MR;
    private javax.swing.JButton MS;
    private javax.swing.JButton decimal;
    private javax.swing.JMenu edit;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JMenu file;
    private javax.swing.JButton five;
    private javax.swing.JButton forwardSlash;
    private javax.swing.JButton four;
    private javax.swing.JMenu help;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem12;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JButton leftArrrow;
    private javax.swing.JButton mMinus;
    private javax.swing.JButton mPlus;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton minus;
    private javax.swing.JButton mod;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton oneOverX;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusMinus;
    private javax.swing.JTextField screen;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton squareRoot;
    private javax.swing.JButton three;
    private javax.swing.JButton times;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
