package Day2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private int employeId;
    private String employeName;
    private String employeEmail;
    private List<String> empPhoneNumbers;

}
