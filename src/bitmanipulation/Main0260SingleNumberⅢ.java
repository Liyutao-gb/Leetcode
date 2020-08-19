package bitmanipulation;

public class Main0260SingleNumber�� {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 2, 5 };
		int[] is = new Solution260().singleNumber(arr);
		for (int i : is) {
			System.out.print(i + " ");
		}
	}
}

class Solution260 {
	public int[] singleNumber(int[] nums) {
		int xor = 0;
		for (int i : nums)// һ���ĵ���,��һ����������������������ض���һλ��1
			xor ^= i;

		int mask = xor & (-xor);

		int[] ans = new int[2];
		for (int i : nums) {
			if ((i & mask) == 0)// == 0�� == mask ���ֽ��
				ans[0] ^= i;
			else
				ans[1] ^= i;
		}

		return ans;
	}
}

class Solution0260 {
	public int[] singleNumber(int[] nums) {
		int num = 0;
		for (int i : nums)// һ���ĵ���,��һ������������ ����������ض���һλ��1
			num ^= i;

		int bit = bitOne(num);// ������һ����������������һλ��ͬ,�Դ˽����Ƿֳ���������

		int[] isOne = new int[nums.length];
		int[] isNo = new int[nums.length];
		int one = 0, no = 0;
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (isOne(n, bit)) {
				isOne[one++] = nums[i];
			} else {
				isNo[no++] = nums[i];
			}
		}

		int[] res = new int[2];
		for (int i : isOne)
			res[0] ^= i;
		for (int i : isNo)
			res[1] ^= i;

		return res;
	}

	public boolean isOne(int num, int bit) {
		int n = num >> bit;
		return (n & 1) == 1;
	}

	public int bitOne(int num) {
		int index = 0;
		while (num != 0) {
			if ((num & 1) == 1)
				break;
			num >>= 1;
			index++;
		}
		return index;
	}
}