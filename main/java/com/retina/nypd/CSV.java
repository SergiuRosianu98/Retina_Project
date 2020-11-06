package com.retina.nypd;

import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSV {

    private static File file = new File(System.getProperty("user.dir"), "/src/main/resources/NYPD_Dataset.csv");


    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> eventMap) {

        /* Introducing HashMap element in a list to be able to sort the elements by value */
        List<Map.Entry<String, Integer>> eventMapToList =
                new LinkedList<Map.Entry<String, Integer>>(eventMap.entrySet());

        /* Sorting the list using a Comparator*/
        Collections.sort((eventMapToList), new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });


        /* Copying back the sorted data to a new HashMap */
        HashMap<String, Integer> auxMap = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : eventMapToList) {
            auxMap.put(entry.getKey(), entry.getValue());
        }

        return auxMap;

    }

    public static HashMap<String, Integer> getEvent(){

        try {
            HashMap<String, Integer> eventMap = new HashMap<>();

            FileReader fileReader = new FileReader(file);

            CSVReader csvReader = new CSVReaderBuilder(fileReader).build();

            String[] lineRecord = csvReader.readNext(); // header

            while ((lineRecord = csvReader.readNext()) != null) {
                eventMap.put(lineRecord[7], eventMap.containsKey(lineRecord[7]) ? eventMap.get(lineRecord[7]) + 1 : 1);
            }

            HashMap<String, Integer> sortedMap = sortByValue(eventMap);

            fileReader.close();
            csvReader.close();

            return sortedMap;
        }
        catch(Exception e){
            return null;
        }
    }

    public static boolean deleteOffense(long id){

        try{
        FileReader fileReader = new FileReader(file);

        CSVReader csvReader = new CSVReaderBuilder(fileReader).build();

        String[] lineRecord;
        String savedString = "";

        boolean deleted = false;

        while ((lineRecord = csvReader.readNext()) != null) {

            if (!lineRecord[0].contains(String.valueOf(id))) {
                savedString += String.join(",", lineRecord) + "\r\n";
            } else {
                deleted = true;
            }

        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(savedString);

        csvReader.close();
        fileWriter.close();
        fileReader.close();

        return deleted;
        }
        catch(Exception e){
            return false;
        }
    }

    public static int insertOffense(Event event) {

        try {
            FileWriter fileWriter = new FileWriter(file, true);

            fileWriter.write(event.getCMPLNT_NUM() + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + ""
                    + "," + event.getKY_CD() + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + ""
                    + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + ","
                    + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + "," + "" + ","
                    + "" + "," + "" + "\r\n");

            fileWriter.close();

            return 1;
        } catch (Exception e) {
            return -1;
        }

    }

    public static int numberOfEvents() {

        try {
            FileReader fileReader = new FileReader(file);

            CSVReader csvReader = new CSVReaderBuilder(fileReader).build();

            String[] lineRecord;
            int count = 0;

            while ((lineRecord = csvReader.readNext()) != null) {
                count++;
            }

            fileReader.close();
            csvReader.close();

            return count - 1;   //the first one is the header
        } catch (Exception e) {
            return -1;
        }
    }
}
