package sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mgh on 17/11/21.
 */
@RestController
@RefreshScope
public class MySampleRestController {
    @Value("${appName}")
    private String appName;

    @RequestMapping("/app-name")
    public String getAppName() {
        return appName;
    }
}
