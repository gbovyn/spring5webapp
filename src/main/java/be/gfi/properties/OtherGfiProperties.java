package be.gfi.properties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OtherGfiProperties {

    private String username;
    private String password;
    private String website;
}
