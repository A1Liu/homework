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

/**
 * Class for handling simple IO and debugging.
 *
 */
class u {

  /** Flag for enabling debug mode */
  public static boolean debug;

  public static BufferedWriter outStream;
  private static StringBuilder out;

  public static BufferedReader in;
  private static StringTokenizer line;

  /** Values for current word, used to synchronize inputting by word and by character */
  private static String current;
  private static int index;

  static {
    try {
      fromStdIO();
      line = new StringTokenizer("");
      outStream = new BufferedWriter(new OutputStreamWriter(System.out, "ASCII"), 4096);
    } catch (Exception e) {}
    out = new StringBuilder();
    debug = false;
  }

  /**
   * Get an integer from input
   */
  public static long integer() throws Exception {
    return Long.parseLong(word());
  }

  /**
   * Get a floating point number from input
   */
  public static double decimal() throws Exception {
    return Double.parseDouble(word());
  }

  /**
   * Get an integer/index of an array from input
   */
  public static int index() throws Exception {
    return Integer.parseInt(word());
  }

  private static String nextToken() throws Exception {
    if (line != null && line.hasMoreTokens()) {
      return line.nextToken();
    } else {
      while(!line.hasMoreTokens()) {
        line = new StringTokenizer(in.readLine());
      }
      return line.nextToken();
    }
  }

  /**
   * Get a string from input
   */
  public static String word() throws Exception {
    if (index != 0 && index < current.length()) {
      current = current.substring(index);
      return current;
    }
    index = 0;
    current = nextToken();
    return current;
  }

  /**
   * Get a single character from input
   */
  public static char character() throws Exception {
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
    in = new BufferedReader(new FileReader(file));
  }

  public static void fromStdIO() throws Exception {
    in = new BufferedReader(new InputStreamReader(System.in));
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
