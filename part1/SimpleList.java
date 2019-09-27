import java.util.List;
import java.util.LinkedList;

class SimpleList
{
    public static List<Integer> squareAll(List<Integer> values)
    {
         /* TO DO: The output list, newValues, should hold as
         its elements the square of the corresponding element
         in the input list.
         Write a loop to add the square of each element from the
         input list into the output list.  Use a "foreach".
      */

        List<Integer> newValues = new LinkedList<Integer>();
        for (int x: values){
            int y = (int) Math.pow(x, 2);
            newValues.add(y);
        }

        return newValues;
    }
}