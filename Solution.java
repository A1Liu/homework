import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Solution {

  public static void main(String[] args) throws Exception {
    u.debug = false; solution(args); u.flush(); }

  public static void solution(String[] args) throws Exception {
    u.debug("Debug mode.");
  }

}

class u {

  public static boolean debug;
  public static BufferedWriter outStream;
  public static StringBuilder out;
  public static Scanner in;
  private static String current;
  private static int index;

  static {
    in = new Scanner(System.in);
    try {
      outStream = new BufferedWriter(new OutputStreamWriter(System.out, "ASCII"), 4096);
    } catch (Exception e) {}
    out = new StringBuilder();
    debug = false;
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
    index = 0;
    current = in.next();
    return current;
  }

  public static char character() {
    if (current == null || index >= current.length()) {
      return word().charAt(index++);
    } else {
      return current.charAt(index++);
    }
  }

  public static void fromFile(String path) throws Exception {
    fromFile(new File(path));
  }

  public static void fromFile(File file) throws Exception {
    in = new Scanner(file);
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
