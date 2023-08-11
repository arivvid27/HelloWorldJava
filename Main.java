import java.util.Scanner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main {
    private static void guiWindow(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField screen;

        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;
        
        JButton add;
        JButton subtract;
        JButton multiply;
        JButton divide;
        JButton clr;
        JButton equals;

        JPanel panel;

        frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.setSize(300, 425);
        Border border = BorderFactory.createLineBorder(Color.black,1);
        
        //set up panel
        panel = new JPanel();
        panel.setLayout(null);
        
        
        
        screen = new JTextField("0");
        screen.setLocation(25,25);
        screen.setSize(175,50);
        screen.setBackground(Color.WHITE);
        screen.setOpaque(true);
    
        button1 = new JButton("1");
        button1.setLocation(25,100);
        button1.setSize(50,50);
        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button1.setActionCommand("Action1");
        
        button2 = new JButton("2");
        button2.setLocation(25,155);
        button2.setSize(50,50);
        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button2.setActionCommand("Action2");
        
        button3 = new JButton("3");
        button3.setLocation(25,210);
        button3.setSize(50,50);
        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button3.setActionCommand("Action3");
        
        button4 = new JButton("4");
        button4.setLocation(25,265);
        button4.setSize(50,50);
        button4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button4.setActionCommand("Action4");
        
        button5 = new JButton("5");
        button5.setLocation(80,100);
        button5.setSize(50,50);
        button5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button5.setActionCommand("Action5");
        
        button6 = new JButton("6");
        button6.setLocation(80,155);
        button6.setSize(50,50);
        button6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button6.setActionCommand("Action6");
        
        button7 = new JButton("7");
        button7.setLocation(80,210);
        button7.setSize(50,50);
        button7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button7.setActionCommand("Action7");
        
        button8 = new JButton("8");
        button8.setLocation(80,265);
        button8.setSize(50,50);
        button8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button8.setActionCommand("Action8");
        
        button9 = new JButton("9");
        button9.setLocation(50,320);
        button9.setSize(50,50);
        button9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        button9.setActionCommand("Action9");
        
        add = new JButton("+");
        add.setLocation(150,100);
        add.setSize(50,50);
        add.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        add.setActionCommand("+");
        
        subtract = new JButton("-");
        subtract.setLocation(150,155);
        subtract.setSize(50,50);
        subtract.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        subtract.setActionCommand("-");
        
        multiply = new JButton("*");
        multiply.setLocation(150, 210);
        multiply.setSize(50,50);
        multiply.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        multiply.setActionCommand("*");
        
        divide = new JButton("÷");
        divide.setLocation(150,265);
        divide.setSize(50,50);
        divide.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        divide.setActionCommand("÷");
        
        clr = new JButton("CLR");
        clr.setLocation(205, 120);
        clr.setSize(75,50);
        clr.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        clr.setActionCommand("clr");
        
        equals = new JButton("=");
        equals.setLocation(205,175);
        equals.setSize(75,50);
        equals.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!");
            }
        });
        equals.setActionCommand("=");
        
    
        panel.add(screen);
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        
        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);
        panel.add(clr);
        panel.add(equals);
        
        
        
        frame.setContentPane(panel);
        frame.setVisible(true);

        
    }
    private static Scanner operator = new Scanner(System.in);
    public static void main(String[] args) {

        // Select Operations
        guiWindow(args);
        String confirmOp;

        System.out.println("[1] => Addition");
        System.out.println("[2] => Subtraction");
        System.out.println("[3] => Multiplication");
        System.out.println("[4] => Division");

        confirmOp = operator.nextLine();

        // Operations

        if ("1".equals(confirmOp)) {
            addition(args);
        } else if ("2".equals(confirmOp)) {
            subtraction(args);
        } else if ("3".equals(confirmOp)) {
            multiplication(args);
        } else if ("4".equals(confirmOp)) {
            division(args);
        }
        else {
            System.out.println("Not a valid option.");
        }
    }


    private static void addition(String[] args) {
        Scanner add1 = new Scanner(System.in);
        Scanner add2 = new Scanner(System.in);

        System.out.println("Enter two values: ");

        int val1 = add1.nextInt();
        int val2 = add2.nextInt();
        int sum = val1 + val2;

        System.out.println("Your sum is " + sum);
    }

    private static void subtraction(String[] args) {
        Scanner sub1 = new Scanner(System.in);
        Scanner sub2 = new Scanner(System.in);

        System.out.println("Enter two values: ");

        int val1 = sub1.nextInt();
        int val2 = sub2.nextInt();
        int remainder = val1 - val2;

        System.out.println("Your remainder is " + remainder);
    }

    private static void multiplication(String[] args) {
        Scanner mul1 = new Scanner(System.in);
        Scanner mul2 = new Scanner(System.in);

        System.out.println("Enter two values: ");

        int val1 = mul1.nextInt();
        int val2 = mul2.nextInt();
        int product = val1 * val2;

        System.out.println("Your product is " + product);
    }

    private static void division(String[] args) {
        Scanner div1 = new Scanner(System.in);
        Scanner div2 = new Scanner(System.in);

        System.out.println("Enter two values: ");

        int val1 = div1.nextInt();
        int val2 = div2.nextInt();
        int quotient = val1 / val2;

        System.out.println("Your quotient is " + quotient);
    }
}