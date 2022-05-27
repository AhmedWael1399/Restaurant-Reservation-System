package GUIs;
import restaurant.reservation.system.Reservations;
import restaurant.reservation.system.Reservation;
import restaurant.reservation.system.User;
import restaurant.reservation.system.Users;
import restaurant.reservation.system.Customer;
import restaurant.reservation.system.Cooker;
import restaurant.reservation.system.Manager;
import restaurant.reservation.system.Waiter;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Login extends javax.swing.JFrame {
    public Login() {
    initComponents();  
    showDate();
    showTime();
    }
 
    void showDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd--MM--yyyy");
        dateLabel.setText(sdf.format(d));
    }
    
    void showTime(){
         new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        timeLabel.setText(sdf.format(d));
            }
            
        }).start();
        
       
    }
    
    
   ArrayList<String> joinedList = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Welcome to");

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("TasteLife");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("username");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("password");

        signInButton.setBackground(new java.awt.Color(255, 102, 0));
        signInButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        signInButton.setForeground(new java.awt.Color(0, 0, 51));
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(255, 102, 0));
        signUpButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 0, 51));
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Didn't register ?");

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 0, 51));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Date:");

        dateLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 102, 0));
        dateLabel.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Time:");

        timeLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 102, 0));
        timeLabel.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(signInButton))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUpButton))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(passwordField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateLabel)
                    .addComponent(jLabel8)
                    .addComponent(timeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(signUpButton))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signInButton)
                        .addComponent(Exit)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    double totalEarnedMoney;
    ArrayList<Reservation> listOfReservations = new ArrayList<Reservation>();
    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed

        ArrayList <User> listOfUsers = new ArrayList<User> ();
        ArrayList <Manager> managers = new ArrayList<Manager>();
        ArrayList <Customer> customers = new ArrayList<Customer>();
        ArrayList <Cooker> cookers = new ArrayList<Cooker>();
        ArrayList <Waiter> waiters = new ArrayList<Waiter>();

        if (usernameTextField.getText().equals("") || passwordField.getText().equals("") )
        {
           JOptionPane.showMessageDialog(this, "You should enter data.");   
        }
        
        else {
        
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            Users uss = (Users) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\users.xml") );
            
            for (Iterator<User> it = uss.getUsers().iterator(); it.hasNext();) {
                User us = it.next();
                listOfUsers.add(us);
            }
           
            
        } catch (JAXBException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int t = 0 ; t < listOfUsers.size() ; t++ )
        {
            switch (listOfUsers.get(t).getRole())
            {
                case "Client":
                    Customer customer = new Customer();
                    customer.setName(listOfUsers.get(t).getName());
                    customer.setPassword(listOfUsers.get(t).getPassword());
                    customer.setUsername(listOfUsers.get(t).getUsername());
                    customer.setRole(listOfUsers.get(t).getRole());
                    customers.add(customer);
                    break;
                case "Manager":
                    Manager manager = new Manager();
                    manager.setName(listOfUsers.get(t).getName());
                    manager.setPassword(listOfUsers.get(t).getPassword());
                    manager.setUsername(listOfUsers.get(t).getUsername());
                    manager.setRole(listOfUsers.get(t).getRole());
                    managers.add(manager);
                    break;
                case "Cooker":
                    Cooker cooker = new Cooker();
                    cooker.setName(listOfUsers.get(t).getName());
                    cooker.setPassword(listOfUsers.get(t).getPassword());
                    cooker.setUsername(listOfUsers.get(t).getUsername());
                    cooker.setRole(listOfUsers.get(t).getRole());
                    cookers.add(cooker);
                    break;
                case "Waiter":
                    Waiter waiter = new Waiter();
                    waiter.setName(listOfUsers.get(t).getName());
                    waiter.setPassword(listOfUsers.get(t).getPassword());
                    waiter.setUsername(listOfUsers.get(t).getUsername());
                    waiter.setRole(listOfUsers.get(t).getRole());
                    waiters.add(waiter);
                    break;
            }
            
        }
        
        int f = 0;
        
        List <User> users = listOfUsers;
        ArrayList <String> wairs = new ArrayList<String>();
        ArrayList <String> chefs = new ArrayList<String>();
        for ( int i = 0 ; i < users.size() ; i++ )
        {
            if (users.get(i).getUsername().equals(usernameTextField.getText()) && users.get(i).getPassword().equals(passwordField.getText()))
            {
                f = 1;
                if (null != users.get(i).getRole())
                switch (users.get(i).getRole()) {
                    case "Client":
                        
                        try {
                               JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
                               Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                
                               Reservations ress = (Reservations) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\reservations.xml") );
                
                               for (Iterator<Reservation> it = ress.getReservations().iterator(); it.hasNext();) {
                               Reservation re = it.next();
                               listOfReservations.add(re);
                               }

                               for ( int k = 0 ; k < listOfReservations.size() ; k++ )
                               {
                                   totalEarnedMoney += listOfReservations.get(k).getResPrice();
                               }
                               } catch (JAXBException ex) {
                                   Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
                               }
                        ArrayList <String> tables = new ArrayList<String>();
                        for ( int m = 0 ; m < listOfReservations.size() ; m++ )
                        {
                            String s = Integer.toString(listOfReservations.get(m).getTableId());
                            tables.add(s);
                        }
                        new CustGUI(tables).setVisible(true);
                        dispose();
                        break;
                    case "Manager":
        
                          try {
                               JAXBContext jaxbContext = JAXBContext.newInstance(Reservations.class);
                               Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                
                               Reservations ress = (Reservations) jaxbUnmarshaller.unmarshal( new File("src\\restaurant\\reservation\\system\\reservations.xml") );
                
                               for (Iterator<Reservation> it = ress.getReservations().iterator(); it.hasNext();) {
                               Reservation re = it.next();
                               listOfReservations.add(re);
                               }

                               for ( int k = 0 ; k < listOfReservations.size() ; k++ )
                               {
                                   totalEarnedMoney += listOfReservations.get(k).getResPrice();
                               }
                               } catch (JAXBException ex) {
                                   Logger.getLogger(CustGUI.class.getName()).log(Level.SEVERE, null, ex);
                               }
                          
                          for ( int h = 0 ; h < waiters.size() ; h++ )
                          {
                              wairs.add(waiters.get(h).getName());
                          }
                          
                          for ( int z = 0 ; z < cookers.size() ; z++ )
                          {
                              chefs.add(cookers.get(z).getName());
                          }
   
                        new ManagerGUI(listOfReservations,wairs,chefs,totalEarnedMoney).setVisible(true);
                        dispose();
                        break;
                    case "Cooker":
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
                        new CookerGUI(listOfReservations).setVisible(true);
                        dispose();
                        break;
                    case "Waiter":
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
                        new WaiterGUI(listOfReservations).setVisible(true);
                        dispose();
                        break;
                }
                
            }
        }
        
        if (f == 0)
            JOptionPane.showMessageDialog(this, "Invalid data.");

        }
    }//GEN-LAST:event_signInButtonActionPerformed


    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed

    int response = JOptionPane.showConfirmDialog(this,"Do you want to register ?", "Sign Up" ,JOptionPane.OK_CANCEL_OPTION);
    
     if  (response==JOptionPane.OK_OPTION)
      {
        new SignUp().setVisible(true);
        dispose();
       
      }
      else {
          new Login().setVisible(true);
          dispose();
      }

    }//GEN-LAST:event_signUpButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      close();
    }//GEN-LAST:event_ExitActionPerformed

    public static void main(String args[]) throws JAXBException {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent (this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }

    
}
