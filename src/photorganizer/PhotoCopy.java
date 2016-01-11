package photorganizer; /**
 * Created by Вадик on 07.01.2016.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class PhotoCopy  {

    public static void copy(File source, File target) throws IOException {
        if (!target.exists()) {
            target.createNewFile();
        }
        try {
            Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException e){
            System.out.println("File not found while copying!");
        }

        }
    }

