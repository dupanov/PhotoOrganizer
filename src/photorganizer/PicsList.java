package photorganizer;



import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Вадик on 08.01.2016.
 */
public class PicsList {

        private List<String> list;

        public PicsList() {
            list = new ArrayList<String>();
        }


        public List getPicsList(Path path) {
            File[] files = new File(String.valueOf(path)).listFiles();

            files.finder();
            for (File file : files) {
                if (file.isFile())
                    list.add(file.getName());
            }
            System.out.println(list.toString());
            return list;
        }

    public File[] finder( String dirName){
        File dir = new File(dirName);
        return dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String filename)
            {
                int lastIndex = filename.indexOf('.');
                String str = new String(filename.substring(lastIndex));
                switch (str){
                    case "jpg":  return true;
                    case "png":  return true;
                }
                return false;
            }
        } );
    }


        public void setPicsList(File file) {
            if (this.list == null) {
                list = new ArrayList<String>();
            }
            list.add(file.getName());
        }
    }






