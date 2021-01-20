package javaapplication37;


import java.util.Scanner;

public class JavaApplication37{

    
  private long startTime = 0;
  private long stopTime = 0;
  private boolean running = false;
  public long elapsed = 0;

  
 public static void main(String[] args)  {
     
 }
  
  
  
  
 Scanner scanner = new Scanner(System.in);
  public  void running(String[] args) {
      System.out.println("Stopwatch Starting ");   
 start();
     long elapsed;
    if (running) {
      elapsed = ((System.currentTimeMillis() - startTime) / 1000);
    } else {
      elapsed = ((stopTime - startTime) / 1000);
    }
          while (running = true)
      System.out.println(elapsed);
      String input = scanner.nextLine();
      if (input.equals(" ")) {
      running = false;
      }
  
  
  
  
  }
 
  

  public void start() {
    this.startTime = System.currentTimeMillis();
    this.running = true;
  }



  }

  
   
          
  
