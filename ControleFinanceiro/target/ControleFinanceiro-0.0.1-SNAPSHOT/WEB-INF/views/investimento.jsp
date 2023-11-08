<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
				<th>conta</th>
				<th>data</th>
				<th>valor</th>
				<th>descricao</th>
				<th>renda fiza?</th>
			</tr>
			<c:forEach var="p" items="${listInvestimentos}">
				<tr>
					<td>${p.conta}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.data}"/></td>
					<td>${p.valor}</td>
					<td>${p.descricao}</td>
					<td>${p.rendaFixa}</td>
					<td><a href="investimento/${p.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<!--  Percebam que aqui no action eu to passando qual a página que elevai mandar os dados depois que eu clicar no botao -->
		<form action="/ControleFinanceiro/investimentoSave" method="POST" modelAttribute="investimento">
			<form:hidden path="investimento.id" />
			<p>
				Conta:
				<form:select path="investimento.conta">
                    <form:option value="-1" label="--Selecione Conta"/>
                    <form:options items="${listContas}" itemValue="id" itemLabel="apelido"/>
                </form:select>
				
			</p>

			<p>
				Data:
				<form:input path="investimento.data" />
				
			</p>
			<p>
				Valor:
				<form:input path="investimento.valor" />
				
			</p>

			<p>
				Descricao:
				<form:input path="investimento.descricao" />
			</p>
			<p>
				Renda Fixa:
<%-- 				<form:input path="investimento.rendaFixa" /> --%>
				Sim <form:radiobutton path="investimento.rendaFixa" value="true"/>  
        		Nao <form:radiobutton path="investimento.rendaFixa" value="false"/>  
			</p>

			<input type="submit" value="Salvar" />

		</form>
	</div>

	<a href="/ControleFinancheiro/"> Voltar</a>
</body>
</html>