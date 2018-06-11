/*$( "#selectpicker" ).change(function() {
   var selValue = $(this).val();
    
    //Sample implementation how it works.
    //var data = "<select ><option value='11'>Value11</option></select>";
    //$("#fillValue").html(data);
    
   $.ajax({
		url : '/MigrateEmail' + selValue,
		type : "POST",
		async : false,
		contentType:"application/json",
		success : function(responseJson) {
            //Sample data
            var data = "<select id='child'><option value='11'>Value11</option></select>"
			$("#fillValue").val(data);
		}
	});
});*/