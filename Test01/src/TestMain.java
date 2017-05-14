import java.util.List;

import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

public class TestMain {

	public static void main(String[] args) {
		XMLTree dd = new XMLTree1("data/foo.xml");
		String a = dd.child(0).attributeNames().toString();
		System.out.println(a.substring(1, a.length()-1));
	}

}
