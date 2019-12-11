import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JunitTestHelper {

    public static String best_1000_list1 = System.getProperty("user.dir")+"/src/Data/best1k_list1.txt";
    public static String best_1000_list2 = System.getProperty("user.dir")+"/src/Data/best1k_list2.txt";
    public static String best_1000_result =System.getProperty("user.dir")+"/src/Data/best1k_result.txt";
    public static String avg_1000_list1 = System.getProperty("user.dir")+"/src/Data/avg1k_list1.txt";
    public static String avg_1000_list2 = System.getProperty("user.dir")+"/src/Data/avg1k_list2.txt";
    public static String avg_1000_result =System.getProperty("user.dir")+"/src/Data/avg1k_result.txt";
    public static String worst_1000_list1 =System.getProperty("user.dir")+"/src/Data/worst1k_list1.txt";
    public static String worst_1000_list2 = System.getProperty("user.dir")+"/src/Data/worst1k_list2.txt";
    public static String worst_1000_result = System.getProperty("user.dir")+"/src/Data/worst1k_result.txt";

    public static String best_50000_list1 = System.getProperty("user.dir")+"/src/Data/best50k_list1.txt";
    public static String best_50000_list2 = System.getProperty("user.dir")+"/src/Data/best50k_list2.txt";
    public static String best_50000_result =System.getProperty("user.dir")+"/src/Data/best50k_result.txt";
    public static String avg_50000_list1 =System.getProperty("user.dir")+"/src/Data/avg50k_list1.txt";
    public static String avg_50000_list2 = System.getProperty("user.dir")+"/src/Data/avg50k_list2.txt";
    public static String avg_50000_result = System.getProperty("user.dir")+"/src/Data/avg50k_result.txt";
    public static String worst_50000_list1 =System.getProperty("user.dir")+"/src/Data/worst50k_list1.txt";
    public static String worst_50000_list2 = System.getProperty("user.dir")+"/src/Data/worst50k_list2.txt";
    public static String worst_50000_result =System.getProperty("user.dir")+"/src/Data/worst50k_result.txt";


    /**
     * This function gets the list of string from a text file
     * provided in the parameter
     *
     * @param FileName 		The full file path of the text file
     * @return				ArrayList containing the string from the file
     */
    public static ArrayList<String> getInputData(String FileName)
    {
        ArrayList<String> arr = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(FileName)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.isEmpty()) continue;
                arr.add(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    /**
     * This function verifies if the two Arraylist are equal.
     * @param list1     The first list to be compared
     * @param list2     The second list to be compared
     * @return			Boolean value if the lists are equal.
     */
    public static Boolean isListEqual(ArrayList< String> list1, ArrayList<String> list2)
    {
        Boolean result = false;

        if((list1 == null && list2 != null)
                || list1 != null && list2 == null
                || list1.size() != list2.size()){
            return false;
        }

        list1 = new ArrayList<String>(list1);
        list2 = new ArrayList<String>(list2);

        Collections.sort(list1);
        Collections.sort(list2);
        result = list1.equals(list2);

        return result;
    }

}
