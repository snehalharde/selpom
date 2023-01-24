package driver;

import config.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;

public final class ConfigReader {

    private ConfigReader() {
    }

    public static FrameworkConfig getConfig() {
        return ConfigFactory.create(FrameworkConfig.class);

    }
}
