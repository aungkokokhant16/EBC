package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.StringTokenizer;

public class test extends JFrame implements ActionListener {

    int unit;
    double charge,grandamount;
    JLabel cusName,cusAddress,cusMeterid,cusUnit,cusID;
    JTextField txfName,txfAddress,txfMeterid,txfUnit,txfID;
    JTextArea jta = new JTextArea ();
    JScrollPane jsp;
    JButton btnSave,btnCancel,btnExit,btnsShowlist;
    JPanel p1,p2;

    public test(){
        super("Electricity Unit Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(null);

        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("Electricity Bill Circulation"));
        p1.setBounds(10,10,390,250);
        p1.setBackground(new Color(179,218,241));
        p1.setLayout(null);

        cusID = new JLabel("Customer ID");
        cusID.setBounds(10,30,100,20);
        p1.add(cusID);

        cusMeterid = new JLabel("Customer Meter ID");
        cusMeterid.setBounds(10,60,150,20);
        p1.add(cusMeterid);

        cusName = new JLabel("Customer Name");
        cusName.setBounds(10,90,100,20);
        p1.add(cusName);



        cusAddress = new JLabel("Customer Address");
        cusAddress.setBounds(10,120,150,20);
        p1.add(cusAddress);

        cusUnit = new JLabel("Customer Unit");
        cusUnit.setBounds(10,150,100,20);
        p1.add(cusUnit);

        txfID = new JTextField();
        txfID.setBounds(170,30,200,20);
        p1.add(txfID);

        txfMeterid = new JTextField();
        txfMeterid.setBounds(170,60,200,20);
        p1.add(txfMeterid);

        txfName = new JTextField();
        txfName.setBounds(170,90,200,20);
        p1.add(txfName);

        txfAddress = new JTextField();
        txfAddress.setBounds(170,120,200,20);
        p1.add(txfAddress);

        txfUnit = new JTextField();
        txfUnit.setBounds(170,150,200,20);
        p1.add(txfUnit);

        btnSave = new JButton("Save");
        btnSave.setBounds(25,200,70,40);
//        btnSave.setMnemonic('S');
        btnSave.addActionListener(this);
        p1.add(btnSave);

        btnsShowlist = new JButton("List");
        btnsShowlist.setBounds(110,200,75,40);
//        btnsShowlist.setMnemonic('L');
        btnsShowlist.addActionListener(this);
        p1.add(btnsShowlist);

        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(200,200,75,40);
//        btnUpdate.setMnemonic('U');
        btnCancel.addActionListener(this);
        p1.add(btnCancel);

        btnExit = new JButton("Exit");
        btnExit.setBounds(290,200,75,40);
//        btnDelete.setMnemonic('D');
        btnExit.addActionListener(this);
        p1.add(btnExit);


        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("Customer Information"));
        p2.setBounds(10,280,390,250);
        p2.setLayout(null);
        p2.setBackground(new Color(203,203,203));

        jsp = new JScrollPane(jta);
        jsp.setBounds(10,20,350,200);
        p2.add(jsp);

        txfID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                txfIDKeyPressed(e);
            }
        });

        txfMeterid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                txfMeteridKeyPressed(e);
            }
        });

        txfUnit.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                txfUnitKeyPressed(e);
            }
        });

        txfName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                txfNameKeyPressed(e);
            }
        });




//        setBounds(100,100,500,500);
        add(p1);
        add(p2);
        setSize(430,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

    }


    private void txfIDKeyPressed(java.awt.event.KeyEvent e) {
        // TODO add your handling code here:
        String cusid = txfID.getText();
        int length = cusid.length();
        char c = e.getKeyChar();

        //check for number 0 to 9
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if(length<10){
                txfID.setEditable(true);
            }else{
                txfID.setEditable(false);
            }
        }else{
            if(e.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txfID.setEditable(true);
            }else{
                txfID.setEditable(false);
            }

        }
    }

    private void txfMeteridKeyPressed(java.awt.event.KeyEvent e) {
        // TODO add your handling code here:
        String cusid = txfMeterid.getText();
        int length = cusid.length();
        char c = e.getKeyChar();

        //check for number 0 to 9
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if(length<10){
                txfMeterid.setEditable(true);
            }else{
                txfMeterid.setEditable(false);
            }
        }else{
            if(e.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txfMeterid.setEditable(true);
            }else{
                txfMeterid.setEditable(false);
            }

        }
    }

    private void txfUnitKeyPressed(java.awt.event.KeyEvent e) {
        // TODO add your handling code here:
        String cusid = txfUnit.getText();
        int length = cusid.length();
        char c = e.getKeyChar();

        //check for number 0 to 9
        if(e.getKeyChar()>='0' && e.getKeyChar()<='9'){
            if(length<10){
                txfUnit.setEditable(true);
            }else{
                txfUnit.setEditable(false);
            }
        }else{
            if(e.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()== KeyEvent.VK_DELETE ){
                txfUnit.setEditable(true);
            }else{
                txfUnit.setEditable(false);
            }

        }
    }

    private void txfNameKeyPressed(java.awt.event.KeyEvent e) {
        // TODO add your handling code here:
        char c = e.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            txfName.setEditable(true);

        }else{
            txfName.setEditable(false);
        }
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btnSave))
        {
            if (txfID.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog (this,"Please Enter Customer ID");
                txfID.requestFocus(true);
            }
            else if (txfName.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog (this,"Please Enter Customer Name");
                txfName.requestFocus(true);
            }
            else if (txfAddress.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog (this,"Please Enter Customer Address");
                txfAddress.requestFocus(true);
            }
            else if (txfMeterid.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog (this,"Please Enter Customer Unit Id");
                txfMeterid.requestFocus(true);
            }
            else if (txfUnit.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog (this,"Please Enter Customer Amount of Unit");
                txfUnit.requestFocus(true);
            }
            else
            {

                saveRecord();
                return ;
            }
        }
        if (ae.getSource().equals(btnsShowlist))
        {
            showAllRecord ();
            return ;
        }
        if (ae.getSource().equals(btnCancel))
        {
            txfID.setText("");
            txfUnit.setText("");
            txfName.requestFocus(true);
            txfName.setText("");
            txfMeterid.setText("");
            txfAddress.setText("");
            txfID.setText("");
        }
        if(ae.getSource().equals(btnExit))
        {
            int result = JOptionPane.showConfirmDialog(null,"Are You Sure Want To Exit?...","Confirm Exit",JOptionPane.OK_CANCEL_OPTION);

            if(result == JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }



    }

    public void saveRecord()
    {
        unit= Integer.parseInt(txfUnit.getText());

        if (unit <= 30) {
            charge = unit*35;
        } else if (unit < 31 && unit <= 50) {
            charge= (1050 + (unit-30)*50);

        } else if (unit < 50 && unit <= 75) {
            charge = (1050 + 1000 +(unit-50)*70);

        } else if (unit < 76 && unit <= 100) {
            charge = ( 1050 + 1000 + 1750 +(unit-75)*90);

        } else if (unit < 101 && unit <= 150) {
            charge = ( 1050 + 1000 + 1750 + 2250+(unit-100)*110);

        } else if (unit < 151 && unit <= 200) {
            charge = ( 1050 + 1000 + 1750 + 2250+ 5500+ (unit-150)*120);

        } else {
            charge = ( 1050 + 1000 + 1750 + 2250+ 5500+ 6000+ (unit-200)*125) ;
        }

        grandamount = charge;



        try
        {
            BufferedWriter bw = new BufferedWriter ( new FileWriter ("CustomerDetails.txt",true));
            bw.write ( txfID.getText()+"|"+txfName.getText()+"|"+txfAddress.getText()+"|"+txfMeterid.getText()+"|"+txfUnit.getText()+"|"+grandamount
                    +System.getProperty("line.separator"));

            jta.setText("Name \t"+txfName.getText()+"\nAddress\t"+txfAddress.getText()+"\nUnit Id\t"
                    +txfMeterid.getText()+"\nAmount of Unit\t"+txfUnit.getText()+"\nTotal Balance\t"+grandamount);

            bw.flush();
            bw.close();

            txfID.setText("");
            txfName.setText("");

            txfAddress.setText("");

            txfMeterid.setText("");

            txfUnit.setText("");
            txfName.requestFocus(true);
            //JOptionPane.showMessageDialog (this, "Your Records are succesfully saved");


        }
        catch (IOException ioe)
        {
            JOptionPane.showMessageDialog (this, "Failed to save !");

        }
    }

    public void showAllRecord ()
    {
        try{
            String line;
            BufferedReader br= new BufferedReader (new FileReader("CustomerDetails.txt"));
            jta.setText ("");
            while ((line = br.readLine())!=null)
            {
                StringTokenizer stk = new StringTokenizer (line,"|");
                while (stk.hasMoreElements())
                {
                    jta.append (stk.nextToken()+"\t");

                }
                jta.append("\n");
            }br.close();
        }
        catch (FileNotFoundException fnfe)
        {
            JOptionPane.showMessageDialog (this,"File is not Found");
        }
        catch (IOException ioe)
        {
            JOptionPane.showMessageDialog (this,"Data cannot be read");
        }
    }







    public static  void  main    (String args []){
        new test();
    }


}
