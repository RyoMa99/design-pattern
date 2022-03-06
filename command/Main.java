package command;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

public class Main extends JFrame implements ActonListener, MouseMotionListener, WindowListener{
  private MacroCommand history = new MacroCommand();
  private DrawCanvas canvas = new DrawCanvas(400, 400, history);
  private JButton clearButton = new JButton("clear");

  public Main(String title){
    super(title);

    this.addWindowListener(this);
    canvas.addMouseMotionListener(this);
    clearButton.addActionListener(this);

    Box buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(this);
    Box mainBox = new Box(BoxLayout.Y_AXIS);
    mainBox.add(this);
    mainBox.add(canvas);
    getContentPane().add(mainBox);

    pack();
    show();
  }

  public void actionPerformed(ActonEvent e){
    if (e.getSource() == clearButton){
      history.clear();
      canvas.repaint();
    }
  }

  public void mouseMoved(MouseEvent e){}

  public void mouseDragged(MouseEvent e){
    Command cmd = new DrawCommand(canvas, e.getPoint());
    history.append(cmd);
    cmd.execute();
  }

  public void windowClosing(WindowEvent e){
    System.exit(0);
  }

  public static void main(String[] args) {
    new Main("Command Pattern Sample");
  }
}
