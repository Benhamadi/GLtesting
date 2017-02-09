<%@page import="java.util.ArrayList"%>
<%@page import="fr.uha.ensisa.gl.BBRtesting.modele.Etape"%>
<%@page import="fr.uha.ensisa.gl.BBRtesting.modele.TestCase"%>
<%@page import="fr.uha.ensisa.gl.BBRtesting.*"%>


<html>

<head>

<meta charset="utf-8">

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"
	rel="stylesheet">




</head>
<body>
	<%
		TestCase t;
		ArrayList<Etape> le = new ArrayList<Etape>();
		if (request.getParameter("AjoutTest") != null) {
			t = new TestCase(String.valueOf(TestCase.ltc.size() + 1),
					request.getParameter("comment"),
					request.getParameter("date"));
			t.setEtapes((ArrayList<Etape>) session.getAttribute("le"));
			t.addTestCase();
			if (session.getAttribute("t") == null)
				session.setAttribute("t", t);
			session.setAttribute("le", null);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else if (request.getParameter("titre") != null) {
			String titre = request.getParameter("titre");
			String description = request.getParameter("describe");
			String id = request.getParameter("id");
			Etape e = new Etape(Integer.parseInt(id), titre, description);
			if (session.getAttribute("le") == null) {
				le.add(e);
				session.setAttribute("le", le);
			} else
				((ArrayList<Etape>) session.getAttribute("le")).add(e);
		} else if (request.getParameter("sup") != null) {
			ArrayList<Etape> l = (ArrayList<Etape>) session
					.getAttribute("le");
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).getId() == Integer.parseInt(request
						.getParameter("idEtape"))) {
					l.remove(i);
					break;
				}
			}
		}
	%>
	<form action="" method="get">
		<table class="table">
			<tr>
				<td>
					<!-- partie de l'ajout du testCase -->
					<p>
					<h2>Ajout de TestCase</h2> </br> <label for="comment">
						Description :</label> </br> <textarea name="comment" id="comment" rows="10"
						cols="30"> </textarea><br> <label for="comment">Date:
				</label><br> <input type="text" id="date" name="date" />
					</p>
				</td>


			</tr>
			<tr>
				<td>
					<!-- partie de l'ajout d'une étape -->
					<p>
					<h2>Ajout des étapes</h2> <label>Titre</label><br> <input
					type="text" id="titre" name="titre" /><br> <label
					for="comment"> Description :</label> </br> <textarea name="describe"
						id="describe" rows="10" cols="30"> </textarea><br> <label>ID</label><br>
					<input type="text" id="id" name="id" /> </br> <input type="submit"
					value="Ajouter Etape" name="Envoyer" /> <br>
					<table id="etapes"
						class="table table-bordered table-striped table-condensed">
						<tr>
							<th>N°</th>
							<th>étape</th>
							<th>Déscription</th>
							<th>supprimer</th>
						</tr>
						<%
							if (session.getAttribute("le") != null) {
								ArrayList<Etape> l = (ArrayList<Etape>) session
										.getAttribute("le");
								for (Etape et : l) {
						%>
						<tr>
							<td><%=et.getId()%></td>
							<td><%=et.getTitre()%></td>
							<td><%=et.getDescription()%></td>
							<td><a
								href="AjoutTest.jsp?sup=true&&idEtape=<%=et.getId()%>"><button
										id="delete" type="button" class="btn btn-default">Supprimer</button></a></td>
						</tr>
						<%
							}
							}
						%>
					</table>
					</p>
				</td>
			</tr>
		</table>
		<button name="AjoutTest">Ajouter le Test</button>
	</form>
</body>
</html>