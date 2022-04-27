package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Ola mundo", 
				"Irei visitar esse pais maravilhoso", 
				12);
				
		Comment commentPost1 = new Comment("Aqui fica o texto do meu post");
		
		post1.addComments(commentPost1);
		
		System.out.println(post1);
		System.out.println(post1.getComment().get(0).getTextString());
	}
}
