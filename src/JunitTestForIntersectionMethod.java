import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JunitTestForIntersectionMethod {


    //1000 words data
    @Test
    public void for1000WordsBestCase3(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.best_1000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.best_1000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.best_1000_result);
        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }

    @Test
    public void for1000WordsAvgCase2(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.avg_1000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.avg_1000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.avg_1000_result);

        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }

    @Test
    public void for1000WordsWorstCase1(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.worst_1000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.worst_1000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.worst_1000_result);

        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }

    //50000 words data
    @Test
    public void for50000WordsWorstCase1(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.worst_50000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.worst_50000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.worst_50000_result);

        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }




    @Test
    public void for50000WordsBestCase3(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.best_50000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.best_50000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.best_50000_result);

        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }


    @Test()
    public void for50000WordsAvgCase2(){

        ArrayList<String> list1 = JunitTestHelper.getInputData(JunitTestHelper.avg_50000_list1);
        ArrayList<String> list2 = JunitTestHelper.getInputData(JunitTestHelper.avg_50000_list2);
        ArrayList<String> result_file = JunitTestHelper.getInputData(JunitTestHelper.avg_50000_result);

        ArrayList<String> intersectingWords = Intersection.intersectionMethod(list1,list2);
        Boolean answer =  JunitTestHelper.isListEqual (result_file,intersectingWords);
        Assert.assertTrue(answer);
    }


}
