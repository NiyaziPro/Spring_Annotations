package com.spring.utils;

public interface Color {
    // Reset
    String RESET = "\u001B[0m";

    // Regular Colors
    String BLACK = "\u001B[30m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";
    // Bright Colors
    String BRIGHT_BLACK = "\u001B[90m";
    String BRIGHT_RED = "\u001B[91m";
    String BRIGHT_GREEN = "\u001B[92m";
    String BRIGHT_YELLOW = "\u001B[93m";
    String BRIGHT_BLUE = "\u001B[94m";
    String BRIGHT_PURPLE = "\u001B[95m";
    String BRIGHT_CYAN = "\u001B[96m";
    String BRIGHT_WHITE = "\u001B[97m";

    // Background Colors
    String BG_BLACK = "\u001B[40m";
    String BG_RED = "\u001B[41m";
    String BG_GREEN = "\u001B[42m";
    String BG_YELLOW = "\u001B[43m";
    String BG_BLUE = "\u001B[44m";
    String BG_PURPLE = "\u001B[45m";
    String BG_CYAN = "\u001B[46m";
    String BG_WHITE = "\u001B[47m";

    // Bright Background Colors
    String BG_BRIGHT_BLACK = "\u001B[100m";
    String BG_BRIGHT_RED = "\u001B[101m";
    String BG_BRIGHT_GREEN = "\u001B[102m";
    String BG_BRIGHT_YELLOW = "\u001B[103m";
    String BG_BRIGHT_BLUE = "\u001B[104m";
    String BG_BRIGHT_PURPLE = "\u001B[105m";
    String BG_BRIGHT_CYAN = "\u001B[106m";
    String BG_BRIGHT_WHITE = "\u001B[107m";

    void fill();
}
