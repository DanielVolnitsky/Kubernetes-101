package com.waytoodanny.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class SharedFileController {

    @GetMapping("/shared-file/content")
    public String sharedFileContent() throws IOException {
        String tmpdir = System.getProperty("java.io.tmpdir");
        System.out.println("Temp dir path: " + tmpdir);
        try {
            return fileContent(tmpdir + "/data/user-shared.txt");
        } catch (IOException e) {
            System.err.println(e);
            throw e;
        }
    }

    private static String fileContent(String filePath) throws IOException {
        Path path = Path.of(filePath);
        byte[] fileBytes = Files.readAllBytes(path);
        return new String(fileBytes, StandardCharsets.UTF_8);
    }
}
