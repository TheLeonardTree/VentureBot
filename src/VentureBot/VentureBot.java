
package VentureBot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.Random; 

/**
 *
 * @author leona
 */
public class VentureBot {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 0;
        int y = 25;   
        
         TimeUnit.SECONDS.sleep(5);  
   Random rand = new Random();       
   Robot robot = new Robot(); 
   int rand_int1 = rand.nextInt(1000); 
   
   while(x != y)
   {
   //warp out to asteroid belt
  robot.keyPress(KeyEvent.VK_S);
        TimeUnit.MILLISECONDS.sleep(rand_int1);   
            rand_int1 = rand.nextInt(1000); 
          robot.mouseMove(1300, 300);         
                TimeUnit.MILLISECONDS.sleep(rand_int1);  
                rand_int1 = rand.nextInt(1000); 
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.MILLISECONDS.sleep(rand_int1);   
      rand_int1 = rand.nextInt(1000); 
        TimeUnit.MILLISECONDS.sleep(rand_int1);
        rand_int1 = rand.nextInt(1000); 
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.MILLISECONDS.sleep(rand_int1);
      rand_int1 = rand.nextInt(1000); 
   robot.keyRelease(KeyEvent.VK_S);  
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);
rand_int1 = rand.nextInt(1000);     
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.SECONDS.sleep(40);

 //Orbit Asteroid
   robot.keyPress(KeyEvent.VK_W);
        TimeUnit.MILLISECONDS.sleep(rand_int1);  
        rand_int1 = rand.nextInt(1000); 
          robot.mouseMove(1300, 350);         
                TimeUnit.MILLISECONDS.sleep(rand_int1);    
                rand_int1 = rand.nextInt(1000); 
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.MILLISECONDS.sleep(rand_int1);   
      rand_int1 = rand.nextInt(1000); 
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.MILLISECONDS.sleep(rand_int1);
      rand_int1 = rand.nextInt(1000); 
   robot.keyRelease(KeyEvent.VK_W);  
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);    
    rand_int1 = rand.nextInt(1000); 
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);
    rand_int1 = rand.nextInt(1000); 
     
    
    // mine
              TimeUnit.SECONDS.sleep(40); 
             robot.keyPress(KeyEvent.VK_F2); 
             robot.keyPress(KeyEvent.VK_F1);
              TimeUnit.MILLISECONDS.sleep(rand_int1);
              rand_int1 = rand.nextInt(1000); 
          robot.keyRelease(KeyEvent.VK_F2);  
            robot.keyRelease(KeyEvent.VK_F1);
                TimeUnit.MILLISECONDS.sleep(rand_int1); 
                rand_int1 = rand.nextInt(1000); 
                  robot.mouseMove(1390, 155);    
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(1);    
    rand_int1 = rand.nextInt(1000); 
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      TimeUnit.MILLISECONDS.sleep(rand_int1);
      rand_int1 = rand.nextInt(1000); 
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    
    // turn off afterburners
      TimeUnit.MILLISECONDS.sleep(rand_int1);   
       robot.keyPress(KeyEvent.VK_F3);
          TimeUnit.MILLISECONDS.sleep(rand_int1);     
        robot.keyRelease(KeyEvent.VK_F3);  
        
//wait for mining
TimeUnit.SECONDS.sleep(1500);   

//navigate to station
    robot.mouseMove(890, 555);    
    robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);    
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);  
    robot.mouseMove(930, 665);    
    TimeUnit.MILLISECONDS.sleep(rand_int1); 
    robot.mouseMove(1150, 665);  
    TimeUnit.MILLISECONDS.sleep(rand_int1); 
    robot.mouseMove(1350, 665);  
    TimeUnit.MILLISECONDS.sleep(rand_int1); 
    robot.mouseMove(1350, 715);
    TimeUnit.MILLISECONDS.sleep(rand_int1); 
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    TimeUnit.MILLISECONDS.sleep(rand_int1);    
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
  
    //wait for travel back to base
    TimeUnit.SECONDS.sleep(70);   
  
   //open cargo hold
   robot.mouseMove(890, 505);    
   TimeUnit.MILLISECONDS.sleep(rand_int1);  
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(rand_int1);    
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(rand_int1);
   robot.mouseMove(930, 585);
   TimeUnit.MILLISECONDS.sleep(rand_int1); 
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(rand_int1); 
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(rand_int1);
   
      //Select Leftover Ore and move to item hold
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(1120, 505);  
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);    
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(780, 345); 
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Select Leftover Ore and move to item hold then sell all
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(1120, 505);  
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(870, 305);  
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(900, 330);  
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(850, 660); 
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Close Hanger Bay Item Window
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mouseMove(1260, 230);  
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   
   //Undock
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mouseMove(820, 505);  
   TimeUnit.MILLISECONDS.sleep(1);  
   robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseMove(875, 750);  
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.MILLISECONDS.sleep(1);
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
   TimeUnit.SECONDS.sleep(25);
   x=x+1;
   }
  }
}