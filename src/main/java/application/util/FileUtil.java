package application.util;

import java.io.Serializable;

/**
 * Created by pfilip on 2.3.17.
 */
public class FileUtil implements Serializable{

    public static String getStructuredDirectoryFromId(Serializable id) {
        String result = String.format("%09d", id);
        result = result.substring(0, 3) + System.getProperty("file.separator") + result.substring(3, 6) + System.getProperty("file.separator") + result.substring(6);
        return result;
    }

    public static boolean checkOrCreatePathToDirectory(String pathToDirectory) {
        boolean directoryExist = true;
        java.io.File directory = new java.io.File(pathToDirectory);
        if (!directory.exists()) {
            boolean result = directory.mkdirs();
            if (!result) {
                directoryExist = false;
            }
        }
        return directoryExist;
    }
}
