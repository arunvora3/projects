package studentgrades;
import java.util.*;

/**
File Name:	StudentGrades
Programmer:	Arun Vora
Date:		7/29/2019
Description:	This program takes in 4 test scores for up to 15 students and using GUI displays things such as student averages, course averages, and more. 
 */

/*Was walked through how to make the program by fellow student and friend Adam Holan, credit goes to him. 
I was having a very tough time understanding double arrays and he helped me out.*/

public class StudentGrades extends javax.swing.JFrame {

    //creating arraylist and array for student's names and their grades
    ArrayList<String> studentNames = new ArrayList<String>();
    Double[][] studentGrades = new Double[15][5];
    /**
     * Creates new form StudentGrades
     */
    public StudentGrades() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblTest1 = new javax.swing.JLabel();
        lblTest2 = new javax.swing.JLabel();
        lblTest3 = new javax.swing.JLabel();
        lblTest4 = new javax.swing.JLabel();
        txtTest1 = new javax.swing.JTextField();
        txtTest2 = new javax.swing.JTextField();
        txtTest3 = new javax.swing.JTextField();
        txtTest4 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnStudentAverage = new javax.swing.JButton();
        btnCourseAverages = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaFinalOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 0, 0));
        mainTitle.setText("Student Grades");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblTest1.setText("Test 1");

        lblTest2.setText("Test 2");

        lblTest3.setText("Test 3");

        lblTest4.setText("Test 4");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnStudentAverage.setText("Student Average");
        btnStudentAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentAverageActionPerformed(evt);
            }
        });

        btnCourseAverages.setText("Course Averages");
        btnCourseAverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAveragesActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txaFinalOutput.setColumns(20);
        txaFinalOutput.setRows(5);
        jScrollPane1.setViewportView(txaFinalOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainTitle)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTest1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTest2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTest2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd)
                                    .addComponent(btnList))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCourseAverages)
                                    .addComponent(btnStudentAverage)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(lblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTest4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTest4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTest3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTest3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(btnExit)))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTest4)
                            .addComponent(txtTest4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLastName)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTest1)
                            .addComponent(txtTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(btnStudentAverage))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTest2)
                            .addComponent(txtTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnList)
                            .addComponent(btnCourseAverages))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTest3)
                                    .addComponent(txtTest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exits program
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
    // Clears text area 
        txaFinalOutput.setText("");
        // for every name in the list, loop through and display it 
        for (int x = 0; x < studentNames.size(); x ++) {
            txaFinalOutput.append(studentNames.get(x) + ": ");
            // for every student loop through each of their grades 
            for (int y = 0; y <= 3; y++) {
                // show the grades
                txaFinalOutput.append(Double.toString(studentGrades[x][y]));     
            }
    txaFinalOutput.append("\n"); //ensuring different entries are displayed on new lines        
        } 
    }//GEN-LAST:event_btnListActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // establishing all the variables needed for calculations 
        double test1, test2, test3, test4;
        int x = 0;
        //creating boolean for the loop 
        boolean valid = false;
        
        //Turn the grades from the text fields into usable doubles
        test1 = Double.parseDouble(txtTest1.getText());
        
        test2 = Double.parseDouble(txtTest2.getText());
        
        test3 = Double.parseDouble(txtTest3.getText());
        
        test4 = Double.parseDouble(txtTest4.getText());
        
        //finds null entries and fills with information 
        while (valid == false) {
            if (studentGrades[x][0] == null)  {
                    studentGrades[x][0] =test1;
                    studentGrades[x][1] =test2;
                    studentGrades[x][2] =test3;
                    studentGrades[x][3] =test4;
                    studentGrades[x][4] =(test1 + test2 + test3 + test4)/4;
                    valid = true;
            }
            x++;
            }
        //add names to list composed of names 
        String name = txtFirstName.getText()+ " " +txtLastName.getText();     
        studentNames.add(name);        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnStudentAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentAverageActionPerformed
        // TODO add your handling code here:
        // clear text area 
        txaFinalOutput.setText(""); 
        // find avg of a given student 
        String name = txtFirstName.getText()+ " " +txtLastName.getText();
            for (int x = 0; x < studentNames.size(); x++) {
                //if the entered name matches the student's name 
                if (studentNames.get(x).equals(name)) {
                    String average = Double.toString(studentGrades[x][4]);
                    //output their average
                    txaFinalOutput.setText(name + "'s average is: " + average);
                }
        
         }
    }//GEN-LAST:event_btnStudentAverageActionPerformed

    private void btnCourseAveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAveragesActionPerformed
        // TODO add your handling code here:
        // set starter value for collective Average
        double collectiveAverage = 0;
        // add averages to course total avg
        for (int i = 0; i < studentNames.size(); i++) {
            collectiveAverage += studentGrades[i][4];  
        }  
        // collectively average all marks
        collectiveAverage /= studentNames.size();
        //display the marks to final output screen on GUI 
        txaFinalOutput.setText("Course Average: " + Double.toString(collectiveAverage));
    }//GEN-LAST:event_btnCourseAveragesActionPerformed

    // unused display to array method 
    /*public void displayArray(){ 
        for (int row = 0; row <= 14; row++){
            for(int col = 0; col <= 3; col++)
                txaFinalOutput.setText(studentgrades[row][col]);*/
       
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
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCourseAverages;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnStudentAverage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblTest1;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JLabel lblTest3;
    private javax.swing.JLabel lblTest4;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JTextArea txaFinalOutput;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtTest1;
    private javax.swing.JTextField txtTest2;
    private javax.swing.JTextField txtTest3;
    private javax.swing.JTextField txtTest4;
    // End of variables declaration//GEN-END:variables
}
