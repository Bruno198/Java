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
		<!--  Percebam que aqui no action eu to passando qual a página que elevai mandar os dados depois que eu clicar no botao -->
		<form action="movimentacaoSave" method="POST" modelAttribute="movimentacao">
			
		
			<p>
				Descricao:
				<form:input path="movimentacao.descricao" />
			</p>
			<p>
				Valor:
				<form:input path="movimentacao.valor" />
			</p>
			
			<p>
				Contas :
				<form:select path="movimentacao.conta">
    				<form:options items="${listContas}" itemLabel="apelido" itemValue="id" />
				</form:select>
			</p>

			<input type="submit" value="Adicionar" />

		</form>
	</div>


</body>

</html>