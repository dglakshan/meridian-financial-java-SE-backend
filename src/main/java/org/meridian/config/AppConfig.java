package org.meridian.config;

import io.github.cdimascio.dotenv.Dotenv;

public class AppConfig {

    private static final Dotenv dotenv = Dotenv.load();

    public static final int SERVER_PORT = Integer.parseInt(dotenv.get("PORT"));
    public static final String API_BASE_PATH = "api/v1";

    public static final double MINIMUM_ACCOUNT_BALANCE = 500.00;
    public static final double MAXIMUM_SINGLE_TRANSFER_LIMIT = 500000.00;
    public static final String DEFAULT_CURRENCY = "LKR";

    public static final String ALLOWED_ORIGIN = dotenv.get("CORS_ALLOWED_ORIGIN","http//:localhost:5173");

    private AppConfig(){}
}
