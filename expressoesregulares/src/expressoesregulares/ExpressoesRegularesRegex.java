package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ? usada para buscar padr?es dentro de um arquivo de texto
public class ExpressoesRegularesRegex {

	public static void main(String[] args) {
		
		/**
		 * Metacarateres (principais)
		 * 
		 *  \d -> todos os digitos/numeros
		 *  \D -> tudo que n?o for digito
		 *  \s -> espa?os em branco \t \n \f \r
		 *  \S -> Caractere que n?o ? branco
		 *  \w -> caracteres de palavras a-z A-Z, digitos  e _underline
		 *  \W -> Tudo que n?o for caractere de palavra
		 *  [] --> procure exatamente. EX: [abc]
		 *  
		 */ 
		
		/**
		 *  Quantificadores
		 *  ? zero ou uma ocorrencia
		 *  * zero ou mais
		 *  + uma ou mais
		 *  {n,m}
		 *  () -> Agrupar uma express?o
		 *  | -> OU
		 *  $ -> encontrar algo no fim da linha
		 *  . -> coringa
		 *  
		 *  Exemplo: o(v|c)o = ovo, oco
		 * maca(rr|c)?o = macarr?o, ou macac?o
		 *
		 * ^ -> caractere de nega??o [^abc]
		 */
		int numeroHex = 0x1;
//		String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//		String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
		
		
//		String regex = "([a-zA-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // ou "(\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
//		String texto = "fulano@hotmail.com, 102/abc@gmail.com, #@!abrao@mail.com, teste@gmail.br, teste@mail";
		
//		String regex = "\\d{2}/\\d{2}/\\d{2,4}"; 
//		String texto = "05/10/2010 05/05/2015 1/1/01 / 01/05/94"; // dd/MM/yyyy
		
		String regex = "proj([^,])*"; 
		String texto = "prog1.bkp, prog1.java, proj1.classe, proj1final.java, proj2.bkp, proj3.java, diagrama, texto, foto"; 
		
		System.out.println("Email valido? " + "#@!abrao@mail.com".matches(regex));
		
		/*
		 * Nesse momento obteremos uma inst?ncia de Pattern, atrav?s do * m?todo
		* static compile(String regex), o qual recebe uma String que ? a
		* express??o regular
		*/
		Pattern pattern = Pattern.compile(regex);
		
		
		/*
		* Aqui, através da instancia de Pattern, chamando o m?todo * matcher() e 
		* passando a fonte de busca
		*/
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("Texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("Express?o: " + matcher.pattern());
		System.out.println("Posi??es encontradas");
		
		//Ligando o motor
		while(matcher.find()) {
			System.out.println(matcher.start() + " "+matcher.group());   //Ligando o motor
		}
		
		
	}

}
