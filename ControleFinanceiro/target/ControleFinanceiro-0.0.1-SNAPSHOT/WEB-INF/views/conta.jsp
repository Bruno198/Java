<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pessoas</title>
</head>
<body>
	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Nome</th>
				<th>email</th>
				<th>Data</th>
			</tr>
			<c:forEach var="p" items="${listContas}">
				<tr>
					<td>${p.apelido}</td>
					<td>${p.numero}</td>
					<td>${p.saldo}</td>
					<td><a href="conta/${p.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<!--  Percebam que aqui no action eu to passando qual a página que elevai mandar os dados depois que eu clicar no botao -->
		<form action="/ControleFinanceiro/contaSave" method="POST" modelAttribute="conta">
			<form:hidden path="conta.id" />
			<p>
				Apelido:
				<form:input path="conta.apelido" />
				
			</p>

			<p>
				instituicao:
				<form:input path="conta.instituicao" />
				
			</p>
			<p>
				conta:
				<form:input path="conta.numero" />
				
			</p>

			<p>
				Saldo:
				<form:input path="conta.saldo" />
			</p>

			<input type="submit" value="Salvar" />

		</form>
	</div>

	<a href="/ControleFinancheiro/"> Voltar</a>
</body>
</html>