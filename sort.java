 
Arrays.sort(nums);
/**
 * Sorts the specified array of ints into ascending numerical order.
 * The sorting algorithm is a tuned quicksort, adapted from Jon
 * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
 * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
 * 1993).  This algorithm offers n*log(n) performance on many data sets
 * that cause other quicksorts to degrade to quadratic performance.
 *
 * @param a the array to be sorted
 */
public static void sort(int[] a) {
sort1(a, 0, a.length);
}