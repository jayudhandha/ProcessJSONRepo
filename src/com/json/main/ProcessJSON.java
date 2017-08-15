package com.json.main;

import com.google.gson.Gson;
import com.json.beans.employeeDetails;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TimerTask;

/**
 *
 * @author jayesh
 */
public class ProcessJSON extends TimerTask {

    Gson gson = new Gson();

    @Override
    public void run() {
        processStart();
    }

    public void processStart() {
        System.out.println("Searching for files..!!");
        try {
            File folder = new File("src/sampleJsonData");
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles.length != 0) {
                for (File listOfFile : listOfFiles) {
                    System.out.println("File Name : " + listOfFile.getAbsolutePath());
                    BufferedReader reader = new BufferedReader(new FileReader(listOfFiles[0].getAbsolutePath()));
                    StringBuilder contentBuilder = new StringBuilder();
                    String line = reader.readLine();
                    while (line != null) {
                        contentBuilder.append(line);
                        line = reader.readLine();
                    }
                    employeeDetails empData = gson.fromJson(contentBuilder.toString(), employeeDetails.class);
                    System.out.println(empData.toString());
                }

            } else {
                System.out.println("No Files Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Exception in JSON processing : " + e.getMessage());
        }

    }

}
