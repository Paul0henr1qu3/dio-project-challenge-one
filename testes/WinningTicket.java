package testes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class WinningTicket {

  private final int MEGA_SENA_MAX_NUMBERS = 6;
  
  private Set<Integer> numbers = new HashSet<>();

  public WinningTicket(){
    this.numbers = getNumbers();
  }


  public Set<Integer> getNumbers() {

    Random numberGenerator = new Random();

    while(this.numbers.size() != MEGA_SENA_MAX_NUMBERS){
      int number = numberGenerator.nextInt(61);
      this.numbers.add(number);
    }
    
    Set<Integer> orderedNumbers = new TreeSet<>(this.numbers);

    return orderedNumbers;
  }

}
