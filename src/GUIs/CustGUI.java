package GUIs;
import restaurant.reservation.system.Order;
import restaurant.reservation.system.Orders;
import restaurant.reservation.system.Reservation;
import restaurant.reservation.system.Reservations;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class CustGUI extends javax.swing.JFrame {

  
    public CustGUI() {
        initComponents();
        
    }
    
    public CustGUI(ArrayList <String> tables) {
        initComponents();
        DefaultListModel model =new DefaultListModel();
        jList1.setModel(model);
        for ( int i = 1 ; i < tables.size() ; i++ )
        { 
            model.addElement("Table" + " " + tables.get(i));
        }
    }
    
    ArrayList <String> listOfMain = new ArrayList<String>();
    ArrayList <String> listOfApp = new ArrayList<String>();
    ArrayList <String> listOfDes = new ArrayList<String>();
    ArrayList<String> joinedList = new ArrayList<>();
    double totalPrice;
    double totalAppPrice;
    double totalMainPrice;
    double totalDesPrice;
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reserve = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tableDataBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        reserverText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        appetizerComboBox = new javax.swing.JComboBox();
        Appetizeradd = new javax.swing.JButton();
        CalculatePrice = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mainCourseComboBox = new javax.swing.JComboBox();
        MainCourseAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        desertComboBox = new javax.swing.JComboBox();
        DesertAdd = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        desList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        appList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Dashboard");
        setBackground(new java.awt.Color(0, 255, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        Reserve.setBackground(new java.awt.Color(255, 102, 0));
        Reserve.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Reserve.setForeground(new java.awt.Color(0, 0, 51));
        Reserve.setText("Reserve");
        Reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 51, 0));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Select your table");

        tableDataBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Table 1, 5 seats, No smoking", "Table 2, 12 seats, No smoking", "Table 3, 12 seats, Smoking", "Table 4, 4 seats, No smoking", "Table 5, 4 seats, Smoking", "Table 6, 7 seats, Smoking", "Table 7, 6 seats, Smoking" }));
        tableDataBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableDataBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Reserver name");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Choose your order");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Appetizer");

        appetizerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Greek Salade", "Fried Potatos", "Mushroom Soup", "Appetizer of the Day" }));

        Appetizeradd.setBackground(new java.awt.Color(255, 102, 0));
        Appetizeradd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Appetizeradd.setForeground(new java.awt.Color(0, 0, 51));
        Appetizeradd.setText("Add Appetizer");
        Appetizeradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppetizeraddActionPerformed(evt);
            }
        });

        CalculatePrice.setBackground(new java.awt.Color(255, 102, 0));
        CalculatePrice.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        CalculatePrice.setForeground(new java.awt.Color(0, 0, 51));
        CalculatePrice.setText("Calculate Price");
        CalculatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculatePriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Total Price");

        totalPriceLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        totalPriceLabel.setForeground(new java.awt.Color(255, 102, 0));
        totalPriceLabel.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Main Course");

        mainCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grilled Chicken", "Beef Steak", "Main Course of the Day" }));

        MainCourseAdd.setBackground(new java.awt.Color(255, 102, 0));
        MainCourseAdd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        MainCourseAdd.setForeground(new java.awt.Color(0, 0, 51));
        MainCourseAdd.setText("Add Main Course");
        MainCourseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainCourseAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Desert");

        desertComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apple Pie", "Molten Cake", "Desert of the Day" }));

        DesertAdd.setBackground(new java.awt.Color(255, 102, 0));
        DesertAdd.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        DesertAdd.setForeground(new java.awt.Color(0, 0, 51));
        DesertAdd.setText("Add Desert");
        DesertAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesertAddActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 102, 0));
        Reset.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 0, 51));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(mainList);

        jScrollPane4.setViewportView(desList);

        jScrollPane3.setViewportView(appList);

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Appetizers");

        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Main Course");

        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Deserts");

        Logout.setBackground(new java.awt.Color(255, 0, 0));
        Logout.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(0, 0, 51));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("We will contact you when available");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CalculatePrice)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tableDataBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reserverText)))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(appetizerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Appetizeradd))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mainCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(MainCourseAdd))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DesertAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(desertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(97, 97, 97))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(tableDataBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(reserverText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Appetizeradd)
                                    .addComponent(MainCourseAdd)
                                    .addComponent(DesertAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CalculatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(appetizerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mainCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
      new Login().setVisible(true);
      dispose();
      
    }//GEN-LAST:event_LogoutActionPerformed
    DefaultListModel mod1 =new DefaultListModel();
    DefaultListModel mod2 =new DefaultListModel();
    DefaultListModel mod3 =new DefaultListModel();
    private void AppetizeraddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppetizeraddActionPerformed
        
        listOfApp.add((String) appetizerComboBox.getSelectedItem());
       
        ArrayList <Order> listOfOrdersFA = new ArrayList<Order>();
        try {
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Orders.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Orders ors = (Orders) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\orders.xml") );
            
            for (Iterator<Order> it = ors.getOrders().iterator(); it.hasNext();) {
                Order or = it.next();
                listOfOrdersFA.add(or);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0 ; i < listOfOrdersFA.size() ; i++ )
        {
            if (listOfOrdersFA.get(i).getName().equals((String) appetizerComboBox.getSelectedItem()))
            {
                totalAppPrice += listOfOrdersFA.get(i).getPrice() + listOfOrdersFA.get(i).getPrice() * 0.1;
            }
        }
        appList.setModel(mod1);
        mod1.addElement(appetizerComboBox.getSelectedItem());
        
    }//GEN-LAST:event_AppetizeraddActionPerformed

    private void MainCourseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainCourseAddActionPerformed
       listOfMain.add((String) mainCourseComboBox.getSelectedItem());
       
       ArrayList <Order> listOfOrdersFM = new ArrayList<Order>();
       try {
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Orders.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Orders ors = (Orders) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\orders.xml") );
            
            for (Iterator<Order> it = ors.getOrders().iterator(); it.hasNext();) {
                Order or = it.next();
                listOfOrdersFM.add(or);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       for (int i = 0 ; i < listOfOrdersFM.size() ; i++ )
        {
            if (listOfOrdersFM.get(i).getName().equals((String) mainCourseComboBox.getSelectedItem()))
            {
                totalMainPrice += listOfOrdersFM.get(i).getPrice() + listOfOrdersFM.get(i).getPrice() * 0.15;
            }
        }
       mainList.setModel(mod2);
       mod2.addElement(mainCourseComboBox.getSelectedItem());
    }//GEN-LAST:event_MainCourseAddActionPerformed

    private void DesertAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesertAddActionPerformed
       listOfDes.add((String) desertComboBox.getSelectedItem());
       
       ArrayList <Order> listOfOrdersFD = new ArrayList<Order>();
       try {
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Orders.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Orders ors = (Orders) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\orders.xml") );
            
            for (Iterator<Order> it = ors.getOrders().iterator(); it.hasNext();) {
                Order or = it.next();
                listOfOrdersFD.add(or);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       for (int i = 0 ; i < listOfOrdersFD.size() ; i++ )
        {
            if (listOfOrdersFD.get(i).getName().equals((String) desertComboBox.getSelectedItem()))
            {
                totalDesPrice += listOfOrdersFD.get(i).getPrice() + listOfOrdersFD.get(i).getPrice() * 0.2;
            }
        }
       desList.setModel(mod3);
       mod3.addElement(desertComboBox.getSelectedItem());
    }//GEN-LAST:event_DesertAddActionPerformed

    private void CalculatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculatePriceActionPerformed
        totalPrice = totalAppPrice + totalDesPrice + totalMainPrice;
        String totalPrice1 = Double.toString(totalPrice);
        totalPriceLabel.setText(totalPrice1);
        
    }//GEN-LAST:event_CalculatePriceActionPerformed

    private void tableDataBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableDataBoxActionPerformed
        
        
    }//GEN-LAST:event_tableDataBoxActionPerformed

    private void ReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveActionPerformed

        if (tableDataBox.getSelectedIndex()==0)
        
            JOptionPane.showMessageDialog(this,"You Must Choose a Table");
        
        else if (reserverText.getText().equals(""))
            
           JOptionPane.showMessageDialog(this,"You Must Enter a Reserver");
          
        else
        {            Reservation res = new Reservation();
        switch (tableDataBox.getSelectedIndex())
        {
            case 1:
                res.setTableId(1);
                break;
            case 2:
                res.setTableId(2);
                break;
            case 3:
                res.setTableId(3);
                break;
            case 4:
                res.setTableId(4);
                break;
            case 5:
                res.setTableId(5);
                break;
            case 6:
                res.setTableId(6);
                break;
            case 7:
                res.setTableId(7);
                break;
        }
        
        res.setReserver(reserverText.getText());
        
        ArrayList <Order> listOfOrders = new ArrayList<Order>();
        
        try {
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Orders.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Orders ors = (Orders) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\orders.xml") );
            
            for (Iterator<Order> it = ors.getOrders().iterator(); it.hasNext();) {
                Order or = it.next();
                listOfOrders.add(or);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        listOfMain.addAll(listOfApp);
        listOfMain.addAll(listOfDes);
        joinedList.addAll(listOfMain);
        
        String listString = "";
        
        for (Iterator<String> it = joinedList.iterator(); it.hasNext();) {
            String s = it.next();
            listString += s + " , ";
        }
        
        String result = null;
        
        if ((listString.length() > 0)) {
            result = listString.substring(0, listString.length() - 3);
        }
        
        ArrayList <Reservation> listOfReservations = new ArrayList<Reservation>();
        
        try {
        JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                
        Reservations ress = (Reservations) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\reservations.xml") );
                
        for (Iterator<Reservation> it = ress.getReservations().iterator(); it.hasNext();) {
            Reservation re = it.next();
            listOfReservations.add(re);
        }
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        res.setFood(result);
        res.setResPrice(totalPrice);
        
        listOfReservations.add(res);
        Reservations reservations = new Reservations();
        reservations.setReservations(listOfReservations);
        try {
        JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(reservations, new File("src\\restaurant\\reservation\\system\\reservations.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"Reservation Recorded Thank you for Choosing our Restaurant");
        }
        

        
    }//GEN-LAST:event_ReserveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        for (int i = 0 ; i < listOfApp.size() ; i++ )
        {
            listOfApp.clear();
            totalAppPrice = 0;
 
        }
        
        
        for (int i = 0 ; i < listOfMain.size() ; i++ )
        {
            listOfMain.clear();
            totalMainPrice =0;
           
        }
        
        
        for (int i = 0 ; i < listOfDes.size() ; i++ )
        {
            listOfDes.clear();
            totalDesPrice =0.0;
        }
      
        
        reserverText.setText("");
        mod1.clear();
        appList.setModel(mod1);
        mod2.clear();
        mainList.setModel(mod2);
        mod3.clear();
        desList.setModel(mod3);
        String p=Double.toString(0.0);
        totalPriceLabel.setText(p);
        tableDataBox.setSelectedIndex(0);
        appetizerComboBox.setSelectedIndex(0);
        mainCourseComboBox.setSelectedIndex(0);
        desertComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Appetizeradd;
    private javax.swing.JButton CalculatePrice;
    private javax.swing.JButton DesertAdd;
    private javax.swing.JButton Logout;
    private javax.swing.JButton MainCourseAdd;
    private javax.swing.JButton Reserve;
    private javax.swing.JButton Reset;
    private javax.swing.JList appList;
    private javax.swing.JComboBox appetizerComboBox;
    private javax.swing.JList desList;
    private javax.swing.JComboBox desertComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox mainCourseComboBox;
    private javax.swing.JList mainList;
    private javax.swing.JTextField reserverText;
    private javax.swing.JComboBox tableDataBox;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
