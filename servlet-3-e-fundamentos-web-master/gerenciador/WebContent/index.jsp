<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>


Bem vindo ao nosso gerenciador de empresas!<br/>
<br/>

<c:if test="${not empty usuarioLogado}">
    Você está logado como ${usuarioLogado.email}<br/>
</c:if>

<form action="executa" method="POST">
		  <input type="hidden" name="tarefa" value="NovaEmpresa">
	Nome: <input type="text" name=nome />
		  <input type="submit" value="Enviar"/>
</form>

<form action="login" method="POST">
	Email: <input type="text" name="email" />
	Senha: <input type="password" name="senha" />
	<input type="submit" value="Logar">
</form>


<form action="executa" method="post">
	<input type="hidden" name="tarefa" value="Logout">
    <input type="submit" value="Logout" />
</form>


</body>
</html>