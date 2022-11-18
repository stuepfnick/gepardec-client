package net.nu_code.gepardec_client;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

@Service
public class FileEncoder {
    public String encodeFileToBase64(String fileLocation) {
        try {
            byte[] fileContent = Files.readAllBytes(Path.of(fileLocation));
            return Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            throw new IllegalStateException("could not read file at: " + fileLocation, e);
        }
    }
}
