package mediumQuestion;

import java.util.HashMap;
import java.util.Map;

public class SuffixTrie {
	// Do not edit the class below except for the
	// populateSuffixTrieFrom and contains methods.
	// Feel free to add new properties and methods
	// to the class.
	static class TrieNode {
		Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	}

	static class SuffixTries {
		TrieNode root = new TrieNode();
		char endSymbol = '*';

		public SuffixTries(String str) {
			populateSuffixTrieFrom(str);
		}

		public void populateSuffixTrieFrom(String str) {

			char[] chars = str.toCharArray();
			TrieNode current = root;

			for (int i = 0; i < chars.length; i++) {
				for (int j = i; j < chars.length; j++) {
					TrieNode newNode = new TrieNode();
					if (!current.children.containsValue(chars[j])) {
						current.children.put(chars[j], newNode);
						current = current.children.get(chars[j]);
					}else {
						current = current.children.get(chars[j]);
					}
				}
				current.children.put(endSymbol,new TrieNode());
				current = root;
			}

		}

		public boolean contains(String str) {
			char[] chars = str.toCharArray();
			Map<Character, TrieNode> current = root.children;

			for (int i = 0; i < str.length(); i++) {
				if (current.containsKey(chars[i])) {
					current = current.get(chars[i]).children;
				} else {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		SuffixTries test = new SuffixTries("babc");
		System.out.println(test.contains("bb"));
	}

}
