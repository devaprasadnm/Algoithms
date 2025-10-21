import java.util.Collections;
import java.util.List;

public class MarcsCakeWalk {
	 public static long marcsCakewalk(List<Integer> calorie) {
		    long ans = 0 ;
		    Collections.sort(calorie,Collections.reverseOrder());
		    for(int i = 0; i<calorie.size();i++){
		        System.out.println(calorie.get(i));
		        ans += Math.pow(2, i)*calorie.get(i);
		    }
		    return ans;

		    }
}
