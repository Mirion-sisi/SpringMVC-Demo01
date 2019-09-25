<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
     <!-- 默认GET请求  -->
   <a href="handler/welcome">first  springmvc  --weclome</a>

   <form action="handler/welcome" method="post">  
   user<input type="text" name="user"> 
   age:<input type="text" name="age">
   <input type="submit" value="btn1">
   </form>
   
   <br>
   <form action="handler/w2">  
   user<input type="text" name="user"> 
   age:<input type="text" name="age">
   <input type="submit" value="btn2">
   </form>
   
   <br>
    <form action="handler/w3/dd/test">  
   user<input type="text" name="user"> 
   age:<input type="text" name="age">
   <input type="submit" value="btn3">
   </form>
   
   <br>
     <form action="handler/w4/dd/xyz/gg/test">  
   user<input type="text" name="user"> 
   age:<input type="text" name="age">
   <input type="submit" value="btn4">
   </form>
   
   <br>
     <form action="handler/w5/adc/test">  
   user<input type="text" name="user"> 
   age:<input type="text" name="age">
   <input type="submit" value="btn5">
   </form>
   
   <!-- 普通的servlet这样传值 -->
   <a href="handler/w6?name=zs">first  springmvc  --weclome</a>
   <br>
   <!-- springMVC这样传值  -->
   <a href="handler/w6/zs">first  springmvc  --weclome</a>
   

   
   
</body>
</html>











