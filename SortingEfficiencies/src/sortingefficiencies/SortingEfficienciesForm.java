package sortingefficiencies;

//Getting the necessary imports for random number generation and use of arrays
import java.util.Random; 
import java.util.*; 
import java.lang.Math; 

/**
File Name:	SortingEfficiency
Programmer:	Arun Vora
Date:		8/07/2019
Description:	This program takes in a certain amount of numbers, randomly generates that amount of numbers
                *Performs the 4 types of searches on them tracking how many loops and the time
                *Displays all pertinent information to text areas using GUI
*/

// I was completely unable to figure out this program on my own in the timeframe, all the credit goes to David Guo

public class SortingEfficienciesForm extends javax.swing.JFrame {

    /*Custom method makeArray to make arrays:
    pre: takes in the range value
    post: makes an array of specified number of randomly generated numbers*/
    public static int[] makeArray(int range) {
        int[] randomArray = new int[range];
        for (int i = 0; i < range; i++) {
            int randomNumber = (int)(Math.random() * 20000)-(10000) + 1;
            randomArray[i] = randomNumber;
        }
        return randomArray;
    }
    
    /*Custom method selectionSort:
    pre: ascending or descending array taken in and order
    post: sorts and gives tracking info*/
    
    private void selection(int[] randomArray, int order) {
        //setting trackers
        int loopNumber = 0;
        int compNumber = 0;
        int shiftNumber = 0;
        long startTime = System.currentTimeMillis();
        if (order == 0) {
            //selectionally sorting through array and tracking ascending
             for (int y = 0; y < randomArray.length ; y++) {
                loopNumber++;
                for (int x = y+1; x < randomArray.length  ; x++) {
                    loopNumber++;
                    if (randomArray[x] < randomArray[y]) {
                        compNumber++;
                        int temp = randomArray[y];
                        randomArray[y] = randomArray[x];
                        randomArray[x] = temp;
                        shiftNumber++;
                    }
                }

            }
        }
        //selectionally sorting through array and tracking descending
        else {
            for (int y = 0; y < randomArray.length; y++) {
                loopNumber++;
                for (int x = y+1; x < randomArray.length  ; x++) {
                    loopNumber++;
                    if (randomArray[x] > randomArray[y]) {
                        compNumber++;
                        int temp = randomArray[y];
                        randomArray[y] = randomArray[x];
                        randomArray[x] = temp;
                        shiftNumber++;
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        //Clear text area 
        txaSortedNumbers.setText("");
        for (int i: randomArray) {
            txaSortedNumbers.append(Integer.toString(i) + "\n");
        }
        // Display results to GUI text area
        txaSortedResults.append("Selection Sort \n");
        txaSortedResults.append("Number of times the loop was executed: " + Integer.toString(loopNumber) + "\n");
        txaSortedResults.append("Number of times a comparison was made: " + Integer.toString(compNumber) + "\n");
        txaSortedResults.append("Number of times a value was shifted: " + Integer.toString(shiftNumber) + "\n");
        txaSortedResults.append("Number of milliseconds to complete sort: " + Long.toString(elapsedTime) + "\n");
    }
    
   /*Custom method bubbleSort:
    pre: ascending or descending array taken in and order
    post: sorts and gives tracking info through bubblesort*/
    
    private void bubble(int[] randomArray, int order) {
        //setting trackers
        int loopNo = 0;
        int compNo = 0;
        int shiftNo = 0;
        long startTime = System.currentTimeMillis();
        if (order == 0) {
            int temp = 0;
            //bubble sorting ascendingly through the array
            for(int bound = 0; bound < randomArray.length; bound++) {
                loopNo++;
               for(int j=1; j < (randomArray.length - bound); j++) {
                   loopNo++;
                  if(randomArray[j-1] > randomArray[j]) { 
                     compNo++;
                     temp = randomArray[j-1];
                     randomArray[j-1] = randomArray[j];
                     randomArray[j] = temp;
                     shiftNo++;
                    }
                }
            }
        }
        //bubble sorting descendlingly through the array
        else {
            int temp = 0;
            for(int bound = 0; bound < randomArray.length; bound++) {
                loopNo++;
               for(int j=1; j < (randomArray.length - bound); j++) {
                   loopNo++;
                  if(randomArray[j-1] < randomArray[j]) {
                    compNo++;
                    temp = randomArray[j-1];
                    randomArray[j-1] = randomArray[j];
                    randomArray[j] = temp;
                    shiftNo++;
                    }
                }
        }
            
        txaSortedNumbers.setText("");
        for (int i: randomArray) {
            txaSortedNumbers.append(Integer.toString(i) + "\n");
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        //Display results to GUI 
        txaSortedResults.append("Bubble Sort \n");
        txaSortedResults.append("Number of times the loop was executed: " + Integer.toString(loopNo) + "\n");
        txaSortedResults.append("Number of times a comparison was made: " + Integer.toString(compNo) + "\n");
        txaSortedResults.append("Number of times a value was shifted: " + Integer.toString(shiftNo) + "\n");
        txaSortedResults.append("Number of milliseconds to complete sort: " + Long.toString(elapsedTime) + "\n");
        }
    }
    
    /*Custom method insertionSort:
    pre: ascending or descending array taken in and order
    post: sorts and gives tracking info through insertion sorting*/
        
    private void insertion(int[] randomArray, int order) {
        //Setting trackers
        int loopNo = 0;
        int compNo = 0;
        int shiftNo = 0;
        long startTime = System.currentTimeMillis();
        if (order == 0) {  
            //insertion searching ascendingly through the array
            for (int j = 1; j < randomArray.length; j++) {  
               while ((j > 0) && (randomArray[j -1]  > randomArray[j])){   
                   loopNo++;
                   compNo++;
                  int temp = randomArray[j]; 
                  randomArray[j] = randomArray[j-1];
                  randomArray[j-1] = temp;
                  shiftNo++;
                  j = j - 1;
               }  
            }
        }
        //insertion searching descendingly through the array
        else {
             for (int j = 1; j < randomArray.length; j++) {  
                 loopNo++;
               while ((j > 0) && (randomArray[j -1] < randomArray[j])){  
                   loopNo++;
                   compNo++;
                  int temp = randomArray[j]; 
                  randomArray[j] = randomArray[j-1];
                  randomArray[j-1] = temp;
                  shiftNo++;
                  j-= 1;
               }  
            }
        }
        txaSortedNumbers.setText("");
        for (int i: randomArray) {
            txaSortedNumbers.append(Integer.toString(i) + "\n");
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        //Display results to GUI 
        txaSortedResults.append("Insertion Sort  \n");
        txaSortedResults.append("Number of times the loop was executed: " + Integer.toString(loopNo) + "\n");
        txaSortedResults.append("Number of times a comparison was made: " + Integer.toString(compNo) + "\n");
        txaSortedResults.append("Number of times a value was shifted: " + Integer.toString(shiftNo) + "\n");
        txaSortedResults.append("Number of milliseconds to complete sort: " + Long.toString(elapsedTime) + "\n");
    }
    //class for trackers to be constant through the program
    class QuickSortTracker {
        int loopNo;
        int compNo;
        int shiftNo;
        //method inside of class to use 
        QuickSortTracker(int loop, int comp, int shift) {
            loopNo = loop;
            compNo = comp;
            shiftNo = shift;
        }
    }
    /*Custom method for quick sort:
    pre: ascending or descending array taken in and order
    post: sorts and gives tracking info through quick sort*/
    
    public void quick(int[] randomArray, int order) {
        //Creates specialized tracker for quick searching
        QuickSortTracker tracker = new QuickSortTracker(0,0,0);
        int bottom = 0;
        int top = randomArray.length - 1;
        long startTime = System.currentTimeMillis(); 
        if (order == 0) {
            //Get and display ascending quick search results to GUI 
           QuickSortTracker displayTracker = quickSortAscending(randomArray, bottom, top, tracker);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            txaSortedResults.append("Quick Sort \n");
            txaSortedResults.append("Number of times the loop was executed: " + Integer.toString(tracker.loopNo) + "\n");
            txaSortedResults.append("Number of times a comparison was made: " + Integer.toString(tracker.compNo) + "\n");
            txaSortedResults.append("Number of times a value was shifted: " + Integer.toString(tracker.shiftNo) + "\n");
            txaSortedResults.append("Number of milliseconds to complete sort: " + Long.toString(elapsedTime) + "\n");
        }
        //Get and display descending quick search results to G
        else {
            QuickSortTracker displayTracker = quickSortDescending(randomArray, bottom, top, tracker);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            txaSortedResults.append("Quick Sort \n");
            txaSortedResults.append("Number of times the loop was executed: " + Integer.toString(tracker.loopNo) + "\n");
            txaSortedResults.append("Number of times a comparison was made: " + Integer.toString(tracker.compNo) + "\n");
            txaSortedResults.append("Number of times a value was shifted: " + Integer.toString(tracker.shiftNo) + "\n");
            txaSortedResults.append("Number of milliseconds to complete sort: " + Long.toString(elapsedTime) + "\n");
        }  
    }
    
     /*Custom method for ascending quick sort:
    pre: takes in array and bottom top values 
    post: returns ascending quick sorted array plus tracking*/ 
    
     public QuickSortTracker quickSortAscending(int[] randomArray, int bottom, int top, QuickSortTracker tracker) {
        //tracking conditions for quick sort ascending 
        if (bottom < top) {
            tracker.compNo++;
            int pivot = randomArray[top];
            tracker.shiftNo++;
            int i = (bottom-1);
            for (int j = bottom; j < top; j++) {
                tracker.loopNo++;
                if (randomArray[j] <= pivot) {
                    tracker.compNo++;
                    i+= 1;
                    int temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;
                    tracker.shiftNo++;
                }
            }
            int temp = randomArray[i+1];
            randomArray[i+1] = randomArray[top];
            randomArray[top] = temp;
            tracker.shiftNo++;
            //setting reference point for partition 
            int partitionRef = i+1;
            quickSortAscending(randomArray, bottom, partitionRef - 1, tracker);
            quickSortAscending(randomArray, partitionRef + 1, top, tracker);
        }
        txaSortedNumbers.setText("");
        for (int i: randomArray) {
            txaSortedNumbers.append(Integer.toString(i) + "\n");
        }
        return tracker;
    }  
        
    /*Custom method for descending quick sort:
    pre: takes in array and bottom top values 
    post: returns descending quick sorted array plus tracking*/ 
    public QuickSortTracker quickSortDescending(int[] randomArray, int bottom, int top, QuickSortTracker tracker) {
        //tracking conditions for quick sort descending
        if (bottom < top) {
            tracker.compNo++;
            int pivot = randomArray[top];
            tracker.shiftNo++;
            int i = (bottom-1);
            for (int j = bottom; j < top; j++) {
                tracker.loopNo++;
                if (randomArray[j] >= pivot) {
                    tracker.compNo++;
                    i+= 1;
                    int temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;
                    tracker.shiftNo++;
                }
            }
            //setting tracking and partition for this specific area 
            int temp = randomArray[i+1];
            randomArray[i+1] = randomArray[top];
            randomArray[top] = temp;
            tracker.shiftNo++; 
            int partitionRef = i+1;           
            quickSortDescending(randomArray, bottom, partitionRef - 1, tracker);
            quickSortDescending(randomArray, partitionRef + 1, top, tracker);
        }
        txaSortedNumbers.setText("");
        for (int i: randomArray) {
            txaSortedNumbers.append(Integer.toString(i) + "\n");
        }
        return tracker;    
    }  
    public SortingEfficienciesForm() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberOfItems = new javax.swing.ButtonGroup();
        sortType = new javax.swing.ButtonGroup();
        titleSortingEfficiencies = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTen = new javax.swing.JRadioButton();
        btnOneHundred = new javax.swing.JRadioButton();
        btnOneThousand = new javax.swing.JRadioButton();
        btnFiveThousand = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnAscending = new javax.swing.JRadioButton();
        btnDescending = new javax.swing.JRadioButton();
        lblOriginalNumbers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOriginalNumbers = new javax.swing.JTextArea();
        btnSortNumbers = new javax.swing.JButton();
        lblSortedResults = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSortedResults = new javax.swing.JTextArea();
        lblSortedNumbers = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaSortedNumbers = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleSortingEfficiencies.setFont(new java.awt.Font("Sunshine Boulevard Personal Use", 0, 24)); // NOI18N
        titleSortingEfficiencies.setForeground(new java.awt.Color(255, 0, 0));
        titleSortingEfficiencies.setText("Sorting Efficiencies");

        jLabel2.setText("Enter the amount of Numbers in the List: ");

        numberOfItems.add(btnTen);
        btnTen.setText("10");

        numberOfItems.add(btnOneHundred);
        btnOneHundred.setText("100");

        numberOfItems.add(btnOneThousand);
        btnOneThousand.setText("1000");

        numberOfItems.add(btnFiveThousand);
        btnFiveThousand.setText("5000");

        jLabel3.setText("Sort Order");

        sortType.add(btnAscending);
        btnAscending.setText("Ascending");

        sortType.add(btnDescending);
        btnDescending.setText("Descending");

        lblOriginalNumbers.setText("Original Numbers");

        txaOriginalNumbers.setColumns(20);
        txaOriginalNumbers.setRows(5);
        jScrollPane1.setViewportView(txaOriginalNumbers);

        btnSortNumbers.setText("Sort Numbers");
        btnSortNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortNumbersActionPerformed(evt);
            }
        });

        lblSortedResults.setText("Sorted Results:");

        txaSortedResults.setColumns(20);
        txaSortedResults.setRows(5);
        jScrollPane2.setViewportView(txaSortedResults);

        lblSortedNumbers.setText("Sorted Numbers");

        txaSortedNumbers.setColumns(20);
        txaSortedNumbers.setRows(5);
        jScrollPane3.setViewportView(txaSortedNumbers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOneHundred)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOneThousand)
                                .addGap(10, 10, 10)
                                .addComponent(btnFiveThousand))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(btnSortNumbers))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOriginalNumbers)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnDescending)
                                                    .addComponent(btnAscending))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(lblSortedNumbers)))))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSortedResults)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titleSortingEfficiencies)
                                .addGap(109, 109, 109)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleSortingEfficiencies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnTen)
                            .addComponent(btnOneHundred)
                            .addComponent(btnOneThousand)
                            .addComponent(btnFiveThousand))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnAscending))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDescending)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSortNumbers)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(lblOriginalNumbers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSortedNumbers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSortedResults))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortNumbersActionPerformed
        //setting variables for range and check tracking
        int range = 0;
        int check = 2;
        //taking in and handling specific numbers through the buttons on GUI 
        if (btnTen.isSelected()) {
            range = 10;
        }
        if (btnOneHundred.isSelected()) {
            range = 100;
        }
        if (btnOneThousand.isSelected()) {
            range = 1000;
        }
        if (btnFiveThousand.isSelected()) {
            range = 5000;
        }
        //making an original array to display to org display (the original random numbers)
        int[] originalArray = makeArray(range);
        txaOriginalNumbers.setText("");
         for (int i: originalArray) {
            txaOriginalNumbers.append(Integer.toString(i) + "\n");
        }
              
        if (btnAscending.isSelected()) {
            check = 0;
        }
        else if (btnDescending.isSelected()) {
            check = 1;
        }
       //clear text area 
        txaSortedResults.setText("");
        
        //call functions to calculate and track every sort for the random numbers
        selection(originalArray, check);
        bubble(originalArray, check);
        insertion(originalArray, check);
        quick(originalArray, check);
    }//GEN-LAST:event_btnSortNumbersActionPerformed

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
            java.util.logging.Logger.getLogger(SortingEfficienciesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingEfficienciesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingEfficienciesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingEfficienciesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingEfficienciesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAscending;
    private javax.swing.JRadioButton btnDescending;
    private javax.swing.JRadioButton btnFiveThousand;
    private javax.swing.JRadioButton btnOneHundred;
    private javax.swing.JRadioButton btnOneThousand;
    private javax.swing.JButton btnSortNumbers;
    private javax.swing.JRadioButton btnTen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblOriginalNumbers;
    private javax.swing.JLabel lblSortedNumbers;
    private javax.swing.JLabel lblSortedResults;
    private javax.swing.ButtonGroup numberOfItems;
    private javax.swing.ButtonGroup sortType;
    private javax.swing.JLabel titleSortingEfficiencies;
    private javax.swing.JTextArea txaOriginalNumbers;
    private javax.swing.JTextArea txaSortedNumbers;
    private javax.swing.JTextArea txaSortedResults;
    // End of variables declaration//GEN-END:variables
}
