package be.gfi.properties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GfiApplicationProperties {

    private String loginUrl;
    private String logoutUrl;
}
