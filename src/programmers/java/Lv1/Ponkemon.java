package programmers.java.Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {

	public int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		int[] kind = new int[nums[nums.length - 1]];

		for (int i = 0; i < nums.length; i++) {
			kind[nums[i] - 1]++; // 각 종류마다 폰켓몬이 몇마리 있는지 확인
		}

		int kind_nums = 0;
		for (int i = 0; i < kind.length; i++) {
			if (kind[i] != 0) {
				kind_nums++; // 존재하는 폰켓몬의 종류 수 확인
			}
		}

		if (nums.length / 2 > kind_nums) {// 폰켓몬의 종류보다 가져가는 폰켓몬의 수가 많으면
			answer = kind_nums;// 폰켓몬의 종류 모두 가져갈 수 있음
		} else {
			answer = nums.length / 2;
		}

		return answer;
	}

	public int solution2(int[] nums) {
		int answer = 0;

		Set<Integer> set = new HashSet<>();

		for (int i : nums) {
			set.add(i);
		}

		int sort = set.size();
		int n = nums.length / 2;

		if (sort > n)
			answer = n;
		else
			answer = sort;
		
		return answer;

	}

}

