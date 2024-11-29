package org.example;

public record Color (int r, int g, int b, int alpha) {

    public Color {
        if(r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || alpha < 0 || alpha > 255)
            throw new IllegalArgumentException("Skladowe nie mieszcza sie w przedziale.");
    }

    public Color (int r, int g, int b) {
        this(r, g, b, 0);
    }

    public String toAnsiCode() {
        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }

    @Override
    public String toString() {
        return "Red: " + r + ", Green: " + g + ", Blue: " + b + ", Alpha: " + alpha;
    }
}