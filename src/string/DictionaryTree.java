package string;

// �ֵ�����һ�����νṹ���ŵ��������ַ����Ĺ���ǰ׺����Լ�洢�ռ䣬�������
//"abc","abcd","abd","b","bcd","efg","hik"��
// �ֵ����Ļ����������£�
// 	1.���ڵ�û���ַ�·������������⣬ÿһ����㶼��һ���ַ�·���ҵ���
//  2.�ӽ��������κ�һ����㣬�������;�������ַ�����������һ��Ϊĳ�������
//	    ���ַ�����ǰ׺��
//  3.ÿ������������е��ַ�·���ϵ��ַ�����ͬ��
public class DictionaryTree {
	public static void main(String[] args) { 
	}
}

class Trie{
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	/**
	 * ���赥��word�ĳ���ΪN�������ұ���word�е�ÿ���ַ��������δ�ͷ��㿪ʼ
	 * ����ÿһ��word[i]���ҵ���һ���ڵ㡣����ҵĹ����н�㲻���ڣ��ͽ����½�㣬
	 * ��Ϊa������a.path = 1����������ڣ���Ϊb����b.path++��ͨ�����һ���ַ�
	 * word[N - 1]�ҵ����һ�����ʱ��Ϊe����e.path++��e.end++��
	 */
	public void insert(String word) {
		if (word == null)
			return;
		
		char[] chs = word.toCharArray();
		TrieNode node = root;
		node.path++;
		int index = 0;
		for (int i = 0; i < chs.length; i++) {
			index = chs[i] - 'a';
			if (node.map[index] == null) {
				node.map[index] = new TrieNode();
			}
			node = node.map[index];
			node.path++;
		}
		node.end++;
	}
	
	/**
	 * �ȵ���search(word)����word�Ƿ���Trie���У����ڣ���ִ�к���Ĺ��̣�
	 * �����ڣ���ֱ�ӷ��ء������ұ���word�е�ÿ���ַ��������δ�ͷ��㿪ʼ
	 * ����ÿһ��word[i]�ҵ���һ����㡣���ҵĹ����У��ѱ�������ÿһ�����
	 * ��pathֵ��1.���������һ������pathֵ����֮���Ѿ�Ϊ0��ֱ�Ӵӵ�ǰ���
	 * ��map��ɾ������������·���������ؼ��ɡ�������������һ����㣬��Ϊe��
	 * ��e.path--��e.end--��
	 */
	public void delete(String word) {
		if (search(word)) {
			char[] chs = word.toCharArray();
			TrieNode node = root;
			node.path++;
			int index = 0;
			for (int i = 0; i < chs.length; i++) {
				index = chs[i] - 'a';
				if (node.map[index].path-- == 1) {
					node.map[index] = null;
					return;
				}
				node = node.map[index];
			}
			node.end--;
		}
	}
	
	/**
	 * �����ұ���word�е�ÿ���ַ��������δ�ͷ��㿪ʼ����ÿһ��word[i],�ҵ�
	 * ��һ����㡣����ҵĹ����н�㲻���ڣ�˵��������ʵ���������û����ӽ�
	 * Trie���������ҵĹ����н�㲻���ܲ����ڣ�ֱ�ӷ���false�������ͨ��word[N - 1]
	 * �ҵ����һ����㣬��Ϊe�����e.end != 0��˵���е���ͨ��word[N - 1]���ַ�·����
	 * ���Խ��e��β������true�����e.end == 0������false��
	 */
	public boolean search(String word) {
		if (word == null)
			return false;
		char[] chs = word.toCharArray();
		TrieNode node = root;
		int index = 0;
		for (int i = 0; i < chs.length; i++) {
			index = chs[i] - 'a';
			if (node.map[index] == null) {
				return false;
			}
			node = node.map[index];
		}
		return node.end != 0;
	}
	
	/**
	 * �Ͳ��Ҳ���ͬ������pre�����ҵ���㣬�������Ľ���Ϊe������e.path��ֵ
	 * ���ɡ�
	 */
	public int prefixNumber(String pre) {
		if (pre == null)
			return 0;
		char[] chs = pre.toCharArray();
		TrieNode node = root;
		int index = 0;
		for (int i = 0; i < chs.length; i++) {
			index = chs[i] - 'a';
			if (node.map[index] == null) {
				return 0;
			}
			node = node.map[index];
		}
		return node.path;
	}
}

class TrieNode{
	public int path;	// path��ʾ�ж��ٸ����ʹ�������ڵ�
	public int end;		// end��ʾ�ж��ٸ��������������β
	public TrieNode[] map;  // map��һ����ϣ��ṹ��key����ý���һ���ַ�·����
							// value��ʾ�ַ�·��ָ��Ľ�㡣
	public TrieNode() {
		path = 0;
		end = 0;
		map = new TrieNode[26];
	}
}