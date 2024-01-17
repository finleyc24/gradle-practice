package dice;

import java.util.Random;

/** Javadoc comment. */
public class Dice {
  public int roll(int sides) {
    return new Random().nextInt();
  }
}