package edu.neu.csye6200;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;


import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileUtil {
    public static List<String> readCSV(String fileName) {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(fileName);

        try {
            lines = Files.readAllLines(path);


            // Remove any empty or malformed lines
            lines.removeIf(line -> line.trim().isEmpty() || line.split(",").length != 4);


        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
        }

        return lines;
    }
}
