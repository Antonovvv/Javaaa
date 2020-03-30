package toOffer;
import java.util.*;
public class Solution53 {
	private int[] hash = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        hash[ch]++;
        queue.offer(ch);
        while(!queue.isEmpty() && hash[queue.peek()] > 1) queue.poll();
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
