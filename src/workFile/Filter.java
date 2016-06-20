package workFile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by user on 19.06.2016.
 */
public class Filter implements FilenameFilter {

    /**
     * Extension that you need to be filtered
     */
    private String extension;

    public Filter(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean accept(File dir, String name) {
        return (name.endsWith(extension));
    }
}

