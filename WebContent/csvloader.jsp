
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="admin_style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload File</title>

      <script type="text/javascript">
      
      function doThing(){
    	  var filefield = document.getElementById("file1");
    	  if(filefield.value.length>0){
    		  var button = document.getElementById("upl");
    		  button.disabled = false;
    		  button.style.backgroundColor="#7FFFD4";
    	  }
      }
    
        </script>
</head>
<body>

				<form name="form" id="form" action="CSVCatcher" method="post" enctype="multipart/form-data" >
				<input type="hidden" name="hiddenfield" value="ok">
				Files to upload:
				<br/>
				<input type="file" id="file1" size="50" onchange="doThing()" name="file1" >
				<br/>
				<input type="submit" id="upl" disabled="disabled" value="Upload" >
				</form>
</body>
</html>