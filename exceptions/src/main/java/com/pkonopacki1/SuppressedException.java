package com.pkonopacki1;

class Season implements AutoCloseable {
    private int seasonNumber;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    @Override
    public void close() {
        System.out.println("Season clonsing process started...");
        if(seasonNumber == 1) {
            throw new RuntimeException("Closing season failed");
        }
        System.out.println("Season closed..."); 
    }

    public void run() {
        System.out.println("Running season " + seasonNumber);
        if(seasonNumber == 1) {
            throw new RuntimeException("Running season failed");
        }
    }

    
}

public class SuppressedException {
    public static void main(String[] args) {
        try (Season season = new Season(1)) {
            season.run();
        } catch(Exception e) {
            System.out.println("Exception caught: " + e);

            for(Throwable se: e.getSuppressed()) {
                System.out.println("Suppressed: " + se);
            }
        }   
               
    }
    
}
