<html>
<body>
<h2>home</h2>
</body>
<script type="text/javascript" src="/static/jquery.js"></script>
<script type="text/javascript">
    $(function () {
       $.ajax({
           url: 'http://localhost:8090/testAjax',
           data: {key: '123456'},
           type: 'get',
           //dataType: 'text',
           success: function(data){
               alert(data);
           },
           error: function (msg) {
               alert(msg);
           }
       });
    });
</script>
</html>
