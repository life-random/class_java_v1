package design.Strategy;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.HexFormat;

public class HexStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return HexFormat.of().formatHex(text.getBytes(StandardCharsets.UTF_8));
    }
}
