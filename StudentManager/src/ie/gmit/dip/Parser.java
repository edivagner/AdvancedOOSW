package ie.gmit.dip;

import java.io.*;
import java.util.*;

public class Parser {
	public Collection<StudentRec> parse(String path) {
		List<StudentRec> col = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split(">>");

				StudentRec sr = new StudentRec(words[0], words[1], words[2], null, words[4], words[5]);
				
				col.add(sr);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return col;

	}

}
