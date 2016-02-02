package br.com.serraria.util;

import java.io.File;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Path {
    
    public static String verificaPath(String path, String fileName) {
        String[] jarPath = path.split(":");
        File file;
        String relPath = "";
        for (String jar : jarPath) {
            file = new File(jar);
            String format = file.getName().substring(file.getName().length()-3);
            if (format.equals("jar")) {
                relPath = jar.replace("Serraria.jar", fileName);
            } else {
                relPath = "/home/dorigon/Documentos/Projetos/serraria/dist" + fileName;
            }
        }
        return relPath;
    }
    
}
