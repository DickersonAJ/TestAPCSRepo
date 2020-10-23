public class Demo {

  public static void main(String[] args) {
    if (args.length == 0) {
      printLoop(5);
    }
    else {
      int n = Integer.parseInt(args[0]);
      printLoop(n);
    }
//    int[] a = {1, 2, 3, 4, 5};
//    int[][] b = {{9}, {78, 45}, {1, 2, 3}};
//    System.out.println(arrToString(a));
//    System.out.println(arrayDeepToString(b));
//    System.out.println(arrayDeepToString(b).replace("}, ","},\n "));
//    System.out.println(arrayDeepToString(create2DArray(5,4,4)));
//    System.out.println(arrayDeepToString(create2DArray(6,2,3)));
//    System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,10)));
//    System.out.println(arrayDeepToString(create2DArrayRandomized(3,3,100)));
  }

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i; j++ ) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      str = str + Integer.toString(arr[i]);
      if (i < arr.length - 1) {
        str = str + ", ";
      }
    }
    str = str + "}";
    return (str);
  }

  public static String arrayDeepToString(int[][] arr){
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      str = str + "{";
      if (arr[i].length == 0) {
        str = str + "}";
        if (i < arr.length - 1) {
          str = str + ", ";
        }
      }
      for (int j = 0; j < arr[i].length; j++) {
        str = str + Integer.toString(arr[i][j]);
        if (j < arr[i].length - 1) {
          str = str + ", ";
        }
        else {
          str = str + "}";
          if (i < arr.length - 1) {
            str = str + ", ";
          }
        }
      }
    }
    str = str + "}";
    return (str);
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][]x = new int[rows][cols];
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        x[i][j] = (int)(Math.random()*(maxValue+1));
      }
    }
    return x;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][]arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int m = (int)(Math.random()*(cols+1));
      arr[i] = new int[m];
      for (int j = 0; j < m; j++) {
        arr[i][j] = (int)(Math.random()*(maxValue+1));
      }
    }
    return arr;
  }

}
