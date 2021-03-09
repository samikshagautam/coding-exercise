package coding.exercise.countfiles;

import java.io.File;

public class CountFiles {

    private class Criteria {
        private String path;
        private boolean includeSubFolders;
        private String extension;


        public Criteria() {
            path = "/";
            includeSubFolders = true;
            extension = null;
        }

        public Criteria(Criteria criteria) {
            path = criteria.path;
            includeSubFolders = criteria.includeSubFolders;
            extension = criteria.extension;

        }

        public boolean filter(File file) {
            if (extension == null) {
                return true;
            }
            String fileName = file.getName();
            String exe = fileName.substring(fileName.lastIndexOf(".") + 1);
            return exe.equals(extension);
        }


    }


    public int[] count(Criteria criteria) {
        int[] result = new int[2];
        File folder = new File(criteria.path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile() && criteria.filter(file)) {
                result[0]++;
            } else if (file.isDirectory()) {
                result[1] += 1;
                if (criteria.includeSubFolders) {
                    Criteria criteria1 = new Criteria(criteria);
                    criteria1.path = file.getAbsolutePath();
                    int[] subResult = count(criteria1);
                    result[0] += subResult[0];
                    result[1] += subResult[1];
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        CountFiles countFiles = new CountFiles();
        Criteria criteria = countFiles.new Criteria();
        criteria.path = "/Applications";
        criteria.includeSubFolders = false;
        int[] result = countFiles.count(criteria);
        System.out.println(criteria.path + " has " + result[0] + " files and " + result[1] + " folders " );
    }
}
