package com.konopackipio1.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileReadersTest {

    @Test
    public void testReadBigFile() {
        assertEquals(3, FileReaders.readBigFile("src/test/testInput.txt").size());
    }

    @Test
    public void testSmallBigFile() {
        assertEquals(3, FileReaders.readSmallFile("src/test/testInput.txt").size());
    }

    @Test
    public void testReadBigFile_noFile() {
        assertEquals(0, FileReaders.readBigFile("").size());
    }

    @Test
    public void testSmallBigFile_noFile() {
        assertEquals(0, FileReaders.readSmallFile("ble").size());
    }
}
