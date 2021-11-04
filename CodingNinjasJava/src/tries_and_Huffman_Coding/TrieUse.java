package tries_and_Huffman_Coding;

public class TrieUse {

	public static void main(String[] args) {

		Trie t = new Trie();
		t.add("NOTE");
		t.add("AND");
		
		System.out.println(t.search("NOTE"));
		System.out.println(t.search("AND"));
		t.remove("AND");
		System.out.println(t.search("AND"));
		
		System.out.println(t.search("NOT"));
		System.out.println(t.search("NOTES"));

	}

}
