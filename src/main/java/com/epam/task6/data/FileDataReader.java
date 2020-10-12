package com.epam.task6.data;

import com.epam.task6.exception.DataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

public class FileDataReader {
    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);
    private final String filename;


    public FileDataReader(String filename) {
        this.filename = filename;
    }

    public String readFromFile() throws DataException {
        BufferedReader bufferedReader = null;
        StringBuilder result = new StringBuilder();

        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                result.append(line);
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }

        }
        return new String(result);
    }
}
