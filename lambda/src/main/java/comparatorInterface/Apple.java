package comparatorInterface;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Apple {

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    private int weight;
    private Color color;
}
