package string;

// 字典树是一种树形结构，优点是利用字符串的公共前缀来节约存储空间，比如加入
//"abc","abcd","abd","b","bcd","efg","hik"。
// 字典树的基本性质如下：
// 	1.根节点没有字符路径。除根结点外，每一个结点都被一个字符路径找到。
//  2.从结点出发到任何一个结点，如果将沿途经过的字符连接起来，一定为某个加入过
//	    的字符串的前缀。
//  3.每个结点向下所有的字符路径上的字符都不同。
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
	 * 假设单词word的长度为N，从左到右遍历word中的每个字符，并依次从头结点开始
	 * 根据每一个word[i]，找到下一个节点。如果找的过程中结点不存在，就建立新结点，
	 * 记为a，并令a.path = 1。如果结点存在，记为b，令b.path++。通过最后一个字符
	 * word[N - 1]找到最后一个结点时记为e，令e.path++，e.end++。
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
	 * 先调用search(word)，看word是否在Trie树中，若在，则执行后面的过程，
	 * 若不在，则直接返回。从左到右遍历word中的每个字符，并依次从头结点开始
	 * 根据每一个word[i]找到下一个结点。在找的过程中，把遍历过的每一个结点
	 * 的path值减1.如果发现下一个结点的path值减完之后已经为0，直接从当前结点
	 * 的map中删除后续的所有路径，并返回即可。如果遍历到最后一个结点，记为e，
	 * 令e.path--，e.end--。
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
	 * 从左到右遍历word中的每个字符，并依次从头结点开始根据每一个word[i],找到
	 * 下一个结点。如果找的过程中结点不存在，说明这个单词的整个部分没有添加进
	 * Trie树，否则找的过程中结点不可能不存在，直接返回false。如果能通过word[N - 1]
	 * 找到最后一个结点，记为e，如果e.end != 0，说明有单词通过word[N - 1]的字符路径，
	 * 并以结点e结尾，返回true。如果e.end == 0，返回false。
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
	 * 和查找操作同理，根据pre不断找到结点，假设最后的结点记为e，返回e.path的值
	 * 即可。
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
	public int path;	// path表示有多少个单词公用这个节点
	public int end;		// end表示有多少个单词以这个结点结尾
	public TrieNode[] map;  // map是一个哈希表结构，key代表该结点的一条字符路径，
							// value表示字符路径指向的结点。
	public TrieNode() {
		path = 0;
		end = 0;
		map = new TrieNode[26];
	}
}