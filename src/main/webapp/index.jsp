<%@page import="fr.uha.ensisa.gl.BBRtesting.modele.TestCaseExecution"%>
<%@page import="fr.uha.ensisa.gl.BBRtesting.modele.TestCase"%>
<%@page import="java.util.ArrayList"%>
<%@page import="fr.uha.ensisa.gl.BBRtesting.*"%>
<html>
<head>
<title>Liste des test</title>
</head>
<body>
<div align="center"  style="background:lime; height: auto; width: 680 px">
<table border="1" id="etapes" style="width: 100%; height: auto;">
<caption><h2>les tests a executer</h2></caption>
						<tr>
							<th>Descrption</th>
							<th>Date</th>
							<th>Executer</th>
							<th>Nbr executions</th>
						</tr>
						<%if(session.getAttribute("t") != null) 
						{
						  ArrayList<TestCase> l = (ArrayList<TestCase>)TestCase.ltc;
						  for(TestCase tc:l)
						  {
						%>
						<tr>
							<td><%=tc.getDescri() %></td>
							<td><%=tc.getDate() %></td>
							<td><a href="#?op=execuet&id=<%=tc.getId()%>"><button id="executer" type="button">Executer</button></a></td>
							<td>
							<%
							 int nb =0;
							 for(TestCaseExecution tce:TestCaseExecution.let)
							 {
								if(tce.getTestCase().getId() == tc.getId())
									nb++;
							 }
							%>
							<%=nb%>
							</td>
						</tr>
						<%
						}
						}
						 %>
					</table>
					<a href = "AjoutTest.jsp"><button style="float: right;" type="button">Ajouter Nouveau Test</button></a>
					</div>
</body>
</html>