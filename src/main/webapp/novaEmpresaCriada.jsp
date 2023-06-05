<%
	String nomeEmpresa = (String)request.getAttribute("empresas");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
	</body>
</html>