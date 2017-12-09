/*
 * Copyright (C) 2017 Universitat Autonoma de Barcelona - David Castells-Rufas <david.castells@uab.cat>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cat.uab.cephis.bigNumCalc;

import java.math.BigInteger;
import javax.swing.JTextField;

/**
 *
 * @author dcr
 */
public class MainFrame extends javax.swing.JFrame
{
    private BigInteger a = new BigInteger("0");
    private BigInteger b = new BigInteger("0");
    private BigInteger radix = new BigInteger("0");
    private BigInteger m = new BigInteger("0");
    private BigInteger r= new BigInteger("0");
    private int top;
    private int bottom;

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        setTitle("Simple BigInteger calculator");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnDecimal = new javax.swing.JToggleButton();
        btnHexadecimal = new javax.swing.JToggleButton();
        btnInvMod = new javax.swing.JButton();
        btnModMult = new javax.swing.JButton();
        btnHexadecimalArrayLSB = new javax.swing.JToggleButton();
        btnRange = new javax.swing.JButton();
        btnMod2 = new javax.swing.JButton();
        txtTop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBottom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnModPow = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRadix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnMontgomeryReduction = new javax.swing.JButton();
        btnMontgomeryMult = new javax.swing.JButton();
        btnMprime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("A:");

        txtA.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtA.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("B:");

        txtB.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtB.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("radix:");

        txtM.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtM.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("R:");

        txtResult.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtResult.setText("0");

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setText("R=A+B");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSub.setText("R=A-B");
        btnSub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMult.setText("R=A*B");
        btnMult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("R=A/B");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMod.setText("R=A%m");
        btnMod.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModActionPerformed(evt);
            }
        });

        btnDecimal.setSelected(true);
        btnDecimal.setText("Decimal");
        btnDecimal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDecimalActionPerformed(evt);
            }
        });

        btnHexadecimal.setText("Hexadecimal");
        btnHexadecimal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHexadecimalActionPerformed(evt);
            }
        });

        btnInvMod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnInvMod.setText("R=A^-1%m");
        btnInvMod.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInvModActionPerformed(evt);
            }
        });

        btnModMult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnModMult.setText("R=A*B%m");
        btnModMult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModMultActionPerformed(evt);
            }
        });

        btnHexadecimalArrayLSB.setText("Hexadecimal Least Significant First Array");
        btnHexadecimalArrayLSB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHexadecimalArrayLSBActionPerformed(evt);
            }
        });

        btnRange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRange.setText("R=A[t..b]");
        btnRange.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRangeActionPerformed(evt);
            }
        });

        btnMod2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMod2.setText("R=A%B");
        btnMod2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMod2ActionPerformed(evt);
            }
        });

        txtTop.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtTop.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("t:");

        txtBottom.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtBottom.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("b:");

        btnModPow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnModPow.setText("R=A^B%m");
        btnModPow.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModPowActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("m:");

        txtRadix.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtRadix.setText("0");

        jLabel8.setText("Std. Arithmetics");

        jLabel9.setText("Modular Arithmetics");

        jLabel10.setText("Montgomery");

        btnMontgomeryReduction.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMontgomeryReduction.setText("R=A*C^-1%m");
        btnMontgomeryReduction.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMontgomeryReductionActionPerformed(evt);
            }
        });

        btnMontgomeryMult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMontgomeryMult.setText("R=A*B*C^-1%m");
        btnMontgomeryMult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMontgomeryMultActionPerformed(evt);
            }
        });

        btnMprime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMprime.setText("R=-m^-1%C");
        btnMprime.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMprimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtA)
                                    .addComponent(txtB)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRadix)
                                    .addComponent(txtM, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtResult, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMod2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexadecimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHexadecimalArrayLSB))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnInvMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModPow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMontgomeryMult, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMprime, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMontgomeryReduction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addComponent(btnRange)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecimal)
                    .addComponent(btnHexadecimal)
                    .addComponent(btnHexadecimalArrayLSB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRadix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMontgomeryReduction, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRange, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModMult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMontgomeryMult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInvMod, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMprime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModPow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnMult, btnSub});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        
        try
        {
            getInputValues();
                
            r = a;
        
            r = r.add(b);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }


        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultActionPerformed
    {//GEN-HEADEREND:event_btnMultActionPerformed
        try
        {
            getInputValues();

            r = a;

            r = r.multiply(b);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubActionPerformed
    {//GEN-HEADEREND:event_btnSubActionPerformed
        try
        {
            getInputValues();
        
            r = a;
            r = r.subtract(b);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        getInputValues();
        
        r = a;
        
        r = r.divide(b);
        
        setOutputValue();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModActionPerformed
    {//GEN-HEADEREND:event_btnModActionPerformed
        try
        {
            getInputValues();

            r = a;
            r = r.mod(m);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDecimalActionPerformed
    {//GEN-HEADEREND:event_btnDecimalActionPerformed
        btnHexadecimal.setSelected(!btnDecimal.isSelected());
        btnHexadecimalArrayLSB.setSelected(!btnDecimal.isSelected());
        
        convertToActualFormat();
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnHexadecimalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHexadecimalActionPerformed
    {//GEN-HEADEREND:event_btnHexadecimalActionPerformed
        btnDecimal.setSelected(!btnHexadecimal.isSelected());
        btnHexadecimalArrayLSB.setSelected(!btnHexadecimal.isSelected());
        
        convertToActualFormat();
    }//GEN-LAST:event_btnHexadecimalActionPerformed

    private void btnInvModActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInvModActionPerformed
    {//GEN-HEADEREND:event_btnInvModActionPerformed
        try
        {
            getInputValues();
            r = a.modInverse(m);
            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
        

    }//GEN-LAST:event_btnInvModActionPerformed

    private void btnModMultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModMultActionPerformed
    {//GEN-HEADEREND:event_btnModMultActionPerformed
        try
        {
            getInputValues();

            r = a;
            r = r.multiply(b).mod(m);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnModMultActionPerformed

    private void btnHexadecimalArrayLSBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHexadecimalArrayLSBActionPerformed
    {//GEN-HEADEREND:event_btnHexadecimalArrayLSBActionPerformed
        btnDecimal.setSelected(!btnHexadecimalArrayLSB.isSelected());
        btnHexadecimal.setSelected(!btnHexadecimalArrayLSB.isSelected());
        
        convertToActualFormat();
    }//GEN-LAST:event_btnHexadecimalArrayLSBActionPerformed

    private void btnRangeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRangeActionPerformed
    {//GEN-HEADEREND:event_btnRangeActionPerformed
        try
        {
            getInputValues();
        
            BigInteger m = new BigInteger("1");
            m = m.shiftLeft(top+1);

            r = a.remainder(m);

            r = r.shiftRight(bottom);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }

    }//GEN-LAST:event_btnRangeActionPerformed

    private void btnMod2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMod2ActionPerformed
    {//GEN-HEADEREND:event_btnMod2ActionPerformed
        try
        {
            getInputValues();
        
            r = a;
            r = r.mod(b);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnMod2ActionPerformed

    private void btnModPowActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModPowActionPerformed
    {//GEN-HEADEREND:event_btnModPowActionPerformed
        try
        {
            getInputValues();
        
            r = a;
            r = r.modPow(b, m);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnModPowActionPerformed

    private void btnMontgomeryReductionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMontgomeryReductionActionPerformed
    {//GEN-HEADEREND:event_btnMontgomeryReductionActionPerformed
        try
        {
            getInputValues();
        
            BigInteger radixInv = radix.modInverse(m);
            r = radixInv.multiply(a).mod(m);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnMontgomeryReductionActionPerformed

    private void btnMontgomeryMultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMontgomeryMultActionPerformed
    {//GEN-HEADEREND:event_btnMontgomeryMultActionPerformed
        try
        {
            getInputValues();
        
            BigInteger radixInv = radix.modInverse(m);
            BigInteger p = a.multiply(b);
            r = radixInv.multiply(p).mod(m);

            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
        
    }//GEN-LAST:event_btnMontgomeryMultActionPerformed

    private void btnMprimeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMprimeActionPerformed
    {//GEN-HEADEREND:event_btnMprimeActionPerformed
        try
        {
            getInputValues();
    
            BigInteger mInv = m.modInverse(radix);
            BigInteger zero = new BigInteger("0");
            
            r = zero.subtract(mInv).mod(radix);
            
            setOutputValue();
        }
        catch (Exception e)
        {
            setOutputError(e);
        }
    }//GEN-LAST:event_btnMprimeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JToggleButton btnDecimal;
    private javax.swing.JToggleButton btnHexadecimal;
    private javax.swing.JToggleButton btnHexadecimalArrayLSB;
    private javax.swing.JButton btnInvMod;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMod2;
    private javax.swing.JButton btnModMult;
    private javax.swing.JButton btnModPow;
    private javax.swing.JButton btnMontgomeryMult;
    private javax.swing.JButton btnMontgomeryReduction;
    private javax.swing.JButton btnMprime;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnRange;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtBottom;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtRadix;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtTop;
    // End of variables declaration//GEN-END:variables

    private void getInputValues()
    {
        a = getBigIntegerValue(txtA);
        b = getBigIntegerValue(txtB);
        radix = getBigIntegerValue(txtRadix);
        m = getBigIntegerValue(txtM);

        top = Integer.parseInt(txtTop.getText());
        bottom = Integer.parseInt(txtBottom.getText());


    }

    private BigInteger getBigIntegerValue(JTextField txt)
    {
        String stext = txt.getText().trim();
        
        if (stext.length() == 0)
            return new BigInteger("0");
        
        if (btnDecimal.isSelected())
            return new BigInteger(stext);
        else if (btnHexadecimal.isSelected())
            return new BigInteger(stext, 16);
        else
        {
            return getBigIntegerFromLimbArray(stext);
        }
    }

    private void setOutputValue()
    {
        if (btnDecimal.isSelected())
            txtResult.setText(r.toString());
        else if (btnHexadecimal.isSelected())
            txtResult.setText(r.toString(16).toUpperCase());
        else
            txtResult.setText(getLimbArrayFromBigInteger(r).toUpperCase());
    }

    private BigInteger getBigIntegerFromLimbArray(String stext)
    {
        String[] limbs = stext.split(" ");

        BigInteger r = new BigInteger("0");
        BigInteger pow = new BigInteger("1");
        
        for (int i=0; i < limbs.length; i++)
        {
            String sLimb = limbs[i];
            BigInteger nLimb = new BigInteger(sLimb, 16);
            
            // r = r + limb * pow, pow = pow * 2^32
            nLimb = nLimb.multiply(pow);
            r = r.add(nLimb);
            pow = pow.shiftLeft(32);
        }
        
        return r;
    }

    private String getLimbArrayFromBigInteger(BigInteger r)
    {
        String ret = "";
        String sLink = "";
        
        BigInteger pow = new BigInteger("1");
        pow = pow.shiftLeft(32);
        
        while (r.bitLength() > 0)
        {
            BigInteger m = r.mod(pow);
            r = r.divide(pow);

            ret = ret + sLink + m.toString(16);
            sLink = " ";
        }
        
        return ret;
    }

    private void convertToActualFormat()
    {
        if (btnDecimal.isSelected())
        {
            txtA.setText(a.toString());
            txtB.setText(b.toString());
            txtRadix.setText(radix.toString());
            txtM.setText(m.toString());
            txtResult.setText(r.toString());
        }
        else if (btnHexadecimal.isSelected())
        {
            txtA.setText(a.toString(16).toUpperCase());
            txtB.setText(b.toString(16).toUpperCase());
            txtRadix.setText(radix.toString(16).toUpperCase());
            txtM.setText(m.toString(16).toUpperCase());
            txtResult.setText(r.toString(16).toUpperCase());
        }
        else
        {
            txtA.setText(getLimbArrayFromBigInteger(a).toUpperCase());
            txtB.setText(getLimbArrayFromBigInteger(b).toUpperCase());
            txtRadix.setText(getLimbArrayFromBigInteger(radix).toUpperCase());
            txtM.setText(getLimbArrayFromBigInteger(m).toUpperCase());
            txtResult.setText(getLimbArrayFromBigInteger(r).toUpperCase());
        }
    }

    private void setOutputError(Exception e)
    {
        txtResult.setText(e.getMessage());
    }
}
