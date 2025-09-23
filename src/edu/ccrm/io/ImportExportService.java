package edu.ccrm.io;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class ImportExportService {
    public void importFile(String path) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.forEach(System.out::println);
        }
    }

    public void exportFile(String path, String content) throws IOException {
        Files.writeString(Paths.get(path), content);
    }
}