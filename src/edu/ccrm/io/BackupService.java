package edu.ccrm.io;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupService {
    public void backup(String sourceDir) throws IOException {
        String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        Path target = Paths.get("backups", "backup-" + ts);
        Files.createDirectories(target);
        Files.walk(Paths.get(sourceDir)).forEach(p -> {
            try {
                Path dest = target.resolve(p.getFileName());
                if (Files.isRegularFile(p)) Files.copy(p, dest, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) { e.printStackTrace(); }
        });
        System.out.println("Backup complete: " + target);
    }
}
