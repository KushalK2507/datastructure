import C_arrays.B_AdvanceArray.F_PascalTriangle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) throws InterruptedException {
//    char[][] ele = new char[1][1];
//    System.out.println(Arrays.deepToString(ele));
//
//    List<Callable<Integer>> task = new LinkedList<>();
//    for (int i=0;i<100;i++){
//      task.add(new CallableTask());
//    }
//
//    var forkJoinPool = Executors.newWorkStealingPool();
//    var result = forkJoinPool.invokeAll(task);
//
//    System.out.println("Main Terminated");
//
//    var forkJoinPool1 = ForkJoinPool.commonPool();
//    System.out.println(forkJoinPool1.getParallelism());

    testPasCal();
    ProducerConsumer pc = new ProducerConsumer();
    Thread t1 = new Thread(() -> {
      try {
        pc.produce();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    });

  }

  public static void testPasCal(){
    F_PascalTriangle LPascalTriangle = new F_PascalTriangle(7);
    System.out.println("Pascal Triangle");
    var result = LPascalTriangle.pascalTriangle();
    for (int i = 0; i < 7; i++) {
      for (int j = i; j <= 7; j++) {
        System.out.print(" ");
      }
      System.out.println(
              result.get(i).stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    var res = LPascalTriangle.printLevel(7);
    System.out.println("Level = "+res);
  }
}

class ProducerConsumer{


  public void produce() throws InterruptedException {

    while (true){
      synchronized (this){
        notify();
      }

      wait();
    }
  }
}



class CallableTask implements Callable<Integer> {

  @Override
  public Integer call() {
    Random rand = new Random();
    var val = rand.nextInt(100) + 1;
    System.out.println("Executing Thread = "+Thread.currentThread().getName()+" Value = "+val);
    return val;
  }
}