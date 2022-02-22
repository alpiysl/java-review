package Day3.Tasks;

import Day3.Tasks.Trader;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {

    private Trader trader;
    private int year;
    private int value;
}
