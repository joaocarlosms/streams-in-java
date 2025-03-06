package challenge2;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {
		try {
			
			String jsonStr = new String(Files.readAllBytes(Paths.get("pessoas.json")));
			Gson gson = new Gson();
			Type type = new TypeToken<List<Person>>() {}.getType();
			List<Person> persons = gson.fromJson(jsonStr, type);
			
			GenericDay day = new Day05();
			day.executeChallenge(persons);
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
