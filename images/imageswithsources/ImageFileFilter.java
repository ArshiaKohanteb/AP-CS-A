package images;

import java.io.*;

/**
 * This class implements a filter for image file names.
 */

public class ImageFileFilter extends javax.swing.filechooser.FileFilter{
    
    private String extension, description;
       
    public ImageFileFilter(String extension, String description){
        this.extension = extension;
        this.description = description;
    }

     public boolean accept(File f){
        return f.getName().toLowerCase().endsWith(extension) ||
               f.isDirectory();
    }
   
    public String getDescription(){
        return description;
    }
}