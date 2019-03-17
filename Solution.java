import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Solution {

  public static void main(String[] args) throws Exception {

    // Flush the output when ready
    u.flush();
  }

}

class u {

  public static boolean debug;
  public static BufferedWriter outStream;
  public static StringBuilder out;
  public static Scanner in;

  static {
    in = new Scanner(System.in);
    try {
      outStream = new BufferedWriter(new OutStreamWriter(System.out, "ASCII"), 4096);
    } catch (Exception e) {}
    out = new StringBuilder();
    debug = true;
  }

  public static long integer() {
    return in.nextLong();
  }

  public static double decimal() {
    return in.nextDouble();
  }

  public static int index() {
    return in.nextInt();
  }

  public static String word() {
    return in.next();
  }

  public static void debug(Object... args) {
    if (!debug) return;
    System.err.print("[DEBUG]: ");
    for (Object o : args) {
      System.err.print(o.toString() + " ");
    }
    System.err.println();
  }

  public static void out(Object... args) {
    for (Object o : args) {
      out.append(o.toString());
      out.append(" ");
    }
    out.append("\n");
  }

  public static void flush() throws Exception {
    outStream.write(out.toString());
    outStream.flush();
    out = new StringBuilder();
  }
}
