package web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import web2.ConnectionForm;



/*
Servlet implementation class Test
*/

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


public FirstServlet() {
  super();
  // TODO Auto-generated constructor stub
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 Noms tableNoms = new Noms();
     request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
	
	this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
}

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	Utilisateur utilisateur = new Utilisateur();
    utilisateur.setNom(request.getParameter("nom"));
    utilisateur.setPrenom(request.getParameter("prenom"));
    
    Noms tableNoms = new Noms();
    tableNoms.ajouterUtilisateur(utilisateur);
    
    request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
	
    this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
	}

}



//package web;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import jakarta.servlet.http.Part;
//
//import web2.ConnectionForm;
//
//
//
///*
//Servlet implementation class Test
//*/
//
//public class FirstServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//
//public FirstServlet() {
//  super();
//  // TODO Auto-generated constructor stub
//}
//
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	Cookie[] cookies = request.getCookies();
//	if (cookies != null) {
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals("prenom")) {
//				request.setAttribute("prenom", cookie.getValue());
//			}
//		}
//	}
//	this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//}
//
//public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
//    String nom = request.getParameter("nom");
//    String prenom = request.getParameter("prenom");
//    
//    Cookie cookie = new Cookie("prenom", prenom);
//    cookie.setMaxAge(60*60*24*30);
//    response.addCookie(cookie);
//	
//	
//    this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//	}
//
//}



//package web;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import jakarta.servlet.http.Part;
//
//import web2.ConnectionForm;
//
//
//
///*
//Servlet implementation class Test
//*/
//
//public class FirstServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//
//public FirstServlet() {
//  super();
//  // TODO Auto-generated constructor stub
//}
//
//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	HttpSession session = request.getSession();
//	
//	String nom = (String) session.getAttribute("nom");
//	
//	String prenom = (String) session.getAttribute("prenom");
//	
////	supprime la connexion au serveur, toutes les données sur le serveur sont supprimés
//	session.invalidate();
//	
//	this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//}
//
//public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
//    String nom = request.getParameter("nom");
//    String prenom = request.getParameter("prenom");
//    
//    HttpSession session = request.getSession();
//
//    session.setAttribute("nom", nom);
//    session.setAttribute("prenom", prenom);
//    
//    this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//	}
//
//}


/*
  Servlet implementation class Test
 */

//public class FirstServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public static final int TAILLE_TAMPON = 10240;
//    public static final String CHEMIN_FICHIERS = "C:\\Users\\Stagiaire\\Pictures\\Camera Roll\\"; // A changer
//    
//       
//    public FirstServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//    }
//
//    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
//        // On récupère le champ description comme d'habitude
//        String description = request.getParameter("description");
//        request.setAttribute("description", description );
//
//        // On récupère le champ du fichier
//        Part part = request.getPart("fichier");
//            
//        // On vérifie qu'on a bien reçu un fichier
//        String nomFichier = getNomFichier(part);
//
//        // Si on a bien un fichier
//        if (nomFichier != null && !nomFichier.isEmpty()) {
//            String nomChamp = part.getName();
//            // Corrige un bug du fonctionnement d'Internet Explorer
//             nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/') + 1)
//                    .substring(nomFichier.lastIndexOf('\\') + 1);
//
//            // On écrit définitivement le fichier sur le disque
//            ecrireFichier(part, nomFichier, CHEMIN_FICHIERS);
//
//            request.setAttribute(nomChamp, nomFichier);
//        }
//
//        this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//    }
//
//    private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
//        BufferedInputStream entree = null;
//        BufferedOutputStream sortie = null;
//        try {
//            entree = new BufferedInputStream(part.getInputStream(), TAILLE_TAMPON);
//            sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);
//
//            byte[] tampon = new byte[TAILLE_TAMPON];
//            int longueur;
//            while ((longueur = entree.read(tampon)) > 0) {
//                sortie.write(tampon, 0, longueur);
//            }
//        } finally {
//            try {
//                sortie.close();
//            } catch (IOException ignore) {
//            }
//            try {
//                entree.close();
//            } catch (IOException ignore) {
//            }
//        }
//    }
//    
//    private static String getNomFichier( Part part ) {
//        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
//            if ( contentDisposition.trim().startsWith( "filename" ) ) {
//                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
//            }
//        }
//        return null;
//    }   
//}










//package web;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import web2.ConnectionForm;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
///**
// * Servlet implementation class FirstServlet
// */
//public class FirstServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public FirstServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
////		 response.setContentType("text/html"); //cad le retour est une page HTML
////         response.setCharacterEncoding("UTF-8"); // encodage de la page web
////         PrintWriter out = response.getWriter(); // création d’un objet qui représente la sortie (pour envoyer des lignes à l’écran)
////         out.println("<!DOCTYPE html>");
////         out.println("<html>");
////         out.println("<head>");
////         out.println("<meta charset='utf-8' />");
////         out.println("<title>Test</title>");
////         out.println("</head>");
////         out.println("<body>");
////         out.println("<p>Bonjour !</p>");
////         out.println("</body>");
////         out.println("</html>");
////         String message ="salut les developpeurs !";
//		
////      request.setAttribute("variable", message);
////		request.setAttribute("heure", "soir");
//		
////		String name = request.getParameter("name");
////		request.setAttribute("name", name);
//		
////		String[] noms = {"Mathieu", "Robert", "François"};
////		request.setAttribute("noms", noms);
//		
////		Auteur auteur = new Auteur();
////		auteur.setPrenom("Mathieu");
////		auteur.setNom("Bonaparte");
////		auteur.setActif(true);
////		
////		request.setAttribute("auteur", auteur);
////		String[] titres = {"nouvel incendie", "une ile a été découverte", "chute du dollar"};
////		request.setAttribute("titres", titres);
//        this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		
//		
//		
////		ConnectionForm form = new ConnectionForm();
////		
////		form.verifierIdentifiants(request);
////		
////		request.setAttribute("form", form);
//		
//		this.getServletContext().getRequestDispatcher("/WEB-INF/Test.jsp").forward(request, response);
////		doGet(request, response);
//	}
//
//}
