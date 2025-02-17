package spaghetti.utils;

import java.io.File;

public final class Utils {
    public static String getFileExtension(File f) {
        String extension = "";

        int i = f.getName().lastIndexOf('.');
        if (i > 0) extension = f.getName().substring(i+1);

        return extension.toLowerCase();
    }

    public static <T> Pair<T, T> swap(T a, T b) {
        return new Pair<>(b, a);
    }
}
