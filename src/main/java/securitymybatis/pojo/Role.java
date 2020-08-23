package securitymybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public final class Role{
    private int role;
    private String grade1;
    private String grade2;
    private String grade3;
    private String grade4;
}

