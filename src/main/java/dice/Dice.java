package dice;

import java.util.Random;

public class Dice {
  /**
   * Roll method.
   * intro for RNG
   */
  public int roll(int sides) {
    Random random = new Random();

    return random.nextInt(sides) + 1;
  }
}