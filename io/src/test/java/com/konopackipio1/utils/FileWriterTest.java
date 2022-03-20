package com.konopackipio1.utils;

import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class FileWriterTest {
    @Test
    public void testWriteFile() {
        String stringPath = "src/test/test_files/testOutput";
        Path path = Paths.get(stringPath);
        String content = "Test output content";

        FileWriter.writeFile(path, content);
        List<String> result = FileReaders.readSmallFile(stringPath);
        
        assertEquals(content, result.get(0));
    }
}
