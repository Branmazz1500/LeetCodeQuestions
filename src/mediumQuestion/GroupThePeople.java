package mediumQuestion;

import java.util.ArrayList;
import java.util.List;

public class GroupThePeople {

	// [3,3,3,3,3,1,3]

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> groups = new ArrayList<List<Integer>>();

		for (int i = 0; i < groupSizes.length; i++) {
			int groupSize = groupSizes[i];
			int count = groupSizes[i];
			if (count != 0) {
				List<Integer> group = new ArrayList<Integer>();
				

				for (int k = i; k < groupSizes.length; k++) {
					if (count != 0) {
						if (groupSizes[k] == groupSize) {
							group.add(k);
							groupSizes[k] = 0;
							count--;
							if(count == 0) {
								groups.add(group);
								break;
							}
						}
					}else {
						groups.add(group);
						break;
					}
				}

			}
		}

		return groups;
	}
	
	public static void main(String[] args) {
		int[] in = new int[] {1};
		System.out.println(groupThePeople(in));
	}
}
