package com.test.ppisakov;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {

    private static final String VERSION = "v7.1";

    public static void main(String[] args) {
        new App().showVersion();
    }

    public void showVersion() {
        log.info("Sanity Search test :: {}", VERSION);
    }

}
