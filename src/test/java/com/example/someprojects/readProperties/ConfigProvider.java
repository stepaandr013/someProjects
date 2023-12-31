package com.example.someprojects.readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String URL_DEMOQA = readConfig().getString("url_demoqa");
    String URL_API = readConfig().getString("url_api");
    String URL_CACTUS = readConfig().getString("url_cactus");

}
