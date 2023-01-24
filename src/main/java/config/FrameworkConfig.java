package config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/main/resources/config.properties")
public interface FrameworkConfig extends Config {
    String url();
    String browser();
}
