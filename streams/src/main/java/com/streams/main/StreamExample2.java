package com.streams.main;

import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;

/**
 * @author Subhranshu.
 *
 */

public class StreamExample2 {
    public final static ThreadLocal<DateFormatter> FORMATTER = ThreadLocal
            .withInitial(() -> new DateFormatter(
                    new SimpleDateFormat("dd-mmm-yyyy")));
}
