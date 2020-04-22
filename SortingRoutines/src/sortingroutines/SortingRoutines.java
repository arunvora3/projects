package sortingroutines;

//Getting the necessary imports for random number generation and use of arrays
import java.util.Random; 
import java.util.*; 

/**
File Name:	SourtingRoutines
Programmer:	Arun Vora
Date:		8/07/2019
Description:	This program takes in amount of numbers and randomly generates that amount of numbers from -1000 to 1000
                * Then it gives the user the option (through GUI) to sort it in any of the 4 sorting methods 
                * Displays the original numbers and the sorted numbers through text areas 
*/

public class SortingRoutines extends javax.swing.JFrame {
    //Creating number list and random for number generation 
    public static int [] numbers; 
    static Random rand = new Random(); 
    
    /*Custom method for quick search lauunching:
    pre: takes in array and order #
    post: sets up array for quick search ascending and descending*/ 
    
    //**All quicksort logic was from David Guo, I could not figure this out myself**
    
    public static int[] quick(int[] numbers, int order) {
        int bottom = 0;
        int top = numbers.length - 1;
        if (order == 0) {
            numbers = quickA(numbers, bottom, top);
            return numbers;
        }
        else {
            numbers = quickD(numbers, bottom, top);
            return numbers;
        }  
    }
    
    /*Custom method for ascending quick sort:
    pre: takes in array and bottom top values 
    post: returns ascending quick sorted array*/ 
    
    public static int[] quickA(int[] numbers, int bottom, int top) {
        
        if (bottom < top) {
            int partitionRef = partitionA(numbers, bottom, top);
            quickA(numbers, bottom, partitionRef - 1);
            quickA(numbers, partitionRef + 1, top);
            
        }
        return numbers;
    }  
    
    /*Custom method for ascending partition:
    pre: takes in unsorted array and values bottoma and top
    post: assigns values to subarray*/ 
    
    private static int partitionA(int numbers[], int bottom, int top) {
       
        int pivot = numbers[top];
        int i = (bottom-1);
        for (int j = bottom; j < top; j++) {
            if (numbers[j] <= pivot) {
                i+= 1;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[i+1];
        numbers[i+1] = numbers[top];
        numbers[top] = temp;
      
        return i+1;
    }
         
    /*Custom method for descending quick sort:
    pre: takes in array and bottom top values 
    post: returns descending quick sorted array*/ 
    
    public static int[] quickD(int[] randomArray, int bottom, int top) {
        if (bottom < top) {
            int partitionRef = partitionD(randomArray, bottom, top);
            
            quickD(randomArray, bottom, partitionRef - 1);
            quickD(randomArray, partitionRef + 1, top);
            
        }
        return randomArray;
    }  
    
    /*Custom method for descending partition:
    pre: takes in unsorted array and values bottoma and top
    post: assigns values to subarray*/ 
    
    private static int partitionD(int randomArray[], int bottom, int top) {
        int pivot = randomArray[top];
        int i = (bottom-1);

        for (int j = bottom; j < top; j++) { 
            if (randomArray[j] >= pivot) {
                i+= 1;

                int temp = randomArray[i];
                randomArray[i] = randomArray[j];
                randomArray[j] = temp;
            }
        }

        int temp = randomArray[i+1];
        randomArray[i+1] = randomArray[top];
        randomArray[top] = temp;

        return i+1;
    }
    
    /**
     * Creates new form SortingRoutines
     */
    public SortingRoutines() {
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

        btngSortingAlgorithms = new javax.swing.ButtonGroup();
        btngSortOrder = new javax.swing.ButtonGroup();
        titleSortingRoutines = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        lblSortingAlgorithm = new javax.swing.JLabel();
        btnBubble = new javax.swing.JRadioButton();
        btnInsertion = new javax.swing.JRadioButton();
        btnQuick = new javax.swing.JRadioButton();
        lblSortOrder = new javax.swing.JLabel();
        btnAscending = new javax.swing.JRadioButton();
        btnDescending = new javax.swing.JRadioButton();
        lblInstructions2 = new javax.swing.JLabel();
        txtNumberAmount = new javax.swing.JTextField();
        btnSortNumbers = new javax.swing.JButton();
        lblOriginalNumbers = new javax.swing.JLabel();
        lblSortedNumbers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOriginalNumbers = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSortedNumbers = new javax.swing.JTextArea();
        btnSelection = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleSortingRoutines.setText("Sorting Routines");

        lblInstructions.setText("Enter the following information:");

        lblSortingAlgorithm.setText("Sorting Algorithm");

        btngSortingAlgorithms.add(btnBubble);
        btnBubble.setText("Bubble");

        btngSortingAlgorithms.add(btnInsertion);
        btnInsertion.setText("Insertion");

        btngSortingAlgorithms.add(btnQuick);
        btnQuick.setText("Quick");

        lblSortOrder.setText("Sort Order");

        btngSortOrder.add(btnAscending);
        btnAscending.setText("Ascending");

        btngSortOrder.add(btnDescending);
        btnDescending.setText("Descending");

        lblInstructions2.setText("Amount of Numbers to Sort:");

        btnSortNumbers.setText("Sort Numbers");
        btnSortNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortNumbersActionPerformed(evt);
            }
        });

        lblOriginalNumbers.setText("Original Numbers:");

        lblSortedNumbers.setText("Sorted Numbers:");

        txaOriginalNumbers.setColumns(20);
        txaOriginalNumbers.setRows(5);
        jScrollPane1.setViewportView(txaOriginalNumbers);

        txaSortedNumbers.setColumns(20);
        txaSortedNumbers.setRows(5);
        jScrollPane2.setViewportView(txaSortedNumbers);

        btngSortingAlgorithms.add(btnSelection);
        btnSelection.setText("Selection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstructions)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSortingAlgorithm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSelection)
                                                .addGap(94, 94, 94)
                                                .addComponent(lblSortOrder))
                                            .addComponent(btnBubble))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDescending)
                                            .addComponent(btnAscending)
                                            .addComponent(lblSortedNumbers)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnQuick)
                                        .addGap(125, 125, 125)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSortNumbers)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(titleSortingRoutines))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblOriginalNumbers))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInstructions2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumberAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleSortingRoutines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortingAlgorithm)
                    .addComponent(lblSortOrder)
                    .addComponent(btnAscending)
                    .addComponent(btnSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBubble)
                    .addComponent(btnDescending))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuick)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSortNumbers)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstructions2)
                    .addComponent(txtNumberAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOriginalNumbers)
                    .addComponent(lblSortedNumbers))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortNumbersActionPerformed
        
        //Define needed variables 
        String numInput, numOutput, value;
        int num, amountOfNumbers; 
        
        //Get amount of numbers to sort from GUI input
        amountOfNumbers = Integer.parseInt(txtNumberAmount.getText()); 
        numbers = new int[amountOfNumbers]; 
        
        //Getting specified amount of random integers 
        value = "";
        for(int x = 0; x <= numbers.length-1; x++){
            //Getting random numbers in range of 0-2000 and subtracting 1000 | -1000 to 1000 from a probabalistic standpoint
            num = rand.nextInt(2000) - 1000; 
            //Assigning those generated numbers to indexes on the number list 
            numbers[x] = num; 
            //Making values outputtable 
            numOutput = Integer.toString(num); 
            value = value + numOutput + "\n";
        }
        //Displaying original numbers on GUI
        txaOriginalNumbers.setText(value);   
        
        
        //Selection sort ascending 
        int transfer; 
        String tempList = "";
        if (btnSelection.isSelected() == true && btnAscending.isSelected() == true) {
            for (int i = 0; i <= amountOfNumbers-2; i++) {
                for (int j = i+1; j <= amountOfNumbers-1; j++) {
                    if (numbers[i] > numbers[j]) {
                        transfer = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = transfer;
                    }
                }
            }
        }
        
        //Selection sort descending 
        if (btnSelection.isSelected() == true && btnDescending.isSelected() == true) {
            for (int i = 0; i <= amountOfNumbers-2; i++) {
                for (int j = i+1; j <= amountOfNumbers-1; j++) {
                    if (numbers[i] < numbers[j]) {
                        transfer = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = transfer;
                    }
                }          
            }
        }
        
        //Bubble sort ascending 
        //boolean to know if it's sorted or not
        boolean check; 
        int bottom =  amountOfNumbers - 1;
        if (btnBubble.isSelected() == true && btnAscending.isSelected() == true) {
            check = true;
            while (check) {
                check = false;
                    for (int j = 0; j < bottom; j++) {
                        if (numbers[j] > numbers[j+1]) {
                            check = true;
                            transfer = numbers[j];
                            numbers[j] = numbers[j+1];
                            numbers[j+1] = transfer;
                        }
                    }
            }
        }
        
        //Bubble sort descending 
         if (btnBubble.isSelected() == true && btnDescending.isSelected() == true) {
            check = true;
            while (check) {
                check = false;
                    for (int j = 0; j < bottom; j++) {
                        if (numbers[j] < numbers[j+1]) {
                            check = true;
                            transfer = numbers[j];
                            numbers[j] = numbers[j+1];
                            numbers[j+1] = transfer;
                        }
                    }
            }
        }
         
        //Insertion sort ascending 
        if (btnInsertion.isSelected() == true && btnAscending.isSelected() == true) {
            for (int n = 1; n <= amountOfNumbers-1; n++) {
                int j = n;
                while (j > 0 && numbers[j-1] > numbers[j]) {
                    transfer = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = transfer;
                    j = j-1;
                }
            }
        }
        
        //Insertion sort descending 
        if (btnInsertion.isSelected() == true && btnDescending.isSelected() == true) {
            for (int n = 1; n <= amountOfNumbers-1; n++) {
                int j = n;
                while (j > 0 && numbers[j-1] < numbers[j]) {
                    transfer = numbers[j];
                    numbers[j] = numbers[j-1];
                   numbers[j-1] = transfer;
                    j = j-1;
                }
            }
        }
        
        //Quicksearch using custom methods 
        if (btnQuick.isSelected()){
            numbers = quick(numbers, 2);
        } 
        String outputInt;
        for (int i = 0; i < numbers.length; i++) {
            outputInt = Integer.toString(numbers[i]);
            tempList = tempList + outputInt + "\n";
        System.out.println(outputInt);
        txaSortedNumbers.setText(tempList);            
        }
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
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingRoutines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingRoutines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAscending;
    private javax.swing.JRadioButton btnBubble;
    private javax.swing.JRadioButton btnDescending;
    private javax.swing.JRadioButton btnInsertion;
    private javax.swing.JRadioButton btnQuick;
    private javax.swing.JRadioButton btnSelection;
    private javax.swing.JButton btnSortNumbers;
    private javax.swing.ButtonGroup btngSortOrder;
    private javax.swing.ButtonGroup btngSortingAlgorithms;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblOriginalNumbers;
    private javax.swing.JLabel lblSortOrder;
    private javax.swing.JLabel lblSortedNumbers;
    private javax.swing.JLabel lblSortingAlgorithm;
    private javax.swing.JLabel titleSortingRoutines;
    private javax.swing.JTextArea txaOriginalNumbers;
    private javax.swing.JTextArea txaSortedNumbers;
    private javax.swing.JTextField txtNumberAmount;
    // End of variables declaration//GEN-END:variables
}
