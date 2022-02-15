package task;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Data // instead of all above
@Builder //generates an AllArgsCons unless there is another XCons
public class Orange {

    private int weight;
    private Color color;
}
