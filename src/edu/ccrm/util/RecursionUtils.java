package edu.ccrm.util;

import java.io.IOException;
import java.nio.file.*;

public class RecursionUtils {
    public static long folderSize(Path path) throws IOException {
        if (Files.isRegularFile(path)) return Files.size(path);
        long size = 0;
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path p : ds) {
                size += folderSize(p);
            }
        }
        return size;
    }
}
