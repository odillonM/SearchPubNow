<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search PubNow | Login</title>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
    <link  href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
	<link  href="bootstrap/css/style.css" rel="stylesheet">

 
	<link rel="shortcut icon" href="images/5746logoPUBNOW.ico" type="image/x-icon"/>


</head>
<body>
	
	<div class="login-form">

     
     
	<form action="SAutenticaUsuario" method="post">
	<div class="form-group ">

       <input type="text" class="form-control" placeholder="digite seu usuário" name="login">

       <i class="fa fa-user"></i>
    </div>
    
    <div class="form-group log-status">

       <input type="password" class="form-control" placeholder="digite sua senha" name="senha">

       <i class="fa fa-lock"></i>
     
	</div>
     
		<button type="submit" class="log-btn" value="logar" >Entrar</button>
	</form>
</div>

</body>
</html>